package dev_java.D2212.date221221_T;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator_3 extends JFrame implements ActionListener {
  private JTextField num1Field;
  private JTextField num2Field;
  private JTextField resultField;
  private JButton addButton;
  private JButton subtractButton;
  private JButton multiplyButton;
  private JButton divideButton;

  public Calculator_3() {
    setLayout(new GridLayout(2, 6));

    num1Field = new JTextField();
    num2Field = new JTextField();
    resultField = new JTextField();
    addButton = new JButton("+");
    subtractButton = new JButton("-");
    multiplyButton = new JButton("*");
    divideButton = new JButton("/");

    add(num1Field);
    add(num2Field);
    add(addButton);
    add(subtractButton);
    add(multiplyButton);
    add(divideButton);
    add(resultField);

    addButton.addActionListener(this);
    subtractButton.addActionListener(this);
    multiplyButton.addActionListener(this);
    divideButton.addActionListener(this);

    setSize(400, 400);
    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    double num1 = Double.parseDouble(num1Field.getText());
    double num2 = Double.parseDouble(num2Field.getText());
    double result = 0;

    if (e.getSource() == addButton) {
      result = num1 + num2;
    } else if (e.getSource() == subtractButton) {
      result = num1 - num2;
    } else if (e.getSource() == multiplyButton) {
      result = num1 * num2;
    } else if (e.getSource() == divideButton) {
      result = num1 / num2;
    }

    resultField.setText(Double.toString(result));
  }

  public static void main(String[] args) {
    new Calculator_3();
  }
}