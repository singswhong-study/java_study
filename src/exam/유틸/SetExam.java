package exam.유틸;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        boolean a = set1.add("A"); //저장할때마다 boolecn 반환. 같은값이 존재하면 false
        boolean b = set1.add("B");
        boolean c = set1.add("A");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c); //  "A"가 존재하므로 false
        System.out.println(set1.size()); //중복된 "A"제거한 "A", "B" 2개

        Iterator<String> itr = set1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //위는 아래와 같다.
        for (String s : set1) {
            System.out.println(s);
        }

    }
}
