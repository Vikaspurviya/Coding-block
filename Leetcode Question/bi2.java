public class bi2 {
    public int[] searchRange(int[] arr, int target) {
    int low=0;
    int high=arr.length-1; 
    int idx1=-1;
    int idx2=-1;
    while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]>target)high=mid-1;
        else if(arr[mid]<target)low=mid+1;
        else if(arr[mid]==target){
            idx1=mid;
            high=mid-1;
        }
    }
    low=0;
    high=arr.length-1;
     while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]>target)high=mid-1;
        else if(arr[mid]<target)low=mid+1;
        else if(arr[mid]==target){
            idx2=mid;
            low=mid+1;
            
        }
    }
    return new int[]{idx1,idx2};
    }

    public static void main(String[] args) {
        int[]arr={5,7,7,8,8,10};
        int target=8;
        bi2 obj = new bi2();
        int[] result=obj.searchRange(arr,target);
        for(int ele:result){
            System.out.print(ele+" ");
        }

    }
}