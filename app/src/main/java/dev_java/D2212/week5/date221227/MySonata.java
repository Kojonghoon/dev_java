package dev_java.D2212.week5.date221227;

public class MySonata extends MyCar {
  MySonata() {
    System.out.println("MySonata 호출 성공");
  }

  @Override
  public void display() {
    System.out.println("나는 2023년형 소나타입니다.");
  }

  public static void main(String[] args) {
    MySonata ms = new MySonata();
  }
}
