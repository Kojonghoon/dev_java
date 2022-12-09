package dev_java.D2212.date221208_T;

import java.util.Scanner;

public class Test1 {
    // 선언부

    // 메서드 선언
    public void count() {
        System.out.println("count호출 ");// 로그에 출력할 값
        Scanner sc = new Scanner((System.in));
        boolean isOk = false;
        while (!isOk/* true */) {
            System.out.print("문자열을 입력해주세요 : ");
            String str = sc.nextLine();
            // if (str.equals("exit")) {
            if ("exit".equals(str)) {
                break;
            } else {
                System.out.println(str.length() + "글자 입니다.");
                // length() : 문자열에 대한 글자 수 반환 메소드
            }
        } // end of while
        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }// end of count()

    // 메인메서드
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.count();
    }
}
