/**
 * Created by Administrator on 2017/1/11.
 */
public class HeapSort extends SortMethod{


    public static void adjustHeap(int[] arr,int node,int size){
        //叶节点无需调节
        if(node*2+1<size){
            int right=node*2+2;
            int left=node*2+1;
            if(right<size){
                if(arr[right]>=arr[left]&&arr[right]>arr[node]){
                    swap(arr,right,node);
                    adjustHeap(arr,right,size);
                }else if(arr[left]>arr[right]&&arr[left]>arr[node]){
                    swap(arr,left,node);
                    adjustHeap(arr,left,size);
                }
            }else{
                if(arr[left]>arr[node]){
                    swap(arr,left,node);
                    adjustHeap(arr,left,size);
                }
            }
        }
    }

    public static void sort(int[] arr,int size){
        //key:从第一个非叶子节点开始调节
        if(size>2){
            for(int i=size/2-1;i>=0;i--){
                adjustHeap(arr,i,size);
            }
            //得到最大堆并交换最大值与队尾值
            swap(arr,0,size-1);
            sort(arr,size-1);
        }else if(size==2){
            if(arr[1]<arr[0]){
                swap(arr,0,1);
            }
        }
    }


    public static void heapSort(int[] arr){
        sort(arr,arr.length);
    }



    public static void main(String[] args) {
        int[] arr={6,2,1,8,3,9,4,54,5,567,55,12,34,654,23,45,66,7,6};
        heapSort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
