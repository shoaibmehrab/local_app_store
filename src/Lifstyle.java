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

public class Lifstyle {

	public JFrame frame;
	public static install install=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lifstyle window = new Lifstyle();
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
	public Lifstyle() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 589, 702);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnLifestyleGroup = new JButton("Lifestyle Group");
		btnLifestyleGroup.setFont(new Font("Arial", Font.PLAIN, 15));
		btnLifestyleGroup.setBackground(new Color(204, 204, 153));
		btnLifestyleGroup.setBounds(52, 187, 183, 46);
		frame.getContentPane().add(btnLifestyleGroup);
		
		JButton btnModernTrends = new JButton("Modern Trends");
		btnModernTrends.setFont(new Font("Arial", Font.PLAIN, 15));
		btnModernTrends.setBackground(new Color(204, 204, 153));
		btnModernTrends.setBounds(52, 104, 183, 46);
		frame.getContentPane().add(btnModernTrends);
		
		JButton btnYogaAndHelth = new JButton("Yoga and Helth Tips");
		btnYogaAndHelth.setFont(new Font("Arial", Font.PLAIN, 15));
		btnYogaAndHelth.setBackground(new Color(204, 204, 153));
		btnYogaAndHelth.setBounds(52, 277, 183, 46);
		frame.getContentPane().add(btnYogaAndHelth);
		
		JButton btnFreehandExercise = new JButton("Freehand Exercise");
		btnFreehandExercise.setFont(new Font("Arial", Font.PLAIN, 15));
		btnFreehandExercise.setBackground(new Color(204, 204, 153));
		btnFreehandExercise.setBounds(52, 369, 183, 41);
		frame.getContentPane().add(btnFreehandExercise);
		
		JButton button_4 = new JButton("Install");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				install install = new install();
				install.frame.setVisible(true);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_4.setBackground(new Color(245, 245, 220));
		button_4.setBounds(409, 379, 89, 23);
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
		button_5.setBounds(409, 290, 89, 23);
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
		button_6.setBounds(409, 198, 89, 23);
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
		button_7.setBounds(409, 117, 89, 23);
		frame.getContentPane().add(button_7);
		
		JLabel label = new JLabel("Ratings:");
		label.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label.setBounds(299, 94, 52, 41);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("*****");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_1.setBounds(298, 136, 71, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Ratings:");
		label_2.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_2.setBounds(299, 175, 52, 41);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("*****");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_3.setBounds(298, 217, 71, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Ratings:");
		label_4.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_4.setBounds(299, 267, 52, 41);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("*****");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_5.setBounds(298, 309, 71, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Ratings:");
		label_6.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_6.setBounds(299, 354, 52, 41);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("***");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_7.setBounds(298, 396, 71, 14);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("Size: 13.3MB");
		label_8.setFont(new Font("Century Gothic", Font.BOLD, 11));
		label_8.setBounds(52, 150, 86, 14);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("Downloded: 1M");
		label_9.setBounds(136, 151, 99, 14);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("Size: 13.3MB");
		label_10.setFont(new Font("Century Gothic", Font.BOLD, 11));
		label_10.setBounds(52, 235, 86, 14);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("Downloded: 1M");
		label_11.setBounds(136, 236, 99, 14);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("Size: 13.3MB");
		label_12.setFont(new Font("Century Gothic", Font.BOLD, 11));
		label_12.setBounds(52, 324, 86, 14);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("Downloded: 1M");
		label_13.setBounds(136, 325, 99, 14);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("Size: 13.3MB");
		label_14.setFont(new Font("Century Gothic", Font.BOLD, 11));
		label_14.setBounds(52, 409, 86, 14);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("Downloded: 1M");
		label_15.setBounds(136, 410, 99, 14);
		frame.getContentPane().add(label_15);
		
		JButton button = new JButton("Go to Home");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				App_store.lifstyle.frame.setVisible(false);
				App_store.app_store.frame.setVisible(true);
			}
		});
		button.setBackground(Color.ORANGE);
		button.setBounds(52, 489, 106, 23);
		frame.getContentPane().add(button);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBackground(new Color(153, 153, 0));
		panel.setBounds(0, 543, 573, 120);
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
		label_22.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\google-plus.png"));
		label_22.setBounds(248, 0, 33, 31);
		panel.add(label_22);
		
		JLabel label_23 = new JLabel("New label");
		label_23.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\12576752211189733180Minduka_RSS_icon_3.svg.hi.png"));
		label_23.setBounds(291, 0, 33, 31);
		panel.add(label_23);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(153, 153, 0));
		panel_1.setBounds(0, 0, 573, 54);
		frame.getContentPane().add(panel_1);
		
		JLabel lblLifestyle = new JLabel("Lifestyle");
		lblLifestyle.setBounds(251, 11, 92, 41);
		panel_1.add(lblLifestyle);
		lblLifestyle.setFont(new Font("Arial", Font.BOLD, 19));
		lblLifestyle.setBackground(new Color(255, 222, 173));
		
		JLabel label_28 = new JLabel("New label");
		label_28.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\lifestyle_tv_logo_in_print.jpg"));
		label_28.setBounds(201, 11, 46, 33);
		panel_1.add(label_28);
		
		JLabel label_24 = new JLabel("      .");
		label_24.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_24.setBounds(0, 119, 46, 14);
		frame.getContentPane().add(label_24);
		
		JLabel label_25 = new JLabel("      .");
		label_25.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_25.setBounds(0, 201, 46, 14);
		frame.getContentPane().add(label_25);
		
		JLabel label_26 = new JLabel("      .");
		label_26.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_26.setBounds(0, 292, 46, 14);
		frame.getContentPane().add(label_26);
		
		JLabel label_27 = new JLabel("      .");
		label_27.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_27.setBounds(0, 380, 46, 14);
		frame.getContentPane().add(label_27);
	}

}
