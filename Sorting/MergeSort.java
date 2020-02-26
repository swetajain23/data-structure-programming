package com.impetus.sorting;

public class MergeSort {

    public static void merge(int a[] , int l , int m , int n){
        int n1 = m - l + 1;
        int n2 = n - m;

        int L[] = new int [n1];
        int R[] = new int [n2];

        for(int i = 0 ; i < n1 ; i++)
           L[i] = a[l+i];
        for(int j = 0 ; j < n2 ; j++)
            R[j] = a[m+1+j];

        int i = 0;
        int j = 0;
        int k = l;
        while(i<n1 && j<n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            a[k] = L[i];
            i++;
            k++;
        }
        while(i<n2){
            a[k] = R[j];
            j++;
            k++;
        }
    }

    public static void print(int a[]){
        for(int i = 0 ; i < a.length ; i++)
            System.out.println("Insertion Sort Array!!!!! " +a[i]);
    }

    public static void sort(int a[] , int l , int n){
        if(l<n) {
            int m = (l+n)/2;
            sort(a, l, m);
            sort(a, m+1, n);
            merge(a,l,m,n);
        }
    }

    public static void main(String args[]){
        int arr[] = {4, 2, 9, 6, 1, 5, 10,74,23,27,71,34,96,54,32,54,21,51};
        MergeSort m = new MergeSort();
        m.sort(arr, 0 , arr.length-1);
        m.print(arr);
    }
}
