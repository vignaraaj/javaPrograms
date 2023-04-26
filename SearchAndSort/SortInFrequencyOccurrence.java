package SearchAndSort;

public class SortInFrequencyOccurrence {
    public static void sortByFrequency(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n];
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                    visited[j] = true;
                }
            }
            if (!visited[i]) freq[i] = count;
        }

        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) if (freq[j] > freq[index] || (freq[j] == freq[index] && arr[j] > arr[index])) index = j;
            if (index != i) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                temp = freq[i];
                freq[i] = freq[index];
                freq[index] = temp;
            }
        }

        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        sortByFrequency( new int[] { 2, 2, 3, 4, 5, 12, 2, 3, 3, 3, 12 });
    }
}
