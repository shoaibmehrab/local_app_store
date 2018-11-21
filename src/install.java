import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class install {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public install() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInstalling = new JLabel("     Installing..........");
		lblInstalling.setForeground(new Color(107, 142, 35));
		lblInstalling.setFont(new Font("Arial", Font.BOLD, 14));
		lblInstalling.setBackground(new Color(255, 255, 255));
		lblInstalling.setBounds(230, 88, 123, 65);
		frame.getContentPane().add(lblInstalling);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Badhan Dass\\Desktop\\Project\\How-to-Install-Installous-5.jpg"));
		label.setBounds(161, 93, 60, 60);
		frame.getContentPane().add(label);
	}
}
