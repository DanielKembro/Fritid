import java.awt.EventQueue;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface {

	private JFrame frame;
	private JTextField txtFieldPass;
	private JTextField txtFieldUser;
	static boolean x = false;
	private String user;
	private String pass;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				int selectedoption = JOptionPane.showOptionDialog(null, "Är du Daniel?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if(selectedoption == JOptionPane.YES_OPTION){
					x =true;
				}
				else{
					System.exit(0);
				}
				try {
					Interface window = new Interface();
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
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 263, 220);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//LOG IN
		
		txtFieldPass = new JTextField();
		txtFieldPass.setBackground(Color.RED);
		txtFieldPass.setBounds(107, 79, 107, 20);
		frame.getContentPane().add(txtFieldPass);
		txtFieldPass.setColumns(10);
		
		txtFieldUser = new JTextField();
		txtFieldUser.setBackground(Color.RED);
		txtFieldUser.setColumns(10);
		txtFieldUser.setBounds(107, 48, 107, 20);
		frame.getContentPane().add(txtFieldUser);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setForeground(Color.RED);
		lblUser.setFont(new Font("Year supply of fairy cakes", Font.PLAIN, 13));
		lblUser.setBounds(10, 38, 76, 28);
		frame.getContentPane().add(lblUser);
		
		JLabel lblPass = new JLabel("Password");
		lblPass.setForeground(Color.RED);
		lblPass.setFont(new Font("Year supply of fairy cakes", Font.PLAIN, 13));
		lblPass.setBounds(10, 71, 76, 31);
		frame.getContentPane().add(lblPass);
		
		JButton btnInit = new JButton("Initialize");
		btnInit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				user = txtFieldUser.getText(); 
				pass = txtFieldPass.getText();
				
				if (x==true){
				if(user.equals("Daniel") && pass.equals("KalleKula")){
					
					Main.openMain();
				}
				else{
					JOptionPane.showMessageDialog(null, "You've entered wrong user or password","", JOptionPane.INFORMATION_MESSAGE);
					txtFieldUser.setText("");
					txtFieldPass.setText("");
				}
			}
			}
		});
		btnInit.setBackground(Color.BLACK);
		btnInit.setForeground(Color.RED);
		btnInit.setFont(new Font("Year supply of fairy cakes", Font.BOLD, 10));
		btnInit.setBounds(107, 110, 107, 23);
		frame.getContentPane().add(btnInit);
		//END OF LOG in
	}
}
