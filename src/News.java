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

public class News {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	
	public static install install=null;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					News window = new News();
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
	public News() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 598, 716);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnProthomAlo = new JButton("Prothom Alo");
		btnProthomAlo.setFont(new Font("Arial", Font.PLAIN, 15));
		btnProthomAlo.setBackground(new Color(204, 255, 102));
		btnProthomAlo.setBounds(61, 109, 183, 46);
		frame.getContentPane().add(btnProthomAlo);
		
		JButton btnKalerKontho = new JButton("Kaler Kontho");
		btnKalerKontho.setFont(new Font("Arial", Font.PLAIN, 15));
		btnKalerKontho.setBackground(new Color(204, 255, 102));
		btnKalerKontho.setBounds(61, 190, 183, 46);
		frame.getContentPane().add(btnKalerKontho);
		
		JButton btnTheDailyStar = new JButton("The Daily Star");
		btnTheDailyStar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnTheDailyStar.setBackground(new Color(204, 255, 102));
		btnTheDailyStar.setBounds(61, 282, 183, 46);
		frame.getContentPane().add(btnTheDailyStar);
		
		JButton btnTheNewAge = new JButton("The New Age");
		btnTheNewAge.setFont(new Font("Arial", Font.PLAIN, 15));
		btnTheNewAge.setBackground(new Color(204, 255, 102));
		btnTheNewAge.setBounds(61, 383, 183, 41);
		frame.getContentPane().add(btnTheNewAge);
		
		JLabel label = new JLabel("Ratings:");
		label.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label.setBounds(328, 97, 52, 41);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("*****");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_1.setBounds(327, 139, 71, 14);
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
		button.setBounds(438, 120, 89, 23);
		frame.getContentPane().add(button);
		
		JLabel label_2 = new JLabel("Ratings:");
		label_2.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_2.setBounds(328, 178, 52, 41);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("*****");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_3.setBounds(327, 220, 71, 14);
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
		button_1.setBounds(438, 201, 89, 23);
		frame.getContentPane().add(button_1);
		
		JLabel label_4 = new JLabel("Ratings:");
		label_4.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_4.setBounds(328, 270, 52, 41);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("*****");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_5.setBounds(327, 312, 71, 14);
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
		button_2.setBounds(438, 293, 89, 23);
		frame.getContentPane().add(button_2);
		
		JLabel label_6 = new JLabel("Ratings:");
		label_6.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_6.setBounds(328, 371, 52, 41);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("***");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_7.setBounds(327, 413, 71, 14);
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
		button_3.setBounds(438, 396, 89, 23);
		frame.getContentPane().add(button_3);
		
		JLabel label_8 = new JLabel("Size: 13.3MB");
		label_8.setFont(new Font("Century Gothic", Font.BOLD, 11));
		label_8.setBounds(61, 152, 86, 14);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("Downloded: 1M");
		label_9.setBounds(145, 153, 99, 14);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("Size: 13.3MB");
		label_10.setFont(new Font("Century Gothic", Font.BOLD, 11));
		label_10.setBounds(61, 233, 86, 14);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("Downloded: 1M");
		label_11.setBounds(145, 234, 99, 14);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("Size: 13.3MB");
		label_12.setFont(new Font("Century Gothic", Font.BOLD, 11));
		label_12.setBounds(61, 325, 86, 14);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("Downloded: 1M");
		label_13.setBounds(145, 326, 99, 14);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("Size: 13.3MB");
		label_14.setFont(new Font("Century Gothic", Font.BOLD, 11));
		label_14.setBounds(61, 424, 86, 14);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("Downloded: 1M");
		label_15.setBounds(145, 425, 99, 14);
		frame.getContentPane().add(label_15);
		
		JButton button_5 = new JButton("Go to Home");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				App_store.app_store.frame.setVisible(true);
				App_store.news.frame.setVisible(false);
			}
		});
		button_5.setBackground(Color.ORANGE);
		button_5.setBounds(50, 502, 106, 23);
		frame.getContentPane().add(button_5);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(0, 573, 588, 111);
		frame.getContentPane().add(panel);
		
		JLabel label_20 = new JLabel("Also Find Us On");
		label_20.setForeground(Color.BLACK);
		label_20.setFont(new Font("Kalpurush", Font.PLAIN, 16));
		label_20.setBounds(10, 11, 134, 14);
		panel.add(label_20);
		
		JLabel label_21 = new JLabel("Contact Us:");
		label_21.setForeground(Color.BLACK);
		label_21.setFont(new Font("Kalpurush", Font.PLAIN, 14));
		label_21.setBounds(10, 58, 77, 14);
		panel.add(label_21);
		
		JLabel label_22 = new JLabel("Email: abc987@yahoo.com");
		label_22.setForeground(Color.BLACK);
		label_22.setBounds(111, 59, 170, 14);
		panel.add(label_22);
		
		JLabel label_23 = new JLabel("Website: www.localaapstore.com");
		label_23.setForeground(Color.BLACK);
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
		panel_1.setBackground(new Color(220, 20, 60));
		panel_1.setBounds(0, 0, 588, 59);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewsAndMagazine = new JLabel("News and Magazine");
		lblNewsAndMagazine.setBounds(189, 11, 263, 41);
		panel_1.add(lblNewsAndMagazine);
		lblNewsAndMagazine.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewsAndMagazine.setBackground(new Color(255, 69, 0));
		
		JLabel label_28 = new JLabel("New label");
		label_28.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\market_red.png"));
		label_28.setBounds(133, 11, 46, 41);
		panel_1.add(label_28);
		
		JLabel label_16 = new JLabel("      .");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_16.setBounds(10, 122, 46, 14);
		frame.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("      .");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_17.setBounds(5, 204, 46, 14);
		frame.getContentPane().add(label_17);
		
		JLabel label_18 = new JLabel("      .");
		label_18.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_18.setBounds(5, 296, 46, 14);
		frame.getContentPane().add(label_18);
		
		JLabel label_19 = new JLabel("      .");
		label_19.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_19.setBounds(10, 394, 46, 14);
		frame.getContentPane().add(label_19);
	}
}
