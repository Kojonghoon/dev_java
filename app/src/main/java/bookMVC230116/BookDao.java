package bookMVC230116;

import java.util.List;
import java.util.Map;

public class BookDao {
    /***************************************************
     * 도서정보 삭제 구현
     * 
     * @param bk_no - 도서번호
     * @return 1이면 삭제 성공, 0이면 삭제 실패
     **************************************************/
    public int bookDelete(int bk_no) {
        int result = 0;
        System.out.println("bookDelete호출(사용자가 선택한 도서번호) ====> " + bk_no);
        // insert here
        return result;
    }// end of bookDelete

    /***************************************************
     * 도서정보 수정구현
     * 
     * @param bkVO - 수정요철으로 입력 받은 값
     * @return 1이면 삭제 성공, 0이면 삭제 실패
     **************************************************/
    public int bookUpdate(BookVO bkVO) {
        int result = 0;
        // 롬복어노테이션 @data를 사용했기에 getter/setter메소드는 없지만 사용가능함
        // 단 VO타입이므로 전변에 담긴 값을 출력하려면 getter메소드 호출함
        // 전역변수는 캡슐화로 인해 직접 접근 불가하고 위변조로 인한 피해로부터 보호를 위해
        // 전급제한자는 반드시 private
        System.out.println("bookUpdate호출(사용자가 선택한 도서정보 - 주소번지 출력됨)===> " + bkVO);
        // insert here
        return result;
    }// end of bookUpdate

    /***************************************************
     * 도서정보 입력하기
     * 
     * @param bkVO - 입력요청으로 입력 받은 값
     * @return 1이면 삭제 성공, 0이면 삭제 실패
     **************************************************/
    public int bookInsert(BookVO bkVO) {
        int result = 0;
        System.out.println("bookInsert호출(사용자가 선택한 도서정보 - 주소번지 출력됨)===> " + bkVO);
        // insert here
        return result;
    }// end of bookInsert

    /***************************************************
     * 도서 목록 조회
     * SELECT bk_no, bk_title FRON book
     * WHERE bk_title(?)=?
     * WHERE bk_author(?)=?
     * WHERE bk_info(?)=?
     * 
     * @param cols 컬럼명 bk_title or bk_author or bk_info
     * @param keyword 텍스트필드에 사용자가 입력한 값
     * @return 겁색결과는 N개 fhdn List<Map<>>
     * 조인이 필수적인 경우에는 반드시 List<Map>형태가 유리하고
     * 그렇지 않은 경우라면 List<XXXVO>형태가 별 차이가 없다.
     * 단 조회 결과로 얻은 정보를 사용하여 자바코드에서 연산을 해야하는 경우라면
     * 제네릭 타입으로 Map보다는 XXXVO가 유리함
     * Map이면 리턴값이 무조건 Object이다. ClassCastingException
     * 
     * int i = integer.parseInt(pMap.get("bk_no").toString())
     * int i = xxxVO.getBKno();
     **************************************************/
    public List<Map<String, Object>> getBookList(String cols, String keyword) {
        return null;
    }
}
