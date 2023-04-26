package logicalProgOnNumbers;

import java.util.*;
public class TopThreeRepeatedNumbers {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3};
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) freq.put(num, freq.getOrDefault(num, 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(freq.entrySet());
        int count = 0;
        while (!pq.isEmpty() && count < 3) {
            System.out.print(pq.poll().getKey() + " ");
            count++;
        }
        System.out.println();
        top3Repeated(arr,arr.length);
    }
    static class Pair { int first, second; }// first holds value and second holds key.
    static class MyCollection {
        int key ,value;
        public int getKey() { return key; }
        public int getValue() { return value; }

        public String toString() { return  key +" "+value ; }
        public MyCollection(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    static void top3Repeated(int[] arr, int n) {
        if (n < 3) { // There should be at-least two elements.
            System.out.print("Invalid Input");
            return;
        }
        boolean flag ;
        List<MyCollection> collect = new ArrayList<>();
        for (int i = 0; i < n; i++){
            flag = true;
            for(MyCollection c : collect){
                if(c.key==arr[i]){
                    c.value++;
                    flag =false;
                }
            }
            if(flag) collect.add(new MyCollection(arr[i],1)) ;
        }
        for(MyCollection c : collect) System.out.print(c+" ");
//        TreeMap<Integer, Integer> freq = new TreeMap<>(); // Count Frequency of each element
//        for (int i = 0; i < n; i++)
//            if (freq.containsKey(arr[i])) freq.put(arr[i], 1 + freq.get(arr[i]));
//            else freq.put(arr[i], 1);
        Pair x = new Pair();
        Pair y = new Pair();
        Pair z = new Pair();
        x.first = y.first = z.first = Integer.MIN_VALUE; // Initialize first value of each variable of Pair type is INT_MIN
        for (MyCollection curr : collect) {  // If frequency of current element is not zero and greater than frequency of first largest element
            if (Integer.parseInt(String.valueOf(curr.getValue())) > x.first) {// Update second and third largest
                z.first = y.first;
                z.second = y.second;
                y.first = x.first;
                y.second = x.second;
                x.first = Integer.parseInt(String.valueOf(curr.getValue())); // Modify values of x Number
                x.second = Integer.parseInt(String.valueOf(curr.getKey()));
            }
            // If frequency of current element is not zero and frequency of current element is less than frequency of
            // first largest element, but greater than y element
            else if (Integer.parseInt(String.valueOf(curr.getValue())) > y.first) { // Modify values of third largest
                z.first = y.first;
                z.second = y.second;
                y.first = Integer.parseInt(String.valueOf(curr.getValue()));// Modify values of second largest
                y.second = Integer.parseInt(String.valueOf(curr.getKey()));
            }
            // If frequency of current element is not zero and frequency of current element is less than
            // frequency of first element and second largest, but greater than third largest.
            else if (Integer.parseInt(String.valueOf(curr.getValue())) > z.first) { // Modify values of z Number
                z.first = Integer.parseInt(String.valueOf(curr.getValue()));
                z.second = Integer.parseInt(String.valueOf(curr.getKey()));
            }
        }

        System.out.print("Three largest elements are " + x.second + " "+ y.second + " " + z.second);
    }
}
