public class IsArraySorted {
    public static void main(String[] args) {
        int[]arr = {50,8,14,34,78};
        int n = arr.length;

        boolean isSorted = true;

        for(int i = 1; i < n; i++){
            if(arr[i-1] > arr[i]){
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
    }
    
}
