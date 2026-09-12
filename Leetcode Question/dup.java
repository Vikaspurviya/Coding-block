public class dup{
    public static void print(int[]arr,int j){
        for(int i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[]arr={0,0,1,1,2,2,3,};
        int j=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[j-1]){
              arr[j]=arr[i];
              j++;
            }
        }
        print(arr,j);
    }
}