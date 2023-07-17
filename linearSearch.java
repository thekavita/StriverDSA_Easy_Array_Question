public class linearSearch {
    public static void main(String[] args) {
        int[]arr = {3,5,7,9,12};
        int target = 7;
        int ans = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] ==target){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
    
}
