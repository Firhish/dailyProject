package lessons.lesson8.assignments.a2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverterApp extends JFrame {

    private JTextField inputField;
    private JLabel resultLabel;

    public TemperatureConverterApp() {
        // Basic setup
        setTitle("Temperature Converter");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Input field
        inputField = new JTextField();
        inputField.setAlignmentX(CENTER_ALIGNMENT);
        mainPanel.add(inputField);

        // Conversion buttons
        JButton celsiusButton = createButton("Convert to Celsius", "Celsius");
        JButton fahrenheitButton = createButton("Convert to Fahrenheit", "Fahrenheit");
        JButton kelvinButton = createButton("Convert to Kelvin", "Kelvin");

        // Result label
        resultLabel = new JLabel("Result: ");
        resultLabel.setAlignmentX(CENTER_ALIGNMENT);
        mainPanel.add(resultLabel);

        // Add components to the main panel
        mainPanel.add(Box.createVerticalStrut(10)); // Add some vertical spacing
        mainPanel.add(celsiusButton);
        mainPanel.add(fahrenheitButton);
        mainPanel.add(kelvinButton);

        // Add main panel to the frame
        add(mainPanel);
    }

    private JButton createButton(String buttonText, final String conversionType) {
        JButton button = new JButton(buttonText);
        button.setAlignmentX(CENTER_ALIGNMENT);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertTemperature(conversionType);
            }
        });
        return button;
    }

    private void convertTemperature(String conversionType) {
        try {
            double inputTemperature = Double.parseDouble(inputField.getText());

            double result;
            String resultText;

            switch (conversionType) {
                case "Celsius":
                    result = (inputTemperature - 32) * 5 / 9;
                    resultText = String.format("%.2f Celsius", result);
                    break;
                case "Fahrenheit":
                    result = (inputTemperature * 9 / 5) + 32;
                    resultText = String.format("%.2f Fahrenheit", result);
                    break;
                case "Kelvin":
                    result = inputTemperature + 273.15;
                    resultText = String.format("%.2f Kelvin", result);
                    break;
                default:
                    resultText = "Invalid conversion type";
            }

            resultLabel.setText("Result: " + resultText);

        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input. Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TemperatureConverterApp app = new TemperatureConverterApp();
            app.setVisible(true);
        });
    }
}
