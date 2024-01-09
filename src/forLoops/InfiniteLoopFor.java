package forLoops;

public class InfiniteLoopFor {
    public static void main(String[] args) {
        for(int i = 0; true; i++) {
            System.out.println(i);
        }
    }
}
