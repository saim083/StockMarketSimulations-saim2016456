package main;

import dataaccessobjects.CompanyImplementations;
import dataaccessobjects.InvestorImplementations;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import singleton.Company;
import singleton.Investor;
import singleton.SoldShares;

public class StockMarketSimulations {

    public static void userMenu(){
        System.out.println("To Find Company with the highest capital press :1:\n"
                         + "To Find Company with the lowest capital press :2:\n"
                         + "To Find Investor with the highest number of shares press :3:\n"
                         + "To Find Investor with the lowest number of shares press :4:\n"
                         + "To Sell Shares Press :5:\n"
                         + "FOR EXIT PRESS :0:");
    }
    public static void main(String args[]){
        
        ArrayList<Company> Companies = new CompanyImplementations().Create100RandomCompaniesObject();
        ArrayList<Investor> investors = new InvestorImplementations().Create100RandomInvestorsObjects();
        ArrayList<SoldShares> soldShares = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        
        while(true){
        System.out.println("Please Select any number :>");
        userMenu();
        input = reader.readLine();
            
            if(input.equals("1")){
         
                System.out.println("Company with the Highest Capital");
               
                 Collections.sort(Companies, new Comparator<Company>() {

            public int compare(Company c1, Company c2) {
                return (int) (c1.getRandomShares() - c2.getRandomShares());
                }
                 });
        
                for(int i=Companies.size()-1; i>=1 ; i--){
                System.out.println(Companies.get(i).toString());
        }
                
                
                }
            if(input.equals("2")){

                   System.out.println("Company with the Lowest Capital");

                 Collections.sort(Companies, new Comparator<Company>() {

            public int compare(Company c1, Company c2) {
                return (int) (c1.getRandomShares() - c2.getRandomShares());
                }
                 });
        
                for(Company c : Companies){
                System.out.println(c.toString());
                 }
             
                
                }
            if(input.equals("3")){
            
                
             System.out.println("Investor With Highes number of shares");

                 Collections.sort(investors, new Comparator<Investor>() {

            public int compare(Investor i1, Investor i2) {
                return (int) (i1.getRandomBudget() - i2.getRandomBudget());
                }
                 });
        
                  for(int i=investors.size()-1; i>=1 ; i--){
                System.out.println(investors.get(i).toString());
        }       
                }
            if(input.equals("4")){
            
             System.out.println("Investor With Lowest number of shares");
             System.out.println("");
           Collections.sort(investors, new Comparator<Investor>() {

            public int compare(Investor i1, Investor i2) {
                return (int) (i1.getRandomBudget() - i2.getRandomBudget());
                }
                 });
        
                for(Investor in : investors){
                System.out.println(in.toString());
                
                }
                System.out.println("");
             

                
                }
            if(input.equals("5")){
            
                System.out.println("Sell Shares");
                
                System.out.print("Enter Company ID >:");
                String companyId = reader.readLine();
                
                for(Company c : Companies ){
                    if(c.getCompanyUniqueID() == Integer.parseInt(companyId)){
                    System.out.println("");
                        System.out.println("Company : "+companyId+" Have "+c.getRandomShares());
                    System.out.println("");
                    }
                }
                System.out.print("How many shares do you want to sell>: ");
                String numberOfShares = reader.readLine();
                
                System.out.print("Investor Id :> ");
                String investor = reader.readLine();
                
                double remainingShares = 0;
                for(Company c : Companies ){
                    
                    if(c.getCompanyUniqueID()== Integer.parseInt(companyId)){
                        remainingShares = c.getRandomShares()- Integer.parseInt(numberOfShares);
                        c.setRandomShares(remainingShares);
                        
                        // if 10 shares sold shares price multiply by 2
                        if(Integer.parseInt(numberOfShares)>=10){
                            c.setRandomPrice(c.getRandomPrice()*2);
                            System.out.println("Share greater then 10 dual price");
                            System.out.println("");
                        //deduce 2% of price
                        }else{
                            double deduce2P = 2/c.getRandomPrice();
                            c.setRandomPrice(c.getRandomPrice()- deduce2P);
                            System.out.println("Share less then 10 deduce 2%");
                            System.out.println("");
                        }
                      
                    }
                }
                
                
                SoldShares sold = new SoldShares(Integer.parseInt(companyId), Integer.parseInt(investor), Integer.parseInt(numberOfShares) , remainingShares);
                soldShares.add(sold);
                for(SoldShares shares : soldShares){
                    
                    System.out.println(shares.toString());
                }
                
                
            }
            if(input.equals("0")){
                break;
                }
        
        
        }
        
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
}
