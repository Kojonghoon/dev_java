package bookMVC230116;

//반드시 구현체 클래스가 있어야만 한다.
//추상클래스는 생성자를 가진다.
//인터페이스는 생성자를 못가짐
//추상클래스는 추상메소드만 가진다. - 일반메소드 불가
// 생성부자 불가
//일반 전변불가

public interface Controller {
    public abstract FrontController getController(String gubun);

}
