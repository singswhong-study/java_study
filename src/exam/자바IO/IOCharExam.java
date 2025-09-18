package exam.자바IO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IOCharExam {
    public static void main(String[] args) {
        //키보드로부터 입력을 받아서 하는 예제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //데코레이터 패턴

        String readLine = null;
        try {
            readLine = br.readLine();
        } catch(Exception e){
            e.printStackTrace();
        }

        System.out.println(readLine);
    }
}
