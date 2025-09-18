package exam.쓰레드;

public class MyThreadExam {

    //JVM 도 process. 이 process 를 나눠서 사용하는것이 thread

    // 1. thread 클래스를 상속.extends 하는 방법
    // 2. thread 의 runnable 을 interface를 구현하는 방법
    public static void main(String[] args) {

        //Thread 상속
        MyThread1 th1 = new MyThread1("첫번째");
        MyThread1 th2 = new MyThread1("두번째");

//        th1.start();
//        th2.start();

        //runnable 구현
        MyThread2 th3 = new MyThread2("세번째");
        MyThread2 th4 = new MyThread2("네번째");

        Thread th5 = new Thread(th3);
        Thread th6 = new Thread(th4);

//        th3.run();
//        th4.run();
        // 이렇게하면 순차실행임. XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

        th5.start();
        th6.start();

        System.out.println("main end!");

    }
}
