package dev_java.Y22M12D01;

//static은 메소드 이름 앞에도 올 수있고
//변수명 앞에도 올 수 있다
//그렇다면 인스턴스화 하는 것과 뭐가 다르지?
public class Pride {
  // 자동차 이름
  static String carName = "2023년형 프라이드 ";
  // 자동차 색상
  String carColor = "흰색";
  // 바퀴수를 담는 변수 선언
  int wheelNum = 4;

  public static void main(String[] args) {
    // 변수이름 앞에 static이 있으면 인스턴스화 없이도 호출이 가능함.
    System.out.println(carName);//
    // 인스턴스화라고 함 - Pride객체가 메모리 상주 -> 호출이 가능한 상태
    Pride myCar = new Pride();// myCar를 인스턴스 변수라 한다.
    myCar.carColor = "보라색";
    System.out.println(myCar);
    myCar = null;
    // insert here - 여기서는 자동차 색상을 출력할 수 있나요?
    myCar = new Pride();
    myCar.carColor = "검정색";
    System.out.println(myCar.carColor);
    myCar.carColor = "검정색";
  }
}
