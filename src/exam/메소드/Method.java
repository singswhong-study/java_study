package exam.메소드;

public class Method {
    public void m1() {
        System.out.println("빈 메소드");
    }
    public void m2(int a) {
        System.out.println(String.format("%d 를 받는 메소드", a));
    }

    public int m3() {
        System.out.println("무조건 3을 리턴하는 메소드");
        return 3;
    }
}