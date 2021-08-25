package com.pallindromicprimenumber;
import java.io.*;
import java.util.*;

public class PallindromicPrimeNumber {
    public static void main (String[] args)
    {
        int i =0;
        int num =0;
        //Empty String
        String  primeNumbers = "";
        int r,sum=0;
        int temp;

        for (i = 1; i <= 1000; i++)
        {
            //Check Whether the number is Prime or not.
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
            //Check Whether the number is Pallindrome or Not.
            temp=num;
            while(num>0){
                r=num%10;  //getting remainder
                sum=(sum*10)+r;
                num=num/10;
            }
        }

        //Display the Prime Numbers.
        System.out.println("Prime numbers from 1 to 1000 are :");
        System.out.println(primeNumbers);

        //Display the Prime Numbers which are Pallindromic number too.
        System.out.println("Palindrome numbers from 1 to 1000 are:");
        if(temp==sum)
            System.out.println(temp);
    }
}
