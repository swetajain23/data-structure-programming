package com.impetus.sorting;

public class InsertionSort {

    public static void sort(Integer a[]){
        int n = a.length;
        for(int i = 1 ; i < n ; ++i){
            int j = i-1;
            int key = a[i];
            while(j>=0 && a[j]>key){
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = key;
        }
            for(int i = 0 ; i < n ; ++i)
            System.out.println("Insertion Sort Array!!!!! " +a[i]);
        }
    public static void  main(String args[]){
        Integer arr[] = {4, 2, 9, 6, 1, 5, 10,74,23,27,71,34,96,54,32,54,21,51};
        InsertionSort s = new InsertionSort();
        s.sort(arr);
    }
}
