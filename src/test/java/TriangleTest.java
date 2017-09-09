import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    private Print print = new Print();

    @Test
    public void output_asterisk_when_output_one() throws Exception {
        assertEquals("*",print.printAsterisk(1));
    }

}
