import java.util.*;
class Darray8{
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

for(int j=0;j<arr[0].length;j++) {
    for(int i=arr.length-1;i>=0;i--){
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}

  

}
}