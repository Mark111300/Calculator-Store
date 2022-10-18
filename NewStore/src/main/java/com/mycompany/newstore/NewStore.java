/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.newstore;

import java.util.Scanner;

/**
 *
 * @author MARK LARRY
 */
public class NewStore {
   public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose,quantity=1;
    public static double total=0,pay;
    public static void menu(){
    System.out.println("   !!!WELCOME TO TON Iphone STORE  !!!   ");
    System.out.println(" ===================================  ");
    System.out.println("              ITEMS           ");
    System.out.println("   1. IphoneXS                Php. 30000 ");
    System.out.println("   2. Iphone11                Php. 35000 ");
    System.out.println("   3. Iphone12                Php. 40000");
    System.out.println("   4. Iphone13                Php  60000 ");
    System.out.println("   5. Iphone14                Php. 70000 ");
    System.out.println(" ==================================== ");
    System.out.println("         LIMITED PROMO        ");
    System.out.println(" 6. Iphone11 with free Tempered Glass and Phone Case    Php. 35500 ");
    System.out.println(" 7. Iphone13 with free Tempered Glass and Phone Case    Php. 40500 ");
    System.out.println(" 8. Cancel                             ");
    System.out.println(" ====================================  ");
    System.out.println("               DISCOUNTS               ");
    System.out.println(" 1. If total cost is Php 100000+ - 5%        ");
    System.out.println(" 2. If total cost is Php 70000+ - 3%         ");
    System.out.println(" ====================================  ");
    }
   public static void order(){
    System.out.println(" Press 1 for IphoneXS           ");
    System.out.println(" Press 2 for Iphone11           ");
    System.out.println(" Press 3 for Iphone12           ");
    System.out.println(" Press 4 for Iphone13           ");
    System.out.println(" Press 5 for Iphone14           ");
    System.out.println(" Press 6 for promo 1            ");
    System.out.println(" Press 7 for promo 2            ");
    System.out.println(" Press 8 to cancel              ");
    System.out.println(" Enter your order:              ");
    choose = input.nextInt();
        switch (choose) {
            case 1:
                System.out.println(" You choose IphoneXS ");
                System.out.print(" How many IphoneXS you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*30000);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println("Want to buy another order? ");
                
                System.out.println(" Press (1) if Yes and (2) if No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();
                    }else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=100000){
                        System.out.println("  ");
                        System.out.println(" You have 5% discount ");  
                        double discount=total*.95;
                        System.out.println(" Your New Total Discounted Payment will be Php: "+ discount);
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                     do{
                        System.out.println(" Sorry Not Enough Money!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);                      
                        break;  }
                        }while(true);}
                       else if (pay >=discount){
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);                        
                        break; } break; }
                    }
                else if (total>=70000 && total<=99999){
                    System.out.println(" You have 3% discount ");
                         double discount=total*.97;
                        System.out.println(" Your New Total Discounted Payment will be Php: "+ discount);
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay <discount){
                        do{
                        System.out.println(" Sorry Not Enough Money!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){         
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);                       
                        break;}
                        }while(true);}
                       else if (pay >=discount){
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);        
                        break;}  break; }
                    }
                else if (total<=99999){
                    System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();    
                    if(pay < total){
                         do{
                        System.out.println(" Sorry Not Enough Money!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){        
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);         
                        break; }
                        }while(true);  }
                       else if (pay >=total){        
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        break;}break; }
                    }
               case 2:
                System.out.println(" You choose Iphone11 ");
                System.out.print(" How many Iphone11 you want to Buy? : ");
                quantity =input.nextInt();
                total = total +(quantity*35000);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? ");
                System.out.println(" Press (1) if Yes and (2) if No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();
                }else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=100000){
                        System.out.println("  ");
                        System.out.println(" You have 5% discount "); 
                        double discount=total*.95;
                        System.out.println(" Your New Total Discounted Payment will be Php: "+ discount);
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                          do{
                        System.out.println(" Sorry Not Enough Money!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);    
                        break;}
                        }while(true);}
                       else if (pay >=discount){    
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);   
                        break; } break;}
                    }
                else if (total>=70000 && total<=99999){
                    System.out.println(" You have 3% discount ");
                        double discount=total*.97;
                        System.out.println(" Your New Total Discounted Payment will be Php: "+ discount);
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay <discount){
                          do{
                        System.out.println(" Sorry Not Enough Money!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);   
                        break; }
                        }while(true); }
                        else if (pay >=discount){
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);  
                        break;} break;}
                    }
                 else if (total<=99999){
                        System.out.println(" Enter a payment: ");
                        pay = input.nextDouble();
                         if(pay <total){
                        do{
                        System.out.println(" Sorry Not Enough Money!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){        
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);   
                        break;}
                        }while(true);}
                       else if (pay >=total){
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        break;  }break;}
                   }
                
            case 3:
                System.out.println(" You choose Iphone12 ");
                System.out.print(" How many Iphone12 you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*40000);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? ");
                System.out.println(" Press (1) if Yes and (2) if No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();
                }else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=100000){
                        System.out.println("  ");
                        System.out.println(" You have 5% discount ");
                        double discount=total*.95;
                        System.out.println(" Your New Total Discounted Payment will be Php: "+ discount);
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                        do{
                        System.out.println(" Sorry Not Enough Money!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);  
                        break;}
                       }while(true); }
                       else if (pay >=discount){
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break;} break; }
                    }
                else if (total>=70000 && total<=99999){
                    System.out.println(" You have 3% discount ");  
                        double discount=total*.97;
                        System.out.println(" Your New Total Discounted Payment will be Php: "+ discount);
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay < discount){ 
                        do{
                        System.out.println(" Sorry Not Enough Money!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){         
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);   
                        break;}
                        }while(true); }
                     else if (pay >=discount){    
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break;   }  break; }
                    }
                else if (total<=99999){
                    System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();   
                    if(pay < total){ 
                        do{
                        System.out.println(" Sorry Not Enough Money!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){         
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        break;}
                        }while(true); }
                       else if (pay >=total){    
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);     
                        break; }break;}
                    }
            case 4:
               System.out.println(" You choose Iphone13 ");
                System.out.print(" How many Iphone13 you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*60000);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? "); 
                System.out.println(" Press (1) if Yes and (2) if No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();
                }else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=100000){
                        System.out.println("  ");
                        System.out.println(" You have 5% discount ");
                        double discount=total*.95;
                        System.out.println(" Your New Total Discounted Payment will be Php: "+ discount);
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                        do{
                        System.out.println(" Sorry Not Enough Money!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                          total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break; }
                        }while(true);   }
                     else if (pay >=discount){     
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break; }  break; }
                    }
                else if (total>=70000 && total<=99999){
                    System.out.println(" You have 3% discount ");
                        double discount=total*.97;
                        System.out.println(" Your New Total Discounted Payment will be Php: "+ discount);
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay < discount){
                        do{
                        System.out.println(" Sorry Not Enough Money!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){         
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break; }
                        }while(true); }
                     else if (pay >=discount){    
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);  
                        break;  }  break; }
                    }
                else if (total<=99999){ 
                    System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();   
                    if(pay < total){ 
                        do{
                        System.out.println(" Sorry Not Enough Money!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){         
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                          total = pay-total;
                        System.out.println(" Your change is Php " + total);    
                        break;  }
                        }while(true);}
                       else if (pay >=total){      
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);  
                        break;  } break; } 
                    }
            case 5:
               System.out.println(" You choose Iphone14 ");
                System.out.print(" How many Iphone14 you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*70000);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? "); 
                System.out.println(" Press (1) if Yes and (2) if No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();}else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=100000){
                        System.out.println("  ");
                        System.out.println(" You have 5% discount ");
                        double discount=total*.95;
                        System.out.println(" Your New Total Discounted Payment will be Php: "+ discount);
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                        do{
                        System.out.println(" Sorry Not Enough Money!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break; }
                        }while(true); }
                     else if (pay >=discount){  
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break;}  break;     } }
                else if (total>=70000 && total<=99999){
                    System.out.println(" You have 3% discount ");
                        double discount=total*.97;
                        System.out.println(" Your New Total Discounted Payment will be Php: "+ discount);
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay < discount){
                        do{
                        System.out.println(" Sorry Not Enough Money!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break; }
                        }while(true); }
                     else if (pay >=discount){      
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break; }  break;   }
                    }
                else if (total<=99999){ 
                    System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();  
                    if(pay < total){
                        do{
                        System.out.println(" Sorry Not Enough Money!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){       
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        break;  }
                        }while(true);  }
                       else if (pay >=total){     
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        break;    } break; }
                    }
                case 6:
                System.out.println(" You choose Iphone11 with free Tempered Glass and Phone Case ");
                System.out.print(" How many Iphone11 with free Tempered Glass and Phone Case you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*35500);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? ");
                System.out.println(" Press (1) if Yes and (2) if No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();
                }else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=100000){
                        System.out.println("  ");
                        System.out.println(" You have 5% discount ");
                        double discount=total*.95;
                        System.out.println(" Your New Total Discounted Payment will be Php: "+ discount);
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                        do{
                        System.out.println(" Sorry Not Enough Money!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){         
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break; }
                        }while(true);}
                     else if (pay >=discount){   
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break;  }  break; }
                   }
                else if (total>=70000 && total<=99999){
                    System.out.println(" You have 3% discount ");  
                        double discount=total*.97;
                        System.out.println(" Your New Total Discounted Payment will be Php: "+ discount);
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay < discount){  
                        do{
                        System.out.println(" Sorry Not Enough Money!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){          
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break; }
                        }while(true);  }
                     else if (pay >=discount){    
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break; } break; }
                    }
                else if (total<=99999){
                    System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();   
                    if(pay < total){
                        do{
                        System.out.println(" Sorry Not Enough Money!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){        
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        
                        break;}
                        }while(true); }
                       else if (pay >=total){    
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        
                        break;   } break; }
                }
                case 7:
                System.out.println(" You choose Iphone13 with free Tempered Glass and Phone Case ");
                System.out.print(" How many Iphone13 with free Tempered Glass and Phone Case you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*40500);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? ");
                System.out.println(" Press (1) if Yes and (2) if No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();
                }else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=100000){
                        System.out.println("  ");
                        System.out.println(" You have 5% discount "); 
                        double discount=total*.95;
                        System.out.println(" Your New Total Discounted Payment will be Php: "+ discount);
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                        do{
                        System.out.println(" Sorry Not Enough Money!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){         
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break;     }
                        }while(true);   }                      
                     else if (pay >=discount){   
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);  
                        break; } break; }
                    }
                else if (total>=70000 && total<=99999){
                    System.out.println(" You have 3% discount ");
                        double discount=total*.97;
                        System.out.println(" Your New Total Discounted Payment will be Php: "+ discount);
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay < discount){
                        do{
                        System.out.println(" Sorry Not Enough Money!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break; }
                        }while(true); }
                     else if (pay >=discount){   
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break; }   break;}
                    }
                else if (total<=99999){
                    System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();    
                    if(pay < total){
                        do{
                        System.out.println(" Sorry Not Enough Money!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){        
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        break;}
                        }while(true); }
                       else if (pay >=total){  
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                         break; }  break; }
                }
                 case 8:
                    System.exit(0);    
                default:      
            break;         }
       System.out.println(" Transaction Complete...");
       System.out.println(" Happy Purchase!! ");
       System.out.println(" ");
       System.out.println(" Next Customer? Press 1: ");
       System.out.println(" To Exit Press 2: ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    total=total-total;
                    order();    }
                else{
                    System.exit(0);}
   }
    public static void main(String[] args) {
        menu();
       order();
    }   
    }
    

