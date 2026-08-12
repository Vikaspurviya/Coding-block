class Problem724 {
    public int pivotIndex(int[] arr) {
    int total=0;
    int left=0;
    for(int ele:arr) total+=ele;

    for(int i=0;i<arr.length;i++){
        int right=total-left-arr[i];
        if(left==right){
            return i;
        }
        left +=arr[i];
    } 
    return -1; 
    }
}