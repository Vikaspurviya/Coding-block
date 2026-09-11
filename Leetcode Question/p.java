public class p{
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){  
               for(int k=0;k<arr.length;k++){
                int sum =arr[i]+arr[j];
              System.out.println(sum);
               }
               System.out.println();
            }
            System.out.println();
        }
    }
}