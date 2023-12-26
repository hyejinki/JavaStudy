package poly.ex.pay1;

import java.util.Scanner;

public class PayMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("결제 수단을 입력하세요: ");
            String option = scanner.nextLine();
            if (option.equals("exit")) {
                System.out.println("프로그램 종료합니다.");
                break;
            }
            System.out.print("결제 금액을 입력하세요: ");
            int amount = scanner.nextInt();
            scanner.nextLine();

            PayService payService = new PayService();
            payService.processPay(option, amount);
        }
    }
}
