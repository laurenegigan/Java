//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Signed
        //Nombre
        //Entier (nombre sans virgule)
        byte monByte = 100;
        short monShort = 10000;
        int monInt = 1000000000;
        long monLong = 10000000000L;

        //Décimal (nombre a virgule)
        float monFloat = 1.2f;
        double monDouble = 1.23;

        //UnSigned
        // Caractère
        char maLettre = 'A';

        //Non-Nombre
        // Booléen
        boolean estVrai = true;

        // Affichage
        System.out.println("Nombre entier Signed");
        System.out.println("byte : " + monByte);
        System.out.println("short : " + monShort);
        System.out.println("int : " + monInt);
        System.out.println("long : " + monLong);
        System.out.println("======================");
        System.out.println("Nombre décimal Signed");
        System.out.println("float : " + monFloat);
        System.out.println("double : " + monDouble);
        System.out.println("======================");
        System.out.println("Non-nombre Booléen");
        System.out.println("boolean : " + estVrai);
        System.out.println("======================");
        System.out.println("Unsigned Caractère");
        System.out.println("char : " + maLettre);

    }

}