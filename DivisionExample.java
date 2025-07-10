package com.mustafa.july08.excptionHandiling;


import java.util.Scanner;
public class DivisionExample{
    public static void main(String []args){
        Scanner sc=null;
        int a;
        int b;
        try{
            sc=new Scanner(System.in);
             a=Integer.parseInt(sc.nextLine());
             b=Integer.parseInt(sc.nextLine());
            int result=a/b;
            System.out.println("Result of division: "+result);
            
            
           
            
            

            
            

        }
        catch(ArrayIndexOutOfBoundsException e){
           
            System.out.println("ArithmeticException caught: Division by zero: dividend="+a+", divisor="+b);
            
        }
    }
}
