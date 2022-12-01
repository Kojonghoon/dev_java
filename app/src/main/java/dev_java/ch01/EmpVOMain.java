package dev_java.ch01;

class EmpVO {
  // 사원번호를 담기
  int empno;
  // 사원이름을 감기
  String ename;
}

public class EmpVOMain {
  public static void main(String[] args) {
    EmpVO empVO = new EmpVO();
    empVO.empno = 1234;
    empVO.ename = "이순신 ";
    System.out.println(empVO.empno + "." + empVO.ename);
    System.out.println("==============");
    empVO = new EmpVO();
    empVO.empno = 5789;
    empVO.ename = "강감찬";
    System.out.println(empVO.empno + "." + empVO.ename);
  }
}