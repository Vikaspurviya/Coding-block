public class selection{
    public static void print(int[]arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
    int[]arr={4,2,5,1,2,9,6};
    for(int i=0;i<arr.length;i++){
        int min=Integer.MAX_VALUE;
        int minidx=0;
        for(int j=i;j<arr.length;j++){
            if(arr[j]<min){
                min=arr[j];
                minidx=j;
            }
        }
        int temp=arr[i];
        arr[i]=arr[minidx];
        arr[minidx]=temp;
    }
    print(arr);
    }
}