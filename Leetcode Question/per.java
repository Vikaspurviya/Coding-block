public class per{
    public static void print(int[]ans){
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[]arr={05,0,1,2,3,4};
        int[]ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
          ans[i]=arr[arr[i]];
        }
        print(ans);
    }
}
