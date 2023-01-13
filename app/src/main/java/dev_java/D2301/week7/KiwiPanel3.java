package dev_java.D2301.week7;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

public class KiwiPanel3 extends JPanel implements ActionListener {
  // String[][] datas = new String[0][3];
  String[] header = { "배경화면", "폰트", "폰트크기" };
  String[][] datas = { { "10", "개발부", "서울" }, { "20", "인사팀", "서울" }, { "30", "전산팀", "서울" } };

  DefaultTableModel model = new DefaultTableModel(datas, header);
  JTable table = new JTable(model);
  JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
      JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

  JTableHeader jth = table.getTableHeader();

  KiwiApp kiwiApp;

  public KiwiPanel3() {
    initDisplay();
  }

  public KiwiPanel3(KiwiApp kiwiApp) {
    this();
    this.kiwiApp = kiwiApp;
  }

  public void changeFontSize() {
    table.setFont(KiwiPanel1.f);
    jth.setFont(KiwiPanel1.f);
  }

  public void initDisplay() {

    if (KiwiPanel1.isSize) {
      changeFontSize();
    }
    this.setLayout(new BorderLayout());
    this.add("Center", scrollPane);
  }

  @Override
  public void actionPerformed(ActionEvent e) {

  }
}