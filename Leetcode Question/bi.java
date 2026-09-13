public class bi{
    public static int search(int[] arr, int target) {
    int low=0;
    int high=arr.length-1;
    while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]>target)high=mid-1;
        else if(arr[mid]<target)low=mid+1;
        else if(arr[mid]==target)return mid;
    } 
    return -1;
    }
    public static void main(String[] args) {
        int[]arr={-1,0,3,5,9,12};
        int target=9;
        bi obj=new bi();
        int result=obj.search(arr,target);
        System.out.print(result);


    }
}