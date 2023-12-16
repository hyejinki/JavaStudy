package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수를 입력하세요: ");

        int num = input.nextInt();
        System.out.println(num + "개의 정수를 입력하세요: ");
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        int minValue = arr[0];
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }

            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        System.out.println("가장 작은 정수: " + minValue);
        System.out.println("가장 큰 정수: " + maxValue);

    }
}
