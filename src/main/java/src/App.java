package src;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("1. Add User.");
            System.out.println("2. Add Organization.");
            // System.out.println("");
            System.out.println("0. Exit.");

            int command = scanner.nextInt();

            if (command == 1) {

            } else if (command == 2) {

            } else if (command == 0) {
                System.exit(0);
            } else {
                System.err.println("Wrong command.");
            }

        }
    }
}
