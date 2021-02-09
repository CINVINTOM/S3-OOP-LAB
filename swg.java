import javax.swing.*;
import java.awt.*;

class swg 
{
	public static void main(String arg[])
	{
		 //Creating the Frame
        JFrame frame = new JFrame("Lets Chat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel labe = new JLabel("Hi I am THE COMPUTER");
	JButton send = new JButton("Say,Hallo");
      
	JLabel label = new JLabel("I am");
	JLabel abel = new JLabel("Nice to see you ");
        JTextField td = new JTextField(10);
	  JTextField tf = new JTextField(10); // accepts upto 10 characters
        
        JButton reset = new JButton("Bye");
        panel.add(labe);
	panel.add(send);
	panel.add(reset);
	panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
 	panel.add(abel);
	panel.add(td);
        
        panel.add(reset);


        //Adding Components to the frame.
       
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);
    }
}
	
