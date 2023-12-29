import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SimpleCalculator extends 
JFrame implements ActionListener {
    private JTextField textField;
    private String input = "";
    public SimpleCalculator() {
        // Set up the JFrame
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        // Text field for display
        textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);
        // Panel for buttons with GridLayout
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));
        // Array of button labels
        String[] buttonLabels = {
                
                "7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "*",
                "0", ".", "=", "/",
                   "C", "%",
        };
        // Add buttons to the panel
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }
        // Add the button panel to the JFrame
        add(buttonPanel, BorderLayout.CENTER);
        // Set frame properties
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "=":
                calculateResult();
                break;
            case "C":
                clearInput();
                break;
            default:
                input += command;
                textField.setText(input);
        }
    }
    private void calculateResult() {
        try {
            double result = evaluateExpression(input);
            textField.setText(Double.toString(result));
            input = "";
        } catch (ArithmeticException | 
NumberFormatException ex) {
            textField.setText("Error");
            input = "";
        }
    }
    private double evaluateExpression
(String expression) {
        return Double.parseDouble(new ScriptEngineManager().getEngineByName
("JavaScript").eval(expression).toString());
    }
    private void clearInput() {
        input = "";
        textField.setText("");
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SimpleCalculator());
    }
}
