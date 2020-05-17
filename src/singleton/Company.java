package singleton;

public class Company {
    
    private int CompanyUniqueID;
    private double RandomShares ;
    private double RandomPrice;

    public Company(int CompanyUniqueID, double RandomShares, double RandomPrice) {
        this.CompanyUniqueID = CompanyUniqueID;
        this.RandomShares = RandomShares;
        this.RandomPrice = RandomPrice;
    }

    public int getCompanyUniqueID() {
        return CompanyUniqueID;
    }

    public double getRandomShares() {
        return RandomShares;
    }

    public double getRandomPrice() {
        return RandomPrice;
    }

    public void setCompanyUniqueID(int CompanyUniqueID) {
        this.CompanyUniqueID = CompanyUniqueID;
    }

    public void setRandomShares(double RandomShares) {
        this.RandomShares = RandomShares;
    }

    public void setRandomPrice(double RandomPrice) {
        this.RandomPrice = RandomPrice;
    }
    

    @Override
    public String toString() {
        return "Company{" + "CompanyUniqueID=" + CompanyUniqueID + ", RandomShares=" + RandomShares + ", RandomPrice=" + RandomPrice + '}';
    }

    
    
    
    
}
