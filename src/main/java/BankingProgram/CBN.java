package BankingProgram;

public class CBN {

    protected double rateOfInterest = 0.0;

    public CBN(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public CBN() {
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }
}
