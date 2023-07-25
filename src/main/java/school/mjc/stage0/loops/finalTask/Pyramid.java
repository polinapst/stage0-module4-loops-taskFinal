package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int spaces = cathetusLength;
        int startNumberInRow = 1;

        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 1; j < spaces; j++) {
                System.out.print(' ');
            }

            for (int j = startNumberInRow; j > 0; j--) {
                System.out.print(j);
            }

            for (int j = 2; j <= startNumberInRow; j++) {
                System.out.print(j);
            }

            spaces--;
            startNumberInRow++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
