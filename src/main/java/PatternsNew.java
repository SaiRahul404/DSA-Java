import java.util.Scanner;

public class PatternsNew {

    //    *
    //   ***
    //  *****
    // *******
    //*********

    // row 1 - 4 (5-1)    1    2*1 -1
    // row 2 - 3 (5-2)    3    2*2-1
    // row 3 - 2  (5-3)   5    2*3-1
    // row 4 - 1          7    2*4-1
    // row 5 - 0          9    2*5-1
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("+++++++++++++++=======+++++++++");
        System.out.println("+++++++++++++++=======+++++++++");
        //
        //1
        //12
        //123
        //1234
        //12345
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        // for i = 1--> j <=1  -> j=1
        //  for i = 2--> j <=2 -> j=1, 2
        // for i = 3--> j <=3 -> j=1, 2, 3

        //1
        //22
        //333
        //4444
        //55555

        // for i = 1--> j <=1  -> j=1  -        1
        //  for i = 2--> j <=2 -> j=1, 2        22
        // for i = 3--> j <=3 -> j=1, 2, 3      333
        // for i = 4--> j <=4 -> j=1, 2, 3,4    4444

        System.out.println("+++++++++++++++=======+++++++++");
        System.out.println("+++++++++++++++=======+++++++++");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }


}
