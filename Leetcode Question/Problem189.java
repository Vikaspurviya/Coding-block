public class Problem189 {
    public void rotate(int[] arr, int d) {
        int n=arr.length;
        d=d%n;
        rotateR(arr,0,n-1);
        rotateR(arr,0,d-1);
        rotateR(arr,d,n-1);
    }
    public void rotateR(int arr[] ,int i, int j){
        while(i<j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
