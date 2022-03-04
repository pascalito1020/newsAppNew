package ac.at.fhcampuswien;

import java.util.Scanner;

public class Menu {

    private AppController controller;
    private static String INVALID_INPUT_MESSAGE;
    private static String EXIT_MESSAGE;

    char input;
    Scanner scanner = new Scanner(System.in);

    public void start(){

        for(int i = 1; i > 0; i++) {
            printMenu();
            input = scanner.next().charAt(0);
            handleInput(input);
            switch (input) {
                case 'a' -> getTopHeadlinesAustria();
                case 'b' -> getAllNewsBitcoin();
                case 'y' -> getArticleCount();
                case 'q' -> {
                    printExitMessage();
                    System.exit(0);
                }
            }
        }
    }

    private void handleInput(char input){

        if(input == 'a') {
            System.out.println("Nice!"); // Platzhalter (Wenn input a ist, wird was gemacht...)
        }else if(input == 'b') {
            System.out.println("Nice!");
        }
        else if(input == 'q') {
            System.out.println("");
        }
        else if(input == 'y') {
            System.out.println("Nice!");
        }else
            printvalidInputMessage();

    }

    private void getArticleCount(/**AppController.ctrl**/){}

    private void getTopHeadlinesAustria(/**AppController.ctrl**/){}

    private void getAllNewsBitcoin(/**AppController.ctrl**/){}

    private static void printExitMessage(){
        System.out.println("Bye bye! ;-)");
    }

    private static void printvalidInputMessage(){
        System.out.println("Invalid Input, Try again!");
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
