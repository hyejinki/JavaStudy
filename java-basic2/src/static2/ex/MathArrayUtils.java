package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        //private 인스턴스 생성을 막는다.
    }

    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
        return (double)sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minV = values[0];
        for (int value : values) {
            if (minV > value) {
                minV = value;
            }
        }
        return minV;
    }
    public static int max(int[] values) {
        int maxV = values[0];
        for (int value : values) {
            if (value > maxV) {
                maxV = value;
            }
        }
        return maxV;
    }




}
