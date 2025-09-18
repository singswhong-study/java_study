package exam.유틸;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
    //리스트는 배열과 비슷하게 사용
    //배열과 달리 필요에따라 크기 변경 자유로움

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("A");

        System.out.println(list.size()); //중복허용되므로 3개

        for(int i = 0; i < list.size(); i++){
            String str = list.get(i);
            System.out.println(str);
        }

    }
}
