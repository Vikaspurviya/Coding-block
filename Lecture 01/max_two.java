import java.util.*;
public class max_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter frist no. :");
        int a=sc.nextInt();
        System.out.print("Enter second no.: ");
        int b= sc.nextInt();
        if(a>b){
            System.out.print("The frist no. is greater :"+a);
        }
        else if(b>a){
            System.out.print("The second no. is greater :"+b);
        } 
        else{
            System.out.print("Both are equal");
        }
    }
}
