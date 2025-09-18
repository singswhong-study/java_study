package exam.자바lang;

public class StringBufferExam {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("안");
        sb.append("녕");
        sb.append("하슈");

        System.out.println(sb.toString());

        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = sb1.append("같다");

        if(sb1 == sb2){
            System.out.println("같아요");
            System.out.println(sb1.toString());
            System.out.println(sb2.toString());
        }

        //본인을 호출해서 값을 바꿔나감. 메소드 체이닝 

    }
}
