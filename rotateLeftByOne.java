public class rotateLeftByOne {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        int n = arr.length;
        int d = 2;
         d %= n;
         reverse(arr, 0, d-1);
         reverse(arr, d, n-1);
         reverse(arr, 0, n-1);

         for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
         }

    }
     public static void reverse(int[]arr ,int l , int r){
        while(l <= r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    
}
