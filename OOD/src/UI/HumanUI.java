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
	private JTextField textFieldName;
	private JTextField textFieldLastName;
	private JTextField textFieldMelliNo;
	private JTextField textFieldEmployeeNo;
	private JTextField textFieldJob;
	private JTextField textFieldStartDate;

	/**
	 * Launch the application.
	 */
	public void showHumanUI() {
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
		
		textFieldName = new JTextField();
		textFieldName.setBounds(160, 52, 86, 20);
		frame.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setBounds(160, 95, 86, 20);
		frame.getContentPane().add(textFieldLastName);
		textFieldLastName.setColumns(10);
		
		textFieldMelliNo = new JTextField();
		textFieldMelliNo.setBounds(160, 132, 86, 20);
		frame.getContentPane().add(textFieldMelliNo);
		textFieldMelliNo.setColumns(10);
		
		textFieldEmployeeNo = new JTextField();
		textFieldEmployeeNo.setBounds(162, 175, 86, 20);
		frame.getContentPane().add(textFieldEmployeeNo);
		textFieldEmployeeNo.setColumns(10);
		
		textFieldJob = new JTextField();
		textFieldJob.setBounds(162, 219, 86, 20);
		frame.getContentPane().add(textFieldJob);
		textFieldJob.setColumns(10);
		
		JButton button = new JButton("\u062B\u0628\u062A \u0645\u0646\u0628\u0639");
		button.setBounds(46, 290, 89, 23);
		frame.getContentPane().add(button);
		
		textFieldStartDate = new JTextField();
		textFieldStartDate.setBounds(162, 266, 86, 20);
		frame.getContentPane().add(textFieldStartDate);
		textFieldStartDate.setColumns(10);
	}

}
