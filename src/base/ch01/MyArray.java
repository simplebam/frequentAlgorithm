package base.ch01;

/**
 * 数组-增删改查
 */
public class MyArray {
    private long[] arr;

    private int elements;

    public MyArray() {
        this(50);
    }

    public MyArray(int maxSize) {
        this.arr = new long[maxSize];
    }


    /**
     * 增
     */
    public void insert(long value) {
        if (elements == arr.length) {
            throw new ArrayIndexOutOfBoundsException("数组爆了");
        }

        arr[elements] = value;
        elements++;
    }





    /**
     * 显示
     */
    public void display() {
        System.out.print("[ ");
        for (int i = 0; i < elements; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    /**
     * 查询-返回索引
     */
    public int search(long value) {
        int i;
        for (i = 0; i < elements; i++) {
            if (arr[i] == value) {
                break;
            }
        }

        if (i == elements) {
            //说明查找不到
            i = -1;
        }
        return i;
    }

    /**
     * 根据索引查找值
     */
    public long get(int index) {
        checkIndex(index);
        return arr[index];
    }


    /**
     * 根据索引更新数据
     */
    public void update(int index, long value) {
        checkIndex(index);
        arr[index] = value;
    }

    /**
     * 删除数据
     */
    public void delete(int index) {
        checkIndex(index);
        for (int i = index; i < elements; i++) {
            arr[i] = arr[i + 1];
        }
        elements--;
    }

    /**
     * 删除数据
     */
    public void delete(long value) {
        int i;
        for (i = 0; i < elements; i++) {
            if (arr[i] == value) {
                break;
            }
        }
        if (i == elements) return;
        delete(i);
    }



    private void checkIndex(int index) {
        if (index < 0 || index >= elements) {
            throw new ArrayIndexOutOfBoundsException("数组越界");
        }
    }


}

