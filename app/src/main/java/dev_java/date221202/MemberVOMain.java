package dev_java.date221202;

//자료구조의 일부로 사용함
//회원정보를 관리하기 위한 목적으로 설계하였다. - 그래서 main 메소드는 필요없다.
public class MemberVOMain {
  public static void main(String[] args) {

    MemberVO memberVO = new MemberVO();
    String 사용자가입력한아이디 = "토마토";
    System.out.println(사용자가입력한아이디);
    // MemberVO클래스에서 mem_id는 접근제한자를 private으로 했으르모
    // 외부에서 접근이 불가하다.
    // 그래서 setter메소드를 제공하고 있다.
    String mem_id = memberVO.setMem_id(mem_id = "KO");

  }

}
