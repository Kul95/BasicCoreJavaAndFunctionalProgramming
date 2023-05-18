package com.bridglabz.BasicCoreJavaPrograms;
public class BasicCoreJavaProgram {
    public static void main(String[] args) {
        flipCoin();
        leapYear();
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
}
