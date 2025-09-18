package exam.자바lang;

public class WrapperExam {
    public static void main(String[] args) {
        //기본형 타입의 객체화를 도와주는 클래스 => wrapper class
        //Boolean, Byte, Short, Integer, Long, Float, Double 클래스
        //String, StringBuffer, StringBuilder
        //원시조상인 Object
        //System, Math, Thread 등등..

        int i1 = 5;         //기본형
//        Integer i3 = new Integer(5); //wrapper 클래스인 Integer 로 참조형으로 만듬. 현재 삭제됨.
        Integer i2 = 5;     // 이렇게 하면 위의 초기화처럼 동작함. => 오토박싱**
        int i3 = i2.intValue(); //원래 이렇게 해야했지만
        int i4 = i2;            // 이렇게 해도되는것. => 오토언박싱**

        // 오토박싱/ 오토언박싱이 진행될 때 wrapper 클래스가 내부적으로 사용됨.
    }
}
