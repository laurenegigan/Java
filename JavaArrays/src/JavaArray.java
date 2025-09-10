import java.util.Arrays;

public class JavaArray {
    public static void main(String[] args) {

        //ONE DIRECTIONAL ARRAY


        int myArr1[];
        int[] myArr2 = new int[5];
        myArr2[4] = 1;

        int[] arr = { 10, 20, 30, 40, 50};
        System.out.println("The value of array element is: " + myArr2[4]);

        //TWO DIRECTIONAL ARRAY

        int[][] myArr3 = new int[3][3];
        myArr3[0][0] = 1;
        myArr3[0][1] = 2;
        myArr3[0][2] = 3;
        myArr3[1][0] = 4;
        myArr3[1][1] = 5;
        myArr3[1][2] = 6;
        myArr3[2][0] = 7;

        System.out.println("The value of array element is: " + myArr3[0][2]);
        //Three-dimensional array

        int[][][] myArr4 = new int[3][3][4];

        myArr4[0][0][0] = 1;
        myArr4[0][0][1] = 2;

        System.out.println("The value of array element is: " + myArr4[0][0][2]);

        //Declaring an array in Java
        //dataType[] arrayName;
        //dataType[] can be any Java object or primitive type.
        //arrayName = new dataType[size];
        //Size is the number of elements in the array
        // arrayName[index] refers to the element at index. Access array elements

        String[] dogs = {"Pitbull", "Bulldog", "Beagle", "Labrador"};

        System.out.println("My dog is: " + dogs[2]);

        System.out.println("Before update : " + dogs[2]);

        dogs[2] = "Corgi";

        System.out.println("After update : " + dogs[2]);

        //loop through the array with the loop

        for (int i = 0; i < dogs.length; i++) {
            System.out.println("Dog " + i + "is a " + dogs[i]);
        }

        //Add new item to an Array

        int [] numbers = {1, 2, 3, 4, 5};
        int [] newNumbers = new int[numbers.length + 1];

        int [] newArray = Arrays.copyOf(numbers, newNumbers.length + 1);

        System.out.println("The new array length is:" + newNumbers.length);
        System.out.println("The new array length is : " + newArray.length);



    }
}
