package exam.자바IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO512Exam {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(start);
        FileInputStream fis = null; //바이트 단위로 파일을 읽음
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("src/exam/자바IO/test.txt"); //읽을 파일
            fos = new FileOutputStream("src/exam/자바IO/test3.txt"); //생성할 경로

            int readCount = -1;
            byte[] buffer = new byte[512];                  //읽을 바이트를 초기화하고
            while((readCount = fis.read(buffer)) != -1){    //read에 그 buffer(512만큼)을 넣어서 읽음. 1000 바이트일때 최초 512, 그다음 488. 수행시간이 1byte씩 읽는것보다 짧다.
                fos.write(buffer, 0, readCount);
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
