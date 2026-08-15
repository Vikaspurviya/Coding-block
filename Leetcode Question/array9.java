import java.util.*;
public class array9 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of array: ");
      int a=sc.nextInt();
      System.out.print("Enter the element of array ");
      int[]arr=new int[a];
      for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
      }
    
     int result=missing(arr);
     System.out.print("The missing no. is: "+result); 
    }
    public static int missing(int[]arr){
    int n=arr.length;
    int sum=n*(n+1)/2;
    int arraysum=0;
    for(int ele:arr){
        arraysum+=ele;
    }
    return sum-arraysum;
}
}
