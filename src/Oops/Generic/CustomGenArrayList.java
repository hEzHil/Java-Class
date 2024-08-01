package Oops.Generic;

import java.util.Arrays;
import java.util.Objects;

public class CustomGenArrayList<T> {

    private Object[] data;
    private  static int Default_Size = 10;
    private int size =0;

    public CustomGenArrayList()      {
        data = new Object[Default_Size];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[Default_Size * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    public T  remove(){
        T removed = (T)(data[--size]);
        return removed;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    public void set(int index , T value){
        data[index] = value;
    }

    public int size(){
        return size;
    }

    private boolean isFull() {
        return size == Default_Size;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args){

        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
        for (int i = 0; i < 14; i++) {
            list.add( 2 * i); 

        }
        System.out.println(list);

    }
}
