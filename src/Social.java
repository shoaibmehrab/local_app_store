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

public class Social {

	public JFrame frame;
	public static install install=null;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Social window = new Social();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Social() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 601, 716);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnFacebook = new JButton("Facebook");
		btnFacebook.setFont(new Font("Arial", Font.PLAIN, 15));
		btnFacebook.setBackground(new Color(255, 204, 204));
		btnFacebook.setBounds(55, 118, 183, 46);
		frame.getContentPane().add(btnFacebook);
		
		JButton btnTwitter = new JButton("Twitter");
		btnTwitter.setFont(new Font("Arial", Font.PLAIN, 15));
		btnTwitter.setBackground(new Color(255, 204, 204));
		btnTwitter.setBounds(55, 211, 183, 46);
		frame.getContentPane().add(btnTwitter);
		
		JButton btnWhatsapp = new JButton("Whatsapp");
		btnWhatsapp.setFont(new Font("Arial", Font.PLAIN, 15));
		btnWhatsapp.setBackground(new Color(255, 204, 204));
		btnWhatsapp.setBounds(55, 303, 183, 46);
		frame.getContentPane().add(btnWhatsapp);
		
		JButton btnViber = new JButton("Viber");
		btnViber.setFont(new Font("Arial", Font.PLAIN, 15));
		btnViber.setBackground(new Color(255, 204, 204));
		btnViber.setBounds(55, 399, 183, 41);
		frame.getContentPane().add(btnViber);
		
		JButton button_4 = new JButton("Install");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				install install = new install();
				install.frame.setVisible(true);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_4.setBackground(new Color(245, 245, 220));
		button_4.setBounds(412, 407, 89, 23);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("Install");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				install install = new install();
				install.frame.setVisible(true);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_5.setBackground(new Color(245, 245, 220));
		button_5.setBounds(412, 314, 89, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("Install");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				install install = new install();
				install.frame.setVisible(true);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_6.setBackground(new Color(245, 245, 220));
		button_6.setBounds(412, 222, 89, 23);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("Install");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				install install = new install();
				install.frame.setVisible(true);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_7.setBackground(new Color(245, 245, 220));
		button_7.setBounds(412, 129, 89, 23);
		frame.getContentPane().add(button_7);
		
		JLabel label = new JLabel("Ratings:");
		label.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label.setBounds(302, 111, 52, 41);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("*****");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_1.setBounds(302, 150, 71, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Ratings:");
		label_2.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_2.setBounds(302, 204, 52, 41);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("*****");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_3.setBounds(302, 243, 71, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Ratings:");
		label_4.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_4.setBounds(302, 296, 52, 41);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("*****");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_5.setBounds(302, 335, 71, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Ratings:");
		label_6.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_6.setBounds(302, 389, 52, 41);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("***");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_7.setBounds(302, 426, 71, 14);
		frame.getContentPane().add(label_7);
		
		JLabel label_9 = new JLabel("Size: 13.3MB");
		label_9.setFont(new Font("Century Gothic", Font.BOLD, 11));
		label_9.setBounds(55, 165, 86, 14);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("Downloded: 1M");
		label_10.setBounds(139, 166, 99, 14);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("Size: 13.3MB");
		label_11.setFont(new Font("Century Gothic", Font.BOLD, 11));
		label_11.setBounds(55, 263, 86, 14);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("Downloded: 1M");
		label_12.setBounds(139, 264, 99, 14);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("Size: 13.3MB");
		label_13.setFont(new Font("Century Gothic", Font.BOLD, 11));
		label_13.setBounds(55, 350, 86, 14);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("Downloded: 1M");
		label_14.setBounds(139, 351, 99, 14);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("Size: 13.3MB");
		label_15.setFont(new Font("Century Gothic", Font.BOLD, 11));
		label_15.setBounds(55, 439, 86, 14);
		frame.getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("Downloded: 1M");
		label_16.setBounds(139, 440, 99, 14);
		frame.getContentPane().add(label_16);
		
		JButton button_8 = new JButton("Go to Home");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				App_store.social.frame.setVisible(false);
				App_store.app_store.frame.setVisible(true);
			}
		});
		button_8.setBackground(Color.ORANGE);
		button_8.setBounds(55, 526, 106, 23);
		frame.getContentPane().add(button_8);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 224, 208));
		panel.setBounds(0, 0, 588, 60);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblSocial = new JLabel("Social");
		lblSocial.setBounds(294, 19, 57, 23);
		panel.add(lblSocial);
		lblSocial.setFont(new Font("Arial", Font.BOLD, 19));
		lblSocial.setBackground(new Color(255, 222, 173));
		
		JLabel label_28 = new JLabel("New label");
		label_28.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\images.png"));
		label_28.setBounds(238, 11, 46, 38);
		panel.add(label_28);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.BLACK);
		panel_1.setBackground(new Color(64, 224, 208));
		panel_1.setBounds(0, 560, 588, 120);
		frame.getContentPane().add(panel_1);
		
		JLabel label_8 = new JLabel("Also Find Us On");
		label_8.setForeground(Color.BLACK);
		label_8.setFont(new Font("Kalpurush", Font.PLAIN, 16));
		label_8.setBounds(10, 11, 134, 14);
		panel_1.add(label_8);
		
		JLabel label_17 = new JLabel("Contact Us:");
		label_17.setForeground(Color.BLACK);
		label_17.setFont(new Font("Kalpurush", Font.PLAIN, 14));
		label_17.setBounds(10, 58, 77, 14);
		panel_1.add(label_17);
		
		JLabel label_18 = new JLabel("Email: abc987@yahoo.com");
		label_18.setForeground(Color.BLACK);
		label_18.setBounds(111, 59, 170, 14);
		panel_1.add(label_18);
		
		JLabel label_19 = new JLabel("Website: www.localaapstore.com");
		label_19.setForeground(Color.BLACK);
		label_19.setBounds(111, 84, 213, 14);
		panel_1.add(label_19);
		
		JLabel label_20 = new JLabel("New label");
		label_20.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\fb-art.jpg"));
		label_20.setBounds(166, 0, 33, 31);
		panel_1.add(label_20);
		
		JLabel label_21 = new JLabel("New label");
		label_21.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\download.png"));
		label_21.setBounds(209, 0, 33, 31);
		panel_1.add(label_21);
		
		JLabel label_22 = new JLabel("New label");
		label_22.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\google-plus.png"));
		label_22.setBounds(248, 0, 33, 31);
		panel_1.add(label_22);
		
		JLabel label_23 = new JLabel("New label");
		label_23.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\12576752211189733180Minduka_RSS_icon_3.svg.hi.png"));
		label_23.setBounds(291, 0, 33, 31);
		panel_1.add(label_23);
		
		JLabel label_24 = new JLabel("      .");
		label_24.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_24.setBounds(10, 131, 46, 14);
		frame.getContentPane().add(label_24);
		
		JLabel label_25 = new JLabel("      .");
		label_25.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_25.setBounds(10, 225, 46, 14);
		frame.getContentPane().add(label_25);
		
		JLabel label_26 = new JLabel("      .");
		label_26.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_26.setBounds(10, 317, 46, 14);
		frame.getContentPane().add(label_26);
		
		JLabel label_27 = new JLabel("      .");
		label_27.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_27.setBounds(10, 410, 46, 14);
		frame.getContentPane().add(label_27);
	}

}
