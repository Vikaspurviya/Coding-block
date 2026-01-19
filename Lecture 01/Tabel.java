import java.util.*;
public class Tabel {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter frist no.: ");
int n =  sc.nextInt();
System.out.println("The multiplication of a no.:"+n);
for(int i=1;i<=10;i++){
  System.out.println(n+"X"+i+"="+n*i); 
}
}

}