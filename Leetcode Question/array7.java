import java.util.*;

public class array7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Emter the array size: "); 
    int n=sc.nextInt();
     
    int[]arr=new int[n];
    System.out.print("Enter array elements: ");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    // for(int i=arr.length-1;i>=0;i--){
    //     System.out.print(arr[i]+" ");
    // }
    int i=0;
    int j=arr.length-1;
    while(i<=j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
     
    }
    for(int ele:arr){
        System.out.print(ele+" ");
    }
    }
}
