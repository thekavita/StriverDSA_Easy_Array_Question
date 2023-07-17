public class NumberAppearsOnes{
    public static void main(String[] args) {
        int[]arr = {2,2,1};
        int n = arr.length;
        int ans = findNumberAppersOnce(arr, n);
        System.out.println(ans);
        
    }
    public static int findNumberAppersOnce(int[]arr , int n){
          for(int i= 0; i < n-1; i+=2){
           if(arr[i] != arr[i+1]){
             return(arr[i]);
           }
        }
        return arr[n-1];
    }

}