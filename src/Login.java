
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
public class Login extends JFrame {
	public static final Connection Null = null;
	 JFrame frame;
	/**
	 * Launch the application.
	 */
	 
		public static 	Login login = null;
		public static Login login2=null;
		
		public static App_store app_store=null;
		
		
	 
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Login window = new Login();
					//window.frame.setVisible(true);
					login =new Login();
					login.frame.setVisible(true);
					app_store =new App_store();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Connection connection = null; 
	private JTextField textFieldUN;
	private JPasswordField passwordField;
	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		connection = Sqlite.dbconnector(); 
		
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 502, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUserName = new JLabel("Username :: ");
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUserName.setBounds(149, 94, 101, 24);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblNewLabel = new JLabel("Password ::");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(149, 156, 101, 14); 
		frame.getContentPane().add(lblNewLabel);
		
		textFieldUN = new JTextField();
		textFieldUN.setBounds(260, 98, 101, 20);
		frame.getContentPane().add(textFieldUN);
		textFieldUN.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(260, 155, 101, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setForeground(new Color(255, 255, 255));
		btnLogIn.setBackground(new Color(34, 139, 34));
		btnLogIn.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0) {
				 App_store app_store=new App_store();
				 //app_store.newScreen();
				 
				try{
					String query = "select * from logininfo where USERNAME = ? and PASSWORD = ?"; 
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, textFieldUN.getText());
					pst.setString(2, passwordField.getText());
					ResultSet rs = pst.executeQuery();
					int count = 0;
					while(rs.next()){
						
						count++;
					}
					if (count == 1)
					{
						JOptionPane.showMessageDialog(null, "USER NAME AND PASSWORD IS CORRECT");
						app_store.frame.setVisible(true);
						app_store.newScreen();
						//login.frame.setVisible(false);
						
						
					}
					else if(count > 1){
						JOptionPane.showMessageDialog(null, "Duplicate USER NAME AND PASSWORD");
					}
					else {
						JOptionPane.showMessageDialog(null, "USERNAME AND PASSWORD IS NOT CORRECT Please TYR AGAIN ");
					}
					
					rs.close();
					pst.close();
					
				}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
					
				}
				
			}
		});
		btnLogIn.setBounds(260, 193, 71, 23);
		frame.getContentPane().add(btnLogIn);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 0));
		panel.setBounds(0, 0, 486, 39);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Log In");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 16));
		lblNewLabel_2.setBounds(245, 0, 115, 39);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 0, 0));
		panel_1.setBounds(0, 328, 486, 122);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\fb-art.jpg"));
		lblNewLabel_1.setBounds(191, 0, 40, 37);
		panel_1.add(lblNewLabel_1);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\download.png"));
		label.setBounds(241, 0, 40, 37);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\12576752211189733180Minduka_RSS_icon_3.svg.hi.png"));
		label_1.setBounds(291, 0, 40, 37);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\google-plus.png"));
		label_2.setBounds(338, 0, 40, 37);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Email: abc987@yahoo.com");
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(101, 69, 170, 14);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Website: www.localaapstore.com");
		label_4.setForeground(Color.WHITE);
		label_4.setBounds(101, 94, 213, 14);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("Contact Us:");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Kalpurush", Font.PLAIN, 14));
		label_5.setBounds(0, 68, 77, 14);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\final-icon-large.jpg"));
		label_6.setBounds(231, 194, 25, 21);
		frame.getContentPane().add(label_6);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\user-512.png"));
		lblNewLabel_3.setBounds(26, 94, 101, 122);
		frame.getContentPane().add(lblNewLabel_3);
	}
}