import java.util.*;
public class d3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        input = input.replaceAll("\s+", " ");
        String[] arr = input.split(" ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String s : arr) {
            double valueofi = Double.parseDouble(s);
            if (Math.sqrt(valueofi) == Math.round(Math.sqrt(valueofi))) {
                numbers.add((int) valueofi);
            }
        }
        System.out.println(numbers);
    }
}

