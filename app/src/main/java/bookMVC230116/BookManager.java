package bookMVC230116;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//개발 방법론에서 디자인 패턴 중 MVC패턴을 알아보자
//M:모델 계층(XXXLogic.java + XXXDao.java)=>서비스 계층 - 비지니로직(업무)계층
//XXXDao가 있고 없고는 MVC패턴에 영향이 없다.
//다만 오라클 서버와 연계에 반복되는 코드를 줄여주고오픈소스나 라이브러리
//(iBatis,MyBarit,(반자동:주로) Hibernate : 완전자동 - SQL문이 없다.)를 조립하기  위한
//클래스쪼개기(생성자) - POJO(pure,) ->String(maven)->String boot(Gradle) - 완결편
//요구사항으로 만들어 사용하는 클래스 임
//C:컨트롤 계층
//V:뷰계층
//프레임워크를 왜 원하는가? - 실력차이를 줄여야함
//와꾸(틀)가 정해짐 - 클래스 선언, 메소드 선언(단, 파라미터 타입과 갯수는 너가 결정)
//개발자는 비지니스 로직에만 집중해라
//
public class BookManager extends JFrame implements ActionListener {
    JButton jbtn_sel = new JButton("조회");// SELECT문
    JButton jbtn_ins = new JButton("입력");// INSERT문
    JButton jbtn_upd = new JButton("수정");// UPDATE문
    JButton jbtn_del = new JButton("삭제");// DELETE문
    JButton jbtn_board = new JButton("게시판");//
    JPanel jp_north = new JPanel();
    String gubun = "bookMgr";// 도서 CRUD이면 bookMgr을 게시판 CRUD이면 boardMgr

    public BookManager() {
    }

    public void initDisplay() {
        jbtn_sel.addActionListener(this);
        jbtn_ins.addActionListener(this);
        jbtn_upd.addActionListener(this);
        jbtn_del.addActionListener(this);
        jbtn_board.addActionListener(this);
        jp_north.add(jbtn_sel);
        jp_north.add(jbtn_ins);
        jp_north.add(jbtn_upd);
        jp_north.add(jbtn_del);
        jp_north.add(jbtn_board);
        this.add(jp_north);
        this.setTitle("도서관리시스템 Ver1.0");
        this.setLocation(100, 100);
        this.setSize(500, 400);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        BookManager bManager = new BookManager();
        // 메인스레드와 Runnable을 통해서 구현하는 스레드를 분리할 수 있는 경우에 사용함
        // 메인스레드와 자기자신이 run구현체 클래스 역할을 병핼하는 컨셉일 때
        // 지연발생 - 화면이 안떠, 소켓 accept가 안일어남, 죽은거
        bManager.initDisplay();// 리펙토링 -
    }
    // 왜 재정의하는 건가?
    // 아이폰, 갤럭시, 아이패드, 장치마다 결정되지 않았으니까...

    @Override
    public void actionPerformed(ActionEvent e) {// 콜백함수 - 웹, 앱개발, 하이브리드 앱 개발
        // 입력|수정|삭제|조회 버튼익 클릭되면 이벤트를 JVM이 감지하고
        // 감지되면 JVM이 actionPerformed메소드를 알아서 호출해줌
        Object obj = e.getSource();
        BookController bookController = null;
        BoardController boardController = null;
         // 아님 게시판 CRUD 처리할까?
        if (obj == jbtn_board) {
            gubun = "boardMgr";
            if ("boardMgr".equals(gubun)) {
                boardController = (BoardController) FrontController.getController(gubun);
                System.out.println("게시판 선택 => "+boardController );
                //게시판 컨트롤러가 결정되면 다시 디폴트 값으로 초기화
                gubun = "bookMgr";
            }
        }
        // 너도 도서 CRUD처리 할 거니?
        if ("bookMgr".equals(gubun)) {
            System.out.println("도서관리선택");
            bookController  = (BookController)FrontController.getController(gubun);
            System.out.println("도서관리선택 => "+ bookController);
            // if문은 무조건 조건을 따진다.
            // else if 문은 앞조건을 수렴하면 뒤에 있는 코드는 실행기회를 갖지않음
            // 너 조회를 원해?
            if (obj == jbtn_sel) {
                System.out.println("조회");
            }
            // 입력하려구?
            if (obj == jbtn_ins) {
                System.out.println("입력");
            }
            // 수정할거야?
            if (obj == jbtn_upd) {
                System.out.println("수정");
            }
            // 탈퇴할거니?
            if (obj == jbtn_del) {
                System.out.println("삭제");
            }
        }
        // 여기로
    }
}
