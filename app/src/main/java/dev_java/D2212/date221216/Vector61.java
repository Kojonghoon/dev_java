package dev_java.D2212.date221216;

import java.util.Scanner;
import java.util.Vector;

public class Vector61 {
  Vector<String[]> vdepts = new Vector<>();
  String[][] depts = {
      { "10", "개발부", "서울", "02-1111-1111" },
      { "20", "인사부", "인천", "032-222-2222" },
      { "30", "총무부", "부산", "051-333-3333" }
  };

  void initVector() { // row
    for (int i = 0; i < depts.length; i++) {
      vdepts.add(depts[i]);// 벡터에 담긴것은 1차 배열이다 - 컬럼의 수는 바뀔 수 있음 -4
    }
  }

  void initVectorPrint() {
    for (int i = 0; i < vdepts.size(); i++) {// row
      String[] oneRow = vdepts.get(i);// get은 주소갑과 값을 호출
      System.out.println(oneRow/* .toString() */); // 주소값을 호출
      // System.out.println(vdepts.get(i));// 주소값을 호출
      for (int j = 0; j < oneRow.length; j++) {// 컬럼
        System.out.print(oneRow[j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Vector61 v61 = new Vector61();
    // initVector 메소드를 경유하지 않았으므로 size는 0이다.
    v61.initVector(); // 3
    // vdepts.get(0) -> "10", "개발부", "서울", "02-1111-1111"
    // vdepts.get(1) -> "20", "인사부", "인천", "032-222-2222"
    // vdepts.get(2) -> "30", "총무부", "부산", "051-333-3333"
    System.out.println(v61.vdepts.size());// 0->3
    v61.initVectorPrint();
    System.out.println("삭제하고자 하는 부서 번호를 입력하세요 ");
    Scanner s = new Scanner(System.in);
    int deptno = s.nextInt();
    for (int i = 0; i < v61.vdepts.size(); i++) {
      String[] oneRow = v61.vdepts.get(i);
      if (deptno == Integer.parseInt(oneRow[0])) {
        v61.vdepts.remove(i);
      }
    }
    System.out.println("================================");
    v61.initVectorPrint();
    // 삭제 한 뒤 남은 정보 출력해보기
    System.out.println(v61.vdepts);
    s.close();
  }
}// end of initVectorPrint
