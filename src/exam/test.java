package exam;

import exam.배열.Array;

public class test {

    public static void main(String[] args) {
        int a = 1;
        add_pri(a);
        System.out.println(a);

        int[] arr = {1};
        add_ref(arr);
        System.out.println(arr[0]);

    }

    static void add_pri(int a){
        a += 1;
    }
    static void add_ref(int[] arr){
        arr[0] += 1;
    }
}
