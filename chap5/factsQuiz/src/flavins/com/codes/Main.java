package flavins.com.codes;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int score = quizeScore();
	    printScore(score);
    }

    public static int quizeScore(){
        boolean quit = false;
        int score = 0;
        for (int i=0; i<5; i++){
            System.out.println("please enter question choice 1 - 4: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    question1();
                    int answer = scanner.nextInt();
                    if(answer == 2016){
                        score++;
                    }
                    scanner.nextLine();
                    break;
                case 2:
                    question2();
                    String answer2 = scanner.toString();
                    if(answer2 == "11" || answer2 == "eleven"){
                        score++;
                    }
                    scanner.nextLine();
                    break;
                case 3:
                    question3();
                    String answer3 = scanner.toString();
                    if(answer3=="1%" || answer3.toLowerCase()=="one"){
                        score++;
                    }
                    scanner.nextLine();
                    break;
                case 4:
                    question4();
                    String answer4 = scanner.toString();
                    if(answer4 == "195"){
                        score++;
                    }
                    scanner.nextLine();
                    break;
            }
        }
        return score;
    }

    public static void  question1(){
        System.out.println("what year is the warmest year in record");
    }

    public static void question2(){
        System.out.println("what percentage of percentage of all global greenhouse gas emission caused by deforestation");
    }

    public static  void question3(){
        System.out.println("what percentage of tree species  in the Amazone request 50% of the region's carbon ");
    }

    public static void question4(){
        System.out.println("How many countries signed the 2015 Paris Agreement ");
    }

    public static void printScore(int score){
        if(score == 4){
            System.out.println("Excellent");
        }else if(score ==3){
            System.out.println("Good");
        }else if(score == 2){
            System.out.println("Fair");
        }else if(score==1){
            System.out.println("brace up your skills");
        }else{
            System.out.println("You kno nothing about climate change");
        }
    }


}
