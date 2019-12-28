package flavins.com.codes;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(double i = 2; i < 9; i++){
            System.out.println(calculateInterest(10000, i));
        }

    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
