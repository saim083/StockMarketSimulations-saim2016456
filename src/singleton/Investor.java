package singleton;

public class Investor {

    
    private int investoUniqueID;
    private double RandomBudget;

    public Investor(int investoUniqueID, double RandomBudget) {
        this.investoUniqueID = investoUniqueID;
        this.RandomBudget = RandomBudget;
    }

    public int getInvestoUniqueID() {
        return investoUniqueID;
    }

    public double getRandomBudget() {
        return RandomBudget;
    }

    @Override
    public String toString() {
        return "Investor{" + "investoUniqueID=" + investoUniqueID + ", RandomBudget=" + RandomBudget + '}';
    }

    
    
}
