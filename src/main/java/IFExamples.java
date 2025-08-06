public class IFExamples {
    public static void main(String[] args) {
        int eggs = 6;
        boolean hasChicken = true;
        boolean hasCoconutMilk = false;
        boolean hasSpices = true;

        if (eggs >= 12) {
            System.out.println("Let's make a big omelette for everyone!");
        } else if (eggs >= 6) {
            System.out.println("I can make scrambled eggs for myself!");
        } else { // This runs if neither of the above conditions were true
            System.out.println("Looks like no eggs for breakfast, time for cereal!");
        }

        if (hasChicken) {
            System.out.println("We have Chicken");
            if (hasCoconutMilk) {
                System.out.println("Let's make kerala Style Chicken");
            } else {
                System.out.println("Let's have a normal Chicken ");
            }
        } else {
            System.out.println("Samay is happy!");
        }

        int month = 13; // April
        String season;

        if (month == 12 || month == 1 || month == 2)
            season = "Winter";  // If month is Dec, Jan, or Feb, it's Winter
        else if (month == 3 || month == 4 || month == 5)
            season = "Spring";  // If March, April, or May, it's Spring
        else if (month == 6 || month == 7 || month == 8)
            season = "Summer";  // If June, July, or Aug, it's Summer
        else if (month == 9 || month == 10 || month == 11)
            season = "Autumn";  // If Sept, Oct, or Nov, it's Autumn
        else
            season = "Bogus Month"; // If the number is invalid, show error message

        System.out.println("Month: " + month + " is in the " + season + ".");

        int dayOfWeek = 3; // 1 for Monday, 2 for Tuesday, etc.

        switch (dayOfWeek) {
            case 1:
                System.out.println("It's Monday, time for work!");
                break;
            case 2:
                System.out.println("It's Tuesday, coding time!");
                break;
            case 3:
                System.out.println("It's Wednesday, half-week done!");
                break;
            case 4:
                System.out.println("It's Thursday, almost weekend!");
                break;
            case 5:
                System.out.println("It's Friday, yay!");
                break;
            case 6:
                System.out.println("It's Saturday, relax!");
                break;
            case 7:
                System.out.println("It's Sunday, prepare for Monday!");
                break;
            default:
                System.out.println("That's not a valid day of the week.");
                break;
        }

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Bogus Month";
        }
        System.out.println("April is in the " + season + ".");
        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Very Good!");
                break;
            case 'C':
                System.out.println("Good!");
                break;
            case 'D':
                System.out.println("Pass.");
                break;
            case 'F':
                System.out.println("Fail.");
                break;
            default:
                System.out.println("Invalid Grade.");
                break;
        }

        String fruit = "Apple";

        switch (fruit) {
            case "Apple":
                System.out.println("An apple a day keeps the doctor away!");
                break;
            case "Banana":
                System.out.println("Great for smoothies.");
                break;
            case "Orange":
                System.out.println("Full of Vitamin C!");
                break;
            default:
                System.out.println("I don't know that fruit.");
                break;
        }
    }
    // The if statement allows a program to execute a block of code only if a specified condition is true.
    //  The else statement provides an alternative block of code to be executed if the
    //  condition of the preceding if statement (or else if statement) is false.

    // switch statement: The "Fixed Menu" Choice
    // The switch statement is like a restaurant menu where you have a few fixed options.
    // You don't have complex "if this and that" conditions; you just pick one item from a list.
    // case option1:: "If you pick 'Pizza', cook pizza."
    //
    //case option2:: "If you pick 'Pasta', cook pasta."

    // break;: This is crucial!
    //Without break;, your program would keep executing the code for the next options too, which is usually not what you want.
    // default:: "If you pick anything else not on the menu, just bring water." This is like the else of the if statement –
    // it runs if none of the case options match.

    // Use if, else if, else when you have complex conditions  or when you have a wide range of possibilities.
    // Use switch when you have a fixed set of specific values you're checking against
    // It's often cleaner and sometimes more efficient for such scenarios than a long chain of else if statements.

    // Programs to check if a number is positive/negative/zero.
    //Program to determine if a person is eligible to vote/drive.

}
