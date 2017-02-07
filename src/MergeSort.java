/**
 * Created by Administrator on 2017/1/11.
 */
public class MergeSort extends SortMethod {

    public static int[] sort(int[] arr){
        return mergeSort(arr);
    }

    private static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int[][] parts=divide(arr);
        int[] left=parts[0];
        int[] right=parts[1];
        int[] sortedLeft=mergeSort(left);
        int[] sortedRight=mergeSort(right);
        return merge(sortedLeft,sortedRight);
    }

    private static int[] merge(int[] left,int[] right){
        int[] arr=new int[left.length+right.length];
        int leftIndex=0,rightIndex=0;
        for(int i=0;i<arr.length;i++) {
            if (leftIndex == left.length) {
                arr[i]=right[rightIndex];
                rightIndex++;

            }else if(rightIndex==right.length){
                arr[i]=left[leftIndex];
                leftIndex++;
            }else {
                if (left[leftIndex] < right[rightIndex]) {
                    arr[i] = left[leftIndex];
                    leftIndex++;
                } else {
                    arr[i] = right[rightIndex];
                    rightIndex++;
                }
            }
        }
        return arr;
    }

    private static int[][] divide(int[] arr){
        int[] left=new int[arr.length/2];
        int[] right=new int[arr.length-arr.length/2];
        for(int i=0;i<left.length;i++){
            left[i]=arr[i];
        }
        for(int i=0;i<right.length;i++){
            right[i]=arr[i+left.length];
        }
        int[][] struct=new int[2][];
        struct[0]=left;
        struct[1]=right;
        return struct;
    }
}
