package base.ch02;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        long[] arr={3,1,8,3,11,66,33,2};
        System.out.println(Arrays.toString(arr));

        System.out.println("----------------------");
        BubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));



    }
}
