package com.impetus.sorting;

public class BubbleSort {

    public static void sort(Integer a[]){
        int n = a.length;
        int temp;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n-i-1 ; j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for(int i = 0 ; i < n ; ++i)
            System.out.println("Bubble Sort Array!!!!! " +a[i]);
    }

    public static void main(String args[]){

        Integer arr[] = {4, 2, 9, 6, 1, 5, 10, 74, 23, 27, 71, 34, 96, 54, 32, 54, 21, 51};
        BubbleSort b = new BubbleSort();
        b.sort(arr);
    }
}
