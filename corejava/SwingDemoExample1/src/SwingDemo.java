import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SwingDemo implements ActionListener {
  
	JFrame f;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3,b4;
	
	public SwingDemo()
	{
		f=new JFrame("My New Swing");
		//f.setLayout(new FlowLayout());
		//f.setLayout(new GridLayout());
		f.setVisible(true);
		f.setSize(370, 450);
		f.setLayout(null);
		f.setResizable(false);
		l1=new JLabel("ID");
		l2=new JLabel("First Name");
		l3=new JLabel("Last Name");
		l4=new JLabel("Email");
		l5=new JLabel("Mobile No");
		
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		t4=new JTextField(20);
		t5=new JTextField(20);
		
	b1=new JButton("INSERT");
	b2=new JButton("SEARCH");
	b3=new JButton("UPDATE");
	b4=new JButton("DELETE");
	
	f.add(l1);
	f.add(t1);
	f.add(l2);
	f.add(t2);
	f.add(l3);
	f.add(t3);
	f.add(l4);
	f.add(t4);
	f.add(l5);
	f.add(t5);
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	
	
	l1.setBounds(50, 50, 100, 20);
	l2.setBounds(50, 100, 100, 20);
	l3.setBounds(50, 150, 100, 20);
	l4.setBounds(50, 200, 100, 20);
	l5.setBounds(50, 250, 100, 20);
	
	t1.setBounds(150, 50, 150, 20);
	t2.setBounds(150, 100, 150, 20);
	t3.setBounds(150, 150, 150, 20);
	t4.setBounds(150, 200, 150, 20);
	t5.setBounds(150, 250, 150, 20);
	
	b1.setBounds(50, 300, 100, 20);
	b2.setBounds(200, 300, 100, 20);
	b3.setBounds(50, 350, 100, 20);
	b4.setBounds(200, 350, 100, 20);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new SwingDemo();
	}

	
	public void actionPerformed(ActionEvent ae) {

if(ae.getSource()==b1)
{
	
		
	System.out.println("Database Created");
}
else if(ae.getSource()==b2)
{
	
	System.out.println("Database Created");
	
}
else if(ae.getSource()==b3)
{
	System.out.println("Update Clicked");
}
else if(ae.getSource()==b4)
{
	System.out.println("Delete Clicked");
}

}
		
	}


