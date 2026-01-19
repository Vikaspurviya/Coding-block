import java.util.*;

public class grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student percentage: ");
        int percent = sc.nextInt();

        if (percent < 0 || percent > 100) {
            System.out.println("Invalid percentage ");
        }
        else if (percent >= 90) {
            System.out.println("The student gets A+ Grade");
        }
        else if (percent >= 80) {
            System.out.println("The student gets A Grade");
        }
        else if (percent >= 75) {
            System.out.println("The student gets B Grade");
        }
        else if (percent >= 60) {
            System.out.println("The student gets C Grade");
        }
        else if (percent >= 50) {
            System.out.println("The student gets D Grade");
        }
        else if (percent >= 33) {
            System.out.println("Bhagwan bharose ho tum ");
        }
        else {
            System.out.println("You are Fail ");
        }
    }
}
