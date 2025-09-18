package exam.어노테이션;

import java.lang.reflect.Method;

public class AnnotationExam {
    public static void main(String[] args) {
        Test t = new Test();

        try {

            Method m = t.getClass().getDeclaredMethod("test"); //특정 클래스, 즉Object 에 정의된 "test"메소드 정보를 가져옴. 없으면 에러

            if(m.isAnnotationPresent(CountAnnotation.class)){
                //특정어노테이션이 적용되어있는지?
                System.out.println("적용됨");
            } else {
                System.out.println("안됨");
            }
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

    }
}
