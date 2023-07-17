import java.util.HashSet;

public class unionOfTwoArray {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        int[]brr = {2,3,4,5,6,7};
        int n = arr.length;
        int m = arr.length;
        int count;
        count = FindUnion(arr, brr, n, m);

        System.out.println(count);
        
    }

    public static int FindUnion(int[]arr , int[]brr , int n , int m){
        int count = 0;
        HashSet<Integer>set = new HashSet<>();

        for(int i = 0; i < n; i++){
            set.add(arr[i]);
        }
        for(int i = 0; i < m; i++){
            if(set.contains(brr[i]))
            count++;
            set.remove(brr[i]);
        }
        return count;
    }
}
