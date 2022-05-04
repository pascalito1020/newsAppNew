package ac.at.fhcampuswien;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Menu {

    private AppController controller = new AppController();
    private static String INVALID_INPUT_MESSAGE = "Invalid input! :-(";
    private static String EXIT_MESSAGE = "Bye Bye ! :-(";

    public void start(){

        String input = null;
        Scanner scanner = new Scanner(System.in);
        while(!Objects.equals(input, "q")){
            printMenu();
            input = scanner.next();
            handleInput(input);
        }

    }

    private void handleInput(String input){

        Scanner scanner2 = new Scanner(System.in);

        if(Objects.equals(input, "a")) {

            System.out.println("Which topic are you interested in?");
            String input2 = scanner2.next();
            controller.getTopHeadlinesAustria(input2);

        }else if(Objects.equals(input, "b")) {
            controller.getAllNewsBitcoin();

        }else if(Objects.equals(input, "y")) {

            System.out.println("Which articles do you want to count?");
            String input3 = scanner2.next();
            controller.articleCount(input3);

        }else if(Objects.equals(input, "q")){
            printExitMessage();
            System.exit(0);
        }else
            printValidInputMessage();

    }

    private static void printExitMessage(){
        System.out.println(EXIT_MESSAGE);
    }

    private static void printValidInputMessage(){
        System.out.println(INVALID_INPUT_MESSAGE);
    }

    private static void printMenu(){
        System.out.println("***********************");
        System.out.println("* Welcome to NewsApp *");
        System.out.println("***********************");
        System.out.println("Enter what you wanna do");
        System.out.println("a: Get top headlines austria");
        System.out.println("b: Get all news about bitcoin");
        System.out.println("y: Count articles");
        System.out.println("q: Quit programm");
    }


}
