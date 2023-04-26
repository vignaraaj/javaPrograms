package dynamicProgramming;

public class KadaneAlgo {
    public static void main(String[] args) {
        kadaneAlgo();
        maxSubArray();
    }

    static void maxSubArray(){
        //using sliding window
        int a[]={2, -4, 3, -1, 2};
        int b[] = {0,0,0,0,0};
        //int globalMax =Integer.MIN_VALUE ;
        int k=1;
        for(int p =0;p<a.length;p++) {
            int max_sum = 0;
            // Consider all blocks starting with i
            for (int i = 0; i < a.length - k + 1; i++) {
                int current_sum = 0;
                for (int j = 0; j < k; j++) current_sum = current_sum + a[i + j];
                // Update result if required.
                max_sum = Math.max(current_sum, max_sum);
                b[i]=max_sum;//check the array from last
            }
            k++;
        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" " ); // output is 2 0 4 2 3
            // (3 is max single element,2 is max when two elements are added,4 is max when 3 elements are added using sliding window)
        }
        //the max subArray will be max among these
        //it will be 4
        int max=b[0];
        for(int i=0;i<b.length;i++) if(b[i]>max) max = b[i];
        System.out.print("\n"+max);

    }
    static void kadaneAlgo(){
        //efficient method to find max sub array
        int a[]={2, -4, 3, -1, 2};
        int local_max = 0;
        int global_max = Integer.MIN_VALUE;
        int n=a.length;
        for(int i=0;i<n;i++){
            local_max = Math.max(a[i], a[i] + local_max);
            if(local_max > global_max) global_max = local_max;
        }
        System.out.println(global_max);
    }
}
