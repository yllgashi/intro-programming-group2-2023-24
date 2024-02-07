package arrays.arraysWithMethods;

public class MbledhElementet {
    public static void main(String[] args) {
        int[] array = new int[10];

        array = mbushArray(array);

        printoArray(array);

        mbledhElementet(array);
    }

    public static int[] mbushArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    public static void printoArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void mbledhElementet(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Shuma: " + sum);
    }
}
