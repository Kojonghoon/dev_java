package dev_java.D2212.week2.date221205;

public class Solution3 {
  // 1부터 100까지 세면 5의 배수이면 fizz
  // 1부터 100까지 세면 7의 배수이면 buzz
  // 1부터 100까지 세면 5와 7칠의 공배수이면 fizzbuzz

  public static void main(String[] args) {

    // for (int fizz = 0; fizz < 101; fizz = fizz + 5)
    for (int fizz = 1; fizz < 101; fizz++)
      if (fizz % 5 == 0)
        System.out.println("fizz " + fizz);
    System.out.println("============");
    // for (int buzz = 0; buzz < 101; buzz = buzz + 7)
    for (int buzz = 1; buzz < 101; buzz++)
      if (buzz % 7 == 0)
        System.out.println("buzz" + buzz);
    System.out.println("=============");
    // for (int fizzbuzz = 0; fizzbuzz < 101; fizzbuzz = fizzbuzz + 7 * 5)
    for (int fizzbuzz = 1; fizzbuzz < 101; fizzbuzz++)
      if (fizzbuzz % 35 == 0)
        System.out.println("fizzbuzz" + fizzbuzz);
  }
}