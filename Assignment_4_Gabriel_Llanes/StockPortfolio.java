/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_4_Gabriel_Llanes.Assignment_4_Gabriel_Llanes;

/**
 *I affirm that this program is entirely my own work and none 
 * of it is the work of any other person.
 * @author Gabriel Llanes
 * Instructor: Caryl Rahn
 * COP 2210 U02 Thursday 11:00 a.m. lab
 */

/*
*   A class to represent a stock portfolio using the traditional measure.
*/
public class StockPortfolio {
//Instance variables
    private String companyName; //Name of the comapany
    private int sharesHeld; //Number of shares held
    private int dollarSharePrice; //Dollar portion of the share price
    private int eithsSharePrice; //Eiths portion of the share price
    
    /**
	 * Create a stockportfolio object with share price measurements 
	 * x,y and a given radius.
	 * @param companyName name of the company
	 * @param sharesHeld the number of shares held
	 * @param dollarSharePrice the dollar portion of share price
         * @param eithsSharePrice Eiths portion of the share price
	 */
    public StockPortfolio(String companyName, int sharesHeld,
            int dollarSharePrice, int eithsSharePrice){
    this.companyName = companyName;
    this.dollarSharePrice = dollarSharePrice;
    this.eithsSharePrice = eithsSharePrice;
    this.sharesHeld = sharesHeld; 
    }
    
    /**
	 * Get the company name.
	 * @return the company name.
	 */
    public String getCompanyName() {
        return companyName;
    }

    /**
	 * Reset the company name to a specified value.
	 * @param companyName name of the company
	 */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    /**
	 * Get the number of shares held
	 * @return the number of shares held
	 */
    public int getSharesHeld() {
        return sharesHeld;
    }

    /**
	 * Reset the sharesHeld to a specified value
	 * @param sharesHeld number of shares held
	 */
    public void setSharesHeld(int sharesHeld) {
        this.sharesHeld = sharesHeld;
    }
    
    /**
	 * Get the dollar portion of the share price
	 * @return the dollar portion of the share price
	 */
    public int getDollarSharePrice() {
        return dollarSharePrice;
    }

    /**
	 * Reset the dollarSharePrice to a specified value.
	 * @param dollarSharePrice the new dollar portion of share price
	 */
    public void setDollarSharePrice(int dollarSharePrice) {
        this.dollarSharePrice = dollarSharePrice;
    }
    
    /**
	 * Get the eiths portion of the share price
	 * @return the eiths portion of the share price
	 */
    public int getEithsSharePrice() {
        return eithsSharePrice;
    }

    /**
	 * Reset the eithsSharePrice to a specified value.
	 * @param eithsSharePrice the new eiths portion of the share price
	 */
    public void setEithsSharePrice(int eithsSharePrice) {
        this.eithsSharePrice = eithsSharePrice;
    }
    
    /**
	 * Modify a StockPrice object with change in dollar and eiths of
         * a share price.
	 * @param changeDollar the changed dollar of share price
	 * @param changeEith the changed eiths portion of a share price
	 */
    public void modifyStockPrice(int changeDollar, int changeEith){
    dollarSharePrice += changeDollar;
    eithsSharePrice += changeEith;
    dollarSharePrice += eithsSharePrice/8;
    eithsSharePrice = eithsSharePrice%8;
    }
    
    /**
	 *  A method to compute and return the portfolio value as a decimal.
	 * @param portfolioValue the returned portfolio value as a decimal.
	 */
    public double portfolioValue(){
    double portfolioValue;
    portfolioValue = sharesHeld*(dollarSharePrice + eithsSharePrice/8.0);
    return portfolioValue;
    }
}
