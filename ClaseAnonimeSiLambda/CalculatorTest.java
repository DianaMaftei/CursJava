public class CalculatorTest
{
    public static void main(String[] args) {
        
        // add
        Calculator calculatorAdd = (x, y) -> x + y;
        
        // subtract
        Calculator calculatorSubtract = (x, y) -> x - y;
        
        // divide
        Calculator calculatorDivide = (x, y) -> x / y;
        
        // multiply
        Calculator calculatorMultiply = (x, y) -> x * y;
        
        // test all
        
        System.out.println(calculatorAdd.calculate(1, 2));
        System.out.println(calculatorSubtract.calculate(1, 2));
        System.out.println(calculatorDivide.calculate(1, 2));
        System.out.println(calculatorMultiply.calculate(1, 2));
    }
}
