package dev_java.D2212.week6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import dev_java.oracle.util.DBConnectionMgr;

public class ZipCodeSearch {
  Connection con = null;// 인터페이스
  PreparedStatement pstmt = null;// 인터페이스
  ResultSet rs = null;// 인터페이스
  DBConnectionMgr dbMgr = new DBConnectionMgr();

  public Integer[] getZipcoed(String dong) {
    System.out.println("getZipcode 호출 성공==>" + dong);
    Integer[] zipcodes = null;
    // List<Integer> imsi = new ArrayList<>();
    Vector<Integer> imsi = new Vector<>();
    StringBuilder sql = new StringBuilder();
    sql.append("SELECT                                ");
    sql.append("                zipcode");
    sql.append("   FROM zipcode_t");
    sql.append(" WHERE zdo LIKE '서울'||'%");

    try {
      con = dbMgr.getConnection();
      pstmt = con.prepareStatement(sql.toString());
      pstmt.setString(1, dong);
      rs = pstmt.executeQuery();
      while (rs.next()) {
        // System.out.println(rs.getInt("zipcode"));
        int code = rs.getInt("zipcode");
        imsi.add(code);
      }
      zipcodes = new Integer[imsi.size()];
      imsi.copyInto(zipcodes);
      for (int c : zipcodes) {
        System.out.println(c);
      }
    } catch (Exception e) {
      e.printStackTrace();// 라인번호출력, 이력출력
    } finally {
      // 사용한 자원 반납하기
      dbMgr.freeConnection(con, pstmt, rs);
    }
    return zipcodes;
  }

  /*
   * public List<Integer> getZipcoed(String dong){
   * 
   * }
   */
  public static void main(String[] args) {
    ZipCodeSearch zcs = new ZipCodeSearch();
    zcs.getZipcoed("역삼");
  }
}
