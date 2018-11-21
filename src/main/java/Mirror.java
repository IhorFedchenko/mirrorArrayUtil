import java.util.Arrays;

public class Mirror {

    //TODO реализовать swap строк, столбиков
    //TODO делать проход только по строкам(колонкам) со свапом и встречной итерацией ячеек
    //    array[y][x]
//        array[0][0] = 1;
//        array[0][1] = 2;
//        array[0][2] = 3;
//        array[1][0] = 4;
//        array[1][1] = 5;
//        array[1][2] = 6;
//        array[2][0] = 7;
//        array[2][1] = 8;
//        array[2][2] = 9;
    public void upDown(int[][]array){
        for (int x = 0; x <array.length ; x++) {
            int firstIndex = 0;
            int lastIntex = array.length-1;
            while(firstIndex < lastIntex){
                //TODO swap()
                swap(array, directional, firstValue, lastValue);
                firstIndex++;
                lastIntex--;
            }

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

    //TODO upDown and leftRight mirror method
}
