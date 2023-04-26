package logicalProgOnNumbers;

public class MinimumPlatformsNeeded {
//Input  : n = 6
//arr[]  = {0900, 0940, 0950, 1100, 1500, 1800}
//dep[]  = {0910, 1200, 1120, 1130, 1900, 2000}
//Output : 3
//Explanation : Minimum 3 platforms are required to safely arrive and depart all trains.
    public static int minimumPlatforms(int[] arr,int[] dep,int n){
        int plat_needed , result = 1;
        for (int i = 0; i < n; i++) {
            plat_needed = 1;
            for (int j = 0; j < n; j++) if (i != j && arr[i] >= arr[j] && dep[j] >= arr[i]) plat_needed++;
            result = Math.max(result, plat_needed);
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        int n = arr.length;
        System.out.println(minimumPlatforms(arr, dep, n));
    }
}
