import java.util.*;
public class Sum {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the no.: ");
int n =  sc.nextInt();
int i=0;
int digit=0;
int sum=0;
while(n>0){
    digit =n%10;
    sum=sum+digit;
    n=n/10;
    i++;
}
System.out.print("The sum  of a no.:"+sum);
}

}
