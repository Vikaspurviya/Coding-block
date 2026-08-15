import java.util.*;
public class array8 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of array: ");
      int a=sc.nextInt();
      System.out.print("No. of iteration: ");
      int d=sc.nextInt();
      System.out.print("Enter size of arraay: ");
      int[]arr=new int[a];
      for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
      }
     rotate(arr,d);

     System.out.print("Rotate array: ");
     for(int ele:arr){
        System.out.print(ele+" ");
     }
    }
    public static void rotate(int[]arr,int d){
        int n=arr.length;
        d=d%n;
        reverse(arr,0,n-1);
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        }
        public static void reverse(int[]arr,int i,int j){
            while(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
    }

