package BankingProgram;

public class Main {

    public static void main(String[] args) {

        CBN cbn = new CBN();
        UBA uba = new UBA();
        GTB gtb = new GTB();
        Zenith zenith = new Zenith();


        System.out.println("CBN Rate of Interest: " + cbn.getRateOfInterest() + "%");

        System.out.println("UBA Rate of Interest: " + uba.getRateOfInterest() + "%");

        System.out.println("GTB Rate of Interest: " + gtb.getRateOfInterest() + "%");

        System.out.println("Zenith Rate of Interest: " + zenith.getRateOfInterest() + "%");









    }
}
