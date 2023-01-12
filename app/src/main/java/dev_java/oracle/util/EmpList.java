package dev_java.oracle.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dev_java.oracle.util.DBConnectionMgr;
//모든 RDBMS에서 제공되는 타입이 아니라 오아클에서만 제공되는 타입 -sys_refcursor
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;

public class EmpList {
  Connection con = null; // 인터페이스 - 비벼지는 부분
  CallableStatement cstmt = null; // 프로시저를 요청할 때 사용하는 인터페이스임
  OracleCallableStatement ocstmt = null;
  ResultSet rs = null; // 오라클 커서를 조작하는데 필요한 추상메소드 가짐
  DBConnectionMgr dbMgr = new DBConnectionMgr();

  public List<Map<String, Object>> getEmpList() {
    List<Map<String, Object>> list = null;
    // insert here - 구글링한 소스를 어디에 붙여야 하나? 기준, 선택 할 수 있다. -API보고 실습코드 적용
    try {
      con = dbMgr.getConnection("scott", "tiger"); // 물리적으로 떨어져 있는 오라클 서버와 연결통로 확보
      cstmt = con.prepareCall("{call proc_login(?)}");
      cstmt.registerOutParameter(1, OracleTypes.CURSOR);
      cstmt.execute();
      // 굳이 추가로 제공되는 클래스로 치환하는 것은 ResultSet을 주입받는 메소드 호출이 필요함
      // CallableStatement에서는 getCursor()를 지원하지 않기 때문에....
      ocstmt = (OracleCallableStatement) cstmt;
      rs = ocstmt.getCursor(1);
      Map<String, Object> rmap = null; // 게으른 인스턴스화
      while (rs.next()) {
        rmap = new HashMap<>();
        rmap.put("empno", rs.getInt(1));
        rmap.put("deptno", rs.getInt(2));
        rmap.put("ename", rs.getString(3));
        // List에 Map추가하기
        // List에 튜플 추가
        // Map에는 컬럼 추가
        list.add(rmap);

      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return list;
  }
  //프로시저 안에서는 여러가지의 DML문을 한 번 서버에 접속한 상태에서
  //한 번에 처리가능
  //commit, rollback가능함
  //자바로 꺼내서 처리하지 않고 프로시저 내부에서 비즈니스로직(업무포함 프로세스)
  //처리가능- 변수 활용과 제어문 사용
  //프로시저 내부에서 자바의 힘을 빌리지 않고도 처리할 수 있는 프로세스들이 있다. - 강점. 시스템부하 줄임
  public static void main(String[] args) {
    EmpList eList = new EmpList();
    List<Map<String, Object>> list = eList.getEmpList();
    System.out.println(list);
  }
}
