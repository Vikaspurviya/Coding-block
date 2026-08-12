import java.util.Arrays;
class Problem977 {
    public int[] sortedSquares(int[] arr) {
    for(int i=0;i<arr.length;i++){
        if(arr[i]<0){
            arr[i]=-arr[i];
        }
       if(arr[i]%2==0){
            arr[i]=arr[i]*arr[i];
       }
       if(arr[i]%2!=0){
            arr[i]=arr[i]*arr[i];
        }
        
    } 
    Arrays.sort(arr);
    return arr;  
    }
}