public class even{
    public static void print(int even){
        
        System.out.print(even);
    }
    public static void main(String[] args) {
        int[]arr={555,901,4822,1771};
        int even=0;
        for(int i=0;i<arr.length;i++){
         int digit=arr[i];
         int cout=0;
         while(digit>0){
             digit=digit/10;
             cout++;
         }
        if(cout%2==0)even++;
        }
        print(even);
    }
}