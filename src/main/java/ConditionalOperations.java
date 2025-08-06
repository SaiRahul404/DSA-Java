import java.util.Scanner;

public class ConditionalOperations {
    public static void main(String[] args) {
        int n;
        int age = 20;
        boolean hasLicense = true;
        double score = 85.5;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println("Is age equal to 20? " + (age == 20));
        System.out.println("Is age not equal to 18? " + (age != 18));
        System.out.println("Is age greater than 18? " + (age > 18));
        System.out.println("Is age less than 25? " + (age < 25));
        System.out.println(age >= 20);
        System.out.println(age <= 19);

        System.out.println("\n--- Logical Operators ---");
        // // AND (&&): Both conditions must be true
        boolean isEligible = (age > 18) && hasLicense;
        System.out.println(isEligible);
//        boolean canVote = (age >= 18) && (hasLicense == true);
        //  // OR (||): At least one condition must be true
        boolean isAdultOrStudent = (age >= 18) || (score > 90);
        System.out.println(isAdultOrStudent);
        boolean wantsDiscount = (age < 12) || (score > 95);
        System.out.println("Wants discount (age < 12 OR score > 95)? " + wantsDiscount); // false (false || false)

        boolean notEligible = !isEligible;
        System.out.println(notEligible);

        boolean isYoung = !(age >= 25);
        System.out.println(isYoung);
    }
}
