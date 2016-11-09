import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by JongKwang on 09/11/2016.
 */
public class CalculatorTest {
    @Test
    public void sum() throws Exception {
        Calculator c = new Calculator();
        assertEquals(c.sum(1, 2), 3);
    }

}