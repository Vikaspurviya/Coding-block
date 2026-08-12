public class twosum {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,77};
        int target=83;
        boolean result=sum(arr,target);
        System.out.print(result);
    }
    public static boolean sum(int[]arr,int x){
        for(int i=0;i<arr.length;i++){
             for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x) return true;
             }
        }
        return false;
    }
}
