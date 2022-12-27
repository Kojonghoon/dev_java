package dev_java.D2212.week3.date221212;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonUIEvent implements ActionListener {

  JButtonUI jbtnUI = null;

  public JButtonUIEvent(JButtonUI jButtonUI) {
    this.jbtnUI = jbtnUI;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object obj = e.getSource();
    if (obj == jbtnUI.jbtn_south) {
      System.out.println(jbtnUI.jbtn_south.getText() + "버튼클릭");
    }
  }
}
