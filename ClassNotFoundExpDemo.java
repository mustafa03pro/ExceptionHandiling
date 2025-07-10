package com.mustafa.july08.excptionHandiling;


import java.util.Scanner;
public class ClassNotFoundExpDemo{
    
    public ClassNotFoundExpDemo(String str){
        Class<?> s1=null;
        try{
            Class.forName(str);
            System.out.println("Class loaded successfully"+s1);
        
        }
        catch(Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
        
    }
   
    public static void main(String []args){
        
        Scanner sc=null;
        sc=new Scanner(System.in);
        String str=sc.next();
       new ClassNotFoundExpDemo(str);
       
    }
}