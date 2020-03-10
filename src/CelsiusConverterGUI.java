import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConverterGUI extends JFrame {
    private JPanel mainPanel;
    private JTextField celsiusTextField;
    private JLabel celsiusLabel;
    private JButton convertButton;
    private JLabel farhenheitLabel;

    public CelsiusConverterGUI(String title) {
        super(title);
        setSize(500, 150);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempFarh = (int) ((Double.parseDouble(celsiusTextField.getText())) * 1.8 + 32);
                farhenheitLabel.setText(tempFarh + " Farhenheit");
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new CelsiusConverterGUI("My celsius converter");
        frame.setVisible(true);
    }
}
