import java.util.*;
class Darray9{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter no. of rows: ");
    int n=sc.nextInt();
     System.out.print("Enter no. of columns: ");
    int m=sc.nextInt(); 
     System.out.print("Enter the target value: ");
   int target=sc.nextInt();
    int[][]arr=new int[n][m];
    System.out.print("Enter element of the array:  "); 
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            arr[i][j]=sc.nextInt();
        }
        System.out.println();
    }
  
   int i=0;
   int j=arr[0].length-1;
   while(j>=0 && i<arr.length){
    if(arr[i][j]>target)j--;
    else if(arr[i][j]<target)i++;
    else if(arr[i][j]==target)System.out.print("True");
    else System.out.print("False");
   }


  

}
}