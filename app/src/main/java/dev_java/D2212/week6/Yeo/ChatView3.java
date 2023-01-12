package dev_java.D2212.week6.Yeo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import java.awt.Graphics2D;
import java.awt.AlphaComposite;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JViewport;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

public class ChatView3 extends JFrame implements ActionListener {
  ObjectOutputStream oos = null;// 말 하고 싶을 때
  ObjectInputStream ois = null;// 듣기 할 때
  String nickName = null;// 닉네임 등록

  // 선언
  String imgPath = "D:\\TEMP\\"; // 배경
  ImageIcon imgbgIcon = new ImageIcon(imgPath + "kazha.jpg"); //
  JLabel jlb_bgLabel = new JLabel(imgbgIcon); //
  JPanel jp = new JPanel(); // 텍스트 메인 페널
  JPanel jp_send = new JPanel(); // 텍스트 전송 페널
  JButton jbtn_send = new JButton(new ImageIcon(imgPath + "sendbtn.png")); // 텍스트 전송 버튼
  JTextField jtf_message = new JTextField(); // 텍스트 입력
  JTextArea jta_display = new JTextArea();

  //
  StyledDocument sd_display = new DefaultStyledDocument(new StyleContext());
  JTextPane jtp_chatDisplay = new JTextPane(sd_display);
  JViewport viewport = new JViewport() {
    public void paintComponent(Graphics g) {
      Image img = imgbgIcon.getImage(); //
      setOpaque(false);
      Graphics2D gd = (Graphics2D) g;
      gd.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));
      g.drawImage(img, 0, 0, this);
      super.paintComponent(g);
    }
  };
  //
  Font font = new Font("Paryrus", Font.BOLD, 40);
  JScrollPane jsp = new JScrollPane(); //
  // 생성

  public ChatView3() {
    initDisplay();
  }

  // 화면
  public void initDisplay() {
    jsp.setOpaque(true);
    jsp.setViewport(viewport);
    jtp_chatDisplay.setOpaque(false);
    jsp.setViewportView(jtp_chatDisplay);
    // 메인 페널
    jp.setLayout(new BorderLayout());
    jp.add("Center", jsp);
    jp.add("South", jp_send);
    // 전송 페널
    jp_send.setLayout(new BorderLayout());
    jp_send.add("Center", jtf_message);
    jp_send.add("East", jbtn_send);
    // 버튼 크기
    jbtn_send.setPreferredSize(new Dimension(65, 40));
    // 전송 화면
    // jta_display 폰트색상
    jtp_chatDisplay.setForeground(Color.ORANGE);
    jtp_chatDisplay.setEditable(false); // 텍스트 필드 입력 불가
    // 폰트
    jtp_chatDisplay.setFont(font);
    jtf_message.setFont(font);
    // 액션
    jtf_message.addActionListener(this);
    jbtn_send.addActionListener(this);
    // 보내기 버튼 크기 조절
    jbtn_send.setPreferredSize(new Dimension(100, 80));
    this.setLayout(new GridLayout(1, 2));
    this.add(jp);
    this.setTitle("Cacao TALK");
    this.setVisible(true);
    this.setSize(400, 600);
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // X 클릭 자동 종료
  }

  // 메인
  public static void main(String[] args) {
    new ChatView3();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object obj = e.getSource();
    // 전송 ??
    String message = jtf_message.getText(); // 전송 시 입력 메시지 받아옴
    if (jtf_message == obj) {
      try {
        oos.writeObject(message);
        jtf_message.setText("");
        //
        sd_display.insertString(sd_display.getLength(), message + "\n", null);
        //
      } catch (Exception e2) {
        e2.printStackTrace();
      }
      //
      jtp_chatDisplay.setCaretPosition(sd_display.getLength());
      jtf_message.setText(""); // TextField 비움
      //
    } else if (obj == jbtn_send || obj == jtf_message) {
      // 입력된 메시지 얻기
      try {
        oos.writeObject(message);
        jtf_message.setText("");
      } catch (Exception e2) {
      }
    }
  }
}