package exam.쓰레드;

public class MyThread1 extends Thread {

    String str;

    public MyThread1(String str){
        this.str = str;
    }

    @Override
    public void run(){

        for(int i = 0; i < 5; i++){

            System.out.println("%s-%d 쓰레드 입니다".formatted(this.str, i));

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }

}
