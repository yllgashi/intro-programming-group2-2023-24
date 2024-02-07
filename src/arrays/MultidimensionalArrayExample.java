package arrays;

public class MultidimensionalArrayExample {
    public static void main(String[] args) {
        // krijimi ne menyren e pare
        int[][] a = new int[2][2];
        a[0][1] = 1;

        // krijimi ne menyren e dyte (new int[4][2])
        int[][] b = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8}
        };


        // Shembull:
        int[][] numratNeMatrice = new int[10][5];

        // mbush array nga perdoruesi
        // numratNeMatrice[0][0] = 123;
        // numratNeMatrice[0][1] = 456;
        numratNeMatrice = mbushArrayMultiDimensionale(numratNeMatrice);

        // shfaq array
        printoArrayMultiDimensionale(numratNeMatrice);
    }

    public static int[][] mbushArrayMultiDimensionale(int[][] arr) {
        int madhesiaRreshtave = arr.length;
        int madhesiaKolonave = arr[0].length;

        for (int rreshti = 0; rreshti < madhesiaRreshtave; rreshti++) {
            for (int kolona = 0; kolona < madhesiaKolonave; kolona++) {
                arr[rreshti][kolona] = 10;
            }
        }

        return arr;
    }

    public static int[][] printoArrayMultiDimensionale(int[][] arr) {
        int madhesiaRreshtave = arr.length;
        int madhesiaKolonave = arr[0].length;

        for (int rreshti = 0; rreshti < madhesiaRreshtave; rreshti++) {
            for (int kolona = 0; kolona < madhesiaKolonave; kolona++) {
                System.out.println(arr[rreshti][kolona] + " ");
            }
            System.out.println();
        }

        return arr;
    }
}
