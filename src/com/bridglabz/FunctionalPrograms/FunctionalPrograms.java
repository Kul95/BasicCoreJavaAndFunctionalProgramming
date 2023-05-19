package com.bridglabz.FunctionalPrograms;

import java.util.Scanner;

public class FunctionalPrograms {
    public static void main(String[] args) {
        quadraticRoot();
    }
    public static void quadraticRoot(){
        System.out.println("Enter the value of a :");
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        System.out.println("Enter the value of b :");
        double b=sc.nextInt();
        System.out.println("Enter the value of c :");
        double c=sc.nextInt();
        double d=(b*b)-(4*a*c);
        double sqrt=Math.sqrt(d);
        if(d>0){
            double root1=(-b+sqrt)/(2*a);
            double root2=(-b-sqrt)/(2*a);
            System.out.println("Roots are : "+root1+ " and "+root2);
        }
        else if(d==0){
            double root1  = -b/(2*a);
            System.out.println(root1);
        }
    }
}
