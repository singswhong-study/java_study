package exam.쓰레드;

public class ThreadNotify extends Thread {
    int total;

    @Override
    public void run(){
        synchronized (this){
            for (int i = 0; i < 5; i++) {
                System.out.println(String.format("%s %d 번째", "웨이트", i));
                total += i;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            notify();
        }
    }
}
