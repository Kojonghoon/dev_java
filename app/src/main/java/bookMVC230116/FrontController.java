package bookMVC230116;

public class FrontController {
    // public static Object getController(String gubun) {
    public static Object getController(String gubun) {
        Object obj = null;// BookController or BoardController
        // FrontController obj = null;// BookController or BoardController
        if ("bookMgr".equals(gubun)) {
            obj = new BookController();
        } else if ("boardMgr".equals(gubun)) {
            obj = new BoardController();
        }
        return obj;
    }
}
