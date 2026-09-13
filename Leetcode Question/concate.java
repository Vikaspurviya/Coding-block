public class concate{
    public static void print(int[]ans){
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,1};
        int[]ans=new int[2*arr.length];
        int len=arr.length;
        for(int i=0;i<arr.length;i++){
          ans[i]=arr[i];
          ans[len+i]=arr[i];
        }
        print(ans);
    }
}
