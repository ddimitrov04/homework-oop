import java.lang.reflect.Array;
import java.util.*;
public class d3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        input = input.replaceAll("\s+", " ");
        String[] arr = input.split(" ");
        int[] numbers = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            numbers[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(numbers);
        int counter = 0;
        for(int i = 0;i<numbers.length;i++){
            counter++;
            if(i == numbers.length - 1){
                System.out.println(numbers[i] +" -> "+counter);
                break;
            }
            if(numbers[i] != numbers[i+1]){
                System.out.println(numbers[i] +" -> "+counter);
                counter=0;
            }
        }
    }
}
