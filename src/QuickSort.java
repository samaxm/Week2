/**
 * Created by Administrator on 2017/1/12.
 */
public class QuickSort extends SortMethod {

    public static void sort(int[] arr){
        doSort(arr,0,arr.length,arr.length);
    }


    public static void doSort(int[] arr,int from,int to,int size){
        if(size>1) {
            int standardIndex = from+size/2;
            //先将小于标准数的移到标准数左侧并记录标准数位置
            standardIndex=moveSmalltoLeft(arr,standardIndex,from,to);
            //从左遍历，找到大于标准数的数则将其与标准数之间的数左移一位并且将该数插入到标准数右侧
            standardIndex=moveBigToRight(arr,standardIndex,from);
            //left part
            doSort(arr,from,standardIndex,standardIndex-from);
            doSort(arr,standardIndex+1,to,to-standardIndex-1);
        }
    }


    private static int moveSmalltoLeft(int[] arr,int standardIndex,int from,int to){
        for(int i=from;i<to;i++){
            if(arr[i]<arr[standardIndex]&&i>standardIndex){
                swap(arr,i,standardIndex);
                standardIndex=i;
            }
        }
        return standardIndex;
    }


    private static int moveBigToRight(int[] arr,int standardIndex,int from){
        if(from!=standardIndex){
            if(from<standardIndex&&arr[from]>arr[standardIndex]){
                int temp=arr[from];
                for(int i=from;i<standardIndex;i++){
                    arr[i]=arr[i+1];
                }
                arr[standardIndex]=temp;
                standardIndex=standardIndex-1;
                return moveBigToRight(arr,standardIndex,from);
            }
            return moveBigToRight(arr,standardIndex,from+1);
        }else{
            return standardIndex;
        }
    }
}
