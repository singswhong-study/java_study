package exam.유틸;

import java.util.*;

public class MapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("1", "A");
        map.put("2", "B");
        map.put("1", "C");

        System.out.println(map.size()); // 두번째 1, C로 덮어씌워짐. 2개

        System.out.println(map.get("1"));
        System.out.println(map.get("2"));

        //map의 key들을 Set자료구조로.
        Set<String> keys = map.keySet();
        System.out.println(keys);

        Iterator<String> itr = keys.iterator();
        while(itr.hasNext()){
            String key = itr.next();
            System.out.println(key + ", " + map.get(key));
        }
    }
}
