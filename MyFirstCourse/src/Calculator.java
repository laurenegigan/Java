import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a number please :)");
        // Collecte les nombres
        int number = input.nextInt();
        System.out.println("Give me a second number please :)");
        int number2 = input.nextInt();
        // Addition et résultat
        int result = number2 + number;
        System.out.println("The result is: " + result);
    }
}
