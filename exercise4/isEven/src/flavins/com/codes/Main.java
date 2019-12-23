package flavins.com.codes;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number = 4;
        int finishedNumber = 20;
        int totalEvenNumber = 0;

        while(number <= finishedNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            totalEvenNumber++;
            if(totalEvenNumber == 5){
                break;
            }

        }

        System.out.println("Total even number: " + totalEvenNumber);
    }

    public static boolean isEvenNumber(int n){
        if(n % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}