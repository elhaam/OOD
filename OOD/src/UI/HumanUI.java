package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class HumanUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HumanUI window = new HumanUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HumanUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 375);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0627\u0637\u0644\u0627\u0639\u0627\u062A \u0645\u0646\u0628\u0639 \u0627\u0646\u0633\u0627\u0646\u06CC:");
		lblNewLabel.setBounds(162, 24, 112, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("\u0646\u0627\u0645:");
		label.setBounds(306, 58, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u0646\u0627\u0645 \u062E\u0627\u0646\u0648\u0627\u062F\u06AF\u06CC:");
		label_1.setBounds(306, 98, 62, 14);
		frame.getContentPane().add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel("\u0634\u0645\u0627\u0631\u0647 \u0645\u0644\u06CC :");
		lblNewLabel_1.setBounds(306, 135, 62, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel label_2 = new JLabel("\u0634\u0645\u0627\u0631\u0647 \u06CC \u06A9\u0627\u0631\u0645\u0646\u062F\u06CC:");
		label_2.setBounds(306, 178, 88, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u0633\u0645\u062A:");
		label_3.setBounds(306, 222, 46, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\u062A\u0627\u0631\u06CC\u062E \u0634\u0631\u0648\u0639 \u06A9\u0627\u0631:");
		label_4.setBounds(306, 269, 88, 14);
		frame.getContentPane().add(label_4);
		
		textField = new JTextField();
		textField.setBounds(160, 52, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(160, 95, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(160, 132, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(162, 175, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(162, 219, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton button = new JButton("\u062B\u0628\u062A \u0645\u0646\u0628\u0639");
		button.setBounds(46, 290, 89, 23);
		frame.getContentPane().add(button);
		
		textField_5 = new JTextField();
		textField_5.setBounds(162, 266, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
	}

}
