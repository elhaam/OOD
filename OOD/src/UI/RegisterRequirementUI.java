package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.TextField;
import java.awt.Panel;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JLabel;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterRequirementUI {

	private JFrame frame;
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
					RegisterRequirementUI window = new RegisterRequirementUI();
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
	public RegisterRequirementUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setFont(null);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 19));
		frame.getContentPane().setEnabled(false);
		frame.setTitle("\u0646\u06CC\u0627\u0632\u0645\u0646\u062F\u06CC");
		frame.setBounds(100, 100, 467, 316);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setFont(new Font("Dialog", Font.PLAIN, 10));
		panel.setBounds(0, 0, 451, 277);
		frame.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{54, 0, 86, 55, 86, 50, 86, 0};
		gbl_panel.rowHeights = new int[]{31, 0, 23, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 4;
		gbc_textField.gridy = 1;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		Label resource = new Label(": \u0645\u0646\u0628\u0639");
		GridBagConstraints gbc_resource = new GridBagConstraints();
		gbc_resource.anchor = GridBagConstraints.NORTHWEST;
		gbc_resource.insets = new Insets(0, 0, 5, 5);
		gbc_resource.gridx = 5;
		gbc_resource.gridy = 1;
		panel.add(resource, gbc_resource);
		resource.setAlignment(Label.RIGHT);
		resource.setFont(new Font("Dialog", Font.PLAIN, 19));
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 4;
		gbc_textField_1.gridy = 3;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		Label section = new Label(": \u0628\u062E\u0634");
		GridBagConstraints gbc_section = new GridBagConstraints();
		gbc_section.anchor = GridBagConstraints.NORTHWEST;
		gbc_section.insets = new Insets(0, 0, 5, 5);
		gbc_section.gridx = 5;
		gbc_section.gridy = 3;
		panel.add(section, gbc_section);
		section.setFont(new Font("Dialog", Font.PLAIN, 19));
		section.setAlignment(Label.RIGHT);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 4;
		gbc_textField_2.gridy = 5;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		Label time = new Label(": \u0632\u0645\u0627\u0646");
		GridBagConstraints gbc_time = new GridBagConstraints();
		gbc_time.anchor = GridBagConstraints.NORTHWEST;
		gbc_time.insets = new Insets(0, 0, 5, 5);
		gbc_time.gridx = 5;
		gbc_time.gridy = 5;
		panel.add(time, gbc_time);
		time.setFont(new Font("Dialog", Font.PLAIN, 19));
		time.setAlignment(Label.RIGHT);
		panel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{time, section, resource}));
		
		JButton button = new JButton("\u062B\u0628\u062A \u0646\u06CC\u0627\u0632\u0645\u0646\u062F\u06CC");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.anchor = GridBagConstraints.NORTH;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridwidth = 2;
		gbc_button.gridx = 1;
		gbc_button.gridy = 7;
		panel.add(button, gbc_button);
	}
}
