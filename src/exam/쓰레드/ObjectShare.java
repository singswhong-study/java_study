package exam.쓰레드;

public class ObjectShare {
    //여러개의 쓰레드에서 하나의 객체를 사용

    public void play1(){
        for(int i = 0; i < 3; i++){
            System.out.println("댄스");

            try{
                Thread.sleep(1000);
            } catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }

    public void play2(){
        for(int i = 0; i < 3; i++){
            System.out.println("뮤직");

            try{
                Thread.sleep(1000);
            } catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
    public void play3(){
        for(int i = 0; i < 3; i++){
            System.out.println("랩");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException ie){
                ie.printStackTrace();
            }

        }
    }

}
