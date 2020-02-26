package com.impetus.array;

public class EvenOddNumber {

    void printArray(int a[], int n){
        int left=0, right=n-1;
        while(left<right){
            while (a[left] % 2 == 0 && left < right ) {
                left++;
            }
            while(a[right] % 2 == 1 && left < right){
                right--;
            }
            if(left<right){
                int temp;
                temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args){

        int a[] = {2,5,3,4,8,6,11,17,16};
        int n = a.length;
        EvenOddNumber eo = new EvenOddNumber();
        eo.printArray(a,n);
        for(int i = 0 ; i<n ; i++){
            System.out.println("array!!!!!! " +a[i]);
        }
    }
}
