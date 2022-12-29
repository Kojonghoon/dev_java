package dev_java.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dev_java.D2212.week4.date221220.DeptVO;
import dev_java.oracle.util.DBConnectionMgr;

public class DeptList {
  Connection con = null;
  PreparedStatement pstmt = null;
  ResultSet rs = null;
  DBConnectionMgr dbMgr = new DBConnectionMgr();

  public List<DeptVO> getDeptList() {
    con = dbMgr.getConnection();
    String sql = "select deptno, dname, loc from dept";
    List<DeptVO> deptList = new ArrayList<>();
    try {
      pstmt = con.prepareStatement(sql);
      rs = pstmt.executeQuery(); // 오라클 서버에게 처리를 요청함
      DeptVO dVO = null;
      while (rs.next()) {
        dVO = DeptVO.builder().deptno(rs.getInt("deptno")).dname(rs.getString("dname")).loc(rs.getString("loc"))
            .build();
        deptList.add(dVO);
      }
    } catch (Exception e) {
      System.out.println(e.toString());
    }
    return deptList;
  }

  public static void main(String[] args) {
    DeptList deptList = new DeptList();
    List<DeptVO> list = null;
    list = deptList.getDeptList();
    for (int i = 0; i < list.size(); i++) {
      DeptVO rdVO = list.get(i);
      System.out.println(rdVO.getDeptno() + "," + rdVO.getDname() + "," + rdVO.getLoc());
    }
  }
}