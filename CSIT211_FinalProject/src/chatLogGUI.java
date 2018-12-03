import java.awt.EventQueue;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;

import javax.swing.GroupLayout.Alignment;

import java.util.Random;
import java.util.Stack;
import java.lang.String;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Stack;


public class chatLogGUI {

	
	private JFrame frmChatlog;
	private static JTextArea txtChat;
	private static JTextArea txtIncident;
	private static String list;
	private static User obj;
	private JTextArea txtBanned;
	private JButton btnGenerate;
	
	String chatlogs;
	String bannedStat;
	
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		User obj = new User();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chatLogGUI window = new chatLogGUI();
					window.frmChatlog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
		




	/**
	 * Create the application.
	 */
	public chatLogGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		
		Sam Sam = new Sam();
		Sarah Sarah = new Sarah();
		Sophia Sophia = new Sophia();
		
	
	 	User[] Users = new User[3];
		Random rand = new Random();
		
		Stack<String> incidents = new Stack<String>();
		Stack<String> incidentsOrder = new Stack<String>();
		
		//Stacks to show incidents
		
	
		
		frmChatlog = new JFrame();
		frmChatlog.getContentPane().setForeground(UIManager.getColor("Button.disabledText"));
		frmChatlog.setTitle("chatLog");
		frmChatlog.setBounds(100, 100, 1066, 701);
		frmChatlog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE CHATLOG CENSORSHIP");
		lblWelcomeToThe.setBounds(290, 16, 497, 47);
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(6, 75, 1060, 30);
		
		JLabel lblUserCensoredChat = new JLabel("BANNED USERS");
		lblUserCensoredChat.setBounds(875, 117, 154, 30);
		lblUserCensoredChat.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 System.exit(0);
			}
		});
		btnExit.setBounds(949, 6, 117, 29);
		frmChatlog.getContentPane().setLayout(null);
		frmChatlog.getContentPane().add(lblWelcomeToThe);
		frmChatlog.getContentPane().add(horizontalStrut);
		frmChatlog.getContentPane().add(lblUserCensoredChat);
		frmChatlog.getContentPane().add(btnExit);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setBounds(6, 639, 1054, 15);
		frmChatlog.getContentPane().add(horizontalStrut_1);

		
		JLabel lblNewLabel = new JLabel("GENERATE CHAT LOGS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(256, 105, 265, 55);
		frmChatlog.getContentPane().add(lblNewLabel);
		
		JTextArea txtChat = new JTextArea();
		txtChat.setForeground(new Color(153, 51, 51));
		txtChat.setRows(1);
		txtChat.setBounds(16, 184, 738, 220);
		frmChatlog.getContentPane().add(txtChat);
		
		JTextArea txtBanned = new JTextArea();
		txtBanned.setBounds(785, 184, 258, 220);
		frmChatlog.getContentPane().add(txtBanned);
		
		JTextArea txtIncident = new JTextArea();
		txtIncident.setBounds(16, 436, 1027, 190);
		frmChatlog.getContentPane().add(txtIncident);
		
		JButton btnGenerate_1 = new JButton("GENERATE");
		btnGenerate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Sam Sam = new Sam();
				Sarah Sarah = new Sarah();
				Sophia Sophia = new Sophia();
				User[] Users = new User[3];
				Random rand = new Random();
				//Stacks to show incidents
				Stack<String> incidents = new Stack<String>();
				
				Stack<String> incidentsOrder = new Stack<String>();
		
				
				//Populating the array of users
				Users[0] = Sam;
				Users[1] = Sarah;
				Users[2] = Sophia;
			
				String nameChe, cenS = null;
			
			 	for (int i = 0; i < Users.length; i++) {
								Users[i].chatStart();
							}
							for (int i = 0; i < 12; i++) {
								int u = rand.nextInt(3);
								Users[u].generateMessage();
								Users[u].check();
								Users[u].separate();
								Users[u].censor(incidents);
								nameChe = (Users[u].nameCheck());
								cenS= (Users[u].censoredChat());
								txtChat.append(nameChe + " : " + cenS + "\n");
																
								//txtChat.append(inci.toString());
								Users[u].clear();
							}
								while(!incidents.isEmpty()) {
									String result = "";
									incidentsOrder.push(incidents.pop());
								}
								String result="";
									while (!incidentsOrder.isEmpty()) {
										result += incidentsOrder.pop() +"\n";
									}
									//System.out.println("This is the result: "+ result);
									txtIncident.setText("\n"+ result);
								
							
							
							
							//txtIncident.setText(displayincidents.pop().toString() + "\n" + displayincidents.pop().toString());
							
						
							
						//	txtIncident.append(incidents.toString()+ "\n");
						
						
							
			for (int i=0; i < Users.length; i++) {
				txtBanned.append(Users[i].nameCheck() + "\t "  + Users[i].banCheck() + " \t" + Users[i].counterCheck() +  " " + "\n");
				txtBanned.append("");
				
			
				
			}
			
			
			

			
			}
		});
		btnGenerate_1.setBounds(6, 147, 117, 29);
		frmChatlog.getContentPane().add(btnGenerate_1);
		
		   
	
		
		JButton btnReset = new JButton("CLEAR");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtChat.setText("");
				txtIncident.setText("");
				txtBanned.setText("");
			}
		});
		btnReset.setBounds(122, 147, 81, 29);
		frmChatlog.getContentPane().add(btnReset);
		
		JLabel lblNewLabel_1 = new JLabel("\tUSER\t||    STATUS   || \t  OFFENCES");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_1.setBounds(775, 151, 268, 16);
		frmChatlog.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		
		Image img = new ImageIcon(this.getClass().getResource("/backGround.jpg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));
		
		lblNewLabel_2.setBounds(6, 6, 1060, 702);
		frmChatlog.getContentPane().add(lblNewLabel_2);
		
	}
	

		
	}


