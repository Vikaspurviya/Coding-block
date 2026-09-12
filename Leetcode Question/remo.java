public class remo{
    public static void print(int[]arr,int j){
        for(int i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[]arr={0,1,2,2,3,0,4,2};
        int val=2;
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
              arr[j]=arr[i];
              j++;
            }
        }
        print(arr,j);
    }
}