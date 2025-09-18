import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("sout 오");

        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);


        Integer a = 123;

        l.add(4);
        l.add(4, 9);

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);

        System.out.println(ll.get(1));

        System.out.println(Collections.emptyMap());
        System.out.println(Collections.emptyList());

        System.out.println(Map.of());
        System.out.println(Set.of());
        System.out.println(List.of());

        String str = null;

        for (int i = 0; i < 10; i++) {
            if (str.equals("A") || str.equals("B") || str.equals("C")) {
                System.out.println("do something");
            }
        }

        for (int i = 0; i < 10; i++) {
            if (!str.equals("A") || !str.equals("B") || !str.equals("C")) {
                continue;
            }

            System.out.println("do something");
        }
    }
}