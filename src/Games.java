import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class Games {

	public  JFrame frame;
	public static install install=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Games games = new Games();
					games.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Games() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 618, 767);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnClashOfClans = new JButton("Heros of  71");
		btnClashOfClans.setFont(new Font("Arial", Font.PLAIN, 15));
		btnClashOfClans.setBackground(new Color(255, 255, 0));
		btnClashOfClans.setBounds(65, 89, 183, 46);
		frame.getContentPane().add(btnClashOfClans);
		
		JButton btnClashOfClans_1 = new JButton("Danguli");
		btnClashOfClans_1.setFont(new Font("Arial", Font.PLAIN, 15));
		btnClashOfClans_1.setBackground(new Color(255, 255, 0));
		btnClashOfClans_1.setBounds(65, 188, 183, 46);
		frame.getContentPane().add(btnClashOfClans_1);
		
		JButton btnSd = new JButton("Pro-Kabadi");
		btnSd.setFont(new Font("Arial", Font.PLAIN, 15));
		btnSd.setBackground(new Color(255, 255, 0));
		btnSd.setBounds(65, 280, 183, 46);
		frame.getContentPane().add(btnSd);
		
		JButton btnTempleRun = new JButton("Nouka Baich");
		btnTempleRun.setFont(new Font("Arial", Font.PLAIN, 15));
		btnTempleRun.setBackground(new Color(255, 255, 0));
		btnTempleRun.setBounds(65, 370, 183, 41);
		frame.getContentPane().add(btnTempleRun);
		
		JButton btnHadodo = new JButton("Ha-do-do");
		btnHadodo.setFont(new Font("Arial", Font.PLAIN, 15));
		btnHadodo.setBackground(new Color(255, 255, 0));
		btnHadodo.setBounds(65, 451, 183, 41);
		frame.getContentPane().add(btnHadodo);
		
		JLabel label = new JLabel("Ratings:");
		label.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label.setBounds(347, 79, 52, 41);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("*****");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_1.setBounds(346, 121, 71, 14);
		frame.getContentPane().add(label_1);
		
		JButton button = new JButton("Install");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				install install = new install();
				install.frame.setVisible(true);
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBackground(new Color(245, 245, 220));
		button.setBounds(457, 199, 89, 23);
		frame.getContentPane().add(button);
		
		JLabel label_2 = new JLabel("Ratings:");
		label_2.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_2.setBounds(347, 181, 52, 41);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("*****");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_3.setBounds(347, 220, 71, 14);
		frame.getContentPane().add(label_3);
		
		JButton button_1 = new JButton("Install");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				install install = new install();
				install.frame.setVisible(true);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_1.setBackground(new Color(245, 245, 220));
		button_1.setBounds(457, 291, 89, 23);
		frame.getContentPane().add(button_1);
		
		JLabel label_4 = new JLabel("Ratings:");
		label_4.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_4.setBounds(347, 273, 52, 41);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("***");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_5.setBounds(347, 312, 71, 14);
		frame.getContentPane().add(label_5);
		
		JButton button_2 = new JButton("Install");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				install install = new install();
				install.frame.setVisible(true);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_2.setBackground(new Color(245, 245, 220));
		button_2.setBounds(457, 378, 89, 23);
		frame.getContentPane().add(button_2);
		
		JLabel label_6 = new JLabel("Ratings:");
		label_6.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_6.setBounds(346, 439, 52, 41);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("***");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_7.setBounds(347, 478, 71, 14);
		frame.getContentPane().add(label_7);
		
		JButton button_3 = new JButton("Install");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				install install = new install();
				install.frame.setVisible(true);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_3.setBackground(new Color(245, 245, 220));
		button_3.setBounds(457, 459, 89, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("Install");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				install install = new install();
				install.frame.setVisible(true);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_4.setBackground(new Color(245, 245, 220));
		button_4.setBounds(457, 102, 89, 23);
		frame.getContentPane().add(button_4);
		
		JLabel label_8 = new JLabel("Ratings:");
		label_8.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_8.setBounds(347, 360, 52, 41);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("*****");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_9.setBounds(347, 397, 71, 14);
		frame.getContentPane().add(label_9);
		
		JButton button_5 = new JButton("Go to Home");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				App_store.app_store.frame.setVisible(true);
				App_store.games.frame.setVisible(false);
			}
		});
		button_5.setBackground(Color.ORANGE);
		button_5.setBounds(65, 579, 106, 23);
		frame.getContentPane().add(button_5);
		
		JLabel lblSizemb = new JLabel("Size: 16.5MB");
		lblSizemb.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblSizemb.setBounds(65, 138, 86, 14);
		frame.getContentPane().add(lblSizemb);
		
		JLabel lblDownlodedm = new JLabel("Downloded: 1.5M");
		lblDownlodedm.setBounds(149, 139, 99, 14);
		frame.getContentPane().add(lblDownlodedm);
		
		JLabel label_12 = new JLabel("Size: 13.3MB");
		label_12.setFont(new Font("Century Gothic", Font.BOLD, 11));
		label_12.setBounds(65, 238, 86, 14);
		frame.getContentPane().add(label_12);
		
		JLabel lblDownlodedm_1 = new JLabel("Downloded: 3.1M");
		lblDownlodedm_1.setBounds(149, 239, 99, 14);
		frame.getContentPane().add(lblDownlodedm_1);
		
		JLabel label_14 = new JLabel("Size: 13.3MB");
		label_14.setFont(new Font("Century Gothic", Font.BOLD, 11));
		label_14.setBounds(65, 328, 86, 14);
		frame.getContentPane().add(label_14);
		
		JLabel lblDownlodedm_2 = new JLabel("Downloded: 2.1M");
		lblDownlodedm_2.setBounds(149, 329, 99, 14);
		frame.getContentPane().add(lblDownlodedm_2);
		
		JLabel lblSizemb_1 = new JLabel("Size: 14.9MB");
		lblSizemb_1.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblSizemb_1.setBounds(65, 413, 86, 14);
		frame.getContentPane().add(lblSizemb_1);
		
		JLabel lblDownlodedm_3 = new JLabel("Downloded: 1.3M");
		lblDownlodedm_3.setBounds(149, 414, 99, 14);
		frame.getContentPane().add(lblDownlodedm_3);
		
		JLabel label_18 = new JLabel("Size: 13.3MB");
		label_18.setFont(new Font("Century Gothic", Font.BOLD, 11));
		label_18.setBounds(65, 498, 86, 14);
		frame.getContentPane().add(label_18);
		
		JLabel label_19 = new JLabel("Downloded: 1M");
		label_19.setBounds(149, 499, 99, 14);
		frame.getContentPane().add(label_19);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(102, 0, 51));
		panel.setBounds(0, 608, 588, 120);
		frame.getContentPane().add(panel);
		
		JLabel label_20 = new JLabel("Also Find Us On");
		label_20.setForeground(new Color(255, 255, 255));
		label_20.setFont(new Font("Kalpurush", Font.PLAIN, 16));
		label_20.setBounds(10, 11, 134, 14);
		panel.add(label_20);
		
		JLabel label_21 = new JLabel("Contact Us:");
		label_21.setForeground(new Color(255, 255, 255));
		label_21.setFont(new Font("Kalpurush", Font.PLAIN, 14));
		label_21.setBounds(10, 58, 77, 14);
		panel.add(label_21);
		
		JLabel label_22 = new JLabel("Email: abc987@yahoo.com");
		label_22.setForeground(new Color(255, 255, 255));
		label_22.setBounds(111, 59, 170, 14);
		panel.add(label_22);
		
		JLabel label_23 = new JLabel("Website: www.localaapstore.com");
		label_23.setForeground(new Color(255, 255, 255));
		label_23.setBounds(111, 84, 213, 14);
		panel.add(label_23);
		
		JLabel label_24 = new JLabel("New label");
		label_24.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\fb-art.jpg"));
		label_24.setBounds(166, 0, 33, 31);
		panel.add(label_24);
		
		JLabel label_25 = new JLabel("New label");
		label_25.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\download.png"));
		label_25.setBounds(209, 0, 33, 31);
		panel.add(label_25);
		
		JLabel label_26 = new JLabel("New label");
		label_26.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\google-plus.png"));
		label_26.setBounds(248, 0, 33, 31);
		panel.add(label_26);
		
		JLabel label_27 = new JLabel("New label");
		label_27.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\12576752211189733180Minduka_RSS_icon_3.svg.hi.png"));
		label_27.setBounds(291, 0, 33, 31);
		panel.add(label_27);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(102, 0, 51));
		panel_1.setBounds(0, 0, 602, 63);
		frame.getContentPane().add(panel_1);
		
		JLabel lblGames = new JLabel("Games");
		lblGames.setForeground(new Color(255, 255, 255));
		lblGames.setBounds(269, 11, 263, 41);
		panel_1.add(lblGames);
		lblGames.setFont(new Font("Arial", Font.BOLD, 19));
		lblGames.setBackground(new Color(255, 222, 173));
		
		JLabel label_33 = new JLabel("New label");
		label_33.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\gaming-console-silhouette_318-33875.png"));
		label_33.setBounds(220, 11, 46, 41);
		panel_1.add(label_33);
		
		JLabel label_28 = new JLabel("      .");
		label_28.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_28.setBounds(9, 100, 46, 14);
		frame.getContentPane().add(label_28);
		
		JLabel label_29 = new JLabel("      .");
		label_29.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_29.setBounds(9, 202, 46, 14);
		frame.getContentPane().add(label_29);
		
		JLabel label_30 = new JLabel("      .");
		label_30.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_30.setBounds(9, 294, 46, 14);
		frame.getContentPane().add(label_30);
		
		JLabel label_31 = new JLabel("      .");
		label_31.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_31.setBounds(9, 381, 46, 14);
		frame.getContentPane().add(label_31);
		
		JLabel label_32 = new JLabel("      .");
		label_32.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_32.setBounds(9, 465, 46, 14);
		frame.getContentPane().add(label_32);
	}

}
