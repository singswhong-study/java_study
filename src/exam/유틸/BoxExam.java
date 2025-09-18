package exam.유틸;

public class BoxExam {

    public static void main(String[] args) {
        Box box = new Box();
        box.setObj(new Object());

        Object obj = box.getObj();

        //Object 타입에는 Object 하위 모든것들이 가능.
        box.setObj("스트링");

        //하지만 설정한 String 타입으로 가져올려면 형변환이 필요.
        String str = (String) box.getObj();

        box.setObj(1);
        int num = (int) box.getObj();

        BoxGeneric<String> box1 = new BoxGeneric<>();
        box1.setObj("스트링");
        String str1 = box1.getObj();

        BoxGeneric<Integer> box2 = new BoxGeneric<>();
        box2.setObj(1);
        int num1 = box2.getObj(); //오토박싱,언박싱 가능

        //이런식으로 generic으로 초기화 한다면 그냥 사용가능..


    }
}
