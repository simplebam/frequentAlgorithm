package base.ch02;

public class SelectionSort {

    public static void sort(long[] arr) {
        int k;
        long temp;
        for (int i = 0; i < arr.length - 1; i++) {
            k = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[k] > arr[j]) {
                    k = j;
                }
            }

            temp = arr[k];
            arr[k] = arr[i];
            arr[i] = temp;

        }
    }
}
