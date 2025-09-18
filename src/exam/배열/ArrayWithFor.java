package exam.배열;

import exam.타입.Strings;

public class ArrayWithFor {
    public static void main(Strings[] args) {
        int[] array = new int[100];

        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }

        int sum = 0;
        for(int num : array){
            sum += num;
        }
    }
}
