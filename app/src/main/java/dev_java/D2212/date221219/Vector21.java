package dev_java.D2212.date221219;

import java.util.Vector;

public class Vector21 {
  public static void main(String[] args) {
    // 2중 [outter : = Vector-size(), inner : = String[]-length] for문 돌림
    // 끼워넣기 가능, 수정대한 API제공은 없다. - 클라우드기반 데이터베이스 제품 이런식...
    Vector<String[]> v = new Vector<>();
    String imsi[] = { "10", "개발부", "서울" };
    v.add(imsi);
    imsi = new String[] { "20", "총무부", "인천" };
    v.add(imsi);
    for (int x = 0; x < v.size(); x++) {// 로우의 수 - 2번 반복
      for (int y = 0; y < imsi.length; y++) {// 컬럼의 수 - 3번 반복
        String[] r = v.get(x);
        System.out.println(r[0] + ", " + r[1] + ", " + r[2]);
      }
    }
    // 크기가 얼마인가요? 0
    // 단일 for문 처리
    Vector<String[]> v2 = new Vector<>();
  }

}
