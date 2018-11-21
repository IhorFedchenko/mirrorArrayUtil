import org.junit.Test;

public class MirrorTest {


    @Test(expected = IllegalArgumentException.class)
    public void invalid_initial_array_v1() throws Exception {
        Mirror mirror = new Mirror(2, 3);
    }
}
