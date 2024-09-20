package src;
public class functions {
    public static int indexOf(int[] arr, int value){
        int k = -1;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == value){
                k = i;
                break;
            }
        }
        return k;
    }
}
