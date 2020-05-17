package dataaccessobjects;

import java.util.ArrayList;

import singleton.Company;
import abstractfactory.CompanyInterface;

public class CompanyImplementations implements CompanyInterface{

    @Override
    public ArrayList<Company> Create100RandomCompaniesObject() {
    
        ArrayList<Company> companiesobjects = new ArrayList<>();
  
      int uniqueCompanyId = 1;
      
      for(int i =1; i<=100; i++){
      
      double randomShares = Math.random() * (1000 - 500 + 1) + 500; 
      double randomPrice = Math.random() * (100 - 10 + 1) + 10; 
      
      Company company = new Company(uniqueCompanyId, Math.round(randomShares), Math.round(randomPrice));
      companiesobjects.add(company);
      uniqueCompanyId += 1;
      }
        return companiesobjects;
    }
    
}
