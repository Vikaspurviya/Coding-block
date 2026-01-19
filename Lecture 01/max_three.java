import java.util.*;
public class max_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter frist no. :");
        int a=sc.nextInt();
        System.out.print("Enter second no.: ");
        int b= sc.nextInt();
        System.out.print("Enter third no.: ");
        int c= sc.nextInt();
        if(a>b && a>c){
            System.out.print("The frist no. is greater :"+a);
        }
        else if(b>a && b>c){
            System.out.print("The second no. is greater :"+b);
        } 
        else if(c>a && c>b){
            System.out.print("The third no. is greater :"+b);
        } 
        else{
            System.out.print("Both are equal");
        }
    }
}