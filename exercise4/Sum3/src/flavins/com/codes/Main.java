package flavins.com.codes;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int counter = 0;
        int sum = 0;
        for(int i = 1; i < 10001; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                sum+=i;
                counter++;
                if(counter == 5){
                    break;
                }
            }
        }
        System.out.println("sum: "+sum);
    }
}