package com.impetus.array;

public class PrintNumbers {

    //print the numbers between n to 1 without using loop
    static void print1(int n1){
        n1--;
        if(n1>1){
            System.out.print(" " +n1);
            print1(n1);
        }
    }

    //print the numbers between n to 1 without using loop
    static void print2(int n2){
        n2++;
        if(n2<100) {
            System.out.print(" " + n2);
            print2(n2);
        }
    }

    public static void main(String [] args){
        print1(100);
        System.out.println(" ");
        print2(1);
    }
}
