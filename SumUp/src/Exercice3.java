public class Exercice3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 150; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.println("PingPongBoom");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("PingPong");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("PingBoom");
            }  else if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("PongBoom");
            } else  if (i % 3 == 0) {
                System.out.println("Ping");
            }  else if (i % 5 == 0) {
                System.out.println("Pong");
            }   else if (i % 7 == 0) {
                System.out.println("Boom");
            } else {
                System.out.println(i);
            }
        }
    }
}
