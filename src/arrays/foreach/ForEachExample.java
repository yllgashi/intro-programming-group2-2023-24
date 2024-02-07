package arrays.foreach;

public class ForEachExample {
    public static void main(String[] args) {
        String[] users = new String[10];

        // mbush array
        // ...

        // printo me for
        printoMeFor(users);

        // printo me foreach
        printoMeForEach(users);
    }

    public static void printoMeFor(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void printoMeForEach(String[] array) {
        for (String elementiNeArray : array) {
            System.out.println(elementiNeArray);
        }
    }
}
