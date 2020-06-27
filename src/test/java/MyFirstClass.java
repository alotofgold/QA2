import org.junit.jupiter.api.Test;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MyFirstClass {
    @Test
    public void CountCharactersInString() {
        String str = "Cutting-edge organizations use test IO to supercharge their QA.";
        int count = str.length();
        System.out.println("Number of characters in the string is " + count + ".");
    }

    @Test
    public void CreditCalc() {
        double percentPerYear = 22;
        double creditAmount = 50000;
        int creditTerm = 12;
        double percentPerMonth = 0;
        double monthlyPayment = 0;
        double totalPrincipalPaid;
        double totalPrincipalInterest;
        percentPerMonth = percentPerYear / 100.00 / creditTerm;
        monthlyPayment = creditAmount * (percentPerMonth + (percentPerMonth /
                (pow((1+percentPerMonth),creditTerm) - 1)));
        totalPrincipalPaid = monthlyPayment * creditTerm;
        totalPrincipalInterest = totalPrincipalPaid - creditAmount;
        System.out.format("Credit Amount - %.2f\n", creditAmount);
        System.out.format("Total Principal Paid - %.2f\n", totalPrincipalPaid);
        System.out.format("Total Principal Interest - %.2f\n", totalPrincipalInterest);
    }

    @Test
    public void distanceBetweenTwoDots(){
        int x1 = 3;
        int y1 = 2;
        int x2 = 12;
        int y2 = 7;
        double AC = x2 - x1;
        double BC = y2 - y1;
        double AB = sqrt(pow(AC,2) + pow(BC,2));
        System.out.println("Distance between point A(" + x1 +  "," + y1 + ")" + " and point B("
                + x2 +  "," + y2 + ")" + " is " + AB + ".");
    }
}