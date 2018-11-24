import java.util.Arrays;

public class Mirror {

    public void upDown(int[][] array) {
        if (!valid(array)) {
            return;
        }
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
        if (!valid(array)) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            int firstIndex = 0;
            int lastIndex = array.length - 1;
            while (firstIndex < lastIndex) {
                swap(array, "x", i, firstIndex, lastIndex);
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
        for (int i = 0; i <array.length ; i++) {
            if (array[i].length != array.length){
                return false;
            }
        }
        return true;
    }


    public void all(int[][] array) {
        if (!valid(array)) {
            return;
        }
//        upDown(array);
//        leftRight(array);
    }

    /**
     * В методе d1 происходит магия
     * В коментариях прототип алгоритма свапа по диагонали "/" если масив 4х4
     * Алгоритм выводит на каждой итерации old(y,x) и new(y,x) координаты
     * @param array
     */
//    int length = 4;
//    int deep = 1;
//    int mirrorDeep = length - 1;
//        for (int i = 0; i < length - 1; i++) {
//        for (int j = 0; j < length - (i+1); j++) {
//            System.out.print("oldY: "+i+" "+"oldX: "+j+" "+" newY: "+(mirrorDeep-j)+" newX: "+(length-(i+1))+"\n");
//        }
//
//    }
    public void d1(int[][] array) {
        if (!valid(array)) {
            return;
        }
        int mirrorDeep = array.length - 1;
        for (int i = 0; i < mirrorDeep; i++) {
            for (int j = 0; j < array.length - (i+1); j++) {
                int tmp = array[i][j];
                array[i][j] = array[mirrorDeep-j][array.length-(i+1)];
                array[mirrorDeep-j][array.length-(i+1)] = tmp;
            }
        }
    }

    public void d2(int[][] array) {
        if (!valid(array)) {
            return;
        }
        int deep = array.length - 1;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - deep ; j++) {
                int tmp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = tmp;
            }
            deep--;
        }
    }

    public String toString(int[][] array) {
        String result = new String();
        for (int i = 0; i < array.length; i++) {
            result += Arrays.toString(array[i]) + "\n";
        }
        return result;
    }
}
