import java.util.Scanner;

public class Hw1_2 {
    public void func() {
        Scanner input = new Scanner(System.in);

        System.out.print("연산 >> ");
        double x = input.nextDouble();
        char op = input.next().charAt(0);
        double y = input.nextDouble();

        double res = 0;
        boolean flag = false;

        switch (op) {
            case '+' :
                res = x + y;
                break;
            case '-':
                res = x - y;
                break;
            case '*':
                res = x * y;
                break;
            case '/':
                if(x == 0 || y == 0) {
                    flag = true;
                    break;
                }
                res = x / y;
                break;
            default:
                break;
        }
        if(flag == true)
            System.out.println("0으로 나눌 수 없습니다.");
        else
            System.out.println((int)x + "" +  (op) + "" + (int)y + " 의 계산 결과는 " + (int)res);
    }
}
