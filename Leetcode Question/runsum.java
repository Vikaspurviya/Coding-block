public class runsum{
    public static void print(int[]arr){
        
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int[]arr={3,1,2,10,1};
        int sum=0;
        for(int i=0;i<arr.length;i++){
          sum=sum+arr[i]; 
            arr[i]=sum; 
        }
    print(arr);
    }
}