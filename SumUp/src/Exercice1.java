public class Exercice1 {
    public static void main(String[] args) {
        int score = 87;
        char grade;

        if (score >= 80) {
            grade = 'A';
        }  else if (score >= 70 && score <= 79) {
            grade = 'B';
        } else if (score >= 60 &&  score <= 69) {
            grade = 'C';
        }  else if (score >= 50 && score <= 59) {
            grade = 'D';
        }  else if (score >= 40 && score <= 49) {
            grade = 'E';
        }  else if (score >= 30 && score <= 39) {
            grade = 'F';
        } else {
            grade = 'G';
        }

        System.out.println("Your grade is " + grade);
    }

}
