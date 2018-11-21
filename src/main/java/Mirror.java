import java.util.Arrays;

public class Mirror {

    private int[][] array;

    public Mirror(int x, int y)  {
        array = new int[x][y];
            if ((x != y) || x <= 0 || y <= 0) {
                throw new IllegalArgumentException("invalid array");
            }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = 0;
            }
        }
    }


    public String toString() {
        String result = new String();
        for (int i = 0; i < array.length; i++) {
            result += Arrays.toString(array[i]) + "\n";
        }
        return result;
    }

}
