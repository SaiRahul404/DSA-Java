import javafx.scene.SubScene;

import java.util.Scanner;

public class NestedLoops {
    // You can place one loop inside another.
    // This is useful for working with patterns or multi-dimensional data
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.println("The values of i and j are " + i + " " + j);
            }
        }
        // i =0, j =0
        // i =0, j = 1
        // i =0, j = 2
        // i =0, j = 3
        // i =0, j = 4
        // i =0, j = 5

        // i =1, j =0
        // i =1, j = 1
        // i =1, j = 2
        // i =1, j = 3
        // i =1, j = 4
        // i =1, j = 5

        // i =2, j =0
        // i =2, j = 1
        // i =2, j = 2
        // i =2, j = 3
        // i =2, j = 4
        // i =2, j = 5

        // i =3, j =0
        // i =3, j = 1
        // i =3, j = 2
        // i =3, j = 3
        // i =3, j = 4
        // i =3, j = 5

        // i =4, j =0
        // i =4, j = 1
        // i =4, j = 2
        // i =4, j = 3
        // i =4, j = 4
        // i =4, j = 5

        // i =5, j =0
        // i =5, j = 1
        // i =5, j = 2
        // i =5, j = 3
        // i =5, j = 4
        // i =5, j = 5

        System.out.println();

        //System.out.print("Enter the number of rows : ");
        int rows = 5;
        int columns = 3;


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // i =0,1,2,3,4
        // j = 0,1,2,3

        System.out.println("==================");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("==================");
        for (int i = rows; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("==================");
        System.out.println("==================");

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("==================");
        System.out.println("==================");

        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
