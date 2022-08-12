import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Java Dealership!");
        System.out.println("\nEnter A to buy a car. \nEnter B to sell a car");
        String option = scan.nextLine();
        switch (option) {
            case "A": System.out.println("\nYou chose option "+ option); break;
            case "B": System.out.println("\nYou chose option "+ option); break;
            default: System.out.println("\nIvalid option");
        }
        scan.close();
    }
}