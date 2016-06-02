package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Resource extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resource frame = new Resource();
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
	public Resource() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u0627\u0646\u062A\u062E\u0627\u0628 \u0646\u0648\u0639 \u0645\u0646\u0628\u0639:");
		label.setBounds(290, 47, 86, 14);
		getContentPane().add(label);
		
		JRadioButton radioButton = new JRadioButton("\u0627\u0637\u0644\u0627\u0639\u0627\u062A\u06CC");
		radioButton.setBounds(244, 91, 109, 23);
		getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u0627\u0646\u0633\u0627\u0646\u06CC");
		radioButton_1.setBounds(102, 91, 109, 23);
		getContentPane().add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("\u0641\u06CC\u0632\u06CC\u06A9\u06CC");
		radioButton_2.setBounds(244, 144, 109, 23);
		getContentPane().add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("\u0645\u0627\u0644\u06CC");
		radioButton_3.setBounds(102, 144, 109, 23);
		getContentPane().add(radioButton_3);
		
		JButton button = new JButton("\u0627\u062F\u0627\u0645\u0647 \u06CC \u062B\u0628\u062A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(45, 203, 89, 23);
		getContentPane().add(button);
	}
}
