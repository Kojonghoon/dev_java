package dev_java.D2212.week3.date221212;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTextAreaUI2 {
  // 선언부
  JTextAreaUILogic2 jtaUILogic2 = new JTextAreaUILogic2(this);
  JTextAreaUI2Event jEvent = new JTextAreaUI2Event(this);

  JScrollPane jsp = null;
  JFrame jf = new JFrame();
  JTextArea jta = null;
  JTextField jtf = new JTextField(10);

  public JTextAreaUI2() {
    getTextArea();
    initDisplay();
  }

  public JTextArea getTextArea() {
    if (jta == null) {
      jta = new JTextArea(10, 20);
      jsp = new JScrollPane(jta,
          JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
          JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    }
    return jta;
  }

  public void initDisplay() {
    jtf.addActionListener(jEvent);
    jta.setBackground(Color.cyan);
    jf.add("Center", jsp);
    jf.add("South", jtf);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setSize(400, 300);
    jf.setVisible(true);
  }

  public static void main(String[] args) {
    new JTextAreaUI2();
  }
}