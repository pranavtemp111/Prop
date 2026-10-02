public class CalculatorTest {
    public void testAdd() {
        Calculator c = new Calculator();
        assert c.add(2, 3) == 5;
    }
}
