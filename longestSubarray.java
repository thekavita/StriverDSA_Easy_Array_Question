import java.util.HashMap;

public class longestSubarray {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6};
        int n = arr.length;
        int k = 11;
        HashMap<Integer , Integer>map = new HashMap<>();
        int count = 0;
        map.put(0,1);
        int sum = 0;
        for(int i = 0; i < n; i++){
           sum += arr[i];
           if(map.containsKey(sum-k))
             count += map.get(sum-k);
           map.put(sum ,map.getOrDefault(sum, 0)+1);
        }
        System.out.println(count);
    }
    
}
