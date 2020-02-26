package com.impetus.array;

public class PrimeNumber {

    static boolean isPrime(int number){
        if(number<=1)
            return false;
        for(int i = 2 ; i<=number/2; i++){
            if(number%i == 0)
                return false;
        }
        return true;
    }

    public static void main(String [] args){
        if(isPrime(20))
            System.out.println(" true") ;
        else
            System.out.println(" false");


    }
}
