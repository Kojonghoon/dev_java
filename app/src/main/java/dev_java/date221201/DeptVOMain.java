package dev_java.date221201;

public class DeptVOMain {
  public static void main(String[] args) {
    DeptVO deptVO = new DeptVO();
    deptVO.deptno = 10;
    deptVO.dname = "개발1팀";
    System.out.println(deptVO.deptno);// 10
    System.out.println(deptVO.dname);// 개발1팀
    System.out.println(deptVO.deptno);// 10
    System.out.println(deptVO);//위치
    System.out.println("==============");
    deptVO = new DeptVO();// 변수 선언X, 객체 생성
    System.out.println(deptVO); // 위치
    deptVO.deptno = 30;
    deptVO.dname = "개발2팀";
    System.out.println(deptVO.deptno);// 30
    System.out.println(deptVO.dname); // 개발2팀
    System.out.println(deptVO.loc); // null
  }
}
