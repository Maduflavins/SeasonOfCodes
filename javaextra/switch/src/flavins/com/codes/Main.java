package flavins.com.codes;

public class Main {

    public static void main(String[] args) {
	    char switchValue = 'A';

	    switch (switchValue){
            case 'A':
                System.out.println("the value is A and its correct");
                break;
            case 'B':
                System.out.println("Value is B");
                break;
            case 'C':
                System.out.println("the value is C");
                break;

            default:
                System.out.println("this is the default");
        }
    }
}
