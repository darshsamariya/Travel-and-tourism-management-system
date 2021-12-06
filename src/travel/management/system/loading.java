package travel.management.system;
import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.sql.*;
public class loading extends JFrame implements Runnable {
 JProgressBar p;
 Thread t;
 static String us;
 public void run()
 {
	
		 try {
			 for(int i=1;i<101;i++)
			 {
				 int m=p.getMaximum();
				 int n=p.getValue();
				 if(n<m)
				 {
					 p.setValue(p.getValue()+1);
				 }
				 else
				 {
					 i=101;
					 setVisible(false);
				 }
				 Thread.sleep(50);
			}
			 this.setVisible(false);
			 new dashboard(us).setVisible(true);
		 }
		 catch(Exception e) {}
	 
 }
	loading(String username)
	{
		us=username;
		t=new Thread(this);
		setLayout(null);
		setBounds(500,300,850,500);
		setBackground(Color.WHITE);
		
		JLabel l1=new JLabel("Travel and Tourism Application");
		l1.setBounds(160,40,600,50);
		l1.setFont(new Font("RaleWay",Font.BOLD,34));
		l1.setForeground(Color.BLUE);
		add(l1);
		
		p=new JProgressBar();
		p.setBounds(260,110,300,30);
		p.setStringPainted(true);
		add(p);
		
		JLabel x=new JLabel("Please Wait.....");
		x.setBounds(350,150,200,30);
		x.setForeground(Color.RED);
		x.setFont(new Font("Tahoma",Font.BOLD,15));
		add(x);
		
		JLabel l3=new JLabel("Please wait "+username);
		l3.setBounds(40,400,300,30);
		l3.setForeground(Color.BLUE);
		l3.setFont(new Font("Tahoma",Font.PLAIN,20));
		add(l3);
		t.start();
		
	}
	
	public static void main(String args[])
	{
		new loading("").setVisible(true);
	
	}
}
