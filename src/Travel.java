import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class Travel {

	public JFrame frame;
	public static install install=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Travel travel=new Travel();
					travel.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Travel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 586, 711);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnHotelsFoBangladesh = new JButton("Hotels fo Bangladesh");
		btnHotelsFoBangladesh.setFont(new Font("Arial", Font.PLAIN, 15));
		btnHotelsFoBangladesh.setBackground(new Color(154, 205, 50));
		btnHotelsFoBangladesh.setBounds(56, 100, 183, 46);
		frame.getContentPane().add(btnHotelsFoBangladesh);
		
		JButton btnTourManager = new JButton("Tour Manager");
		btnTourManager.setFont(new Font("Arial", Font.PLAIN, 15));
		btnTourManager.setBackground(new Color(154, 205, 50));
		btnTourManager.setBounds(56, 194, 183, 46);
		frame.getContentPane().add(btnTourManager);
		
		JButton btnAirport = new JButton("Tourist Guide");
		btnAirport.setFont(new Font("Arial", Font.PLAIN, 15));
		btnAirport.setBackground(new Color(154, 205, 50));
		btnAirport.setBounds(56, 289, 183, 46);
		frame.getContentPane().add(btnAirport);
		
		JButton btnMyGpsLocation = new JButton("My GPS Location");
		btnMyGpsLocation.setFont(new Font("Arial", Font.PLAIN, 15));
		btnMyGpsLocation.setBackground(new Color(154, 205, 50));
		btnMyGpsLocation.setBounds(56, 382, 183, 41);
		frame.getContentPane().add(btnMyGpsLocation);
		
		JButton button = new JButton("Go to Home");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				App_store.app_store.frame.setVisible(true);
				App_store.travel.frame.setVisible(false);
			}
		});
		button.setBackground(Color.ORANGE);
		button.setBounds(56, 499, 106, 23);
		frame.getContentPane().add(button);
		
		JLabel label = new JLabel("Size: 13.3MB");
		label.setFont(new Font("Century Gothic", Font.BOLD, 11));
		label.setBounds(56, 147, 86, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Downloded: 1M");
		label_1.setBounds(140, 148, 99, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Size: 13.3MB");
		label_2.setFont(new Font("Century Gothic", Font.BOLD, 11));
		label_2.setBounds(56, 243, 86, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Downloded: 1M");
		label_3.setBounds(140, 244, 99, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Size: 13.3MB");
		label_4.setFont(new Font("Century Gothic", Font.BOLD, 11));
		label_4.setBounds(56, 337, 86, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Downloded: 1M");
		label_5.setBounds(140, 338, 99, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Size: 13.3MB");
		label_6.setFont(new Font("Century Gothic", Font.BOLD, 11));
		label_6.setBounds(56, 428, 86, 14);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("Downloded: 1M");
		label_7.setBounds(140, 429, 99, 14);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("*****");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_8.setBounds(305, 142, 71, 14);
		frame.getContentPane().add(label_8);
		
		JButton button_1 = new JButton("Install");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				install install = new install();
				install.frame.setVisible(true);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_1.setBackground(new Color(245, 245, 220));
		button_1.setBounds(416, 123, 89, 23);
		frame.getContentPane().add(button_1);
		
		JLabel label_9 = new JLabel("Ratings:");
		label_9.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_9.setBounds(306, 100, 52, 41);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("*****");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_10.setBounds(305, 226, 71, 14);
		frame.getContentPane().add(label_10);
		
		JButton button_2 = new JButton("Install");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				install install = new install();
				install.frame.setVisible(true);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_2.setBackground(new Color(245, 245, 220));
		button_2.setBounds(416, 207, 89, 23);
		frame.getContentPane().add(button_2);
		
		JLabel label_11 = new JLabel("Ratings:");
		label_11.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_11.setBounds(306, 184, 52, 41);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("*****");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_12.setBounds(305, 321, 71, 14);
		frame.getContentPane().add(label_12);
		
		JButton button_3 = new JButton("Install");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				install install = new install();
				install.frame.setVisible(true);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_3.setBackground(new Color(245, 245, 220));
		button_3.setBounds(416, 302, 89, 23);
		frame.getContentPane().add(button_3);
		
		JLabel label_13 = new JLabel("Ratings:");
		label_13.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_13.setBounds(306, 279, 52, 41);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("*****");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_14.setBounds(305, 408, 71, 14);
		frame.getContentPane().add(label_14);
		
		JButton button_4 = new JButton("Install");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				install install = new install();
				install.frame.setVisible(true);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_4.setBackground(new Color(245, 245, 220));
		button_4.setBounds(416, 390, 89, 23);
		frame.getContentPane().add(button_4);
		
		JLabel label_15 = new JLabel("Ratings:");
		label_15.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_15.setBounds(306, 370, 52, 41);
		frame.getContentPane().add(label_15);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBackground(new Color(153, 50, 204));
		panel.setBounds(0, 552, 569, 120);
		frame.getContentPane().add(panel);
		
		JLabel label_16 = new JLabel("Also Find Us On");
		label_16.setForeground(new Color(255, 255, 255));
		label_16.setFont(new Font("Kalpurush", Font.PLAIN, 16));
		label_16.setBounds(10, 11, 134, 14);
		panel.add(label_16);
		
		JLabel label_17 = new JLabel("Contact Us:");
		label_17.setForeground(new Color(255, 255, 255));
		label_17.setFont(new Font("Kalpurush", Font.PLAIN, 14));
		label_17.setBounds(10, 58, 77, 14);
		panel.add(label_17);
		
		JLabel label_18 = new JLabel("Email: abc987@yahoo.com");
		label_18.setForeground(new Color(255, 255, 255));
		label_18.setBounds(111, 59, 170, 14);
		panel.add(label_18);
		
		JLabel label_19 = new JLabel("Website: www.localaapstore.com");
		label_19.setForeground(new Color(255, 255, 255));
		label_19.setBounds(111, 84, 213, 14);
		panel.add(label_19);
		
		JLabel label_20 = new JLabel("New label");
		label_20.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\fb-art.jpg"));
		label_20.setBounds(166, 0, 33, 31);
		panel.add(label_20);
		
		JLabel label_21 = new JLabel("New label");
		label_21.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\download.png"));
		label_21.setBounds(209, 0, 33, 31);
		panel.add(label_21);
		
		JLabel label_22 = new JLabel("New label");
		label_22.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\google-plus.png"));
		label_22.setBounds(248, 0, 33, 31);
		panel.add(label_22);
		
		JLabel label_23 = new JLabel("New label");
		label_23.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\12576752211189733180Minduka_RSS_icon_3.svg.hi.png"));
		label_23.setBounds(291, 0, 33, 31);
		panel.add(label_23);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 50, 204));
		panel_1.setBounds(0, 0, 569, 66);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTravel = new JLabel("Travel");
		lblTravel.setForeground(new Color(255, 255, 255));
		lblTravel.setBounds(282, 21, 59, 23);
		panel_1.add(lblTravel);
		lblTravel.setFont(new Font("Arial", Font.BOLD, 19));
		lblTravel.setBackground(new Color(255, 222, 173));
		
		JLabel label_24 = new JLabel("      .");
		label_24.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_24.setBounds(0, 123, 46, 14);
		frame.getContentPane().add(label_24);
		
		JLabel label_25 = new JLabel("      .");
		label_25.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_25.setBounds(0, 208, 46, 14);
		frame.getContentPane().add(label_25);
		
		JLabel label_26 = new JLabel("      .");
		label_26.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_26.setBounds(0, 303, 46, 14);
		frame.getContentPane().add(label_26);
		
		JLabel label_27 = new JLabel("      .");
		label_27.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_27.setBounds(0, 393, 46, 14);
		frame.getContentPane().add(label_27);
	}
}
