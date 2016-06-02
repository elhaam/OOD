package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PhysicalResource extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhysicalResource frame = new PhysicalResource();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PhysicalResource() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0627\u0637\u0644\u0627\u0639\u0627\u062A \u0645\u0646\u0628\u0639 \u0641\u06CC\u0632\u06CC\u06A9\u06CC:");
		label.setBounds(156, 28, 118, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0634\u0645\u0627\u0631\u0647 \u0627\u0645\u0648\u0627\u0644:");
		label_1.setBounds(254, 66, 68, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u0646\u0648\u0639:");
		label_2.setBounds(254, 112, 46, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u0645\u062F\u0644/\u0627\u0633\u0645:");
		label_3.setBounds(254, 164, 68, 14);
		contentPane.add(label_3);
		
		textField = new JTextField();
		textField.setBounds(131, 63, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(131, 109, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(131, 161, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton button = new JButton("\u062B\u0628\u062A \u0645\u0646\u0628\u0639");
		button.setBounds(37, 213, 89, 23);
		contentPane.add(button);
	}
}
