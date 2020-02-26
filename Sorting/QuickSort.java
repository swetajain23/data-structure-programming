package com.impetus.sorting;

public class QuickSort {

    int partition(int a[] , int low, int high){

        int i = low-1;
        int pivot = a[high];
        int temp;
        for(int j=low; j<high; j++){
            if(a[j]<pivot){
                i++;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;

        return i+1;
    }

    void print(int a[]){
        for(int i = 0 ; i < a.length ; i++)
            System.out.println("Insertion Sort Array!!!!! " +a[i]);
    }

    void sort(int a[], int low, int high){
        if(low<high){
              int pi = partition(a,low,high);
              sort(a, low, pi-1);
              sort(a, pi+1, high);
        }

    }

    public static void main(String args[]){

        int arr[] = {10, 7, 2, 9, 15, 11, 3, 1};
        int high = arr.length;
        QuickSort q = new QuickSort();
        q.sort(arr, 0, high-1);
        q.print(arr);
    }
}
