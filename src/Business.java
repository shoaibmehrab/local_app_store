import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class Business {

	public  JFrame frame;

	/**
	 * Launch the application.
	 
	 */

	
	public static install install=null;
	/**
	 * Create the application.
	 */
	public Business() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 564, 672);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnMonthlyBudgetPlanner = new JButton("Monthly Budget Planner");
		btnMonthlyBudgetPlanner.setFont(new Font("Arial", Font.PLAIN, 15));
		btnMonthlyBudgetPlanner.setBackground(new Color(255, 99, 71));
		btnMonthlyBudgetPlanner.setBounds(77, 99, 183, 46);
		frame.getContentPane().add(btnMonthlyBudgetPlanner);
		
		JLabel label = new JLabel("      .");
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(25, 116, 46, 14);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("Money Converter");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(255, 99, 71));
		btnNewButton.setBounds(77, 180, 183, 46);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Stock Market");
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBackground(new Color(255, 99, 71));
		btnNewButton_1.setBounds(77, 272, 183, 46);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Financial Calculator");
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton_2.setBackground(new Color(255, 99, 71));
		btnNewButton_2.setBounds(77, 364, 183, 41);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel label_1 = new JLabel("      .");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setBounds(25, 194, 46, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("      .");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_2.setBounds(25, 289, 46, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("      .");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_3.setBounds(25, 378, 46, 14);
		frame.getContentPane().add(label_3);
		
		JLabel lblSizemb = new JLabel("Size: 13.3MB");
		lblSizemb.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblSizemb.setBounds(77, 144, 86, 14);
		frame.getContentPane().add(lblSizemb);
		
		JLabel lblSizemb_1 = new JLabel("Size: 12.6MB");
		lblSizemb_1.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblSizemb_1.setBounds(77, 227, 86, 14);
		frame.getContentPane().add(lblSizemb_1);
		
		JLabel lblSizemb_2 = new JLabel("Size: 11.3MB");
		lblSizemb_2.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblSizemb_2.setBounds(77, 317, 86, 14);
		frame.getContentPane().add(lblSizemb_2);
		
		JLabel lblSizemb_3 = new JLabel("Size: 13.9MB");
		lblSizemb_3.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblSizemb_3.setBounds(77, 405, 86, 14);
		frame.getContentPane().add(lblSizemb_3);
		
		JLabel lblRatings = new JLabel("Ratings:");
		lblRatings.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblRatings.setBounds(324, 89, 52, 41);
		frame.getContentPane().add(lblRatings);
		
		JLabel label_4 = new JLabel("*****");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_4.setBounds(323, 131, 71, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Ratings:");
		label_5.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_5.setBounds(324, 170, 52, 41);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("*****");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_6.setBounds(323, 212, 71, 14);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("Ratings:");
		label_7.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_7.setBounds(324, 262, 52, 41);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("*****");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_8.setBounds(323, 304, 71, 14);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("Ratings:");
		label_9.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_9.setBounds(324, 349, 52, 41);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("***");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_10.setBounds(323, 391, 71, 14);
		frame.getContentPane().add(label_10);
		
		JButton btnInstall = new JButton("Install");
		btnInstall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				install install = new install();
				install.frame.setVisible(true);
			}
		});
		btnInstall.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnInstall.setBackground(new Color(245, 245, 220));
		btnInstall.setBounds(434, 112, 89, 23);
		frame.getContentPane().add(btnInstall);
		
		JButton button = new JButton("Install");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				install install = new install();
				install.frame.setVisible(true);
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBackground(new Color(245, 245, 220));
		button.setBounds(434, 193, 89, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Install");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				install install = new install();
				install.frame.setVisible(true);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_1.setBackground(new Color(245, 245, 220));
		button_1.setBounds(434, 285, 89, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Install");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				install install = new install();
				install.frame.setVisible(true);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_2.setBackground(new Color(245, 245, 220));
		button_2.setBounds(434, 374, 89, 23);
		frame.getContentPane().add(button_2);
		
		JLabel lblNewLabel = new JLabel("Downloded: 1M");
		lblNewLabel.setBounds(161, 145, 99, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblDownlodedk = new JLabel("Downloded: 1.5K");
		lblDownlodedk.setBounds(161, 228, 99, 14);
		frame.getContentPane().add(lblDownlodedk);
		
		JLabel lblDownloded = new JLabel("Downloded: 3.2K");
		lblDownloded.setBounds(161, 318, 99, 14);
		frame.getContentPane().add(lblDownloded);
		
		JLabel lblDownlodedk_1 = new JLabel("Downloded: 5.1K");
		lblDownlodedk_1.setBounds(161, 406, 99, 14);
		frame.getContentPane().add(lblDownlodedk_1);
		
		JButton btnBack = new JButton("Go to Home");
		btnBack.setBackground(Color.ORANGE);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				App_store.business.frame.setVisible(false);
				App_store.app_store.frame.setVisible(true);
			}
		});
		btnBack.setBounds(77, 497, 106, 23);
		frame.getContentPane().add(btnBack);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(new Color(240, 230, 140));
		panel.setBounds(3, 531, 588, 120);
		frame.getContentPane().add(panel);
		
		JLabel label_11 = new JLabel("Also Find Us On");
		label_11.setForeground(new Color(0, 0, 0));
		label_11.setFont(new Font("Kalpurush", Font.PLAIN, 16));
		label_11.setBounds(10, 11, 134, 14);
		panel.add(label_11);
		
		JLabel label_16 = new JLabel("Contact Us:");
		label_16.setForeground(new Color(0, 0, 0));
		label_16.setFont(new Font("Kalpurush", Font.PLAIN, 14));
		label_16.setBounds(10, 58, 77, 14);
		panel.add(label_16);
		
		JLabel label_17 = new JLabel("Email: abc987@yahoo.com");
		label_17.setForeground(new Color(0, 0, 0));
		label_17.setBounds(111, 59, 170, 14);
		panel.add(label_17);
		
		JLabel label_18 = new JLabel("Website: www.localaapstore.com");
		label_18.setForeground(new Color(0, 0, 0));
		label_18.setBounds(111, 84, 213, 14);
		panel.add(label_18);
		
		JLabel label_12 = new JLabel("New label");
		label_12.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\fb-art.jpg"));
		label_12.setBounds(166, 0, 33, 31);
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("New label");
		label_13.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\download.png"));
		label_13.setBounds(209, 0, 33, 31);
		panel.add(label_13);
		
		JLabel label_14 = new JLabel("New label");
		label_14.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\google-plus.png"));
		label_14.setBounds(248, 0, 33, 31);
		panel.add(label_14);
		
		JLabel label_15 = new JLabel("New label");
		label_15.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\12576752211189733180Minduka_RSS_icon_3.svg.hi.png"));
		label_15.setBounds(291, 0, 33, 31);
		panel.add(label_15);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 230, 140));
		panel_1.setBounds(3, 0, 545, 55);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblBusiness = new JLabel("Business");
		lblBusiness.setForeground(new Color(0, 0, 0));
		lblBusiness.setBounds(240, 11, 92, 44);
		panel_1.add(lblBusiness);
		lblBusiness.setBackground(new Color(255, 222, 173));
		lblBusiness.setFont(new Font("Arial", Font.BOLD, 19));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\11399809-briefcase-vector-icon-logo-design.jpg"));
		lblNewLabel_1.setBounds(184, 15, 46, 33);
		panel_1.add(lblNewLabel_1);
	}
}
