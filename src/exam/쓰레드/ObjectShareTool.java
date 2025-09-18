package exam.쓰레드;

public class ObjectShareTool extends Thread {
    int type;
    ObjectShare os;

    public ObjectShareTool(int type, ObjectShare os){
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
