public class maxConsecutiveOnes {
    public static void main(String[] args) {
        int[]arr = {1,1,0,1,1,1,1};
        int n = arr.length;
        int max = 0;
        int one = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                one++;
                max = Math.max(one , max);
            }
            else{
                one = 0;
            }
        }
        System.out.println(max);
    }
    
}
