package exam.자바IO;

import java.io.*;

public class IOCharFileExam {
    public static void main(String[] args) {

        BufferedReader br = null;
        PrintWriter pw = null;

        try {

            br = new BufferedReader(new FileReader("src/exam/자바IO/test.txt"));
            pw = new PrintWriter(new FileWriter("src/exam/자바IO/test5.txt"));

            String line = null; //한줄 읽고 저장할 공간

            while((line = br.readLine()) != null){
                pw.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pw.close(); //닫아주지 않으면 아무내용도 완성되지않음. 빈파일..
                br.close();
            } catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
