package base.ch01;

public class Exam {

    public static void main(String... args) {

        int[] arr = {1, 5, 7, 8, 9, 13};
//        System.out.println(binarySearch(arr, 6));

        System.out.println(binarySearch2(arr, 3, 0, arr.length - 1));

    }

    private static int binarySearch2(int[] arr, int key, int low, int high) {
        int middle = (low + high) >>> 1;
        if (arr[middle] == key) {
            return middle;
        }

        if (low > high) {
            return -1;
        }

        if (arr[middle] > key) {
            return binarySearch2(arr, key, low, middle - 1);
        } else if (arr[middle] < key) {
            return binarySearch2(arr, key, middle + 1, high);
        }
        return -1;
    }


    private static int binarySearch0(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int middle = (low + high) >>> 1;
            if (arr[middle] > key) {
                high = middle - 1;
            } else if (arr[middle] < key) {
                low = middle + 1;
            } else {
                //找到的情况下
                return middle;
            }
        }

        return -(low + 1);

    }


    private static int binarySearch(int[] arr, int key) {
        int middle = 0;
        int low = 0;
        int high = arr.length - 1;
        while (true) {
            middle = (low + high) / 2;
            if (arr[middle] == key) {
                return middle;
            } else if (low > high) {
                return -1;
            } else {
                if (arr[middle] > key) {
                    //说明需要往左边查询
                    high = middle - 1;
                } else {
                    //说明需要往右边查询
                    low = middle + 1;
                }
            }
        }

    }


    /**
     * 实现数组的反转
     */
    public static int[] reverse(int[] arr) {
        int newArr[] = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < newArr.length; i++, j--) {
            newArr[i] = arr[j];
        }
        return newArr;
    }
}
