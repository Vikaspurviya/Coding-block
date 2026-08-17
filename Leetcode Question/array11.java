import java.util.Scanner;

public class array11 {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of array: ");
      int a=sc.nextInt();
      System.out.print("Enter the element of array ");
      int[]arr=new int[a];
      for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
      }
    
     wave(arr);
     System.out.print("After wave: ");
     for(int ele:arr){
        System.out.print(ele+" ");
     }
    } 
    public static void wave(int[]arr){
        for(int i=0;i<arr.length-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
}
