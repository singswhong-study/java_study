package exam.자바IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOExam {
    //byte 단위 입출력은 InputStream, OutputStream 추상클래스를 상속받아서 만듬.
    //char 문자단위 입출력은 Reader, Writer 추상클래스를 상속받아서 만듬.

//    파일로 부터 입력받고 쓰기 위한 클래스 : FileInputStream, FileOutputStream, FileReader, FileWriter
//    배열로 부터 입력받고 쓰기 위한 클래스 : ByteArrayInputStream, ByteArrayOutputStream, CharReader, CharWriter
//      => 해당 클래스들은 어디로부터, 어디에라는 대상을 지정할 수 있는 IO클래스.  "장식대상 클래스"

//    DataInputStream, DataOutputStream같은 클래스를 보면 다양한 데이터 형을 입력받고 출력
//    PrintWriter는 다양하게 한줄 출력하는 pintln()메소드를 가짐.
//    BufferedReader는 한줄 입력받는 readLine()메소드를 가짐.
//      => 이런 클래스들은 다양한 방식으로 입력하고, 출력하는 기능을 제공. "장식하는 클래스"

    //왜 장식? => Decorator Pattern. 하나의 클래스를 장식하는 것 처럼 생성자에서 감싸서 새로운 기능을 추가할 수 있도록 만드는 방식이라서.

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(start);

        FileInputStream fis = null; //바이트 단위로 파일을 읽음
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("src/exam/자바IO/test.txt"); //읽을 파일
            fos = new FileOutputStream("src/exam/자바IO/test2.txt"); //생성할 경로

            int read = -1;

            while((read = fis.read()) != -1){
                fos.write(read);
            }
            

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        long end = System.currentTimeMillis();
        System.out.println(end);
    }

}
