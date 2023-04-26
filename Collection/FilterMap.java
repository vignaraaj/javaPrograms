package Collection;
/*
 java i/o is used to process the input and produce the output
 It uses stream to make operations faster
 java.io package contains all the classes for i/o
 Stream --> sequence of objects(data) //like a flow of water
 Stream is made up of bytes
 java creates 3 streams automatically
 >>>System.out(standard output stream)
 >>>System.in(standard input stream)
 >>>System.err(standard error stream)
*/

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class FilterMap {
        public static void main(String[] args) {
            Map<Integer, String> HOSTING = new HashMap<>();
            HOSTING.put(1, "linode.com");
            HOSTING.put(2, "heroku.com");
            HOSTING.put(3, "digitalocean.com");
            HOSTING.put(4, "aws.amazon.com");
            // Before Java 8
            String result = "";
            for (Map.Entry<Integer, String> entry : HOSTING.entrySet()) if ("aws.amazon.com".equals(entry.getValue())) result = entry.getValue();
            System.out.println("Before Java 8 : " + result);
            //Map -> Stream -> Filter -> String
            result = HOSTING.entrySet().stream()
                    .filter(map -> "aws.amazon.com".equals(map.getValue()))
                    .map(map -> map.getValue())
                    .collect(Collectors.joining());
            System.out.println("With Java 8 : " + result);
            // filter more values
            result = HOSTING.entrySet().stream()
                    .filter(x -> {
                        if (!x.getValue().contains("amazon") && !x.getValue().contains("digital")) return true;
                        return false;
                    })
                    .map(map -> map.getValue())
                    .collect(Collectors.joining(","));
            System.out.println("With Java 8 : " + result);
            //Map -> Stream -> Filter -> Map
            Map<Integer, String> collect = HOSTING.entrySet().stream()
                    .filter(map -> map.getKey() == 2)
                    .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
            System.out.println(collect); //output : {2=heroku.com}
            Map<Integer, String> collect2 = HOSTING.entrySet().stream()
                    .filter(map -> map.getKey() <= 3)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            System.out.println(collect2); //output : {1=linode.com, 2=heroku.com, 3=digitalocean.com}
            //  {1=linode.com}
            Map<Integer, String> filteredMap = filterByValue(HOSTING, x -> x.contains("linode"));
            System.out.println(filteredMap);
            // {1=linode.com, 4=aws.amazon.com, 5=aws2.amazon.com}
            Map<Integer, String> filteredMap2 = filterByValue(HOSTING, x -> (x.contains("aws") || x.contains("linode")));
            System.out.println(filteredMap2);
            // {4=aws.amazon.com}
            Map<Integer, String> filteredMap3 = filterByValue(HOSTING, x -> (x.contains("aws") && !x.contains("aws2")));
            System.out.println(filteredMap3);
            // {1=linode.com, 2=heroku.com}
            Map<Integer, String> filteredMap4 = filterByValue(HOSTING, x -> (x.length() <= 10));
            System.out.println(filteredMap4);
        }
    // Generic Map filter by value, with predicate
    public static <K, V> Map<K, V> filterByValue(Map<K, V> map, Predicate<V> predicate) {
        return map.entrySet()
                .stream()
                .filter(x -> predicate.test(x.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }


}
