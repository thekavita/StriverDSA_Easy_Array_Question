public class SecondLargest {
    public static void main(String[] args) {
        int[]arr = {12, 35, 1, 10, 34, 1};
        int n = arr.length;
        int max = arr[0];
        int max2 = -1;
        
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max2 = max;
                max = arr[i];
            }
            else if(arr[i] > max2){
                if(arr[i] != max){
                    max2 = arr[i];
                }
            }
        }
        System.out.println(max2);
    }
    
}
