import java.util.Scanner;

public class d2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int[] array = new int[a];
        for (int k = 0; k <a ; k++) {
            array[k]=scan.nextInt();

        }

            int ash = 0;
            for (int i = 0; i < array.length; i++) {
                String reverse = String.valueOf(array[i]);

                byte[] curr = reverse.getBytes();

                byte[] ans = new byte[curr.length];

                for (int y = 0; y < curr.length; y++) {

                    ans[y] = curr[curr.length - y - 1];
                }

                int converter = Integer.parseInt(new String(ans));

                ash += converter;


            }System.out.println(ash);
        }
    }

