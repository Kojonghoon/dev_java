package dev_java.date221202;

//자료구조의 일부로 사용함
//회원정보를 관리하기 위한 목적으로 설계하였다. - 그래서 main 메소드는 필요없다.
public class MemberVOMain {
  public static void main(String[] args) {

    MemberVO memberVO = new MemberVO();
    String 사용자가입력한아이디 = "tomato";
    System.out.println(사용자가입력한아이디);
    // MemberVO클래스에서 mem_id는 접근제한자를 private으로 했으르모
    // 외부에서 접근이 불가하다.
    // 그래서 setter메소드를 제공하고 있다.
    // Private으로 선언된 변수는 클래스 외부에서 사용이 불가함 - 보안 - 캡슐화
    memberVO.setMem_id("tomato");
    // private가 아닌 public 이면 ("토마토")가 아닌 = 토마토 도 가능
    String id = memberVO.getMem_id();
    System.out.println(id);// tomato
    System.out.println(memberVO.getMem_id());// tomato
    // mem_name의 경우 접근제한자를 public으로 했으므로 직접 초기화가 가능하다.
    // memberVO.mem_name="토마토";
    String mem_id = memberVO.getMem_id();
    System.out.println(mem_id);
    memberVO.setMem_id(mem_id);

    memberVO.setMem_pw("12345");
    String mem_pw = memberVO.getMem_pw();
    System.out.println(mem_pw);

    memberVO.setMem_name("홍길동");// setter 메소드를 호출하는 것만으로 초기화됨
    String mem_name = memberVO.getMem_name();// 홍길동 출력
    System.out.println(mem_name);

  }

}
