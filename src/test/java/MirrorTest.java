import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MirrorTest {
    @Test
    public void toPrint() {
        Mirror mirror = new Mirror();
        //1 2 3
        //4 5 6
        //7 8 9
        //array[y][x]
        int[][] array = new int[3][3];
        array[0] = new int[]{1, 2, 3};
        array[1] = new int[]{4, 5, 6};
        array[2] = new int[]{7, 8, 9};

        assertEquals("[1, 2, 3]\n" + "[4, 5, 6]\n" + "[7, 8, 9]\n", mirror.toString(array));


    }

    @Test
    public void upDown_When_Size_is_3() {
        Mirror mirror = new Mirror();
        int[][] array = new int[3][3];
        array[0] = new int[]{1, 2, 3};
        array[1] = new int[]{4, 5, 6};
        array[2] = new int[]{7, 8, 9};
        mirror.upDown(array);
        assertEquals("[7, 8, 9]\n" + "[4, 5, 6]\n" + "[1, 2, 3]\n", mirror.toString(array));
    }

    @Test
    public void upDown_When_Size_is_4() {
        Mirror mirror = new Mirror();
        int[][] array = new int[4][4];
        array[0] = new int[]{1, 2, 3, 4};
        array[1] = new int[]{5, 6, 7, 8};
        array[2] = new int[]{9, 10, 11, 12};
        array[3] = new int[]{13, 14, 15, 16};
        mirror.upDown(array);
        assertEquals("[13, 14, 15, 16]\n" +
                "[9, 10, 11, 12]\n" +
                "[5, 6, 7, 8]\n" +
                "[1, 2, 3, 4]\n", mirror.toString(array));
    }

    @Test
    public void leftRight_When_Size_is_3() {
        Mirror mirror = new Mirror();
        int[][] array = new int[3][3];
        array[0] = new int[]{1, 2, 3};
        array[1] = new int[]{4, 5, 6};
        array[2] = new int[]{7, 8, 9};
        mirror.leftRight(array);
        assertEquals("[3, 2, 1]\n" + "[6, 5, 4]\n" + "[9, 8, 7]\n", mirror.toString(array));
    }

    @Test
    public void leftRight_When_Size_is_4() {
        Mirror mirror = new Mirror();
        int[][] array = new int[4][4];
        array[0] = new int[]{1, 2, 3, 4};
        array[1] = new int[]{5, 6, 7, 8};
        array[2] = new int[]{9, 10, 11, 12};
        array[3] = new int[]{13, 14, 15, 16};
        mirror.leftRight(array);
        assertEquals("[4, 3, 2, 1]\n" +
                "[8, 7, 6, 5]\n" +
                "[12, 11, 10, 9]\n" +
                "[16, 15, 14, 13]\n", mirror.toString(array));
    }

    @Test
    public void d1_When_Size_is_2() {
        Mirror mirror = new Mirror();
        int[][] array = new int[2][2];
        array[0] = new int[]{1, 2};
        array[1] = new int[]{3, 4};
        mirror.d1(array);
        assertEquals("[4, 2]\n" + "[3, 1]\n", mirror.toString(array));
    }

    @Test
    public void d1_When_Size_is_3() {
        Mirror mirror = new Mirror();
        int[][] array = new int[3][3];
        array[0] = new int[]{1, 2, 3};
        array[1] = new int[]{4, 5, 6};
        array[2] = new int[]{7, 8, 9};
        mirror.d1(array);
        assertEquals("[9, 6, 3]\n" + "[8, 5, 2]\n" + "[7, 4, 1]\n", mirror.toString(array));
    }

    @Test
    public void d1_When_Size_is_4() {
        Mirror mirror = new Mirror();
        int[][] array = new int[4][4];
        array[0] = new int[]{1, 2, 3, 4};
        array[1] = new int[]{5, 6, 7, 8};
        array[2] = new int[]{9, 10, 11, 12};
        array[3] = new int[]{13, 14, 15, 16};
        mirror.d1(array);
        assertEquals("[16, 12, 8, 4]\n" +
                "[15, 11, 7, 3]\n" +
                "[14, 10, 6, 2]\n" +
                "[13, 9, 5, 1]\n", mirror.toString(array));
    }
    @Test
    public void d1_When_Size_is_5() {
        Mirror mirror = new Mirror();
        int[][] array = new int[5][5];
        array[0] = new int[]{1, 2, 3, 4, 5};
        array[1] = new int[]{6, 7, 8, 9, 10};
        array[2] = new int[]{11, 12, 13, 14, 15};
        array[3] = new int[]{16, 17, 18, 19, 20};
        array[4] = new int[]{21, 22, 23, 24, 25};
        mirror.d1(array);
        assertEquals("[25, 20, 15, 10, 5]\n" +
                "[24, 19, 14, 9, 4]\n" +
                "[23, 18, 13, 8, 3]\n" +
                "[22, 17, 12, 7, 2]\n" +
                "[21, 16, 11, 6, 1]\n", mirror.toString(array));
    }
}
