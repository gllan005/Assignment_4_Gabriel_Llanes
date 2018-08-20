/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_4_Gabriel_Llanes.Assignment_4_Gabriel_Llanes;

/**
 *I affirm that this program is entirely my own work and 
 * none of it is the work of any other person.
 * @author Gabriel Llanes
 * Instructor: Caryl Rahn 
 * COP 2210 U02 Thursday 11:00 a.m. lab
 */
import java.util.Scanner;
public class ClientCode {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    String companyName;
    int sharesHeld, dollarSharePrice, eithsSharePrice;
    
    /*
    Get values of the variables from the user
    */
    System.out.println("Enter name of the company: ");
    companyName = input.nextLine();
    System.out.println("Enter the number of shares held: ");
    sharesHeld = input.nextInt();
    System.out.println("Enter the dollar portion of the share price: ");
    dollarSharePrice = input.nextInt();
    System.out.println("Enter the eiths portion of the share price: ");
    eithsSharePrice = input.nextInt();
    
    /*
    *Compute and output values by calling 
    *methods in the stockportfolio class 
    */
    StockPortfolio ob = new StockPortfolio(companyName, sharesHeld, dollarSharePrice, eithsSharePrice); 
    System.out.println("Company Name: " + ob.getCompanyName());
     System.out.println("Number of Shares: " + ob.getSharesHeld());
      System.out.println("Opening Price Per Share: " + ob.getDollarSharePrice() + " " + ob.getEithsSharePrice()
      + "/8");
    System.out.printf("Opening portfolio value: $%.2f\n",ob.portfolioValue());
    System.out.println("Enter the change in dollar portion of the share price: ");
    dollarSharePrice = input.nextInt();
    System.out.println("Enter the change in eiths portion of the share price: ");
    eithsSharePrice = input.nextInt(); 
    ob.modifyStockPrice(dollarSharePrice, eithsSharePrice);
    System.out.println("Changing share price: " + dollarSharePrice + " " + eithsSharePrice
      + "/8");
    System.out.println("Closing share price: " + ob.getDollarSharePrice() + " " + ob.getEithsSharePrice()
      + "/8");
    
    System.out.printf("Closing portfolio value: $%.2f\n",ob.portfolioValue());
    System.out.println("Enter the change in dollar portion of the share price: ");
    dollarSharePrice = input.nextInt();
    System.out.println("Enter the change in eiths portion of the share price: ");
    eithsSharePrice = input.nextInt(); 
    ob.modifyStockPrice(dollarSharePrice, eithsSharePrice);
    System.out.println("Changing share price: " + dollarSharePrice + " " + eithsSharePrice
      + "/8");
    System.out.println("Closing share price: " + ob.getDollarSharePrice() + " " + ob.getEithsSharePrice()
      + "/8");
    System.out.printf("Closing portfolio value: $%.2f\n",ob.portfolioValue());
    
    }
}
