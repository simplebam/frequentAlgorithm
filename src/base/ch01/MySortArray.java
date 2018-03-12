package base.ch01;

/**
 * 有序数组-增删改查
 */
public class MySortArray {
    private long[] arr;

    private int elements;

    public MySortArray() {
        this(50);
    }

    public MySortArray(int maxSize) {
        this.arr = new long[maxSize];
    }


    /**
     * 增
     */
    public void insert(long value) {
        if (elements == arr.length) {
            throw new ArrayIndexOutOfBoundsException("数组爆了");
        }
        //先拿到索引值
        int index;
        for (index = 0; index < elements; index++) {
            if (arr[index] > value) {
                break;
            }
        }

        int i;
        for (i = elements; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[i] = value;
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
     * 根据索引删除数据
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

