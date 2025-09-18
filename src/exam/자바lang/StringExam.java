package exam.자바lang;

public class StringExam {
    public static void main(String[] args) {
        String str1 = "첫번째";
        String str2 = str1.substring(0,1);
        System.out.println(str1);
        System.out.println(str2);
        //String 은 불변클래스. str1 자체는 변화가 없다.

        String str3 = str1 + str2;
        System.out.println(str3);

        //str3은 아래와 같은 흐름.
        String str4 = new StringBuffer().append(str1).append(str2).toString();
        System.out.println(str4);

        // *** 반복문안에서 str + str 은 피해야한다.
        // 항상 stringBuffer 객체가 만들어지므로 => n회마다 stringBuffer 객체가 생성됨. => 속도저하
        // StringBuffer 를 직접 만들어서 사용하는게 맞다.
        
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            sb.append("어쩌구");
        }
        String str5 = sb.toString();
        System.out.println(str5);

    }
}
