import java.util.*;
public class array10 {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of array: ");
      int a=sc.nextInt();
      System.out.print("Enter the element of array ");
      int[]arr=new int[a];
      for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
      }
    
     segregate(arr);
     System.out.print("After segregation: ");
     for(int ele:arr){
        System.out.print(ele+" ");
     }
    }  
    public static void segregate(int[]arr){
        int n=arr.length;
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;  
            }
        }
        
    }
}
