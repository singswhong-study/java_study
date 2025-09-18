package exam.쓰레드;

public class ObjectShareExam {
    public static void main(String[] args) {
        ObjectShare os = new ObjectShare();

        ObjectShareTool tool1 = new ObjectShareTool(1, os);
        ObjectShareTool tool2 = new ObjectShareTool(2, os);
        ObjectShareTool tool3 = new ObjectShareTool(3, os);

//        tool1.start();
//        tool2.start();
//        tool3.start();


        //동기화와 동기화 블럭처리
        ObjectShareSync oss = new ObjectShareSync();

        ObjectShareToolSync tool4 = new ObjectShareToolSync(1, oss);
        ObjectShareToolSync tool5 = new ObjectShareToolSync(2, oss);
        ObjectShareToolSync tool6 = new ObjectShareToolSync(3, oss);
        tool4.start();
        tool5.start();
        tool6.start();
        // synchronized 가 붙어서 쓰레드 하나가 완료되면 다음 쓰레드로. monitoring lock 이 걸린다.
        // sync와 일반이 섞이면 이반 메소드는 상관없이 실행됨.
        // 메소드 자체가 아니라 메소드 내의 block만 따로 설정도 가능 => synchronized(this){} => 필요한 부분만 동기화

    }
}
