package exam.쓰레드;

public class ThreadWaitNotify {
    public static void main(String[] args) {

        ThreadNotify th1 = new ThreadNotify();
        th1.start();
        //synchronized 므로 모니터링 락 획득.
        synchronized (th1){
            try{
                System.out.println("대기");
                th1.wait(); //
//                wait() 를 하지 않았을 때 로그
//                대기
//                wait 후 작업 : total = 0
//                웨이트 0 번째
//                웨이트 1 번째
//                웨이트 2 번째
//                웨이트 3 번째
//                웨이트 4 번째
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(String.format("wait 후 작업 : total = %d", th1.total));
        }

    }
}
// wait(), notify() 시 로그
//        대기
//        웨이트 0 번째
//        웨이트 1 번째
//        웨이트 2 번째
//        웨이트 3 번째
//        웨이트 4 번째
//        wait 후 작업 : total = 10
