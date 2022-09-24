import java.util.Scanner;

public class Hw1_1 {
    public void func() {
        Scanner input = new Scanner(System.in);

        System.out.print("첫번째 원의 중심과 반지름 입력 >> ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int rad1 = input.nextInt();

        System.out.print("두번쨰 원의 중심과 반지름 입력 >> ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int rad2 = input.nextInt();

        double sub = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        if((double)rad1 >= sub || (double)rad2 >= sub)
            System.out.println("두 원은 서로 겹친다.");
        else
            System.out.println("두 원은 서로 겹치지 않는다.");
    }
}
