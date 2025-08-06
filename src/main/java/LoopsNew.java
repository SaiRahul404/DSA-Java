import java.util.Scanner;

public class LoopsNew {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Calculate the sum of numbers from 1 to N.
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            // 1st iteration sum = 0 i =1
            // sum = 1
            // i = 2
            // sum = sum + i
            // sum = 1+2 = 3
            // i = 3
            // sum = 3+3 = 6
            // i =4
            // sum = 6 + 4 = 10
            sum = sum + i;
        }
        System.out.println("The sum of 1st " + n + " is :" + sum);

    }
}
