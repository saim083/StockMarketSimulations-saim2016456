/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

public class SoldShares {

    private int companyId;
    private int investorId;
    private int numberOfShareBuy;
    private double remainigShares;

    public SoldShares(int companyId, int investorId, int numberOfShareBuy , double remainingShares) {
        this.companyId = companyId;
        this.investorId = investorId;
        this.numberOfShareBuy = numberOfShareBuy;
        this.remainigShares = remainingShares;
    }

    public int getCompanyId() {
        return companyId;
    }

    public int getInvestorId() {
        return investorId;
    }

    public int getNumberOfShareBuy() {
        return numberOfShareBuy;
    }

    public double getRemainigShares() {
        return remainigShares;
    }

    @Override
    public String toString() {
        return "SoldShares{" + "companyId=" + companyId + ", investorId=" + investorId + ", numberOfShareBuy=" + numberOfShareBuy + ", remainigShares=" + remainigShares + '}';
    }
    
    
    
}
