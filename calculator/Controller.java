import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private View theView;
    private Model theModel;

    public Controller(View theView, Model theModel) {
        this.theView = theView;
        this.theModel = theModel;

        // Wire each button to its own listener (inner classes below)
        this.theView.addAddListener(new AddListener());
        this.theView.addSubtractListener(new SubtractListener());
        this.theView.addMultiplyListener(new MultiplyListener());
        this.theView.addDivideListener(new DivideListener());
    }

    class AddListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double firstNumber = theView.getFirstNumber();
                double secondNumber = theView.getSecondNumber();

                theModel.addTwoNumbers(firstNumber, secondNumber);

                theView.setCalcSolution(theModel.getCalculationValue());
            } catch (NumberFormatException ex) {
                theView.setErrorMessage("Please enter valid numbers.");
            }
        }
    }

    // Inner class for the - button
    class SubtractListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double firstNumber = theView.getFirstNumber();
                double secondNumber = theView.getSecondNumber();
                theModel.subtractTwoNumbers(firstNumber, secondNumber);
                theView.setCalcSolution(theModel.getCalculationValue());
            } catch (NumberFormatException ex) {
                theView.setErrorMessage("Please enter valid numbers.");
            }
        }
    }

    // Inner class for the * button
    class MultiplyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double firstNumber = theView.getFirstNumber();
                double secondNumber = theView.getSecondNumber();
                theModel.multiplyTwoNumbers(firstNumber, secondNumber);
                theView.setCalcSolution(theModel.getCalculationValue());
            } catch (NumberFormatException ex) {
                theView.setErrorMessage("Please enter valid numbers.");
            }
        }
    }

    // Inner class for the / button
    class DivideListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double firstNumber = theView.getFirstNumber();
                double secondNumber = theView.getSecondNumber();
                theModel.divideTwoNumbers(firstNumber, secondNumber);
                theView.setCalcSolution(theModel.getCalculationValue());
            } catch (NumberFormatException ex) {
                theView.setErrorMessage("Please enter valid numbers.");
            } catch (ArithmeticException ex) {
                // Thrown by the model when dividing by zero
                theView.setErrorMessage("Cannot divide by zero.");
            }
        }
    }

    public static void main(String[] args) {
        View theView = new View();
        Model theModel = new Model();

        // Wire them together!
        Controller theController = new Controller(theView, theModel);
    }
}
