package flavins.com.codes;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i = 5;
        int factorial = 1;
        System.out.println("\tnumber" + "\tfactorial");
        for(int m=1; m<=i; m++){
            factorial = factorial*m;
            System.out.println("\t"+ m + "\t"+"\t"+ factorial);
        }
//        System.out.println(factorial);
////        while(i <= 20){
////            i++;
////            if(i % 5 == 0){
////                System.out.println("==========" + i);
////            }
////            System.out.println("#####################" + i);
//        }

    }
}
