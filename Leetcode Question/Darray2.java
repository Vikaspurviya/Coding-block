import java.util.*;
class Darray2{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter no. of rows: ");
    int n=sc.nextInt();
     System.out.print("Enter no. of columns: ");
    int m=sc.nextInt(); 
    int[][]arr=new int[n][m];
    System.out.print("Enter element of the array:  "); 
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            arr[i][j]=sc.nextInt();
        }
        System.out.println();
    }
for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
           System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }

    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
           if(arr[i][j]>max)max=arr[i][j];
        }
    }
    System.out.print(max);

}
}