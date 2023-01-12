package dev_java.oracle.util;

import java.sql.CallableStatement;
import java.sql.Connection;

//클래스 성계에 있어서 DAO(Data Access Object)패턴의 사용은 필수가 되었따
//특히나 MyBatis와 같은 ORM솔루션이 제공되면서 더 강조 되었다
//JDBC API ->iBatis(Apache)-> MyBatis(google) : 30%줄어듦->JPA(Hibernate) - 클래스설계
// - 쿼리문이 없다(추상적이다. 조인관계는 어떡하지)
public class ChatDao {
  Connection con = null; // 인터페이스 - 비벼지는 부분
  CallableStatement cstmt = null;
  DBConnectionMgr dbMgr = new DBConnectionMgr();

  public String login(String mem_id, String mem_pw) {
    String mem_name = null;
    try {
      con = dbMgr.getConnection(); // 물리적으로 떨어져 있는
      cstmt = con.prepareCall("{call proc_login(?,?,?)}");
      cstmt.setString(1, mem_id);
      cstmt.setString(2, mem_pw);
      cstmt.registerOutParameter(3, java.sql.Types.VARCHAR);
      cstmt.executeUpdate();
      mem_name = cstmt.getString(3);
      System.out.println(mem_name);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return mem_name;
    // return "회원가입했던 너의 이름";
  }

  public static void main(String[] args) {
    ChatDao cd = new ChatDao();
    String r_name = cd.login("tomato", "123");
    System.out.println(r_name);
  }
}