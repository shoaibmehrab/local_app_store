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

public class Entertainment {

	public JFrame frame;
	public static install install=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Entertainment window = new Entertainment();
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
	public Entertainment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 619, 713);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnTopTvSeries = new JButton("Top TV Series");
		btnTopTvSeries.setFont(new Font("Arial", Font.PLAIN, 15));
		btnTopTvSeries.setBackground(new Color(250, 250, 210));
		btnTopTvSeries.setBounds(78, 291, 183, 46);
		frame.getContentPane().add(btnTopTvSeries);
		
		JButton btnTopCulturalFunction = new JButton("Top Cultural Function");
		btnTopCulturalFunction.setFont(new Font("Arial", Font.PLAIN, 15));
		btnTopCulturalFunction.setBackground(new Color(250, 250, 210));
		btnTopCulturalFunction.setBounds(78, 384, 183, 41);
		frame.getContentPane().add(btnTopCulturalFunction);
		
		JButton btnImdbTop = new JButton("IMDB Top 100");
		btnImdbTop.setFont(new Font("Arial", Font.PLAIN, 15));
		btnImdbTop.setBackground(new Color(250, 250, 210));
		btnImdbTop.setBounds(78, 100, 183, 46);
		frame.getContentPane().add(btnImdbTop);
		
		JButton btnGrammyAward = new JButton("Grammy Award");
		btnGrammyAward.setFont(new Font("Arial", Font.PLAIN, 15));
		btnGrammyAward.setBackground(new Color(250, 250, 210));
		btnGrammyAward.setBounds(78, 197, 183, 46);
		frame.getContentPane().add(btnGrammyAward);
		
		JLabel label = new JLabel("***");
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		label.setBounds(308, 132, 71, 14);
		frame.getContentPane().add(label);
		
		JButton button = new JButton("Install");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				install install = new install();
				install.frame.setVisible(true);
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBackground(new Color(245, 245, 220));
		button.setBounds(419, 113, 89, 23);
		frame.getContentPane().add(button);
		
		JLabel label_1 = new JLabel("Ratings:");
		label_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_1.setBounds(309, 90, 52, 41);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("*****");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_2.setBounds(303, 229, 71, 14);
		frame.getContentPane().add(label_2);
		
		JButton button_1 = new JButton("Install");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				install install = new install();
				install.frame.setVisible(true);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_1.setBackground(new Color(245, 245, 220));
		button_1.setBounds(419, 208, 89, 23);
		frame.getContentPane().add(button_1);
		
		JLabel label_3 = new JLabel("Ratings:");
		label_3.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_3.setBounds(303, 183, 52, 41);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("*****");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_4.setBounds(308, 323, 71, 14);
		frame.getContentPane().add(label_4);
		
		JButton button_2 = new JButton("Install");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				install install = new install();
				install.frame.setVisible(true);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_2.setBackground(new Color(245, 245, 220));
		button_2.setBounds(419, 302, 89, 23);
		frame.getContentPane().add(button_2);
		
		JLabel label_5 = new JLabel("Ratings:");
		label_5.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_5.setBounds(308, 277, 52, 41);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("***");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_6.setBounds(308, 411, 71, 14);
		frame.getContentPane().add(label_6);
		
		JButton button_3 = new JButton("Install");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				install install = new install();
				install.frame.setVisible(true);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_3.setBackground(new Color(245, 245, 220));
		button_3.setBounds(419, 392, 89, 23);
		frame.getContentPane().add(button_3);
		
		JLabel label_7 = new JLabel("Ratings:");
		label_7.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_7.setBounds(308, 367, 52, 41);
		frame.getContentPane().add(label_7);
		
		JLabel lblSizemb = new JLabel("Size: 3.3MB");
		lblSizemb.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblSizemb.setBounds(78, 150, 86, 14);
		frame.getContentPane().add(lblSizemb);
		
		JLabel lblDownlodedm = new JLabel("Downloded: 1.5M");
		lblDownlodedm.setBounds(162, 151, 99, 14);
		frame.getContentPane().add(lblDownlodedm);
		
		JLabel lblSizemb_1 = new JLabel("Size: 10.8MB");
		lblSizemb_1.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblSizemb_1.setBounds(78, 245, 86, 14);
		frame.getContentPane().add(lblSizemb_1);
		
		JLabel lblDownlodedm_1 = new JLabel("Downloded: 3.5M");
		lblDownlodedm_1.setBounds(162, 246, 99, 14);
		frame.getContentPane().add(lblDownlodedm_1);
		
		JLabel lblSizemb_2 = new JLabel("Size: 9.3MB");
		lblSizemb_2.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblSizemb_2.setBounds(78, 344, 86, 14);
		frame.getContentPane().add(lblSizemb_2);
		
		JLabel lblDownlodedm_2 = new JLabel("Downloded: 3.6M");
		lblDownlodedm_2.setBounds(162, 345, 99, 14);
		frame.getContentPane().add(lblDownlodedm_2);
		
		JLabel lblSizemb_3 = new JLabel("Size: 12.4MB");
		lblSizemb_3.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblSizemb_3.setBounds(78, 429, 86, 14);
		frame.getContentPane().add(lblSizemb_3);
		
		JLabel lblDownlodedm_3 = new JLabel("Downloded: 13.5M");
		lblDownlodedm_3.setBounds(162, 430, 99, 14);
		frame.getContentPane().add(lblDownlodedm_3);
		
		JButton button_4 = new JButton("Go to Home");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				App_store.app_store.frame.setVisible(true);
				App_store.entertainment.frame.setVisible(false);
			}
		});
		button_4.setBackground(Color.ORANGE);
		button_4.setBounds(78, 509, 106, 23);
		frame.getContentPane().add(button_4);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBackground(new Color(255, 0, 51));
		panel.setBounds(0, 554, 603, 120);
		frame.getContentPane().add(panel);
		
		JLabel label_16 = new JLabel("Also Find Us On");
		label_16.setForeground(Color.BLACK);
		label_16.setFont(new Font("Kalpurush", Font.PLAIN, 16));
		label_16.setBounds(10, 11, 134, 14);
		panel.add(label_16);
		
		JLabel label_17 = new JLabel("Contact Us:");
		label_17.setForeground(Color.BLACK);
		label_17.setFont(new Font("Kalpurush", Font.PLAIN, 14));
		label_17.setBounds(10, 58, 77, 14);
		panel.add(label_17);
		
		JLabel label_18 = new JLabel("Email: abc987@yahoo.com");
		label_18.setForeground(Color.BLACK);
		label_18.setBounds(111, 59, 170, 14);
		panel.add(label_18);
		
		JLabel label_19 = new JLabel("Website: www.localaapstore.com");
		label_19.setForeground(Color.BLACK);
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
		label_22.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\12576752211189733180Minduka_RSS_icon_3.svg.hi.png"));
		label_22.setBounds(248, 0, 33, 31);
		panel.add(label_22);
		
		JLabel label_23 = new JLabel("New label");
		label_23.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\google-plus.png"));
		label_23.setBounds(291, 0, 33, 31);
		panel.add(label_23);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(255, 0, 51));
		panel_1.setBounds(0, 0, 603, 64);
		frame.getContentPane().add(panel_1);
		
		JLabel lblEntertainment = new JLabel("Entertainment");
		lblEntertainment.setBounds(247, 11, 162, 41);
		panel_1.add(lblEntertainment);
		lblEntertainment.setFont(new Font("Arial", Font.BOLD, 19));
		lblEntertainment.setBackground(new Color(250, 250, 210));
		
		JLabel label_28 = new JLabel("New label");
		label_28.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\google-play-music-logo.jpg"));
		label_28.setBounds(191, 11, 46, 33);
		panel_1.add(label_28);
		
		JLabel label_24 = new JLabel("      .");
		label_24.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_24.setBounds(22, 113, 46, 14);
		frame.getContentPane().add(label_24);
		
		JLabel label_25 = new JLabel("      .");
		label_25.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_25.setBounds(22, 211, 46, 14);
		frame.getContentPane().add(label_25);
		
		JLabel label_26 = new JLabel("      .");
		label_26.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_26.setBounds(22, 305, 46, 14);
		frame.getContentPane().add(label_26);
		
		JLabel label_27 = new JLabel("      .");
		label_27.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_27.setBounds(22, 395, 46, 14);
		frame.getContentPane().add(label_27);
	}

}
