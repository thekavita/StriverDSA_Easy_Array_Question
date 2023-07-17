import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[]arr = {3,0,1};
        int n = arr.length;
        int res = 0;
        
        Arrays.sort(arr);
        for(int i = 0;i < n; i++){
            if(arr[i] != res){
                System.out.println(res);
                break;
            }
            else{
                res++;
            }
        }
    }
    
}
