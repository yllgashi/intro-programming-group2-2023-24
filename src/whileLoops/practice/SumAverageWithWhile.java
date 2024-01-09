package whileLoops.practice;

public class SumAverageWithWhile {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        while (count < 10) {
            count++;
            sum += count;
        }

        double avg = (double) sum/count;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
