package com.bridglabz.BasicCoreJavaPrograms;
public class BasicCoreJavaProgram {
    public static void main(String[] args) {
        flipCoin();
    }
    public static void flipCoin(){
        double flip=Math.random();
        if(flip<0.5){
        System.out.println(flip+ " : tails");
        }else{
            System.out.println(flip+ " : head");
        }
    }
}
