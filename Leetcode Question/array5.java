import java.util.*;
public class array5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        print(arr);
    }
    public static void print(int[]arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr[i]+=10;
                System.out.print(arr[i]+" ");
            }
            else if(arr[i]%2!=0){
                arr[i]*=2;
                System.out.print(arr[i]+" ");
            }
        }
        
    }
}
