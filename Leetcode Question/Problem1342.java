public class Problem1342 {
    public int numberOfSteps(int num) {
        int cout=0;
    while(num>0){
        if(num%2==0){
          num=num/2;
          cout++;
        }
        else{
            num=num-1;
            cout++;
        }
        
    } 
    return cout;
    }
}

