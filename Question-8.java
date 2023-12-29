import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class IntegerDivisionUI extends JFrame {
    private JTextField num1Field;
    private JTextField num2Field;
    private JTextField resultField;
    public IntegerDivisionUI() {
        // Set up the JFrame
        setTitle("Integer Division Calculator");
        setDefaultCloseOperation
(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new java.awt.FlowLayout());

        // Create components
        JLabel num1Label = new JLabel("Num1:");
        num1Field = new JTextField(10);
        JLabel num2Label = new JLabel("Num2:");
        num2Field = new JTextField(10);
        JButton divideButton = new  JButton("Divide");
        resultField = new JTextField(15);
        resultField.setEditable(false);
        // Add components to the frame
        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(divideButton);
        add(resultField);
// Add action listener to the Divide button
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
  // Get the numbers from the text fields
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    // Perform the division and display the result
                    int result = num1 / num2;                   resultField.setText(Integer.toString(result));
} catch (NumberFormatException ex) {
// Handle NumberFormatException by displaying an error message dialog
  JOptionPane.showMessageDialog
(IntegerDivisionUI.this,
"Please enter valid integers for Num1 and Num2.", "Input Error", JOptionPane.ERROR_MESSAGE);
  } catch (ArithmeticException ex) {
 // Handle ArithmeticException
 (division by zero) by displaying an error message dialog
JOptionPane.showMessageDialog
(IntegerDivisionUI.this,
    "Cannot divide by zero. Please enter a non-zero value for Num2.",
"Division by Zero", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new IntegerDivisionUI().setVisible(true);
        });
    }
}

