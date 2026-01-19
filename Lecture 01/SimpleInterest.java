import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the amount :");
        int p = sc.nextInt();
        System.out.print("Enter the rate :");
        int r = sc.nextInt();
        System.out.print("Enter the time in year:");
        int t=sc.nextInt();
        int simple_interest=(p*r*t)/100;
        System.out.print("The simple interest is: "+simple_interest);
    }
    
}
