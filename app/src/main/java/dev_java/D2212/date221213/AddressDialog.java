package dev_java.D2212.date221213;

import javax.swing.JDialog;

public class AddressDialog {
  JDialog jdg = new JDialog();

  // System.exit(0); jf.dispose();
  public AddressDialog() {
    jdg.setSize(400, 300);
    jdg.setVisible(false);
  }

  // XXX.YYY.ZZZ.methodA();
  public void setDialog(String title, boolean isView) {
    jdg.setTitle(title);
    jdg.setVisible(isView);
  }

  public static void main(String[] args) {
    new AddressDialog();
  }
}