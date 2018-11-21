import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;

import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Scrollbar;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;

public class App_store {

	public  JFrame frame;

	/**
	 * Launch the application.
	 */
	
	public static App_store app_store = null;
	
	public static Business business=null ;
	public static News news=null;
	public static Games games=null;
	public static Entertainment entertainment=null;
	public static Education education=null;
	public static Travel travel=null;
	public static Lifstyle lifstyle=null;
	public static Social social=null;
		
	
	
	public static void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 app_store = new App_store();
					 
					 app_store.frame.setVisible(true);
					 
					 
					 business = new Business();
					 social=new Social();
					 news =new News();
					education=new Education();
					games =new Games();
					lifstyle =new Lifstyle();
					entertainment =new Entertainment();
					travel=new Travel();
					
					
					 
					 
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App_store() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 520, 665);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnEducation = new JButton("Education");
		btnEducation.setFont(new Font("Arial Unicode MS", Font.PLAIN, 13));
		btnEducation.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				Education education = new Education();
//				education.frame.setVisible(true);
				education.frame.setVisible(true);
				app_store.frame.setVisible(false);
				
			}
		});
		btnEducation.setBackground(new Color(124, 252, 0));
		btnEducation.setBounds(290, 148, 161, 55);
		frame.getContentPane().add(btnEducation);
		
		JButton btnTravel = new JButton("Travel");
		btnTravel.setFont(new Font("Arial Unicode MS", Font.PLAIN, 13));
		btnTravel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				Travel travel = new Travel();
//				travel.frame.setVisible(true);
				travel.frame.setVisible(true);
				app_store.frame.setVisible(false);
				
			}
		});
		btnTravel.setBackground(new Color(173, 255, 47));
		btnTravel.setBounds(66, 248, 170, 46);
		frame.getContentPane().add(btnTravel);
		
		JButton btnGames = new JButton("Games");
		btnGames.setFont(new Font("Arial Unicode MS", Font.PLAIN, 13));
		btnGames .addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				Games games = new Games();
//				games.frame.setVisible(true);
				
				games.frame.setVisible(true);
				app_store.frame.setVisible(false);
				
			}
		});
		btnGames.setBackground(new Color(255, 215, 0));
		btnGames.setBounds(290, 248, 161, 46);
		frame.getContentPane().add(btnGames);
		
		JButton btnEntertainment = new JButton("Entertainment");
		btnEntertainment.setFont(new Font("Arial Unicode MS", Font.PLAIN, 13));
		btnEntertainment.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
//				Entertainment entertainment=new Entertainment();
//				entertainment.frame.setVisible(true);  
				entertainment.frame.setVisible(true);
				app_store.frame.setVisible(false);
				
			}
		});
		
		btnEntertainment.setBackground(new Color(255, 127, 80));
		btnEntertainment.setBounds(66, 334, 170, 46);
		frame.getContentPane().add(btnEntertainment);
		
		JButton btnBusiness = new JButton("Business & Finance");
		btnBusiness.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				business.frame.setVisible(true);
				app_store.frame.setVisible(false);
				
			}
		});
		btnBusiness.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		btnBusiness.setBackground(new Color(255, 245, 238));
		btnBusiness.setBounds(66, 148, 170, 55);
		frame.getContentPane().add(btnBusiness);
		
		JButton btnSocial = new JButton("Social");
		btnSocial.setFont(new Font("Arial Unicode MS", Font.PLAIN, 13));
		btnSocial.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				Social social =new Social();
//				social.frame.setVisible(true);
				social.frame.setVisible(true);
				app_store.frame.setVisible(false);
				
				
				
			}
		});
		btnSocial.setBackground(new Color(224, 255, 255));
		btnSocial.setBounds(290, 334, 161, 46);
		frame.getContentPane().add(btnSocial);
		
		JButton btnNewsAndMedia = new JButton("News and Media");
		btnNewsAndMedia.setFont(new Font("Arial Unicode MS", Font.PLAIN, 13));
		btnNewsAndMedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				News news =new News();
//				news.frame.setVisible(true);
				news.frame.setVisible(true);
				app_store.frame.setVisible(false);
			}
		});
		btnNewsAndMedia.setBackground(new Color(0, 255, 255));
		btnNewsAndMedia.setBounds(66, 418, 170, 46);
		frame.getContentPane().add(btnNewsAndMedia);
		
		
		
		JButton btnLifestyle = new JButton("Lifestyle");
		btnLifestyle.setFont(new Font("Arial Unicode MS", Font.PLAIN, 13));
		btnLifestyle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				Lifstyle lifstyle =new Lifstyle();
//				lifstyle.frame.setVisible(true);
				lifstyle.frame.setVisible(true);
				app_store.frame.setVisible(false);
			}
		});
		btnLifestyle.setBackground(new Color(210, 180, 140));
		btnLifestyle.setBounds(290, 418, 161, 46);
		frame.getContentPane().add(btnLifestyle);
		
		JLabel lblCatagory = new JLabel("Catagory");
		lblCatagory.setFont(new Font("Kalpurush", Font.BOLD, 19));
		lblCatagory.setBounds(66, 104, 130, 33);
		frame.getContentPane().add(lblCatagory);
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setForeground(new Color(255, 228, 181));
		scrollbar.setBounds(526, 1, 17, 569);
		frame.getContentPane().add(scrollbar);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(50, 205, 50));
		panel.setBounds(0, 1, 504, 68);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbWelcome = new JLabel("Welcome");
		lbWelcome.setForeground(new Color(255, 255, 255));
		lbWelcome.setFont(new Font("Kalpurush", Font.PLAIN, 16));
		lbWelcome.setBounds(193, 0, 72, 37);
		panel.add(lbWelcome);
		
		JLabel lblTo = new JLabel("to");
		lblTo.setForeground(new Color(255, 255, 255));
		lblTo.setFont(new Font("Kalpurush", Font.PLAIN, 15));
		lblTo.setBounds(240, 30, 46, 14);
		panel.add(lblTo);
		
		JLabel lblLocalAppStore = new JLabel("AppSHOP");
		lblLocalAppStore.setForeground(new Color(255, 255, 255));
		lblLocalAppStore.setFont(new Font("Kalpurush", Font.PLAIN, 16));
		lblLocalAppStore.setBounds(223, 48, 109, 14);
		panel.add(lblLocalAppStore);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\unnamed (1).png"));
		lblNewLabel_5.setBounds(137, 10, 46, 51);
		panel.add(lblNewLabel_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBackground(new Color(50, 205, 50));
		panel_1.setBounds(0, 506, 520, 120);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Also Find Us On");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Kalpurush", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 134, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\download.png"));
		lblNewLabel_1.setBounds(166, 4, 33, 31);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\fb-art.jpg"));
		lblNewLabel_2.setBounds(209, 4, 33, 31);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\12576752211189733180Minduka_RSS_icon_3.svg.hi.png"));
		lblNewLabel_3.setBounds(248, 4, 33, 31);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\google-plus.png"));
		lblNewLabel_4.setBounds(291, 4, 33, 31);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblContactUs = new JLabel("Contact Us:");
		lblContactUs.setForeground(new Color(255, 255, 255));
		lblContactUs.setFont(new Font("Kalpurush", Font.PLAIN, 14));
		lblContactUs.setBounds(10, 58, 77, 14);
		panel_1.add(lblContactUs);
		
		JLabel lblNewLabel_6 = new JLabel("Email: abc987@yahoo.com");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(111, 59, 170, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Website: www.localaapstore.com");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setBounds(111, 84, 213, 14);
		panel_1.add(lblNewLabel_7);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblCatagory, btnEducation, btnTravel, btnGames, btnEntertainment, btnBusiness, btnSocial, btnNewsAndMedia, btnLifestyle, scrollbar}));
	}
}
