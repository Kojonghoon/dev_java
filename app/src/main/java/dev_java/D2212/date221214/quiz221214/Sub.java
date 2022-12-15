package dev_java.D2212.date221214.quiz221214;

import javax.swing.JDialog;

public class Sub {
  JDialog jdg = new JDialog();

  public Sub() {
    initDisplay();
  }

  public void initDisplay() {
    jdg.setSize(300, 400);
    jdg.setVisible(true);
  }

  public static void main(String[] args) {
    new Sub();
  }
}
