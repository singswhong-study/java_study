package exam.클래스;

public class Field {
    public static void main(String[] args) {
        //Field : 클래스의 속성, 프로퍼티를 의미함.
        Car c1 = new Car();
        Car c2 = new Car();
        
        c1.name = "벤츠";
        c1.color = "블랙";

        c2.name = "아우디";
        c2.color = "레드";

        System.out.println(c1.toString());
        System.out.println(c2.toString());

    }

    public static class Car {
        //타입    필드명
        String name;
        String color;

        public String toString(){
            return "name : " + this.name + ", color : " + this.color;
        }
    }
}
