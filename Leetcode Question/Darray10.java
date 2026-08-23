import java.util.*;
class Darray10{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter no. of rows: ");
    int n1=sc.nextInt();
     System.out.print("Enter no. of columns: ");
    int m2=sc.nextInt(); 
     System.out.print("Enter the target value: ");
   int target=sc.nextInt();
    int[][]arr=new int[n1][m2];
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
    List<Integer>ans=spiral(arr);
    for(int ele:ans){
        System.out.print(ele+" ");
    }
}
    public static List<Integer> spiral(int[][]arr){
    int n=arr.length,m=arr[0].length;
    int fr=0,lr=n-1,fc=0,lc=m-1;
   ArrayList<Integer>ans=new ArrayList<>();
    while(fr<=lr && fc<=lc){
        for(int j=fc;j<=lc;j++){
            ans.add(arr[fr][j]);
        }
      
        fr++;
        if(fr>lr || fc>lc)break;

        for(int i=fr;i<=lr;i++){
            ans.add(arr[i][lc]);
        }
    
        lc--;
        if(fr>lr || fc>lc)break;


        for(int j=lc;j>=fc;j--){
            ans.add(arr[lr][j]);
        }
       
        lr--;
        if(fr>lr || fc>lc)break;

        for(int i=lr;i>=fr;i--){
            ans.add(arr[i][fc]);
        }
     
        fc++;

    }
  return ans;
}
}