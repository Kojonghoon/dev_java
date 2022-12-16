package dev_java.D2212.date221216;

import java.util.Vector;

public class Vector4_1 {
  public static void main(String[] args) {
    String fruits[] = { "키위", "포도", "사과" };

    Vector<String> vfruit = new Vector<>();
    for (int i = 0; i < fruits.length; i++) {
      vfruit.add(i, fruits[i]);
    }
    System.out.println(vfruit.size());
    vfruit.add(1, "토마토");
    vfruit.remove(2);

    for (int i = 0; i < vfruit.size(); i++) {
      System.out.println(vfruit.get(i));
    }
  }
}