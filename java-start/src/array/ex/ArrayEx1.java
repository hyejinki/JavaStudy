package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        int tatal = 0;
        for (int student : students) {
            tatal += student;
        }
        double average = (double) tatal / students.length;
        System.out.println("점수 총합: " + tatal);
        System.out.println("점수 평균: " + average);
    }
}
