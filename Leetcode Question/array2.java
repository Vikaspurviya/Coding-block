import java.util.*;
public class array2 {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in); 
    System.out.print("Enter Size of array: ");
    int n=sc.nextInt();
    int[]arr=new int[n];
    System.out.print("Enter element of array: ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        if(arr[i]<0){
            System.out.print(arr[i]+" ");
        }
    }
    }
}
