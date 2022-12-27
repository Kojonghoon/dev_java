package dev_java.D2212.week3.date221216;

import java.util.Vector;

public class Vector6_1 {
  public static void main(String[] args) {
    String[][] depts = {
        { "10", "개발부", "서울" },
        { "20", "인사부", "인천" },
        { "30", "총무부", "부산" }
    };
    Vector<String> vdepts = new Vector<>();
    for (int i = 0; i < depts.length; i++) {
      for (int j = 0; j < depts[i].length; j++) {
        vdepts.add(depts[i][j]);
      }
    } // end of for
    for (String v : vdepts) {
      System.out.print(v + " ");
    }
  }
}
