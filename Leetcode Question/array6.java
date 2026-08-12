
public class array6 {
    public static void main(String[] args) {
    int[]arr={333,4,22,1,4,5,6,333};
    int index=-1;
    int found=333;
    boolean search=false;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==found){
            index=i;
            search=true;
            break;
        }
    }
    if(search==false)System.out.print("The element is not found");
    else System.out.print("The element is found at index no.: "+index);
    }
}
