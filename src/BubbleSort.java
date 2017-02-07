/**
 * Created by Administrator on 2017/1/11.
 */
public class BubbleSort extends SortMethod {

    public static void sort(int[] arr){

        for(int i=arr.length;i>0;i--){
            for(int j=0;j<i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
}
