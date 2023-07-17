public class LargestElement{
    public static void main(String[] args) {
        int[]arr = {11,98,43,99,2,0};
        int n = arr.length;

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}