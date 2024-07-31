import javax.swing.*;
public class GreetingGUI extends JFrame {
public GreetingGUI() {
super("Greeting");
// Create components
JLabel nameLabel = new JLabel("Enter the employee name");
JTextField nameField = new JTextField(20);
JButton greetButton = new JButton("Greet");

// Add components to frame
JPanel panel = new JPanel();
panel.add(nameLabel);
panel.add(nameField);
panel.add(greetButton);
add(panel);
// Add action listener to the button
greetButton.addActionListener(e -> {
    String name = nameField.getText();
    if (!name.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Hello, " + name + "!");
    } else {
    JOptionPane.showMessageDialog(this, "Please enter your name.");
    }
    });
    // Set frame properties
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 150);
    setLocationRelativeTo(null); // Center the window
    setVisible(true);
    }
    
    public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> new GreetingGUI());
    }}
    
