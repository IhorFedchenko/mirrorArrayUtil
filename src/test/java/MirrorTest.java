import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MirrorTest {
    @Test
    public void upDown() {
        Mirror mirror = new Mirror();
        //1 2 3
        //4 5 6
        //7 8 9
        int[][] array = new int[3][3];
////      array[y][x]
//        array[0][0] = 1;
//        array[0][1] = 2;
//        array[0][2] = 3;
//        array[1][0] = 4;
//        array[1][1] = 5;
//        array[1][2] = 6;
//        array[2][0] = 7;
//        array[2][1] = 8;
//        array[2][2] = 9;
        System.out.println(mirror.toString(array));
    }


}
