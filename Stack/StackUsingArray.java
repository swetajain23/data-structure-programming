package com.impetus.stack;

public class StackUsingArray {

    static final int max = 1000;
    int top;
    int[] a = new int[max];

    StackUsingArray(){
        top = -1;
    }

    boolean isEmpty(){
            return (top<0);
        }

    boolean push(int x){
        if(top == (max-1)){
            System.out.println("Stack is overflow!!!!!");
            return false;
        }
        else{
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop(){
        if(top<0){
            System.out.println("Stack is underflow!!!!");
            return 0;
        }
        else{
            int x = a[top--];
            return x;
        }
    }

    int peek(){
        if(top<0){
            return 0;
        }
        else{
            int x = a[top];
            return x;
        }
    }

    public static void main(String[] args){
        StackUsingArray s = new StackUsingArray();
        s.push(10);
        s.push(30);
        s.push(40);
        s.push(20);
        System.out.println(s.pop()+ " poped from stacked!!!");
    }
}
