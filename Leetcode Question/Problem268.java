class Problem268 {
    public int missingNumber(int[] arr) {
     int n=arr.length;
     int sumarr=0;
     int sum=n*(n+1)/2;
     for(int ele:arr){
    sumarr +=ele;
     }
     return sum-sumarr;   
    }
}