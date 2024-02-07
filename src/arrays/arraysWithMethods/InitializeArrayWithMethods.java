package arrays.arraysWithMethods;

public class InitializeArrayWithMethods {
    // Te mbushet dhe te printohet nje array me numra 1-10
    public static void main(String[] args) {
        int[] myArray = inicializoArray();
        printoArray(myArray);
    }

    public static int[] inicializoArray() {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static void printoArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
