package exam.타입;

public class Strings {
    public static void main(String[] args) {

        String str1 = "하이";
        String str2 = "하이";

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        // constant pool 에 저장 된 녀석이라서 hashCode 가 같다.

        System.out.println(str1 == str2); //true
        // 리터럴 취급이므로 이렇게 비교해도 같다

        String str3 = new String("하이");
        String str4 = new String("하이");

        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
        // 별개의 인스턴스로 생성된 녀석이라 내용물이 같아도 hashCode가 다르다.

        System.out.println(str3 == str4); //false

        String str5 = str3; //객체 3을 참조
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str5));
        //str5는 str3을 가르키고 있는 녀석, 즉 참조 했기때문에 hashCode 가 같다.

        System.out.println(str3 == str5); // 메모리 영역이 같이 때문에 true;
        
        /*
        자바에서 메모리는 
        stack, heap 영역으로 나뉜다.
        stack : 1. 원시형의 정적 타입의 데이터가 값과 같이 할당
                2. heap에 생성된 Object 타입 데이터의 참조값이 항당.
                3. 쓰레드당 하나씩 항당. 각쓰레드는 서로의 stack에 접근 하지 못한다.
        
        heap :  1. 동적으로 할당된 메모리 영역
                2. 모든 Object(객체의 원시조상) 타입의 데이터가 할당됨.
                3. 위에서 할당된 Object의 참조값은 stack에 할당됨.
                4. stack과 다르게 하나의 영역만 존재

        ex)
        stack   :
        heap    :
        ----------------------------------------
        1. 여기서 int a = 1; 초기화 시
        ----------------------------------------
        stack   : a = 1
        heap    :
        ----------------------------------------
        2. 여기서 String name = "abc" ; 초기화 시
        ----------------------------------------
        stack   : a = 1, name
        heap    : "abc"
        ----------------------------------------
            => 변수 name 은 stack에, string 객체인 "abc"는 힙에
        ----------------------------------------
        3. List<String> list = new ArrayList<>(); 초기화 시
        ----------------------------------------
        stack   : a = 1, name, list
        heap    : "abc", 비어있는 list
        ----------------------------------------
        3-1. 여기서 list.add("a"), list.add("b") 했을 때
        ----------------------------------------
        stack   : a = 1, name, list
        heap    : "abc", list[0 ~ 1], "a", "b"
        ----------------------------------------
            => list의 참조값은 stack에, list는 2개의 길이를 가지고 각각의 list[0],[1]값은 strign a,b 로 heap에 채워짐.


        4. stack과 연결되지 않은 heap은?
            => GC가 제거함.

        */
    }
}
