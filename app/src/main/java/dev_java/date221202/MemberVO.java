package dev_java.date221202;

//자료구조의 일부로 사용함
public class MemberVO {
  private String mem_id = null;
  private String mem_pw = null;
  private String mem_name = null;

  // setter는 write.save
  // setter메소드를 활용하여 전변 mem_id를 초기화 한다
  public void setMem_id(String mem_id) {
    this.mem_id = mem_id;
  }

  public void setMem_pw(String mem_pw) {
    this.mem_pw = mem_pw;
  }

  public void setMem_name(String mem_name) {
    this.mem_name = mem_name;
  }

  // getter는 read, 듣기
  public String getMem_id() {
    return mem_id;
  }

  public static void main(String[] args) {
    MemberVO memberVO = new MemberVO();
    System.out.println(memberVO.mem_id); // null - 초기화를 하지 않았기에
  }

  public String getMem_pw() {
    return mem_pw;
  }

  public String getMem_name() {
    return mem_name;
  }

}
