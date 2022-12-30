import java.util.*;
public class MergeSort {

    public static void main(String[] args) {
        int arr[]={2,8,45,21,3};
//        int arr1[]={91,63,52,14,101};
          MergeSort(arr,0, arr.length-1);
          PrintArry(arr);
    }
    public  static void PrintArry(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void MergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid =si+(ei-si)/2;

//        left Part
        MergeSort(arr,si,mid);
//        Right Part
        MergeSort(arr,mid+1,ei);

         Merge(arr,si,mid,ei);

    }

    public  static void Merge(int arr[],int si,int mid,int ei) {

        int temp[] = new int[ei - si + 1];

//        Iterator for Left part
        int i = si;
//        Iterator for Right part
        int j = mid + 1;
//
//        Right part
        int k = 0;
        while (i <= mid && j <= ei) {

            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
//         Left Part

            while (i <= mid) {
                temp[k++] = arr[i++];
            }

//         Right Part
            while (j <= ei) {
                temp[k++] = arr[j++];
            }

//           Copy temp to Original Array
            for (k = 0, i = si; k < temp.length; k++, i++) {
                arr[i] = temp[k];
            }
        }


    }

