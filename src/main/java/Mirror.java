import java.util.Arrays;

public class Mirror {

    public void upDown(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int firstIndex = 0;
            int lastIndex = array.length - 1;
            while (firstIndex < lastIndex) {
                swap(array, "y", i, firstIndex, lastIndex);
                firstIndex++;
                lastIndex--;
            }
        }
    }

    public void leftRight(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int firstIndex = 0;
            int lastIndex = array.length - 1;
            while (firstIndex < lastIndex){
                swap(array,"x", i, firstIndex, lastIndex);
                firstIndex++;
                lastIndex--;
            }
        }
    }

    //        array[y][x]
    //        array[0][0] = 1;
    //        array[2][1] = 8;
    //        array[2][0] = 7;
    //        array[1][2] = 6;
    //        array[1][1] = 5;
    //        array[1][0] = 4;
    //        array[0][2] = 3;
    //        array[0][1] = 2;
    //        array[2][2] = 9;
    private void swap(int[][] array, String directional, int indexDirectional, int first, int last) {
        if (directional.equals("x")) {
            int tmp = array[indexDirectional][first];
            array[indexDirectional][first] = array[indexDirectional][last];
            array[indexDirectional][last] = tmp;
        }
        if (directional.equals("y")) {
            int tmp = array[first][indexDirectional];
            array[first][indexDirectional] = array[last][indexDirectional];
            array[last][indexDirectional] = tmp;
        }
    }

    private boolean valid(int[][] array) {
        // TODO implement me (TDD)
        return true;
    }


    public void all(int[][] array) {
        if (!valid(array)) {
            return;
        }

//        upDown(array);
//        leftRight(array);
    }

    public void d1(int[][] array) {
        if (!valid(array)) {
            return;
        }

        // TODO implement me (TDD)
    }

    public void d2(int[][] array) {
        if (!valid(array)) {
            return;
        }

        // TODO implement me (TDD)
    }

    public String toString(int[][] array) {
        String result = new String();
        for (int i = 0; i < array.length; i++) {
            result += Arrays.toString(array[i]) + "\n";
        }
        return result;
    }
}
