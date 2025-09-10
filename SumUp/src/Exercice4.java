import java.util.Random;

public class Exercice4 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt(100));

        }
    }
}
