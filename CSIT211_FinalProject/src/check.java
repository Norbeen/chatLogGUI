//Final Programming Project

//Import statements
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.lang.String;
import java.util.Stack;

public class check
{
	//Main method. For now this is just going to be used as a driver to test code
	public static void main(String[] args) {
		//Variable declaration
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
		
		chatLog(Users, rand, incidents);
		System.out.println("");
		displayIncidents(incidents, incidentsOrder);
		
		
	} //End of main method


	//Definition for method to generate a chat log
	public static void chatLog(User[] Users, Random rand, Stack<String> incidents) {
		for (int i = 0; i < Users.length; i++) {
			Users[i].chatStart();
		}
		for (int i = 0; i <= 20; i++) {
			int u = rand.nextInt(3);
			Users[u].generateMessage();
			Users[u].check();
			Users[u].separate();
		Users[u].censor(incidents);
			System.out.println(Users[u].nameCheck() + ": " + Users[u].censoredChat());
			Users[u].clear();
		} //End of for loop to print out random quotes from random users
	} //End of chatLog method
	
	public static void displayIncidents(Stack<String> incidents, Stack<String> incidentsOrder) {
		if (!incidents.isEmpty()) {
			incidentsOrder.push(incidents.pop());
			displayIncidents(incidents, incidentsOrder);
			
			while (!incidentsOrder.isEmpty()) {
				System.out.println(incidentsOrder.pop());
			}
		}
	}

	//Going to flesh out the GUI here!
	class chatWindow extends JFrame {
	
	} //End of GUI definition
} //End of QuotesChat class definition
