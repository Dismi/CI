package CICategorization;

//package jtextfielddemo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Point;

public class LoginPage {

	private JFrame ServiceNow;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.ServiceNow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ServiceNow = new JFrame();
		ServiceNow.setLocation(50, 50);
		ServiceNow.setSize(new Dimension(450, 300));
		ServiceNow.getContentPane().setSize(new Dimension(1200, 500));
		ServiceNow.getContentPane().setLocation(new Point(50, 50));
		ServiceNow.setLocation(new Point(50, 50));
		ServiceNow.setResizable(false);
		ServiceNow.setTitle("Incident Categorization");
//		ServiceNow.setBounds(1200, 500, 450, 300);
		ServiceNow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ServiceNow.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ServiceNow Ticket Details");
		lblNewLabel.setBounds(147, 16, 194, 20);
		ServiceNow.getContentPane().add(lblNewLabel);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(59, 69, 69, 20);
		ServiceNow.getContentPane().add(lblLogin);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(59, 117, 69, 20);
		ServiceNow.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(222, 66, 146, 26);
		ServiceNow.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(222, 114, 146, 26);
		ServiceNow.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = textField.getText();
				String password = textField.getText();
				
				if(username.contentEquals("admin") && password.contentEquals("admin"))
				{
					
					MainPage.main(null);
				}
				else if (username.contentEquals("emp") && password.contentEquals("emp"))
				{
					MainPage.main(null);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnLogin.setBounds(79, 197, 115, 29);
		ServiceNow.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				passwordField.setText(null);
			}
		});
		btnReset.setBounds(256, 197, 115, 29);
		ServiceNow.getContentPane().add(btnReset);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(15, 36, 398, 2);
		ServiceNow.getContentPane().add(separator);
	}
}

