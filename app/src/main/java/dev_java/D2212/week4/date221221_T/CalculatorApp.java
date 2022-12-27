package dev_java.D2212.week4.date221221_T;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorApp extends JFrame implements ActionListener {
  // 선언부
  JTextField jtf_display = new JTextField(10);
  JPanel jp_center = new JPanel();
  JButton jbtn_clear = new JButton("C");
  JButton jbtn_equal = new JButton("=");
  JButton jbtn_one = new JButton("1");
  JButton jbtn_two = new JButton("2");
  JButton jbtn_plus = new JButton("+");
  JButton jbtn_minus = new JButton("-");
  JButton jbtn_mult = new JButton("*");
  JButton jbtn_div = new JButton("/");
  Font f = new Font("Paryrus", Font.BOLD, 40);
  int i;
  int j;
  int result = 0;

  // 생성부
  public CalculatorApp() {
    initDisplay();
  }

  // 화면처리기
  public void initDisplay() {
    jbtn_one.setForeground(Color.RED);
    jbtn_two.setForeground(Color.GREEN);
    jbtn_one.setFont(f);
    jbtn_two.setFont(f);
    jp_center.setBackground(Color.CYAN);
    jp_center.setLayout(new GridLayout(2, 6));
    jp_center.add(jbtn_plus);
    jp_center.add(jbtn_minus);
    jp_center.add(jbtn_mult);
    jp_center.add(jbtn_div);
    jp_center.add(jbtn_equal);
    jp_center.add(jbtn_clear);
    jp_center.add(jbtn_one);
    jp_center.add(jbtn_two);
    jtf_display.setEditable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.add("North", jtf_display);
    this.add("Center", jp_center);
    this.setTitle("내가만든 계산기");
    this.setSize(500, 300);
    this.setVisible(true);

    // ActionListener 추가
    jbtn_clear.addActionListener(this);
    jbtn_equal.addActionListener(this);
    jbtn_one.addActionListener(this);
    jbtn_two.addActionListener(this);
  }

  public static void main(String[] args) {
    new CalculatorApp();

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object obj = e.getSource();
    if (obj == jbtn_one) {
      i = Integer.parseInt(jtf_display.getText());
      jtf_display.setText("");
    } else if (obj == jbtn_two) {
      j = Integer.parseInt(jtf_display.getText());
      jtf_display.setText("");
    }
  }
}
// JButton jbtn_three = new JButton("3");
// JButton jbtn_four = new JButton("4");
// JButton jbtn_five = new JButton("5");
// JButton jbtn_six = new JButton("6");
// JButton jbtn_seven = new JButton("7");
// JButton jbtn_eight = new JButton("8");
// JButton jbtn_nine = new JButton("9");

// jp_center.add(jbtn_three);
// jp_center.add(jbtn_four);
// jp_center.add(jbtn_five);
// jp_center.add(jbtn_six);
// jp_center.add(jbtn_seven);
// jp_center.add(jbtn_eight);
// jp_center.add(jbtn_nine);