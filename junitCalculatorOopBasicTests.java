import CalculatorOOP.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class junitCalculatorOopBasicTests {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator(1,0);
        int result = calc.add(1,0);
        Assert.assertEquals(1, result);
    }
    @Test
    public void testSub() {
        Calculator calc = new Calculator(10, 5);
        int result = calc.sub(10, 5);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testMult() {
        Calculator calc = new Calculator(4, 6);
        int result = calc.mult(4, 6);
        Assert.assertEquals(24, result);
    }

    @Test
    public void testDiv() {
        Calculator calc = new Calculator(10, 2);
        int result = calc.div(10, 2);
        Assert.assertEquals(5, result);
    }
}

