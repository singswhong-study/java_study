package exam.배열;

import exam.타입.Strings;

public class Array {
    public static void main(Strings[] args) {

        int[] array1 = new int[100];
        //처음 만들어진 크기가 변하지 않음. 값을 넣을 수 있는 메모리 n칸을 가짐.

        array1[0] = 1;
        array1[99] = 100;
        //몇번째에 값을 넣을것이다

        int[] array2 = new int[]{1,2,3}; 
        //new int[3] 에 0,1,2 번째에 값을 넣은것과 같다.
        //array[0] = 1, array[1] = 2, array[2] = 3

        int[] array3 = {1,2,3};
        //위와 같다

        int arrayValue3 = array3[2];
        System.out.println(arrayValue3);

        //참조형 타입.
    }
}
