package dev_java.D2212.week6.date230102;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
  String path = "";
  public void output() {
    FileWriter fw = null;
    try {
      fw = new FileWriter("test.txt", true);
      fw.write(97);
      fw.write(65);
      // IO패키지는 스트ㅡ림형태로 이동하니까 열려있을 경우 인터셉트나 워변조가 가능하므로
      // 반드시 사용후에는 닫도록 하고 있다.
      fw.close();
    } catch (FileNotFoundException fe) {
      System.out.println("파일이 존재하지 않습니다.");
    } catch (IOException ie) {
      ie.printStackTrace();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      // 예외가 발생하든 그렇지 않든 무조건 처리할 코드는 여기에 작성할 것.
      try {
        if (fw != null)
          fw.close();
      } catch (Exception e) {

      }
    }

  }

  public static void main(String[] args) {
    FileTest ft = new FileTest();
    ft.output();
  }
}
