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

        // Implement calculator components


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