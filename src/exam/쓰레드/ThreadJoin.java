package exam.쓰레드;

public class ThreadJoin {
    public static void main(String[] args) {
        MyThread1 th1 = new MyThread1("스트링");

        th1.start();

        System.out.println("시작");

        try {
            th1.join(); //쓰레드가 끝날때까지 기다림.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("종료");
    }
}
