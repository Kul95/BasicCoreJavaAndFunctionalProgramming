package com.bridglabz.BasicCoreJavaPrograms;

import java.util.Scanner;

public class BasicCoreJavaProgram {
    public static void main(String[] args) {
        flipCoin();
        leapYear();
        powerOfTwo()
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
}
