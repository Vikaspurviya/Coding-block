public class prob {
    public static void print(int[]arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
    int[]arr={8,1,2,2,3};
    for(int i=0;i<arr.length;i++){
        int count=0;
        for(int j=0;j<arr.length;j++){
            if(arr[i]>arr[j])count++;
        }
        arr[i]=count;
    }
    print(arr);
    }
}
