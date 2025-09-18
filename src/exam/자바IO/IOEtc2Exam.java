package exam.자바IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOEtc2Exam {
    public static void main(String[] args) {
        //다양한 타입의 입력
        try(
                //IO객체 선언, 다양한 타입을 쓸수있는 DataOutputStream.
                DataInputStream in = new DataInputStream(new FileInputStream("src/exam/자바IO/test4.txt"));
        ){
            //IO객체 사용. DataOutputStream 으로 저장한 순서대로 읽어야 한다.************ read 순서가 바뀌면 값이 잘못됨.
            int i = in.readInt();
            boolean b = in.readBoolean();
            double d = in.readDouble();

            System.out.println(i);
            System.out.println(b);
            System.out.println(d);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
