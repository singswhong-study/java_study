package exam.열거형;

public class EnumExam {
    //특정값만 가져가서 사용해야 할 때
    public static final String MALE = "MALE"; // 예전에는 이런식으로 사용

    public static void main(String[] args) {

        System.out.println(MALE);
        System.out.println(GENDER.MALE);
        System.out.println(GENDER.FEMALE);

    }
    enum GENDER {   // 이런식으로 사용.
        MALE,
        FEMALE
    };
}
