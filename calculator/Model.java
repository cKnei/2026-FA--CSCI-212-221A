public class Model {
    // NO GUI CONTENT, JUST THE MATH!

    private double calculationValue;

    // The math "recipes" our chef follows
    public void addTwoNumbers(double firstNumber, double secondNumber) {
        calculationValue = firstNumber + secondNumber;
    }

    public void subtractTwoNumbers(double firstNumber, double secondNumber) {
        calculationValue = firstNumber - secondNumber;
    }

    public void multiplyTwoNumbers(double firstNumber, double secondNumber) {
        calculationValue = firstNumber * secondNumber;
    }

    public void divideTwoNumbers(double firstNumber, double secondNumber) {
        // Dividing by zero is not allowed, so the model refuses the order
        if (secondNumber == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        calculationValue = firstNumber / secondNumber;
    }

    // Getter to return the result
    public double getCalculationValue() {
        return calculationValue;
    }
}
