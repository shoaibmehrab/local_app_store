import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JLabel;

public class Welcome {

	public JFrame frame;

	public static  Welcome welcome=null;
	public static Sign_up sign_up=null;
	public static Login login=null;
	
	//public static 
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcome=new Welcome();
					welcome.frame.setVisible(true);
					
					/*Welcome window = new Welcome();
					window.frame.setVisible(true);*/
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public Welcome() {
		initialize();
		sign_up=new Sign_up();
		login=new Login();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(new Color(255, 250, 205));
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Create Account ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				sign_up.frame.setVisible(true);
				welcome.frame.setVisible(false);
				
			}
		});
		btnNewButton.setForeground(new Color(245, 245, 245));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setBounds(36, 297, 176, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Log In");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButton_1.setBackground(new Color(0, 128, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				login.frame.setVisible(true);
				welcome.frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(321, 297, 167, 31);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblApp = new JLabel("App");
		lblApp.setFont(new Font("Yu Mincho Demibold", Font.BOLD, 35));
		lblApp.setForeground(new Color(255, 0, 0));
		lblApp.setBounds(186, 82, 83, 38);
		frame.getContentPane().add(lblApp);
		
		JLabel lblBazar = new JLabel("SHOP");
		lblBazar.setFont(new Font("Yu Mincho", Font.BOLD, 35));
		lblBazar.setForeground(new Color(0, 153, 51));
		lblBazar.setBounds(251, 86, 135, 31);
		frame.getContentPane().add(lblBazar);
		frame.setBounds(100, 100, 526, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
