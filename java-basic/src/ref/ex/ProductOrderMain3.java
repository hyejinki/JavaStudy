package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        ProductOrder[] orders = new ProductOrder[num];


        for (int i = 0; i < num; i++) {
            System.out.println(num + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String name = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(name, price, quantity);
        }

        printOrder(orders);
        getTotalPrice(orders);

    }

    static ProductOrder createOrder(String name, int price, int quantity) {
        ProductOrder po = new ProductOrder();
        po.productName = name;
        po.price = price;
        po.quantity = quantity;
        return po;
    }

    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + " 가격: " + order.price + " 수량: " + order.quantity);
        }
    }

    static void getTotalPrice(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
        System.out.println("총 결제 금액: " + total);
    }
}
