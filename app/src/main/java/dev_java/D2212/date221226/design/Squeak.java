package dev_java.D2212.date221226.design;

public class Squeak implements QuackBehavior{

  @Override
  public void quack() {
    //삑삑인지 무음인지 꽥꽥인지는 언제 누가 어디에서 결정할 수 있을까?\
    //언제? 해당 기능이 요청될때
    //누가? 구현하고자 하는 객체가 무엇인가에 따라서 Duck myDuck = new WoodDuck();
    //누가? 구현하고자 하는 객체가 무엇인가에 따라서 Duck myDuck = new RuvverDuck();
    //누가? 구현하고자 하는 객체가 무엇인가에 따라서 Duck myDuck = new MallardDuck();
    //
    System.out.println("<<삐~이이이잉ㄱ 삑>>");
  }
  
}
