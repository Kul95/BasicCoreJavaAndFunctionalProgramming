package com.bridglabz.BasicCoreJavaPrograms;

import java.util.Scanner;

public class BasicCoreJavaProgram {
    public static void main(String[] args) {
        flipCoin();
        leapYear();
        powerOfTwo();
//        harmonicSum();
        evenOdd();
        swapTwoNum();
        quotientRemainder();
        vowelOrConsonent();
        largestNum();
        primeFactor();
    }
    public static void flipCoin(){
        double flip=Math.random();
        if(flip<0.5){
        System.out.println(flip+ " : tails");
        }else{
            System.out.println(flip+ " : head");
        }
    }
    public static void leapYear(){
        int year=2020;
        if(((year%4==0)&&(year%100 !=0))||(year%400==0)){
            System.out.println(year+ ": is Leap year");
        }else{
            System.out.println(year+ " : is not a leap year");
        }
    }
    public static void powerOfTwo(){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println(num+" *"+i+" ="+num*i);
        }
    }
    public static void harmonicSum(int num){
        double sum=0;
          num=5;
         for(double i=1;i<=num;i++){
             sum=sum+1/i;
             System.out.println(sum);
         }
    }
    public static void evenOdd(){
        int num=3;
        if(num%2==0){
            System.out.println(num+ " is even number");
        }else{
            System.out.println(num+ " is odd number.");
        }
    }
    public static void swapTwoNum(){
        int n1=20,n2=50;
        int temp;
        System.out.println("Before swapping : "+n1+ " and "+n2 );
        temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("After swapping :"+n1+ " and "+n2);
    }
    public static void quotientRemainder(){
        int dividend=20;
        int divisor=3;
        int quotient=dividend/divisor;
        int remainder=dividend % divisor;
        System.out.println("Quotient is :"+quotient );
        System.out.println("remainder is :"+remainder);
    }
    public static void vowelOrConsonent(){
        char ch='e';
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'||ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'){
            System.out.println(ch+ " is vowel");
        }else{
            System.out.println(ch+ " is consonent");
        }
    }
    public static void largestNum(){
        int n1=2,n2=3,n3=6;
        if(n1>n2 && n1>n3){
            System.out.println("Largest number is :"+n1);
        }else if(n2>n1 && n2>n3){
            System.out.println("Largest number is :"+n2);
        }else{
            System.out.println("Largest number is :"+n3);
        }
    }
    public static void primeFactor(){
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=2;
        int temp=num;
        while(temp>1){
            if(temp%i==0){
                System.out.print(i+" , ");
                temp=temp/i;
            }else{
                i++;
            }
        }
    }
}
