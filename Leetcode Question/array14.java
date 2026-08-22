class array14 {
    public static void main(String[] args) {
        int[]arr1={2};
        int[]arr2={2};
        int[]arr=new int[arr1.length+arr2.length];
        merge(arr,arr1,arr2);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void merge(int[]arr,int[] arr1,int[]arr2) {
    int m=arr1.length;
    int n=arr2.length;
    int i=0;
    int j=0;
    int k=0;
    while(i<m && j<n){
        if(arr1[i]<arr2[j]){
            arr[k]=arr1[i];
            i++;
        }
        else if(arr1[i]>arr2[j]){
            arr[k]=arr2[j];
            j++;
        }
        else if(arr1[i]==arr2[j]){
            arr[k]=arr1[i];
            i++;
        }
        k++;
    }
    if(i==m){
        while(j<n){
            arr[k]=arr2[j];
            k++;
            j++;
        }
    }
    else{
        while(i<m){
            arr[k]=arr1[i];
            i++;
            k++;
        }
    }

    }
}