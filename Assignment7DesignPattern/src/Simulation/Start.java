package Simulation;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        printMenu();
        String choice;
        boolean cont = true;

        do {
            System.out.print("\nMake a choice: ");

            choice = scan.next();

            switch (choice.toLowerCase()) {
                case "menu":
                    printMenu();
                    break;
                case "quit":
                    cont = false;
                    break;
                case "spawn":
                    break;
                case "give":
                    break;
                case "tick":
                    break;
                case "summary":
                    break;
                default:
                    System.out.println("Not a valid choice.");
                    break;

            }
        } while (cont);



    }

    private static void printMenu() {

        System.out.println("\n===BEEHIVE SIMULATOR===");
        System.out.print("\nspawn X Y T - creates a new beehive at position X, Y of species T" +
                            "\ngive I R A - give beehive I resource R of amount A" +
                            "\ntick T - perform T tick operations" +
                            "\nsummary I - give a summary of beehive I" +
                            "\nmenu - print the menu" +
                            "\nquit - quit the program");

    }
}
