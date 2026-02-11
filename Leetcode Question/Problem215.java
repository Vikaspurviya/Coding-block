import java.util.Arrays;
class Solution {
    public int findKthLargest(int[] arr, int k) {
    Arrays.sort(arr);
    int j=0;
    int ans=0;
    int i=arr.length-1;
    while(j<k){
        ans=arr[i];
        j++;
        i--;
        }
    return ans;
    }
}