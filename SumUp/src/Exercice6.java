import java.util.Random;

public class Exercice6 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = {52,67,12,43,16,6,63,84,35};
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        for (int number : array) {

        }
    }
}
