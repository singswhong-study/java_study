package exam.자바IO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class IOEtc1Exam {
    public static void main(String[] args) {
        //다양한 타입의 출력

        //try with resource
        try(
                //IO객체 선언, 다양한 타입을 쓸수있는 DataOutputStream.
                //별도의 close를 하지 않아도 됨.
                DataOutputStream out = new DataOutputStream(new FileOutputStream("src/exam/자바IO/test4.txt"));
        ){
            //IO객체 사용
            out.writeInt(100);
            out.writeBoolean(true);
            out.writeDouble(50.5);
            //=> 이렇게 작성했을 시 InputStream으로 읽어야 정상작동.

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
