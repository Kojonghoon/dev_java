package dev_java.D2212.week4.date221219;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class DeptTable7 extends JFrame implements ActionListener {// DeptTable1 is a JFrame
  // 선언부
  // 파라미터의 this는 DeptTable7타입이고 main에서 호출된 생성자로
  // 현재 메모리에 로딩중인 그 객체를 가리킨다.
  // 왜 this를 넘겨야 하나요? 입력할건데...?
  // JTable7Dialog에서 부서번호, 부서명, 지역을 입력한 후 저장버튼을 누르면
  // Vector<String[]>추가하고 추가된 로우를 포함하는 Vector가 부모창에
  // 새로 리플래쉬(재사용 되어야 함- 이건 부모클래스에 구현함) 되어야 하니까...호출해야함
  JTable7Dialog jtd7 = new JTable7Dialog(this);
  String header[] = { "부서번호", "부서명", "지역" };
  String datas[][] = new String[0][3];
  // this는 사용되는 클래스 영역에서 선언된 클래스를 가리킨다
  // 그러면 여기서는 DeptTable1타입인 것임
  // 그런데 DefaultTableModel은 자바에서 제공되는 클래스임-생성자도 정해져 있음
  // 생성자는 메소드 오버로딩 규칙을 따름 - 파라미터의 갯수나 타입이 달라야 함
  // 제공되는 생성자에 없음 - 결국 사용 못함 - 컴파일 에러(문법에러 발생)
  DefaultTableModel dtm_dept = new DefaultTableModel(datas, header);// 생성자 호출
  JTable jtb_dept = new JTable(dtm_dept);
  JScrollPane jsp_dept = new JScrollPane(jtb_dept, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
      JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
  // 버튼을 붙일 속지 선언
  JPanel jp_north = new JPanel();
  JButton jbtn_sel = new JButton("조회");
  JButton jbtn_ins = new JButton("입력");
  JButton jbtn_upd = new JButton("수정");
  JButton jbtn_del = new JButton("삭제");
  JButton jbtn_detail = new JButton("상세보기");
  static Vector<String[]> vdata = new Vector<>();// vdata.size() = 0;

  // 생성자
  public DeptTable7() {
    initDisplay();
  }

  // 화면그리기
  public void initDisplay() {
    jbtn_ins.addActionListener(this);
    jbtn_upd.addActionListener(this);
    jbtn_sel.addActionListener(this);
    jbtn_del.addActionListener(this);
    jbtn_detail.addActionListener(this);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jp_north.setLayout(new FlowLayout(FlowLayout.RIGHT));
    jbtn_sel.setBackground(new Color(158, 9, 9));
    jbtn_sel.setForeground(Color.WHITE);
    jbtn_ins.setBackground(new Color(19, 99, 57));
    jbtn_ins.setForeground(Color.WHITE);
    jbtn_upd.setBackground(new Color(54, 54, 54));
    jbtn_upd.setForeground(Color.WHITE);
    jbtn_del.setBackground(new Color(7, 84, 170));
    jbtn_del.setForeground(Color.WHITE);
    jbtn_detail.setBackground(new Color(80, 90, 170));
    jbtn_detail.setForeground(Color.WHITE);
    jp_north.add(jbtn_sel);
    jp_north.add(jbtn_ins);
    jp_north.add(jbtn_upd);
    jp_north.add(jbtn_del);
    jp_north.add(jbtn_detail);
    this.add("North", jp_north);
    this.add("Center", jsp_dept);
    this.setTitle("부서관리시스템 Ver1.0");
    this.setSize(500, 400);
    this.setVisible(true);
  }

  public void refreshData() {
    System.out.println("refreshData 호출");
    // 입력, 수정전에 조회된 정보는 삭제함
    while (dtm_dept.getRowCount() > 0) {
      dtm_dept.removeRow(0);
    }
    if (DeptTable7.vdata.size() <= 0) {
      JOptionPane.showMessageDialog(this, "조회 결과가 없습니다.", "WARN", JOptionPane.WARNING_MESSAGE);
      return; // refreshData() 탈출
    }
    System.out.println("DeptTable7 : " + vdata.size());
    // 벡터의 크기만큼 반복하면서 dtm_dept 데이터셋에 String[] 추가함
    for (int i = 0; i < vdata.size(); i++) {
      String[] oneRow = vdata.get(i);
      dtm_dept.addRow(oneRow);
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object obj = e.getSource();
    // 조회 할 거야?
    if (obj == jbtn_sel) {
      refreshData();
    }
    // 너 입력버튼 누른거야?
    else if (obj == jbtn_ins) {
      jtd7.set("입력", true, null);
    }
    // 너 수정할려구?
    else if (obj == jbtn_upd) {
      // 어떤 로우를 수정할 거니?
      // JTable목록에서 선택한 로우의 index값을 가져옴
      int index = jtb_dept.getSelectedRow();
      // 데이터객체로 벡터를 사용중이니 벡터에서 꺼낸 값을 String[]초기화
      // 테이블의 약식 폼인 JTable 이벤트로 얻어옴
      String[] oneRow = vdata.get(index);
      jtd7.set("수정", true, oneRow);
    }
    // 너 상세보기 원해?
    else if (obj == jbtn_detail) {
      // int index = jtb_dept.getSelectedRow();
      // String[] oneRow = vdata.get(index);
      // jtd7.set("상세보기", true, oneRow);
    }
  }

  // 메인메소드
  public static void main(String[] args) {
    new DeptTable7();
  }
}
