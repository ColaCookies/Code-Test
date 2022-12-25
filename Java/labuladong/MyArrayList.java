package Java.labuladong;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<E> implements Iterable<E> {
    // 真正存储数据的底层数组
    private E[] data;
    // 记录当前元素个数
    private int size;
    // 默认初始容量
    private static final int INIT_CAP = 1;

    public MyArrayList() {
        this(INIT_CAP);
    }

    public MyArrayList(int initCapacity) {
        data = (E[]) new Object[initCapacity];
        size = 0;
    }

    // 增
    public void addLast(E e) {
        if (data.length == size) {
            resize( data.length*2 );
        }
        data[size] = e;
        size++;

    }

    //在 index 索引的位置添加一个元素 e
    public void add(int index, E e) {
        
    }

    public void addFirst(E e) {
    }















    // 删
    // 删除数组的最后一个元素并返回
    public E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (size < data.length /4 ) {
            resize(data.length /2);
        }

        E deletedVal = data[size -1];
        data[size -1] = null;

        size--;
        return deletedVal;
    }

    // 删除 index 对应的元素并返回
    public E remove(int index) {
        return null;
        
    }

    public E removeFirst() {
        return remove(0);
    }

    // 查
    // 返回索引 index 对应的元素
    public E get(int index) {
        checkElementIndex(index);
        return data[index];
    }

    // 改
    // 将索引 index 的元素改为 element 并返回之前的元素
    public E set(int index, E element) {
        // 检查索引越界
        checkElementIndex(index);
        // 修改数据
        E oldVal = data[index];
        data[index] = element;
        return oldVal;
    }

    // 工具方法
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // 将 data 的容量改为 newCap
    private void resize(int newCap) {
        if (size > newCap) {
            return;
        }
        E[] temp = (E[]) new Object[newCap];

        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        // System.arraycopy(data, 0, temp, 0, size);
        data = temp;
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    // 检查 index 索引位置是否可以存在元素

    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    // 检查 index 索引位置是否可以添加元素

    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int p = 0;

            @Override
            public boolean hasNext() {
                return p != size;
            }

            @Override
            public E next() {
                return data[p++];
            }
        };
    }

    private void display() {
        System.out.println("size = " + size + " cap = " + data.length);
        System.out.println(Arrays.toString(data));
    }


    public static void main(String[] args) {
        // 初始容量设置为 3
        MyArrayList<Integer> arr = new MyArrayList<>(3);

        // 添加 5 个元素
        for (int i = 1; i <= 5; i++) {
            arr.addLast(i);
        }

        arr.remove(3);
        arr.add(1, 9);
        arr.addFirst(100);
        int val = arr.removeLast();

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

}