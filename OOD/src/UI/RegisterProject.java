package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class RegisterProject {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterProject window = new RegisterProject();
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
	public RegisterProject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("\u0627\u0637\u0644\u0627\u0639\u0627\u062A \u067E\u0631\u0648\u0698\u0647");
		label.setBounds(172, 22, 132, 23);
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(label);
		
		JLabel lblNewLabel_2 = new JLabel("\u062A\u0639\u062F\u0627\u062F \u0645\u0627\u0698\u0648\u0644 :");
		lblNewLabel_2.setBounds(317, 126, 60, 23);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("\u062A\u0639\u062F\u0627\u062F \u0646\u06CC\u0631\u0648\u06CC \u0627\u0646\u0633\u0627\u0646\u06CC :");
		lblNewLabel_1.setBounds(282, 101, 102, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel(" \u0646\u0627\u0645 : ");
		lblNewLabel.setBounds(351, 64, 26, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("\u062A\u06A9\u0646\u0648\u0644\u0648\u0698\u06CC :");
		lblNewLabel_3.setBounds(327, 160, 52, 23);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("\u062B\u0628\u062A \u067E\u0631\u0648\u0698\u0647");
		btnNewButton.setBounds(45, 213, 89, 23);
		panel.add(btnNewButton);
	}
}
