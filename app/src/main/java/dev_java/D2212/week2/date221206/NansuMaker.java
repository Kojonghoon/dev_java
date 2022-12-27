package dev_java.D2212.week2.date221206;

public class NansuMaker {
  // 만일 여기서 채번한 값을 다른 클래스에서 재사용해야 한다면
  // 그런 상황이면 나는 멤버변수로 결정한다
  int com[] = new int[3];
  int my[] = new int[3];// 사용자가 선택한 숫자
  // 난수발생하여 3자리의 서로 다른 숫자로된 값을 배열에 담기

  public void ranCom() {
    com[0] = (int) (Math.random() * 10);
    do {
      com[1] = (int) (Math.random() * 10);
    } while (com[0] == com[1]);
    // insert here
    do {
      com[2] = (int) (Math.random() * 10);
    } while (com[0] == com[2] || com[1] == com[2]);
  }

  // 초기화, 지변이 맞다.
  // 자리가 같다는 것을 배열의 index를 활용하시오.
  public String account(String use_input) {
    // insert here
    int my[] = new int[3];
    int temp=Integer.parseInt(use_input);
    
    if (com[0] == my[0]) {
      return "1스 2볼";
    } else if (com[0] == my[0] && com[1] == my[1]) {
      return "2스 1볼";
    } else if (com[0] == my[0] && com[1] == my[1] && com[2] == my[2]) {
      return "3스";
    }
    System.out.println();
    return use_input;
  }

  public static void main(String[] args) {
    NansuMaker nansuMaker = new NansuMaker();
    for (int i = 0; i < 10; i++) {
      nansuMaker.ranCom();
      System.out.println(nansuMaker.com[0] + "" + nansuMaker.com[1] + "" + nansuMaker.com[2]);
    }
  }
}
