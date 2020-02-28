package com.impetus.searching;

public class BinarySearch {

    static int search(int []a, int low, int high , int ele){
        int mid = (low+high)/2;
        if(low>high)
            return -1;
        if(a[mid] == ele)
            return mid;
        if(a[mid]>ele)
            return search(a,low,mid-1,ele);
        else
            return search(a, mid, high, ele);
    }
    
    public static void main(String [] args){
        int a[] = {2,4,6,8,9,12,15,17};
        int n = a.length;
        int index = search(a, 0, n , 15);
        System.out.println("index " +index);
    }
}


