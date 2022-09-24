import java.util.Scanner;

public class Hw1_3 {
    public void func() {
        int[] arr = new int[101];
        boolean[] check = new boolean[101];

        Scanner input = new Scanner(System.in);

        System.out.print("정수 몇개? >> ");
        int N = input.nextInt();

        for(int i = 0; i < N; i++) {
            int n = (int)(Math.random() * 100 + 1);

            if(check[n] == true) i--;
            else {
                check[n] = true;
                arr[i] = n;
            }
        }

        for(int i = 1; i <= N; i++) {
            System.out.print(arr[i - 1] + " ");
            if(i % 10 == 0) System.out.println();
        }
    }
}
