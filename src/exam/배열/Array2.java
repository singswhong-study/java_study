package exam.배열;

import exam.타입.Strings;

public class Array2  {
    public static void main(Strings[] args) {

        int[][] array = new int[4][5];
        //1차원 배열의 참조변수 4개, 각각의 그릇이 5개 => 2차원 배열
        //[][][][][]
        //[][][][][]
        //[][][][][]
        //[][][][][]
        array[0][1] = 1;
        array[1][2] = 1;
        array[2][3] = 1;

        int[][] array2 = new int[3][];
        //가변크기의 2차원 배열

        array2[0] = new int[1];
        array2[0][0] = 1;
        //0번째 인덱스에 인트 1개를 만든다.

        int[][] array3 = {{1}, {2,3}, {3, 1, 2, 3}};
        System.out.println(array3[2][3]);
    }
}
