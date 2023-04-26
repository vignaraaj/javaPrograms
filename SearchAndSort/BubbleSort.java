package SearchAndSort;

public class BubbleSort {
    //time complexity is o(n^2) for average and worst case but o(n) for best case, o(1) space complexity
    public static void main(String args[]) {
        int arr[] = { 12, 11, 13,23,4,3,6,45,63,3,2, 5, 6 };
        BubbleSort ob = new BubbleSort();
        ob.sort(arr);
        printArray(arr);
    }
    void sort(int arr[]){
        for(int i=0;i< arr.length;i++) {
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
