package exam.타입;

public class Type {
    /*
    <기본형, 원시형, primitive>
        논리형 : boolean
        문자형 : char
        정수형 : byte, short, int, long
        실수형 : float, double
    */

    /*
    <참조형, reference>
        기본형 외 모든 타입
        String, Class 등
     */

    public static void main(String[] args) {

        int i = 4; //정수 => 원시형

        String str = new String("참조형");
        // string 은 new 하고 생성자 String()가 존재함. => 메모리에 객체 (혹은 인스턴스) 가 생성
        // str이라는 string은 "참조형" 이라는 String 객체를 참조한다.

    }

}
