import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Main {

	private JFrame frame;
	private JTextField txtFieldHi;

	/**
	 * Launch the application.
	 */
	public static void openMain() {
		EventQueue.invokeLater(new Runnable() {			
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}
	public static String sayHi(){
		String word = "Hi!" + "" ;
		return word;
		//Hej
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(422, 11, 12, 239);
		frame.getContentPane().add(scrollPane);
		
		
		JButton btnNewButton = new JButton("Push for help");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtFieldHi.setText(sayHi());
				
			}
		});
		btnNewButton.setBounds(103, 47, 161, 23);
		frame.getContentPane().add(btnNewButton);
		
		txtFieldHi = new JTextField();
		txtFieldHi.setBounds(145, 103, 86, 20);
		frame.getContentPane().add(txtFieldHi);
		txtFieldHi.setColumns(10);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(JOptionPane.showConfirmDialog(frame,"Do you want to exist", "Exit", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(296, 205, 89, 23);
		frame.getContentPane().add(btnExit);
	}
}
