package dev_java.oracle;

import java.util.HashMap;
import java.util.Map;

//회원정보 담기
public class MapTest4 {
  public static void main(String[] args) {
    Map<String, Object> rMap = new HashMap<>();
    rMap.put("mem_id", "tomato");
    System.out.println("1 : " + rMap);// 변수명은 분명 같은데 13번은 apple출력됨
    rMap = new HashMap<>();// 새로운 객체가 생성됨 - 타입은 같지만
    rMap.put("mem_id", "apple");
    System.out.println("2 : " + rMap);
    rMap = new HashMap<>();
    System.out.println("3 : " + rMap);
  }
}
