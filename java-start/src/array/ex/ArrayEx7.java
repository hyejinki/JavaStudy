package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] score = new int[4][3];
        String[] subjects = {"국어 점수", "영어 점수", "수학 점수"};
        int[] total = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < subjects.length; j++){
                System.out.print(subjects[j] + " : ");
                score[i][j] = input.nextInt();
                total[i] += score[i][j];
            }
        }
        for (int i = 0; i < 4; i++) {
            double average = (double)total[i] / subjects.length;
            System.out.println((i + 1) + "번 학생의 총점: " + total[i] + ", " + "평균 : " + average);
        }
    }
}
