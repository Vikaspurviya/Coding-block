import java.util.*;
public class Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.: ");
        int n = sc.nextInt();
        if(n==0){
            System.out.print("The no. is zero");
        }
        else if(n%2==0){
            System.out.print("The no. is even");
        }
        else if(n%2!=0){
            System.out.print("The no. is odd");
        }
    }
}
