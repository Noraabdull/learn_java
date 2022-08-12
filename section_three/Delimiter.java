import java.util.Scanner;

public class Delimiter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two integers (on the smae line)");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Enter two big integers (on the smae line)");
        long bignum1 = scan.nextLong();
        long bignum2 = scan.nextLong();

        System.out.println("Enter two decimels (on the smae line)");
        double decimel1 = scan.nextDouble();
        double decimel2 = scan.nextDouble();

        System.out.println("Enter two text values (on the smae line)");
        String text1 = scan.next();
        String text2 = scan.next();

        scan.close();

        System.out.println("Integers: "+ num1 +"  "+num2);
        System.out.println("big numbers: "+ bignum1 +"  "+bignum2);
        System.out.println("decimels: "+ decimel1 +"  "+decimel2);
        System.out.println("text values: "+ text1 +"  "+text2);


    }
    
}
