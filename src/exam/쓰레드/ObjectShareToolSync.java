package exam.쓰레드;

public class ObjectShareToolSync extends Thread {
    int type;
    ObjectShareSync os;

    public ObjectShareToolSync(int type, ObjectShareSync os){
        this.type = type;
        this.os = os;
    }

    @Override
    public void run(){
        switch(type) {
            case 1:
                os.play1();;
                break;
            case 2:
                os.play2();
                break;
            default:
                os.play3();
        }
    }
}
