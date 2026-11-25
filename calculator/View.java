import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View {
    private JFrame frame;
    private JTextField firstNumber;
    private JTextField secondNumber;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JLabel calcSolution;

    public View() {
        frame = new JFrame("MVC Calculator");
        frame.setSize(600, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        firstNumber = new JTextField(10);
        secondNumber = new JTextField(10);

        // One button per operation
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");

        calcSolution = new JLabel("Answer: ");

        frame.add(firstNumber);
        frame.add(secondNumber);
        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(multiplyButton);
        frame.add(divideButton);
        frame.add(calcSolution);

        frame.setVisible(true);
    }

    // --- GETTERS & SETTERS FOR THE CONTROLLER ---
    public double getFirstNumber() {
        return Double.parseDouble(firstNumber.getText());
    }

    public double getSecondNumber() {
        return Double.parseDouble(secondNumber.getText());
    }

    public void setCalcSolution(double solution) {
        calcSolution.setText("Answer: " + solution);
    }

    // Lets the controller show an error message instead of a number
    public void setErrorMessage(String message) {
        calcSolution.setText("Error: " + message);
    }

    // --- The Controller uses these to attach a listener to each button ---
    public void addAddListener(ActionListener listenForAddButton) {
        addButton.addActionListener(listenForAddButton);
    }

    public void addSubtractListener(ActionListener listenForSubtractButton) {
        subtractButton.addActionListener(listenForSubtractButton);
    }

    public void addMultiplyListener(ActionListener listenForMultiplyButton) {
        multiplyButton.addActionListener(listenForMultiplyButton);
    }

    public void addDivideListener(ActionListener listenForDivideButton) {
        divideButton.addActionListener(listenForDivideButton);
    }
}
