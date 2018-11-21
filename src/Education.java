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

public class Education {

	public JFrame frame;
	public static install install=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				
					Education education=new Education();
					education.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Education() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 595, 728);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnComicBookReader = new JButton("Comic Book Reader");
		btnComicBookReader.setFont(new Font("Arial", Font.PLAIN, 15));
		btnComicBookReader.setBackground(new Color(255, 153, 102));
		btnComicBookReader.setBounds(74, 115, 183, 46);
		frame.getContentPane().add(btnComicBookReader);
		
		JButton btnAudiobookPlayer = new JButton("Audiobook Player");
		btnAudiobookPlayer.setFont(new Font("Arial", Font.PLAIN, 15));
		btnAudiobookPlayer.setBackground(new Color(255, 153, 102));
		btnAudiobookPlayer.setBounds(74, 201, 183, 46);
		frame.getContentPane().add(btnAudiobookPlayer);
		
		JButton btnOxfordDictionary = new JButton("Oxford Dictionary");
		btnOxfordDictionary.setFont(new Font("Arial", Font.PLAIN, 15));
		btnOxfordDictionary.setBackground(new Color(255, 153, 102));
		btnOxfordDictionary.setBounds(74, 286, 183, 46);
		frame.getContentPane().add(btnOxfordDictionary);
		
		JButton btnThePeriodicTable = new JButton("The Periodic Table");
		btnThePeriodicTable.setFont(new Font("Arial", Font.PLAIN, 15));
		btnThePeriodicTable.setBackground(new Color(255, 153, 102));
		btnThePeriodicTable.setBounds(74, 380, 183, 41);
		frame.getContentPane().add(btnThePeriodicTable);
		
		JLabel label = new JLabel("Ratings:");
		label.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label.setBounds(309, 105, 52, 41);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("*****");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_1.setBounds(308, 147, 71, 14);
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
		button.setBounds(419, 128, 89, 23);
		frame.getContentPane().add(button);
		
		JLabel label_2 = new JLabel("Ratings:");
		label_2.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_2.setBounds(309, 186, 52, 41);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("*****");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_3.setBounds(308, 228, 71, 14);
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
		button_1.setBounds(419, 209, 89, 23);
		frame.getContentPane().add(button_1);
		
		JLabel label_4 = new JLabel("Ratings:");
		label_4.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_4.setBounds(309, 278, 52, 41);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("*****");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_5.setBounds(308, 320, 71, 14);
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
		button_2.setBounds(419, 301, 89, 23);
		frame.getContentPane().add(button_2);
		
		JLabel label_6 = new JLabel("Ratings:");
		label_6.setFont(new Font("Century Gothic", Font.BOLD, 14));
		label_6.setBounds(309, 365, 52, 41);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("***");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_7.setBounds(308, 407, 71, 14);
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
		button_3.setBounds(419, 390, 89, 23);
		frame.getContentPane().add(button_3);
		
		JLabel lblSizemb = new JLabel("Size: 11.3MB");
		lblSizemb.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblSizemb.setBounds(74, 163, 86, 14);
		frame.getContentPane().add(lblSizemb);
		
		JLabel lblDownlodedm_3 = new JLabel("Downloded: 1.34M");
		lblDownlodedm_3.setBounds(158, 164, 99, 14);
		frame.getContentPane().add(lblDownlodedm_3);
		
		JLabel lblSizemb_1 = new JLabel("Size: 10.3MB");
		lblSizemb_1.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblSizemb_1.setBounds(74, 247, 86, 14);
		frame.getContentPane().add(lblSizemb_1);
		
		JLabel lblDownlodedm_2 = new JLabel("Downloded: 1.88M");
		lblDownlodedm_2.setBounds(158, 248, 99, 14);
		frame.getContentPane().add(lblDownlodedm_2);
		
		JLabel lblSizemb_2 = new JLabel("Size: 14.2MB");
		lblSizemb_2.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblSizemb_2.setBounds(74, 336, 86, 14);
		frame.getContentPane().add(lblSizemb_2);
		
		JLabel lblDownlodedm_1 = new JLabel("Downloded: 1.6M");
		lblDownlodedm_1.setBounds(158, 337, 99, 14);
		frame.getContentPane().add(lblDownlodedm_1);
		
		JLabel lblSizemb_3 = new JLabel("Size: 20.4MB");
		lblSizemb_3.setFont(new Font("Century Gothic", Font.BOLD, 11));
		lblSizemb_3.setBounds(74, 420, 86, 14);
		frame.getContentPane().add(lblSizemb_3);
		
		JLabel lblDownlodedm = new JLabel("Downloded: 3.5M");
		lblDownlodedm.setBounds(158, 421, 99, 14);
		frame.getContentPane().add(lblDownlodedm);
		
		JButton button_4 = new JButton("Go to Home");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				App_store.app_store.frame.setVisible(true);
				App_store.education.frame.setVisible(false);
			}
		});
		button_4.setBackground(Color.ORANGE);
		button_4.setBounds(74, 508, 106, 23);
		frame.getContentPane().add(button_4);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBackground(new Color(34, 139, 34));
		panel.setBounds(0, 569, 588, 120);
		frame.getContentPane().add(panel);
		
		JLabel label_16 = new JLabel("Also Find Us On");
		label_16.setForeground(new Color(255, 255, 255));
		label_16.setFont(new Font("Kalpurush", Font.PLAIN, 16));
		label_16.setBounds(10, 11, 134, 14);
		panel.add(label_16);
		
		JLabel label_17 = new JLabel("Contact Us:");
		label_17.setForeground(Color.BLACK);
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
		label_22.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\12576752211189733180Minduka_RSS_icon_3.svg.hi.png"));
		label_22.setBounds(248, 0, 33, 31);
		panel.add(label_22);
		
		JLabel label_23 = new JLabel("New label");
		label_23.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\google-plus.png"));
		label_23.setBounds(291, 0, 33, 31);
		panel.add(label_23);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(51, 153, 51));
		panel_1.setBounds(0, 0, 579, 68);
		frame.getContentPane().add(panel_1);
		
		JLabel lblEducation = new JLabel("Education");
		lblEducation.setForeground(new Color(255, 255, 255));
		lblEducation.setBounds(239, 11, 263, 41);
		panel_1.add(lblEducation);
		lblEducation.setFont(new Font("Arial", Font.BOLD, 19));
		lblEducation.setBackground(new Color(255, 222, 173));
		
		JLabel label_28 = new JLabel("New label");
		label_28.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\education-logo-19190862.jpg"));
		label_28.setBounds(183, 6, 46, 57);
		panel_1.add(label_28);
		
		JLabel label_24 = new JLabel("      .");
		label_24.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_24.setBounds(25, 130, 46, 14);
		frame.getContentPane().add(label_24);
		
		JLabel label_25 = new JLabel("      .");
		label_25.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_25.setBounds(25, 215, 46, 14);
		frame.getContentPane().add(label_25);
		
		JLabel label_26 = new JLabel("      .");
		label_26.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_26.setBounds(25, 303, 46, 14);
		frame.getContentPane().add(label_26);
		
		JLabel label_27 = new JLabel("      .");
		label_27.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_27.setBounds(25, 392, 46, 14);
		frame.getContentPane().add(label_27);
	}

}
