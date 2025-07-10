package com.mustafa.july08.excptionHandiling;

import java.util.Scanner;
public class ClassCastExceptionDemo{
    
    public static void handleClassCastException(){
        Object obj[]={"harry","raj","rohan",123};
       
       
            for(Object ob:obj){
                 try{
                    String str=(String )ob;
                    System.out.println("Casting successful: "+str);
                 }
                catch(Exception e){
                    System.out.println(e.toString());
                    System.out.println(e.getMessage());
                }

            
              
            }
           
        
       
        
    }
   
    public static void main(String []args){
        
        
       handleClassCastException();
       
    }
}