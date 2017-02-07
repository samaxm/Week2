import java.util.*;

/**
 * Created by Administrator on 2017/1/11.
 */
public class InsertSort extends SortMethod {

    private int value;

    private void test(InsertSort otrher){
        otrher.test(this);
    }

    public static void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[i]){
                    insert(arr,i,j);
                }
            }
        }
    }


    private static void insert(int[] arr,int valueIndex,int insertPosition){
        int temp=arr[valueIndex];
        for(int i=valueIndex;i>insertPosition;i--){
            arr[i]=arr[i-1];
        }
        arr[insertPosition]=temp;
    }
}
