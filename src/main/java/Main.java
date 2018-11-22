public class Main {

    public static void main(String[] args) {
        int length = 4;
        int deep = 1;
        int mirrorDeep = length - deep;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - deep; j++) {
                System.out.print("oldY: "+i+" "+"oldX: "+j+" "+" newY: "+(mirrorDeep-j)+" newX: "+(length-deep)+"\n");
            }
            deep++;

        }
    }
}