import java.util.Arrays;
import java.util.Scanner;

public class Class0509 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] ar = new int[num];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = s.nextInt();
        }
        Arrays.sort(ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
    }
}
