package dev_java.D2212.date221212;

// 메모리 StackOverFlow 발생
public class JTextAreaUILogic2 {

  JTextAreaUI2 jTextAreaUI2 = null;
  // 여기서 직접 인스턴스화 하면 복제본이 만들어짐 - 망함 - 복제본이 출력되므로

  public JTextAreaUILogic2(JTextAreaUI2 jTextAreaUI2) {
    // 생성자 안에서 JTextAreaUI의 JTextArea원본과 전변을 초기화해주어야 함
    this.jTextAreaUI2 = jTextAreaUI2;
  }

  public void account(String input) {
    // JTextAreaUI클래스에 정의된 주소번지를 사용하고 싶다. 어떡하지?
    jTextAreaUI2.jta.append("UILogic : " + input + "\n");
  }
}
