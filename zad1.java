import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class d1 {

    static int mostFrequent(int arr[], int n)
    {

        // Insert all elements in hash
        Map<Integer, Integer> hp =
                new HashMap<Integer, Integer>();

        for(int i = 0; i < n; i++)
        {
            int key = arr[i];
            if(hp.containsKey(key))
            {
                int freq = hp.get(key);
                freq++;
                hp.put(key, freq);
            }
            else
            {
                hp.put(key, 1);
            }
        }

        // find max frequency.
        int max_count = 0, res = -1;

        for(Entry<Integer, Integer> val : hp.entrySet())
        {
            if (max_count < val.getValue())
            {
                res = val.getKey();
                max_count = val.getValue();
            }
        }
        System.out.println("num of repeated times: " +max_count);
        return res;
    }

    // Driver code
    public static void main (String[] args) {

        int arr[] = {2,2,3,2,1,2,2,2};
        int n = arr.length;

        System.out.println(mostFrequent(arr, n));
    }
}
