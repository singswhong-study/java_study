package exam.쓰레드;

public class DaemonThread implements Runnable {
    
    //데몬은 유닉스 계열 운영체제에서 백그라운드로 동작하는 프로그램
    //이렇게 만드는 이유는 백그라운드에서 특별한 작업을 처리하게 하는 용도
    //일반쓰레드가 종료되면 강제로 종료되는 특징.

    @Override
    public void run(){
        while (true) {
            System.out.println("데몬 쓰레드가 실행중입니다.");

            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
                break; //Exception발생시 while 문 빠찌도록
            }
        }
    }

    public static void main(String[] args) {
        Thread th1 = new Thread(new DaemonThread()); // runnable interface 작성 시 new Runnable 을 매개변수로.

        th1.setDaemon(true);
        th1.start();
    
        try {
            System.out.println("메인 시작");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("메인 쓰레드가 종료");

    }
}
