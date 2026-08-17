public class array12 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        int carry=1;
        add(arr,carry);

        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static int[] add(int[]arr,int carry){
        for(int i=arr.length-1;i>=0;i--){
         if(arr[i]+carry<=9){
            arr[i]+=carry;
            carry=0;
            break;
         }
         else{
            arr[i]=0;
            carry=1;
         }
        }
        if(carry==1){
            int[] result=new int[arr.length + 1];
                result[0]=1;
                return result ;
            }
             return arr;
        }
   
    }

