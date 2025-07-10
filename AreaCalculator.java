package com.mustafa.july08.excptionHandiling;


import java.util.Scanner;
public class AreaCalculator{
   
         public static double calculateArea(double length,double breadth ){
            if(length<=0||breadth<=0){
                System.out.println("Error: Length and width must be > 0.");
                System.exit(0);
            }
        double result=length*breadth;
        return result;
  

    }
   
    public static void main(String []args){
        Scanner sc=null;
        double a;
        double b;
        try{
            sc=new Scanner(System.in);
             a=Double.parseDouble(sc.nextLine());
             b=Double.parseDouble(sc.nextLine());
             //calculateArea(a,b);
             System.out.println("Area of rectangle with length "+a+" and width "+b+" is: "+calculateArea(a,b));
           
            
            
           
            
            

            
            

        }
        catch(Exception e){
           
            System.out.println("ArithmeticException caught: Division by zero: dividend="+5+", divisor=0");
            
        }
    }
}
