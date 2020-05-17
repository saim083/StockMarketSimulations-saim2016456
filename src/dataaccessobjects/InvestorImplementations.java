package dataaccessobjects;

import java.util.ArrayList;
import singleton.Investor;
import abstractfactory.InvestorInterface;

public class InvestorImplementations implements InvestorInterface{

    @Override
    public ArrayList<Investor> Create100RandomInvestorsObjects() {
  
        
        ArrayList<Investor> investorsobjects = new ArrayList<>();
        
      
      int UniqueInvestorId = 1;
      
      for(int i =1; i<=100; i++){
      
      double random_budgets = Math.random() * (10000 - 1000 + 1) + 10000; 
      
      Investor investor = new Investor(UniqueInvestorId, Math.round(random_budgets));
      investorsobjects.add(investor);
      UniqueInvestorId+=1;
      }
        return investorsobjects;
    }

    
}
