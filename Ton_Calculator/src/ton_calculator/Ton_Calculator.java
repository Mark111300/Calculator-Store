/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ton_calculator;

import java.util.Scanner;

/**
 *
 * @author Oton_CPE112
 */
public class Ton_Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      System.out.println("Welcome to Ton Calculator!\nPlease Enter 1"); 
        Scanner input=new Scanner(System.in);
        int x = input.nextInt();
        
        
         System.out.println ("Enter 1 to Continue Loop");
        int loop_control=input.nextInt();
     
        
       while (loop_control==1)
           
       {
           
          System.out.println("Switch input to Continue...:");
          
          x=input.nextInt();
          switch(x){
              
              case 1:
                 
              System.out.println ("Enter a Number to be Solve:   ");
     
     
        int A= input.nextInt();
        String operation= input.next();
        int B= input.nextInt();

            while(A + B != 0){

        if(operation.equals("+")){ 
            System.out.println("Answer = " + (A+B));
        }
        else if(operation.equals("-")){ 
            System.out.println("Answer = " + (A-B));
        }
        else if(operation.equals("*")){ 
            System.out.println("Answer = " + (A*B));
        }   
        else if(operation.equals("/")){ 
            System.out.println("Answer = " + (A/B));
        }
        else {
            System.out.println("Math Error");
        }
            
            break;
        }
            case 2:
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the answer to determine if it is Odd or Even: ");
            int num = sc.nextInt();

            if ((num ^ 1) == num + 1) 
            { 
             System.out.println("The entered number "+ num +" is Even"); 
            } 
            else 
            { 
            System.out.println("The entered number "+ num +" is Odd"); 
    } 
    }
      
       }
       
      
       System.out.println("Continue..Loop?");
       loop_control=input.nextInt();
        
    }
    
} 
    
