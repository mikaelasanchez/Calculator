// Imports
import javax.swing.*;
import java.awt.*;

/**
 * GUI class for the calculator. Contains main method.
 */
public class GUI extends JFrame {

    /**
     * Constructor method for the calculator GUI
     */
    public GUI() {
        setTitle("Calculator");
        setSize(400, 500);
        setLocation(500, 200);

        // Instantiate calculator components
        TextField textField = new TextField();
        Button calculateBtn = new Button("Calculate");
        JPanel panel2 = new JPanel();

        // Set calculate button attributes
        calculateBtn.setSize(60,60);
        calculateBtn.setLocation(20,90);

        // Set text field attributes
        textField.setSize(250,40);
        textField.setLocation(20,20);

        // Add components to calculator window
        add(textField);
        add(calculateBtn);
        add(panel2);


        // Make calculator visible
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * Main method
     * Creates new GUI object to display
     */
    public static void main(String[] args) {
        Frame calculatorGUI = new GUI();
        
    }
}