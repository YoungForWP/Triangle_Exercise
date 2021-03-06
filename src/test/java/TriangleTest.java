import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    private Print print = new Print();

    @Test
    public void output_asterisk_when_input_one() throws Exception {
        assertEquals("*", print.printAsterisk(1, "horizontal"));
    }

    @Test
    public void output_multiple_asterisk() throws Exception {
        assertEquals("********", print.printAsterisk(8, "horizontal"));
    }

    @Test
    public void output_vertical_asterisk() throws Exception {
        assertEquals("*\n*", print.printAsterisk(2, "vertical"));
    }

    @Test
    public void out_put_multiple_vertical_asterisk() throws Exception {
        assertEquals("*\n*\n*\n*", print.printAsterisk(4, "vertical"));
    }

    @Test
    public void output_right_trigle_when_inut_two() throws Exception {
        assertEquals("*\n**\n***", print.printAsterisk(3, "right"));
    }

    @Test
    public void final_test() throws Exception {
        assertEquals("*\n**\n***\n****\n*****", print.printAsterisk(5, "right"));
    }
}
