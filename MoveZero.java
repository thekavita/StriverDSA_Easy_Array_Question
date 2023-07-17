public class MoveZero {

    public static void main(String[] args) {
        int [] arr = {0,1,0,3,12};
        int n = arr.length;

        int i = 0;
        for(int j = 0; j < n; j++){
            if(arr[j] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        for(int j = 0; j < n; j++){
            System.out.print(arr[j]+" ");
        }
    }
    
}
