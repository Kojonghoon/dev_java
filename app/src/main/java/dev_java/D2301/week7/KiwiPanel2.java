package dev_java.D2301.week7;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

public class KiwiPanel2 extends JPanel implements ActionListener {
    JTextArea jta = new JTextArea("");
    JTextField jtf = new JTextField("");
    KiwiApp kiwiApp;

    public KiwiPanel2() {
        initDisplay();
    }

    public KiwiPanel2(KiwiApp kiwiApp) {
        this(); // 18번 default constructor call
        this.kiwiApp = kiwiApp;
    }

    public void initDisplay() {

        // JPanel은 디폴트 레이아웃이 플로우 레이아웃
        if (KiwiPanel1.isSize) {
            changeFontSize();
        }
        this.setLayout(new BorderLayout());
        this.add("Center", jta);
        this.add("South", jtf);
        jtf.requestFocus(true);
        jtf.addActionListener(this);
    }

    public void changeFontSize() {
        jta.setFont(KiwiPanel1.f);
        jtf.setFont(KiwiPanel1.f);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();

        if (object == jtf) {
            String message = jtf.getText();
            jta.append(message + "\n");
            if (message.length() > 0) {
                jtf.setText("");
            }
        }
    }

    public static void main(String[] args) {
        KiwiPanel2 kPanel2 = new KiwiPanel2();
        kPanel2.initDisplay();
    }

}
