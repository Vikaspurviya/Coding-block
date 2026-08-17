import java.util.ArrayList;
import java.util.*;
public class array13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(sc.nextInt());
        }
        add1(ans);
        System.out.print(ans);
    }

    public static ArrayList<Integer> add1(ArrayList<Integer>ans){
        int carry=1;
        for(int i=ans.size()-1;i>=0;i--){
            if(ans.get(i)+carry<=9){
                ans.set(i,ans.get(i)+1);
                carry=0;
                break;
            }
            else{
                ans.set(i,0);
                carry=1;
            }
        }
        if(carry==1){
            ans.add(0,1);
        }
        return ans;
    }
}
