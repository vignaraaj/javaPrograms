package SearchAndSort;

public class InsertionSort {
    //time complexity is o(n^2) for average and worst case but o(n) for best case, o(1) space complexity
    public static void main(String args[]) {
        int arr[] = { 12, 11, 13,23,4,3,6,45,63,3,2, 5, 6 };
        InsertionSort ob = new InsertionSort();
        //considers the first element as key and is sorted and checks all the other elements with respect to the key(here first element)
        //after sorting the first element the second element is considered as key (if it is lesser than first element otherwise it is added to the sorted array and next element is considered as key) and inserts other elements in correct positions...
        ob.sort(arr);
        printArray(arr);
    }
     void sort(int arr[]){
        for(int i=0;i< arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j-=1;
            }arr[j+1]=key;
        }
    }
     static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++) System.out.print(arr[i] + " ");
    }
}
