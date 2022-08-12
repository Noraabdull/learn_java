import java.util.Scanner;
public class Survey {
    public static void main(String[] args) {
        int counter= 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("What is your name?");
        String name =  scan.nextLine();
        counter++;
        System.out.println("How old are you?");
        int age = scan.nextInt();
        counter++;
        System.out.println("How much money do you spend on coffee?");
        Double coffeePrice = scan.nextDouble();
        counter++;
        System.out.println("How much money do you spend on fast food?");
        Double foodPrice = scan.nextDouble();
        counter++;
        scan.close();
        System.out.println("\nThank you "+ name+ " for answering all " + counter + " questions!\n");
        System.out.println("\nYour fast food expenses are "+ (foodPrice/coffeePrice)+ " times more than your coffe expenses.\n");

    }
}