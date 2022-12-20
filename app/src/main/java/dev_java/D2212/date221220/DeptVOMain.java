package dev_java.D2212.date221220;

public class DeptVOMain {
  public static void main(String[] args) {
    // DeptVO dVo = new DeptVO(); // 0 null null DeptVO에서 builder를 주석처리해야 댐
    DeptVO dVo = DeptVO.builder().deptno(10).build();
    DeptVO dVo1 = DeptVO.builder().dname("총무부").build();
    DeptVO dVo2 = DeptVO.builder().deptno(20).loc("부산").dname("총무부").build();
    // deptno, dname, loc 순서가 바뀌어도 상관이 없이 반영가능
    System.out.println(dVo.getDeptno() + ", " + dVo.getDname() + ", " + dVo.getLoc());
    System.out.println(dVo1.getDeptno() + ", " + dVo1.getDname() + ", " + dVo1.getLoc());
    System.out.println(dVo2.getDeptno() + ", " + dVo2.getDname() + ", " + dVo2.getLoc());

  }

}
