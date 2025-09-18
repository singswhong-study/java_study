package exam.쓰레드;

public class MyThread2 implements Runnable {
    //자바는 단일상속만 지원하므로, 다른클래스를 상속하는 중에 Thread를 상속할 수 없으므로 runnable interface 를 구현해서 사용하면 된다.
    String str;

    public MyThread2 (String str){
        this.str = str;
    }


    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(String.format("%s-%d 러너블 쓰레드에요", str, i));

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
