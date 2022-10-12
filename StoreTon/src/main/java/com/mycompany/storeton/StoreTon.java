/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.storeton;

import java.util.Scanner;

/**
 *
 * @author MARK LARRY
 */
public class StoreTon {

    public static void main(String[] args) {
     
     
 
        
       Scanner a = new Scanner(System.in);
           
    int IphoneXS = 30000;
    int Iphone11 = 45000;
    int Iphone12 = 72500;
    int Iphone13 = 80000;
    int Iphone14 = 95000;
    
    String b = "Yes";
    String c = "No";
    String O ="O";
    String d = "IphoneXS";
    String e = "Iphone11";
    String f = "Iphone12";
    String g = "Iphone13";
    String h = "Iphone14";
    int x;
    int m;
    int y;
    int z;
    int q;
    int p;
  
    System.out.println("Hello Iphone Lovers! Welcome to My IphoneStore\n If You want to take a look at my shop just type 'Yes' if not then type 'No'");
    System.out.println("(Note That You can only buy 1 same Item!)" + "\n" + "(Choose Carefully)");
    String J = a.next();   
    
     if (J.equals(b)) {
    	do {
            System.out.println("If you want to take a look at the list of the items just press 'O'");
           J=a.next();
           
            if (J.equals(O)  ) {
            	System.out.println("\n" + "1:" + d + "\n" + "\n" + "2:" + e + "\n" + "\n" + "3:" + f + "\n" + "\n" + "4:" + g + "\n" + "\n" + "5:" + h + "\n");
            	System.out.println("We Also Give Discounts!"+"\n"+"If Your 3. BRONZE MEMBER you get 10% discounts!"+"\n"+"If Your 2. SILVER MEMBER you get 15% discounts!\nIf Your 1. GOLD MEMBER you get 20% discounts!");
                System.out.println("If you want to see the details of each item just type their item number" + "\n" + "If you are done looking at the details then press X");
                m = a.nextInt();
                switch (m) {
                    case 1:
                        System.out.println("IphoneXS" + "\n" +"BODY"+ "\n"+"       Dimensions: 143.6 x 70.9 x 7.7 mm (5.65 x 2.79 x 0.30 in)"+ "\n"+"       Weight: 	   177 g (6.24 oz)"+ "\n"+"       Build:	   Glass front (Corning-made glass), glass back (Corning-made glass), stainless steel frame"+"\n"+"MEMORY"+"\n"+"       Internal	 256GB 4GB RAM"+"\n"+"MAIN CAMERA"+"\n"+"       12 MP, f/2.4, 52mm (telephoto), 1/3.4\", 1.0µm, PDAF, OIS, 2x optical zoom");
                       
                        break;

                    case 2:
                        System.out.println("Iphone11" + "\n" +"BODY"+ "\n"+"       Dimensions: 150.9 x 75.7 x 8.3 mm (5.94 x 2.98 x 0.33 in)"+ "\n"+"       Weight: 	    194 g (6.84 oz)"+ "\n"+"       Build:	    Glass front (Corning-made glass), glass back (Corning-made glass), aluminum frame (7000 series)"+"\n"+"MEMORY"+"\n"+"       Internal	 256GB 4GB RAM"+"\n"+"MAIN CAMERA"+"\n"+"       12 MP, f/1.8, 26mm (wide), 1/2.55\", 1.4µm, dual pixel PDAF, OIS");
                        break;
                    case 3:
                        System.out.println("Iphone12" + "\n" +"BODY"+ "\n"+"       Dimensions: 146.7 x 71.5 x 7.4 mm (5.78 x 2.81 x 0.29 in)"+ "\n"+"       Weight: 	    164 g (5.78 oz)"+ "\n"+"       Build:	    Glass front (Corning-made glass), glass back (Corning-made glass), aluminum frame (7000 series)"+"\n"+"MEMORY"+"\n"+"       Internal	 256GB 4GB RAM"+"\n"+"MAIN CAMERA"+"\n"+"       12 MP, f/1.6, 26mm (wide), 1.4µm, dual pixel PDAF, OIS");
                        break;
                    case 4:
                        System.out.println("Iphone13" + "\n" +"BODY"+ "\n"+"       Dimensions: 146.7 x 71.5 x 7.7 mm (5.78 x 2.81 x 0.30 in)"+ "\n"+"       Weight: 	    174 g (6.14 oz)"+ "\n"+"       Build:	    Glass front (Corning-made glass), glass back (Corning-made glass), aluminum frame"+"\n"+"MEMORY"+"\n"+"       Internal	 512GB 4GB RAM"+"\n"+"MAIN CAMERA"+"\n"+"       12 MP, f/1.6, 26mm (wide), 1.7µm, dual pixel PDAF, sensor-shift OIS");
                        break;
                    case 5:
                        System.out.println("Iphone14" + "\n" +"BODY"+ "\n"+"       Dimensions: 146.7 x 71.5 x 7.8 mm (5.78 x 2.81 x 0.31 in)"+ "\n"+"       Weight: 	    172 g (6.07 oz)"+ "\n"+"       Build:	    Glass front (Corning-made glass), glass back (Corning-made glass), aluminum frame"+"\n"+"MEMORY"+"\n"+"       Internal	 512GB 6GB RAM"+"\n"+"MAIN CAMERA"+"\n"+"       12 MP, f/1.5, 26mm (wide), 1/1.7\", 1.9µm, dual pixel PDAF, sensor-shift OIS");
                }
                System.out.println("\n");
            System.out.println("Do you want to look at another Item?");
            System.out.println("Yes or No?");
            
            J = a.next();
       
            if (J.equals(c)) {
            System.out.println("Have you chosen your Fav Iphone?" + "\n");
            J=a.next();
            if(J.equals(b)) {
            System.out.println("How many Item would you like to buy?"+"\n"+"(Limited to 5 items only)");
            
            x=a.nextInt();
            
            if (x==1) {
            	System.out.println("Type The Item Number of The Iphone You've Picked: ");
            	x=a.nextInt();
            	
            	if(x==1) {
                	
            		System.out.println("The Price of the IphoneXS would be:   "+IphoneXS);
            		System.out.println("What type of membership do you have in our shop?"+"\n"+"Input: (1)-GOLD MEMBER (2)-SILVER MEMBER (3)-BRONZE MEMBER");
            		p=a.nextInt();
            		if(p==3) {
            			double discount = IphoneXS*0.90;
            			System.out.println("You will get 10% discount!");
            			System.out.println("Your Total discounted Payment will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment: ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double money = discount - x;
                    			System.out.println("It seems like you are short on " +money );
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double I_change = x - discount;
                		
                		System.out.println(" Here is your change:   "+I_change);
                		
                		System.out.println("Happy Purchase!");
            			break;
            		}
            		else if(p==2) {
            			double discount = IphoneXS*0.85;
            			System.out.println("You will get 15% discount!");
            			System.out.println("Your Total discounted Payment will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment: ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double money = discount - x;
                    			System.out.println("It seems like you are short on " +money );
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double I_change = x - discount;
                		
                		System.out.println(" Here is your change:   "+I_change);
                		
                		System.out.println("Happy Purchase!");
            			break;
            		}
            		else if(p==1) {
            			double discount = IphoneXS*0.80;
            			System.out.println("You will get 20% discount!");
            			System.out.println("Your Total discounted Payment will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment: ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double money = discount - x;
                    			System.out.println("It seems like you are short on " +money );
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double I_change = x - discount;
                		
                		System.out.println(" Here is your change:   "+I_change);
                		
                		System.out.println("Happy Purchase!");
            			break;
            		}
            		
            		else {	
            		do {
            			
            		System.out.println("Please Input The Payment: ");
            		x=a.nextInt();
            		if(x<IphoneXS) {
            			
            			float money = IphoneXS - x;
            			System.out.println("It seems like you are short on "+money);
            			System.out.println("Please Try Again");
            			
            			
            			}
            		
            		}while(x<IphoneXS);
            		float I_change = x - IphoneXS;
            		
            		System.out.println("Here is your change:   "+I_change);
            		
            		System.out.println("Happy Purchase!");
            		break;
            		}
            		
                	}
            		//Iphone11
            	else if(x==2) {
                	
            	
            		System.out.println("The Price of the Iphone11 would be:   "+Iphone11);
            		System.out.println("What type of membership do you have in our shop?"+"\n"+"Input: (1)-GOLD MEMBER (2)-SILVER MEMBER (3)-BRONZE MEMBER");
            		p=a.nextInt();
            		if(p==3) {
            			double discount = Iphone11*0.90;
            			System.out.println("You will get 18% discount!");
            			System.out.println("Your Total discounted Payment will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment: ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double money = discount - x;
                    			System.out.println("It seems like you are short on " +money );
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double I_change = x - discount;
                		
                		System.out.println(" Here is your change:   "+I_change);
                		
                		System.out.println("Happy Purchase!");
            			break;
            		}
            		else if(p==2) {
            			double discount = Iphone11*0.85;
            			System.out.println("You will get 15% discount!");
            			System.out.println("Your Total discounted Payment will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment: ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double money = discount - x;
                    			System.out.println("It seems like you are short on " +money );
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double I_change = x - discount;
                		
                		System.out.println(" Here is your change:   "+I_change);
                		
                		System.out.println("Happy Purchase!");
            			break;
            		}
            		else if(p==1) {
            			double discount = Iphone11*0.80;
            			System.out.println("You will get 10% discount!");
            			System.out.println("Your Total discounted Payment will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment: ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double money = discount - x;
                    			System.out.println("It seems like you are short on " +money );
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double I_change = x - discount;
                		
                		System.out.println(" Here is your change:   "+I_change);
                		
                		System.out.println("Happy Purchase!");
            			break;
            		}
            		
            		else {	
            		do {
            			
            		System.out.println("Please Input The Payment: ");
            		x=a.nextInt();
            		if(x<Iphone11) {
            			
            			float money = Iphone11 - x;
            			System.out.println("It seems like you are short on "+money);
            			System.out.println("Please Try Again");
            			
            			
            			}
            		
            		}while(x<Iphone11);
            		float I_change = x - Iphone11;
            		
            		System.out.println("Here is your change:   "+I_change);
            		
            		System.out.println("Happy Purchase!");
            		break;
            		}
            		
                	}
            	//Iphone12
            		else if(x==3) {
                	
            		System.out.println("The Price of the Iphone11 would be:   "+Iphone12);
            		System.out.println("What type of membership do you have in our shop?"+"\n"+"Input: (1)-GOLD MEMBER (2)-SILVER MEMBER (3)-BRONZE MEMBER");
            		p=a.nextInt();
            		if(p==3) {
            			double discount = Iphone12*0.90;
            			System.out.println("You will get 18% discount!");
            			System.out.println("Your Total discounted Payment will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment: ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double money = discount - x;
                    			System.out.println("It seems like you are short on " +money );
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double I_change = x - discount;
                		
                		System.out.println(" Here is your change:   "+I_change);
                		
                		System.out.println("Happy Purchase!");
            			break;
            		}
            		else if(p==2) {
            			double discount = Iphone12*0.85;
            			System.out.println("You will get 15% discount!");
            			System.out.println("Your Total discounted Payment will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment: ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double money = discount - x;
                    			System.out.println("It seems like you are short on " +money );
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double I_change = x - discount;
                		
                		System.out.println(" Here is your change:   "+I_change);
                		
                		System.out.println("Happy Purchase!");
            			break;
            		}
            		else if(p==1) {
            			double discount = Iphone12*0.80;
            			System.out.println("You will get 10% discount!");
            			System.out.println("Your Total discounted Payment will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment: ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double money = discount - x;
                    			System.out.println("It seems like you are short on " +money );
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double I_change = x - discount;
                		
                		System.out.println(" Here is your change:   "+I_change);
                		
                		System.out.println("Happy Purchase!");
            			break;
            		}
            		
            		else {	
            		do {
            			
            		System.out.println("Please Input The Payment: ");
            		x=a.nextInt();
            		if(x<Iphone12) {
            			
            			float money = Iphone12 - x;
            			System.out.println("It seems like you are short on "+money);
            			System.out.println("Please Try Again");
            			
            			
            			}
            		
            		}while(x<Iphone12);
            		float I_change = x - Iphone12;
            		
            		System.out.println("Here is your change:   "+I_change);
            		
            		System.out.println("Happy Purchase!");
            		break;
            		}
            		
                	}
            	//Iphone13
            		else if(x==4) {
                    	
                		System.out.println("The Price of the Iphone11 would be:   "+Iphone13);
                                System.out.println("What type of membership do you have in our shop?"+"\n"+"Input: (1)-GOLD MEMBER (2)-SILVER MEMBER (3)-BRONZE MEMBER");
            		p=a.nextInt();
            		if(p==3) {
            			double discount = Iphone13*0.90;
            			System.out.println("You will get 18% discount!");
            			System.out.println("Your Total discounted Payment will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment: ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double money = discount - x;
                    			System.out.println("It seems like you are short on " +money );
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double I_change = x - discount;
                		
                		System.out.println(" Here is your change:   "+I_change);
                		
                		System.out.println("Happy Purchase!");
            			break;
            		}
            		else if(p==2) {
            			double discount = Iphone13*0.85;
            			System.out.println("You will get 15% discount!");
            			System.out.println("Your Total discounted Payment will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment: ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double money = discount - x;
                    			System.out.println("It seems like you are short on " +money );
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double I_change = x - discount;
                		
                		System.out.println(" Here is your change:   "+I_change);
                		
                		System.out.println("Happy Purchase!");
            			break;
            		}
            		else if(p==1) {
            			double discount = Iphone13*0.80;
            			System.out.println("You will get 10% discount!");
            			System.out.println("Your Total discounted Payment will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment: ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double money = discount - x;
                    			System.out.println("It seems like you are short on " +money );
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double I_change = x - discount;
                		
                		System.out.println(" Here is your change:   "+I_change);
                		
                		System.out.println("Happy Purchase!");
            			break;
            		}
            		
            		else {	
            		do {
            			
            		System.out.println("Please Input The Payment: ");
            		x=a.nextInt();
            		if(x<Iphone13) {
            			
            			float money = Iphone13 - x;
            			System.out.println("It seems like you are short on "+money);
            			System.out.println("Please Try Again");
            			
            			
            			}
            		
            		}while(x<Iphone13);
            		float I_change = x - Iphone13;
            		
            		System.out.println("Here is your change:   "+I_change);
            		
            		System.out.println("Happy Purchase!");
            		break;
            		}
            		
                	}
                     //Iphone14
            		else if(x==5) {
                	
            		System.out.println("The Price of the Iphone11 would be:   "+Iphone14);
            		System.out.println("What type of membership do you have in our shop?"+"\n"+"Input: (1)-GOLD MEMBER (2)-SILVER MEMBER (3)-BRONZE MEMBER");
            		p=a.nextInt();
            		if(p==3) {
            			double discount = Iphone14*0.90;
            			System.out.println("You will get 18% discount!");
            			System.out.println("Your Total discounted Payment will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment: ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double money = discount - x;
                    			System.out.println("It seems like you are short on " +money );
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double I_change = x - discount;
                		
                		System.out.println(" Here is your change:   "+I_change);
                		
                		System.out.println("Happy Purchase!");
            			break;
            		}
            		else if(p==2) {
            			double discount = Iphone14*0.85;
            			System.out.println("You will get 15% discount!");
            			System.out.println("Your Total discounted Payment will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment: ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double money = discount - x;
                    			System.out.println("It seems like you are short on " +money );
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double I_change = x - discount;
                		
                		System.out.println(" Here is your change:   "+I_change);
                		
                		System.out.println("Happy Purchase!");
            			break;
            		}
            		else if(p==1) {
            			double discount = Iphone14*0.80;
            			System.out.println("You will get 10% discount!");
            			System.out.println("Your Total discounted Payment will be "+discount);
            			do {
                			
                    		System.out.println("Please Input The Payment: ");
                    		x=a.nextInt();
                    		if(x<discount) {
                    			
                    			double money = discount - x;
                    			System.out.println("It seems like you are short on " +money );
                    			System.out.println("Please Try Again");
                    			
                    			
                    			}
                    		
                    		}while(x<discount);
            			double I_change = x - discount;
                		
                		System.out.println(" Here is your change:   "+I_change);
                		
                		System.out.println("Happy Purchase!");
            			break;
            		}
            		
            		else {	
            		do {
            			
            		System.out.println("Please Input The Payment: ");
            		x=a.nextInt();
            		if(x<Iphone14) {
            			
            			float money = Iphone14 - x;
            			System.out.println("It seems like you are short on "+money);
            			System.out.println("Please Try Again");
            			
            			
            			}
            		
            		}while(x<Iphone14);
            		float I_change = x - Iphone14;
            		
            		System.out.println("Here is your change:   "+I_change);
            		
            		System.out.println("Happy Purchase!");
            		break;
            		}
            		
                	}
            	
           }
            //2 Items
            else if(x==2) {
            	System.out.println("What Items would you like to buy?"+"\n"+"(Just type the item numbers and Please type the numbers in an ascending order example (1,2,3,4,5))");
            	System.out.println("IF YOU BREAK THIS RULE IT WILL CAUSE ERROR TO THE SYSTEM!");
            	x=a.nextInt();
            	m=a.nextInt();
            	
            	//IphoneXS+Iphone11
            	if(x==1 && m==2) {
            		float d_e=IphoneXS+Iphone11;
            	System.out.println("You chose "+d+" and "+e);
            	
            	System.out.println("The Total: "+d_e);
            	System.out.println("What type of membership do you have in our shop?"+"\n"+"Input: (1)-GOLD MEMBER (2)-SILVER MEMBER (3)-BRONZE MEMBER");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = d_e*0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
           
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==2) {
        			double discount = d_e*0.85;
        			System.out.println("You will get 15% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
           
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==1) {
        			double discount = d_e*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
           
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment: ");
            		x=a.nextInt();
            		if(x<d_e) {
            			float money = d_e - x;
            			System.out.println("It seems like you are short on "+money);
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<d_e);
            	
            		float d_e_change = x - d_e;
            		System.out.println("Here is your change:   "+d_e_change);
            	
            		System.out.println("Happy Purchase!");
            		break;
            	}
            		
            	}
            	//IphoneXS+Iphone12
            	else if(x==1 && m==3) {
            		float sum =IphoneXS+Iphone12;
            	System.out.println("You chose "+d+" and "+f);
            	System.out.println("The Total: "+sum);
            	System.out.println("What type of membership do you have in our shop?"+"\n"+"Input: (1)-GOLD MEMBER (2)-SILVER MEMBER (3)-BRONZE MEMBER");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==2) {
        			double discount = sum*0.85;
        			System.out.println("You will get 15% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment: ");
            		x=a.nextInt();
            		if(x<sum) {
            			float money = sum - x;
            			System.out.println("It seems like you are short on "+money);
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<sum);
            	
            		float d_f_change = x - sum;
            		System.out.println("Here is your change:   "+d_f_change);
            
            		System.out.println("Happy Purchase!");
            		break;
            	}
            		
            	}
            	//IphoneXS+Iphone13
            	else if(x==1 && m==4) {
            		float sum=IphoneXS+Iphone13;
            	System.out.println("You chose "+d+" and "+g);
            	System.out.println("The Total: "+sum);
            	
            	System.out.println("What type of membership do you have in our shop?"+"\n"+"Input: (1)-GOLD MEMBER (2)-SILVER MEMBER (3)-BRONZE MEMBER");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==2) {
        			double discount = sum*0.85;
        			System.out.println("You will get 15% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment: ");
            		x=a.nextInt();
            		if(x<sum) {
            			float money = sum - x;
            			System.out.println("It seems like you are short on "+money);
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<sum);
            	
            		float d_g_change = x - sum;
            		System.out.println("Here is your change:   "+d_g_change);
            
            		System.out.println("Happy Purchase!");
            		break;
            	}
            		
            	}
            	//IphoneXS+Iphone14
            	else if(x==1 && m==5) {
            		float sum=IphoneXS+Iphone14;
            	System.out.println("You chose "+d+" and "+h);
            	System.out.println("The Total: "+sum);
            	System.out.println("What type of membership do you have in our shop?"+"\n"+"Input: (1)-GOLD MEMBER (2)-SILVER MEMBER (3)-BRONZE MEMBER");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==2) {
        			double discount = sum*0.85;
        			System.out.println("You will get 15% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment: ");
            		x=a.nextInt();
            		if(x<sum) {
            			float money = sum - x;
            			System.out.println("It seems like you are short on "+money);
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<sum);
            	
            		float d_h_change = x - sum;
            		System.out.println("Here is your change:   "+d_h_change);
            
            		System.out.println("Happy Purchase!");
            		break;
            	}
            		
            	}
            	//Iphone11+Iphone12
            	else if(x==2 && m==3) {
            		float sum=Iphone11+Iphone12;
            	System.out.println("You chose "+e+" and "+f);
            	System.out.println("The Total: "+sum);
            	System.out.println("What type of membership do you have in our shop?"+"\n"+"Input: (1)-GOLD MEMBER (2)-SILVER MEMBER (3)-BRONZE MEMBER");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==2) {
        			double discount = sum*0.85;
        			System.out.println("You will get 15% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment: ");
            		x=a.nextInt();
            		if(x<sum) {
            			float money = sum - x;
            			System.out.println("It seems like you are short on "+money);
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<sum);
            	
            		float e_f_change = x - sum;
            		System.out.println("Here is your change:   "+e_f_change);
            
            		System.out.println("Happy Purchase!");
            		break;
            	}
            		
            	}
            	//Iphone11+Iphone13
            	else if(x==2 && m==4) {
            		float sum=Iphone11+Iphone13;
            	System.out.println("You chose "+e+" and "+g);
            	System.out.println("The Total: "+sum);
            	System.out.println("What type of membership do you have in our shop?"+"\n"+"Input: (1)-GOLD MEMBER (2)-SILVER MEMBER (3)-BRONZE MEMBER");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==2) {
        			double discount = sum*0.85;
        			System.out.println("You will get 15% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment: ");
            		x=a.nextInt();
            		if(x<sum) {
            			float money = sum - x;
            			System.out.println("It seems like you are short on "+money);
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<sum);
            	
            		float e_g_change = x - sum;
            		System.out.println("Here is your change:   "+e_g_change);
            
            		System.out.println("Happy Purchase!");
            		break;
            	}
            		
            	}
            	//Iphone11+Iphone14
            	else if(x==2 && m==5) {
            		float sum=Iphone11+Iphone14;
            	System.out.println("You chose "+e+" and "+h);
            	System.out.println("The Total: "+sum);
            	System.out.println("What type of membership do you have in our shop?"+"\n"+"Input: (1)-GOLD MEMBER (2)-SILVER MEMBER (3)-BRONZE MEMBER");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==2) {
        			double discount = sum*0.85;
        			System.out.println("You will get 15% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment: ");
            		x=a.nextInt();
            		if(x<sum) {
            			float money = sum - x;
            			System.out.println("It seems like you are short on "+money);
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<sum);
            	
            		float e_h_change = x - sum;
            		System.out.println("Here is your change:   "+e_h_change);
            
            		System.out.println("Happy Purchase!");
            		break;
            	}
            		
            	}
            	//Iphone12+Iphone13
            	else if(x==3 && m==4) {
            		float sum=Iphone12+Iphone13;
            	System.out.println("You chose "+f+" and "+g);
            	System.out.println("The Total: "+sum);
            	System.out.println("What type of membership do you have in our shop?"+"\n"+"Input: (1)-GOLD MEMBER (2)-SILVER MEMBER (3)-BRONZE MEMBER");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==2) {
        			double discount = sum*0.85;
        			System.out.println("You will get 15% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment: ");
            		x=a.nextInt();
            		if(x<sum) {
            			float money = sum - x;
            			System.out.println("It seems like you are short on "+money);
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<sum);
            	
            		float f_g_change = x - sum;
            		System.out.println("Here is your change:   "+f_g_change);
            
            		System.out.println("Happy Purchase!");
            		break;
            	}
            		
            	}
            	//Iphone12+Iphone14
            	else if(x==3 && m==5) {
            		float sum=Iphone12+Iphone14;
            	System.out.println("You chose "+f+" and "+h);
            	System.out.println("The Total: "+sum);
            	System.out.println("What type of membership do you have in our shop?"+"\n"+"Input: (1)-GOLD MEMBER (2)-SILVER MEMBER (3)-BRONZE MEMBER");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==2) {
        			double discount = sum*0.85;
        			System.out.println("You will get 15% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment: ");
            		x=a.nextInt();
            		if(x<sum) {
            			float money = sum - x;
            			System.out.println("It seems like you are short on "+money);
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<sum);
            	
            		float f_h_change = x - sum;
            		System.out.println("Here is your change:   "+f_h_change);
            
            		System.out.println("Happy Purchase!");
            		break;
            	}
            		
            	}
            	//Iphone13+Iphone14
            	else if(x==4 && m==5) {
            		float sum=Iphone13+Iphone14;
            	System.out.println("You chose "+g+" and "+h);
            	System.out.println("The Total: "+sum);
            	System.out.println("What type of membership do you have in our shop?"+"\n"+"Input: (1)-GOLD MEMBER (2)-SILVER MEMBER (3)-BRONZE MEMBER");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==2) {
        			double discount = sum*0.85;
        			System.out.println("You will get 15% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment: ");
            		x=a.nextInt();
            		if(x<sum) {
            			float money = sum - x;
            			System.out.println("It seems like you are short on "+money);
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<sum);
            	
            		float g_h_change = x - sum;
            		System.out.println("Here is your change:   "+g_h_change);
            
            		System.out.println("Happy Purchase!");
            		break;
            	}
            		
            	}
            }
            //3 items
            else if (x==3) {
            	System.out.println("What Items would you like to buy?"+"\n"+"(Just type the item numbers and Please type the numbers in an ascending order example (1,2,3,4,5))");
            	System.out.println("IF YOU BREAK THIS RULE IT WILL CAUSE ERROR TO THE SYSTEM!");
            	x=a.nextInt();
            	m=a.nextInt();
            	y=a.nextInt();
            	//IphoneXS+Iphone11+Iphone12
            	if(x==1 && m==2 && y==3) {            	
            		float sum = IphoneXS+Iphone11+Iphone12;
            		System.out.println("You chose "+d+" and "+e+" and "+f);
            		System.out.println("The Total: "+sum);
            		System.out.println("What type of membership do you have in our shop?"+"\n"+"Input: (1)-GOLD MEMBER (2)-SILVER MEMBER (3)-BRONZE MEMBER");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==2) {
        			double discount = sum*0.85;
        			System.out.println("You will get 15% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment: ");
            		x=a.nextInt();
            		if(x<sum) {
            			float money = sum - x;
            			System.out.println("It seems like you are short on "+money);
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<sum);
            	
            		float change = x - sum;
            		System.out.println("Here is your change:   "+change);
            
            		System.out.println("Happy Purchase!");
            		break;
            	}
            		
            	}
            	//IphoneXS+Iphone11+Iphone13
            	else if(x==1 && m==2 && y==4) {            	
            		float sum = IphoneXS+Iphone11+Iphone13;
            		System.out.println("You chose "+d+" and "+e+" and "+g);
            		System.out.println("The Total: "+sum);
            		System.out.println("What type of membership do you have in our shop?"+"\n"+"Input: (1)-GOLD MEMBER (2)-SILVER MEMBER (3)-BRONZE MEMBER");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==2) {
        			double discount = sum*0.85;
        			System.out.println("You will get 15% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment: ");
            		x=a.nextInt();
            		if(x<sum) {
            			float money = sum - x;
            			System.out.println("It seems like you are short on "+money);
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<sum);
            	
            		float change = x - sum;
            		System.out.println("Here is your change:   "+change);
            
            		System.out.println("Happy Purchase!");
            		break;
            	}
            		
            	}
            	//IphoneXS+Iphone11+Iphone14
            	if(x==1 && m==2 && y==5) {            	
            		float sum = IphoneXS+Iphone11+Iphone14;
            		System.out.println("You chose "+d+" and "+e+" and "+h);
            		System.out.println("The Total: "+sum);
            		System.out.println("What type of membership do you have in our shop?"+"\n"+"Input: (1)-GOLD MEMBER (2)-SILVER MEMBER (3)-BRONZE MEMBER");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==2) {
        			double discount = sum*0.85;
        			System.out.println("You will get 15% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment: ");
            		x=a.nextInt();
            		if(x<sum) {
            			float money = sum - x;
            			System.out.println("It seems like you are short on "+money);
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<sum);
            	
            		float change = x - sum;
            		System.out.println("Here is your change:   "+change);
            
            		System.out.println("Happy Purchase!");
            		break;
            	}
            		
            	}
            	//Iphone11+Iphone12+Iphone13
            	else if(x==2 && m==3 && y==4) {            	
            		float sum = Iphone11+Iphone12+Iphone13;
            		System.out.println("You chose "+e+" and "+f+" and "+g);
            		System.out.println("The Total: "+sum);
            		System.out.println("What type of membership do you have in our shop?"+"\n"+"Input: (1)-GOLD MEMBER (2)-SILVER MEMBER (3)-BRONZE MEMBER");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==2) {
        			double discount = sum*0.85;
        			System.out.println("You will get 15% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment: ");
            		x=a.nextInt();
            		if(x<sum) {
            			float money = sum - x;
            			System.out.println("It seems like you are short on "+money);
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<sum);
            	
            		float change = x - sum;
            		System.out.println("Here is your change:   "+change);
            
            		System.out.println("Happy Purchase!");
            		break;
            	}
            		
            	}
            	//Iphone11+Iphone12+Iphone14
            	else if(x==2 && m==3 && y==5) {            	
            		float sum = Iphone11+Iphone12+Iphone14;
            		System.out.println("You chose "+e+" and "+f+" and "+h);
            		System.out.println("The Total: "+sum);
            		System.out.println("What type of membership do you have in our shop?"+"\n"+"Input: (1)-GOLD MEMBER (2)-SILVER MEMBER (3)-BRONZE MEMBER");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==2) {
        			double discount = sum*0.85;
        			System.out.println("You will get 15% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment: ");
            		x=a.nextInt();
            		if(x<sum) {
            			float money = sum - x;
            			System.out.println("It seems like you are short on "+money);
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<sum);
            	
            		float change = x - sum;
            		System.out.println("Here is your change:   "+change);
            
            		System.out.println("Happy Purchase!");
            		break;
            	}
            		
            	}
                
            	
            	//Iphone12+Iphone13+Iphone14
            	else if(x==3 && m==4 && y==5) {            	
            		float sum = Iphone12+Iphone13+Iphone14;
            		System.out.println("You chose "+f+" and "+g+" and "+g);
            		System.out.println("The Total: "+sum);
            		System.out.println("What type of membership do you have in our shop?"+"\n"+"Input: (1)-GOLD MEMBER (2)-SILVER MEMBER (3)-BRONZE MEMBER");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==2) {
        			double discount = sum*0.85;
        			System.out.println("You will get 15% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment: ");
            		x=a.nextInt();
            		if(x<sum) {
            			float money = sum - x;
            			System.out.println("It seems like you are short on "+money);
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<sum);
            	
            		float change = x - sum;
            		System.out.println("Here is your change:   "+change);
            
            		System.out.println("Happy Purchase!");
            		break;
            	}
            		
            	}
                
            }
            	//4 items
            	else if (x==4) {
            		System.out.println("What Items would you like to buy?"+"\n"+"(Just type the item numbers and Please type the numbers in an ascending order example (1,2,3,4,5))");
                        System.out.println("IF YOU BREAK THIS RULE IT WILL CAUSE ERROR TO THE SYSTEM!");
                	x=a.nextInt();
                	m=a.nextInt();
                	y=a.nextInt();
            		z=a.nextInt();
            		// IphoneXS+Iphone11+Iphone12+Iphone13
            		if(x==1 && m==2 && y==3 && z==4) {
            			float sum = IphoneXS+Iphone11+Iphone12+Iphone13;
                		System.out.println("You chose "+d+" and "+e+" and "+f+"and"+g);
                		System.out.println("The Total: "+sum);
                			System.out.println("What type of membership do you have in our shop?"+"\n"+"Input: (1)-GOLD MEMBER (2)-SILVER MEMBER (3)-BRONZE MEMBER");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment:");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==2) {
        			double discount = sum*0.85;
        			System.out.println("You will get 15% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment: ");
            		x=a.nextInt();
            		if(x<sum) {
            			float money = sum - x;
            			System.out.println("It seems like you are short on "+money);
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<sum);
            	
            		float change = x - sum;
            		System.out.println("Here is your change:   "+change);
            
            		System.out.println("Happy Purchase!");
            		break;
            	}
            		
            	}
            		//IphoneXS+Iphone11+Iphone12+Iphone14
            		else if(x==2 && m==3 && y==3 && z==5) {
            			float sum = IphoneXS+Iphone11+Iphone12+Iphone14;
                		System.out.println("You chose "+e+" and "+f+" and "+g+"and"+h);
                		System.out.println("The Total: "+sum);
                			System.out.println("What type of membership do you have in our shop?"+"\n"+"Input: (1)-GOLD MEMBER (2)-SILVER MEMBER (3)-BRONZE MEMBER");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==2) {
        			double discount = sum*0.85;
        			System.out.println("You will get 15% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment: ");
            		x=a.nextInt();
            		if(x<sum) {
            			float money = sum - x;
            			System.out.println("It seems like you are short on "+money);
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<sum);
            	
            		float change = x - sum;
            		System.out.println("Here is your change:   "+change);
            
            		System.out.println("Happy Purchase!");
            		break;
            	}
            		
            	}
            	}
            	//5 items
            	else {
            		System.out.println("What Items would you like to buy?"+"\n"+"(Just type the item numbers and Please type the numbers in an ascending order example (1,2,3,4,5))");
                        System.out.println("IF YOU BREAK THIS RULE IT WILL CAUSE ERROR TO THE SYSTEM!");
                	x=a.nextInt();
                	m=a.nextInt();
                	y=a.nextInt();
            		z=a.nextInt();
            		q=a.nextInt();
            		//IphoneXS+Iphone11+Iphone12+Iphone13+Iphone14
            		if(x==1 && m==2 && y==3 && z==4 && q==5) {
            			float sum = IphoneXS+Iphone11+Iphone12+Iphone13+Iphone14;
                		System.out.println("You chose "+d+" and "+e+" and "+f+" and "+g+" and "+h);
                		System.out.println("The Total: "+sum);
                		System.out.println("What type of membership do you have in our shop?"+"\n"+"Input: (1)-GOLD MEMBER (2)-SILVER MEMBER (3)-BRONZE MEMBER");
            	p=a.nextInt();
            	if(p==3) {
        			double discount = sum *0.90;
        			System.out.println("You will get 10% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==2) {
        			double discount = sum*0.85;
        			System.out.println("You will get 15% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	if(p==1) {
        			double discount = sum*0.80;
        			System.out.println("You will get 20% discount!");
        			System.out.println("Your total Discounted Payment will be "+discount);
        			do {
            			
                		System.out.println("Please Input The Payment: ");
                		x=a.nextInt();
                		if(x<discount) {
                			
                			double money = discount - x;
                			System.out.println("It seems like you are short on "+money);
                			System.out.println("Please Try Again");
                			
                			
                			}
                		
                		}while(x<discount);
        			double change = x - discount;
            		
            		System.out.println("Here is your change:   "+change);
       
            		System.out.println("Happy Purchase!");
            		break;
        		}
            	else {
            	do {
            		System.out.println("Please Input The Payment: ");
            		x=a.nextInt();
            		if(x<sum) {
            			float money = sum - x;
            			System.out.println("It seems like you are short on "+money);
            			System.out.println("Please Try Again");	
            		}
            		
            		}while(x<sum);
            	
            		float change = x - sum;
            		System.out.println("Here is your change:   "+change);
            
            		System.out.println("Happy Purchase!");
            		break;
            	}
            		
            	}
            	}
            	
            
                	
            
            
            
        }
        }
    	
            }
    	} while (J.equals(b));
	
    }
	}
	
}
