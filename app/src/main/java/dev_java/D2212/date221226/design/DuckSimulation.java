package dev_java.D2212.date221226.design;

public class DuckSimulation {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();
    System.out.println("=========");
    Duck yourDuck = new WoodDuck();
    yourDuck.performFly();
    yourDuck.performQuack();
    // Duck himDuck = new RubberDuck();
    // himDuck.performFly();
    // himDuck.performQuack();
  }
}