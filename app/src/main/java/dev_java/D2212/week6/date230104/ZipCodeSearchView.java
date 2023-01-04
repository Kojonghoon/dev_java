package dev_java.D2212.week6.date230104;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import dev_java.oracle.util.DBConnectionMgr;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ZipCodeSearchView extends JFrame implements ItemListener {

  // 선언부
  // 사용자가 선택한 zdo
  String zdo = null;
  // 사용자가 선택한 sigu
  String sigu = null;
  // 사용자가 선택한 dong
  String dong = null;
  // DB에서 가져온 zdos[]
  String[] zdos = null;
  // DB에서 가져온 sigus[]
  String[] sigus = null;
  // DB에서 가져온 dongs[]
  String[] dongs = null;
  // 중분류(sigu),소분류(dong)
  String totals[] = { "전체" };
  JPanel jp_north = new JPanel();
  JPanel jp_center = new JPanel();
  JComboBox jcb_zdo = null;
  JComboBox jcb_sigu = null;
  JComboBox jcb_dong = null;
  DBConnectionMgr dbMgr = new DBConnectionMgr();
  Connection con = null;
  PreparedStatement pstmt = null;
  ResultSet rs = null;

  // 생성자
  public ZipCodeSearchView() {
    zdos = getZDOList();
    sigus = getSiguList(zdo);
    // dongs = getDONGList();
    jcb_zdo = new JComboBox(zdos);
    jcb_zdo.addItemListener(this);
    jcb_sigu = new JComboBox(totals);
    jcb_sigu.addItemListener(this);
    jcb_dong = new JComboBox(totals);
    jcb_dong.addItemListener(this);
  }

  // 대분류 정보 초기화에 필요한 DB조회하기 구현
  public String[] getZDOList() {
    StringBuilder sql = new StringBuilder();
    sql.append("SELECT '전체' zdo FROM dual ");
    sql.append("UNION ALL ");
    sql.append("SELECT zdo ");
    sql.append("FROM( ");
    sql.append(" SELECT distinct(zdo) zdo ");
    sql.append(" FROM zipcode_t ");
    sql.append(" ORDER BY zdo asc)");
    try {
      // con의 주소번지가 확인되면 오라클서버와 연결통로가 확보되었다.
      con = dbMgr.getConnection();
      pstmt = con.prepareStatement(sql.toString());
      // 오라클에서 생성된 테이블의 커서 디폴트위치는 항상 isTop이다.
      rs = pstmt.executeQuery();
      Vector<String> v = new Vector<>();

      // rs.previous() 커서 앞으로 이동
      while (rs.next()) {
        String zdo = rs.getString("zdo");
        v.add(zdo);
      }
      zdos = new String[v.size()];

      v.copyInto(zdos);

    } catch (SQLException se) {
      System.out.println(se.toString()); // getMessage()로 찍어도됨
      System.out.println(sql.toString());
    } finally {
      // 사용한 자원 반납하기-생성된 역순으로 할것.
      // 생략해도 언젠간 반납은 이루어짐 - 명시적으로 반납처리 권장함
      // 왜냐하면 오라클 서버에서 커넥션을 강제로 종료시켜 버리니까...
      try {
        dbMgr.freeConnection(con, pstmt, rs);
      } catch (Exception e) {
        // TODO: handle exception
      }
    }

    return zdos;
  }// end of getZDOList

  // 화면처리부
  public void initDisplay() {
    // 윈도우창 닫기 버튼
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jp_north.add(jcb_zdo);
    jp_north.add(jcb_sigu);
    jp_north.add(jcb_dong);
    this.add("North", jp_north);
    this.setSize(630, 400);
    this.setVisible(true);

  }

  // 메인메소드
  public static void main(String[] args) {
    JFrame.setDefaultLookAndFeelDecorated(true);
    ZipCodeSearchView zcsv = new ZipCodeSearchView();
    zcsv.initDisplay();
  }

  @Override
  public void itemStateChanged(ItemEvent ie) {
    // TODO Auto-generated method stub
    Object obj = ie.getSource();
    // 너 ZDO콤보박스니?
    if (obj == jcb_zdo) {
      if (ie.getStateChange() == ItemEvent.SELECTED) {
        System.out.println("선택한 ZDO ==>" + zdos[jcb_zdo.getSelectedIndex()]);
        zdo = zdos[jcb_zdo.getSelectedIndex()];
        sigus = getSiguList(zdo);
        // 대분류가 결정이 되었을때 sigus를 초기화해줘야한다.
        // 기존에 디폴트로 전체 상수값을 넣어두었으니 이것을 삭제하고
        jcb_sigu.removeAllItems();
        // 새로운 DB서버에서 읽어온 값으로 아이템을 추가해야한다.
        for (int i = 0; i < sigus.length; i++) {
          jcb_sigu.addItem(sigus[i]);
        }

      }
    }
  }

  public String[] getSiguList(String zdo) {
    StringBuilder sql = new StringBuilder();

    sql.append("SELECT '전체' sigu FROM dual ");
    sql.append("UNION ALL ");
    sql.append("SELECT sigu ");
    sql.append("FROM( ");
    sql.append(" SELECT distinct(sigu) sigu ");
    sql.append(" FROM zipcode_t ");
    sql.append(" WHERE zdo =? ");
    sql.append(" ORDER BY sigu asc)");

    try {
      con = dbMgr.getConnection();
      pstmt = con.prepareStatement(sql.toString());
      pstmt.setString(1, zdo);
      rs = pstmt.executeQuery();
      Vector<String> v = new Vector<>();
      while (rs.next()) {
        String sigu = rs.getString("sigu");
        v.add(sigu);
      }
      sigus = new String[v.size()];
      v.copyInto(sigus);
    } catch (SQLException se) {
      System.out.println(se.toString());
      System.out.println(sql.toString());
    } finally {
      try {
        dbMgr.freeConnection(con, pstmt, rs);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return sigus;
  }//end of getSiguList
}