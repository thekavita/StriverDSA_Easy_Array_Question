public class dublicateElement {

    public static void main(String[] args) {
        int[]arr = {2,2,2,2};
        int n = arr.length;

        int i = 0;

        for(int j = 1; j < n; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println(i+1);
    }
    
}
