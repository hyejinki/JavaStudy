package loop;

public class While2_1 {

    public static void main(String[] args) {
        int i = 10;
        int sum = 0;

        while (i <= 12) {
            sum += i;
            i ++;
            System.out.println("i = " + i + "sum = " + sum);
        }
    }
}
