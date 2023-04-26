package SearchAndSort;

import java.util.Arrays;
public class LinearAndBinarySearch {
    //linear search time complexity is o(n)
    //binary search time complexity is o(log(n))
    public static void main(String[] args) {
        int arr[]  = {9,14,3,2,43,11,58,22};
        int element1 = 43;
        int element2 = 11;
        System.out.println("Element " + element1 +" at "+linearSearch(arr,element1) +"th position found by linear search");
        System.out.println("Element " + element2 +" at "+binarySearch(arr,element2)+"th position found by binary search");
    }
    static int linearSearch(int arr[],int k){
        System.out.println("original array : "+ Arrays.toString(arr));
        for(int i=0;i<arr.length;i++) if(arr[i]==k) return i+1;
        System.out.println("element not found");
        return -1;
    }
    //to use binary search the array should be in ascending or descending order
    static int binarySearch(int arr[],int k){
        Arrays.sort(arr);//sorts in ascending order
        System.out.println("Ascending order : "+ Arrays.toString(arr));
        int i=0;
        int j=arr.length-1;
        int mid = i+j/2;
        while(i<=j){
            if(arr[mid]<k) i=mid+1;
            else if(arr[mid]==k) return mid+1;
            else j=mid-1;
            mid = i+j/2;
        }
        if(i>j) System.out.println("element not found");
        return -1;
    }
}
