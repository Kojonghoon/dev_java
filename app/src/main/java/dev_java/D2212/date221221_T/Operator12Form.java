package dev_java.D2212.date221221_T;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Operator12Form extends JFrame implements ActionListener {
  JPanel panel = new JPanel();
  JTextField text = new JTextField();

  // 버튼
  String btn_name[] = { "C", "/", "*", "=", "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "0" };
  JButton btns[] = new JButton[btn_name.length];

  public Operator12Form() {
    setVisible(true);
    setTitle("계산기");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(400, 600);
    setResizable(true);
    add(panel);
    panel.setLayout(new GridLayout(4, 4, 4, 4));

    // 창
    // text.setEditable(false);
    text.setBackground(Color.WHITE);
    text.setHorizontalAlignment(JTextField.RIGHT);
    text.setFont(new Font("Arial", Font.BOLD, 50));
    add(text);
    add(panel);

    // 버튼
    for (int i = 0; i < btn_name.length; i++) {
      btns[i] = new JButton(btn_name[i]);
      btns[i].setBackground(Color.BLACK);
      btns[i].setForeground(Color.WHITE);
      btns[i].setFont(new Font("Arial", Font.BOLD, 50));
      switch (i) {
        case 0:
          btns[i].setBackground(Color.RED);
          break;
        case 1, 2, 3, 7, 11, 15:
          btns[i].setBackground(Color.gray);
      }// switch
      panel.add(btns[i]);
    } // for
    text.setVisible(true);
    text.setBounds(8, 10, 270, 70);
  } // public Cal2

  public void actionPerformed(ActionEvent e) {
    Object obj = e.getSource();
    if (obj == btns[0]) {

    }
  }

  public static void main(String[] args) {
    Operator12Form c = new Operator12Form();

  }
}