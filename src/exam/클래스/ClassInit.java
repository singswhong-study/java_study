package exam.클래스;

public class ClassInit {
    // 객체 = 붕어빵, 붕어빵틀 = 클래스
    public static void main(String[] args) {

        Car c1 = new Car("람보르기니");
        
        System.out.println(c1.name);
        System.out.println(c1.color);

        Car c2 = new Car("벤츠", "블랙");
        System.out.println(c2.name);
        System.out.println(c2.color);


    }
    public static class Car {
        String name;
        String color;

        Car(String name){   //생성자1
            this.name = name;
        }

        Car(String name, String color){   //생성자2
            this.name = name;
            this.color = color;
        }

    }
}
