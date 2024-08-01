package Oops.Generic;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private  static int Default_Size = 10;
    private int size =0;

    public CustomArrayList() {
        this.data = new int[Default_Size];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[Default_Size * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    public int remove(){
        int removed = data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    private boolean isFull() {
        return size == Default_Size;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args){
        CustomArrayList list = new CustomArrayList();
//        list.add(2);
//        list.add(3);
//        list.add(6);
//        list.add(8);
//        list.add(9);
//        System.out.println(list);
//        System.out.println( list.get(3));
//        System.out.println(list.size());

        for(int i=0;i<15;i++){
            list.add( 2 * i);
        }
        System.out.println(list);

    }
}
