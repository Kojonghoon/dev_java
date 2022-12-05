package dev_java.D2212.date221205;

public class MemberInit {
  int i;
  int hap;

  // 디폴트 생성자라고 부른다. - 디폴트 생성자는 파라미터를 결정해줄 필요 없으니 생략하면
  // JWM이 대신 생성해 주어 전변들을 초기화 시킴
  public MemberInit() {
    System.out.println("디폴트 생성자 호출 성공" + i + "," + hap);
  }

  public MemberInit(int i, int hap) {
    System.out.println("파라미터가 두개인 생성자 호출 성공" + i + "," + hap);
    this.i = i;
    this.hap = hap;
  }

  public static void main(String[] args) {
    MemberInit mi = new MemberInit(); // 10번 생성자 호출임 - 메소드 오버로딩 매커니즘따른다
    MemberInit mi2 = new MemberInit(1, 0); // 14번 생성자 호출임
  }
}
