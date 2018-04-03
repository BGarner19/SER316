package Simulation;

import java.util.Scanner;

import static Simulation.Apiary.getApiaryInstance;

/**
 * This class runs the program. Uses a menu and calls the apiary instances methods to create the bee simulator.
 */

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
                    getApiaryInstance().spawnBeehive(Integer.parseInt(scan.next()), Integer.parseInt(scan.next()), scan.next());
                    break;
                case "give":
                    getApiaryInstance().giveResource(Integer.parseInt(scan.next()), scan.next(), Integer.parseInt(scan.next()));
                    break;
                case "tick":
                    if (scan.hasNextInt()) {
                        getApiaryInstance().updateTicks(Integer.parseInt(scan.next()));
                    }
                    else {
                        getApiaryInstance().updateTicks();
                    }
                    break;
                case "summary":
                    getApiaryInstance().summarize(Integer.parseInt(scan.next()));
                    break;
                default:
                    System.out.println("Not a valid choice.");
                    break;
            }
        } while (cont);



    }

    private static void printMenu() {

        System.out.println("\n===BEEHIVE SIMULATOR===");
        System.out.print("\nspawn X Y T - creates a new beehive at position X, Y of species T (Killer, Honey)" +
                            "\ngive I R A - give beehive I resource R of amount A (Warrior, Food)" +
                            "\ntick T - perform T tick operations" +
                            "\nsummary I - give a summary of beehive I" +
                            "\nmenu - print the menu" +
                            "\nquit - quit the program");

    }
}
