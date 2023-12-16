package loop;

public class Break1 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true) {
            if (sum > 10) {
                System.out.println("10보다 크면 종료" + sum);
                break;
            }
            sum += i;
            i ++;
        }
    }
}
