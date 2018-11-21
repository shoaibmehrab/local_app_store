import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Sign_up {

	public JFrame frame;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	
	public static Login login = null;
	public static Sign_up sign_up=null;
	private JTextField textField_4;
		
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sign_up=new Sign_up();
					sign_up.frame.setVisible(true);
					//Sign_up window = new Sign_up();
					//window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sign_up() {
		initialize();
		login = new Login();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Vani", Font.PLAIN, 18));
		frame.getContentPane().setBackground(new Color(204, 204, 153));
		frame.setBounds(100, 100, 500, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name:: ");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel.setBounds(102, 73, 91, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name:: ");
		lblLastName.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblLastName.setBounds(102, 127, 91, 27);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblUserName = new JLabel("User Name ::");
		lblUserName.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblUserName.setBounds(102, 179, 91, 27);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblEmail = new JLabel("Email ::");
		lblEmail.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblEmail.setBounds(102, 291, 91, 27);
		frame.getContentPane().add(lblEmail);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setForeground(new Color(245, 245, 245));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				login.frame.setVisible(true);
				sign_up.frame.setVisible(false);
			}
		});
		btnSignUp.setFont(new Font("Vani", Font.PLAIN, 16));
		btnSignUp.setBackground(new Color(0, 128, 0));
		btnSignUp.setBounds(214, 353, 132, 48);
		frame.getContentPane().add(btnSignUp);
		
		textField = new JTextField();
		textField.setBounds(214, 74, 205, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(214, 128, 205, 27);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(214, 183, 205, 27);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(214, 295, 205, 27);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(214, 241, 205, 27);
		frame.getContentPane().add(textField_4);
		
		JLabel lblPassword = new JLabel("Password ::");
		lblPassword.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblPassword.setBounds(102, 237, 91, 27);
		frame.getContentPane().add(lblPassword);
	}
}
