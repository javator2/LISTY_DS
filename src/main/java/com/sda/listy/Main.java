package com.sda.listy;

public class Main {
    public static void main(String[] args) {

        CustomList<Integer> list = new CustomList<Integer>();
        list.add(2);
        list.add(2);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(22);
        list.add(22);

        for(Integer list1:list){
            System.out.println(list1);
        }
    }
}
