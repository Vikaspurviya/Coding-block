public class sort{
    public static void print(int[]arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
    int[]arr={1,4,5,6,2,8,3};
   
    for(int i=0;i<arr.length-1;i++){
         int swap=0;
        for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                swap++;
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        if(swap==0)break;
    } 
    print(arr);
    }
}