package com.impetus.sorting;

public class SelectionSort {

    public static void sort(Integer a[]){
        int n = a.length;
        int min_index;
        for(int i = 0 ; i < n-1 ; i++){
            min_index = i;
            for(int j = i+1 ; j<n ; j++){
                if(a[j] < a[min_index]){
                    min_index = j;
                    j++;
                }
            }
            int temp = a[i];
            a[i] = a[min_index];
            a[min_index] = temp;
        }

        for(int i = 0 ; i < n ; ++i)
            System.out.println("Selection Sort Array!!!!! " +a[i]);
    }

    public static void main(String args[]){

        Integer arr[] = {4, 2, 9, 6, 1, 5, 10,74,23,27,71,34,96,54,32,54,21,51};
        SelectionSort s = new SelectionSort();
        s.sort(arr);
    }
}
