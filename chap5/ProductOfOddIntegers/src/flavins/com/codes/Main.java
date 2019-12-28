package flavins.com.codes;

public class Main {

    public static void main(String[] args) {
	    int product = 1;

	    for(int i = 1; i <= 16; i++){
	        if(i % 2 != 0){
	            product*= i;
            }
        }

        System.out.println("the product of the odd integers is: " + product);
    }
}
