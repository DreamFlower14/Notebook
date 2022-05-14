package Class;

import java.util.Scanner;

public class C0512 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                int sum = i + j;
                if (sum >= num) {
                    sum -= num;
                }
                System.out.print(arr[sum] + " ");
            }
            System.out.println();
        }
    }
}