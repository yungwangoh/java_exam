public class Hw1_4 {
    public void func() {
        int[][] arr = new int[4][4];
        boolean[][] check = new boolean[4][4];

        while (true) {
            int cnt = 0;

            int n = (int) (Math.random() * 10 + 1);

            int a = (int) (Math.random() * 4);
            int b = (int) (Math.random() * 4);

            check[a][b] = true;
            arr[a][b] = n;

            for(int i = 0; i < 4; i++) {
                for(int j = 0; j < 4; j++) {
                    if(arr[i][j] == 0) cnt++;
                }
            }

            if(cnt == 6) break;
        }

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
