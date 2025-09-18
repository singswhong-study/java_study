package exam.배열;

import exam.타입.Strings;

public class ForEach {
    public static void main(Strings[] args) {

        int[] iarr = {10,20,30,40,50};

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }

        for(int value:iarr){
            System.out.println(value);
        }

    }
}
