package exam.스코프;

public class VariableScope {
    int global = 10;    // 클래스 전체 범위
    static int globalStatic = 20;

    public void scopeCheck1(int val){
        int local = 20;
        System.out.println(global);     //사용가능
    }

    public void scopeCheck2(int val){
        System.out.println(global);     //사용가능
//        System.out.println(local);      //사용불가
    }
    // * 1. 변수를 선언한 블록 영역 구분

    public static void main(String[] args) {
//        System.out.println(global);     //사용불가
//        System.out.println(local);      //사용불가

        // * 2. static.
        // 클래스는 붕어빵 틀 => 인스턴스 화 하지 않으면 사용 불가. (붕어빵 틀 != 붕어빵).
        // static 은 인스턴스화 되지 않아도 미리 온로드 되어있어서 사용가능.

        System.out.println(globalStatic);   //사용 가능
        ScopeTest s = new ScopeTest();
        System.out.println(s.global);
        s.global = 22;
        System.out.println(s.global);

        VariableScope vs1 = new VariableScope();
        VariableScope vs2 = new VariableScope();
        System.out.println(vs1.globalStatic);
        System.out.println(vs2.globalStatic);

        vs1.globalStatic = 9;

        System.out.println(vs1.globalStatic);
        System.out.println(vs2.globalStatic);

        // vs1과 vs2의 globalStatic은 같은값 참조. 하나만 바꿔도 값은 같다.

        System.out.println(VariableScope.globalStatic);
        //static 은 이런식으로 사용


    }

}

