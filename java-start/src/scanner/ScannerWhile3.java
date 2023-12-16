package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("정수를 입력하세요(0을 입력하면 종료) : ");
            int num = input.nextInt();

            if (num == 0) {
                System.out.println("입력한 숫자의 총합 : " + sum);
                break;
            }
            sum += num;

        }
    }
}
