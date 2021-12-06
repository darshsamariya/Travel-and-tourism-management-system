package travel.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;
public class ViewPackage extends JFrame implements ActionListener {
	JButton b1;
	ViewPackage(String us)
	{
		setBounds(500,220,900,500);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		JLabel l1=new JLabel("View Package");
		l1.setBounds(130,0,200,30);
		l1.setFont(new Font("Tahoma",Font.BOLD,25));
		add(l1);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/bookedDetails.jpg"));
		Image i2=i1.getImage().getScaledInstance(450,400,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l2=new JLabel(i3);
		l2.setBounds(450,20,400,400);
		add(l2);
		
		JLabel l3=new JLabel("Username :");
		l3.setBounds(30,60,150,30);
		l3.setFont(new Font("RaleWay",Font.PLAIN,15));
		add(l3);
		JLabel l13=new JLabel(us);
		l13.setBounds(200,60,200,30);
		l13.setFont(new Font("RaleWay",Font.PLAIN,15));
		add(l13);
		
		JLabel l4=new JLabel("Package :");
		l4.setBounds(30,110,150,30);
		l4.setFont(new Font("RaleWay",Font.PLAIN,15));
		add(l4);
		JLabel l14=new JLabel();
		l14.setBounds(200,110,200,30);
		l14.setFont(new Font("RaleWay",Font.PLAIN,15));
		add(l14);
		
		JLabel l5=new JLabel("Total Person :");
		l5.setBounds(30,160,150,30);
		l5.setFont(new Font("RaleWay",Font.PLAIN,15));
		add(l5);
		JLabel l15=new JLabel();
		l15.setBounds(200,160,200,30);
		l15.setFont(new Font("RaleWay",Font.PLAIN,15));
		add(l15);
		
		JLabel l6=new JLabel("ID :");
		l6.setBounds(30,210,150,30);
		l6.setFont(new Font("RaleWay",Font.PLAIN,15));
		add(l6);
		JLabel l16=new JLabel();
		l16.setBounds(200,210,200,30);
		l16.setFont(new Font("RaleWay",Font.PLAIN,15));
		add(l16);
		
		JLabel l7=new JLabel("Number :");
		l7.setBounds(30,260,150,30);
		l7.setFont(new Font("RaleWay",Font.PLAIN,15));
		add(l7);
		JLabel l17=new JLabel();
		l17.setBounds(200,260,200,30);
		l17.setFont(new Font("RaleWay",Font.PLAIN,15));
		add(l17);
		
		JLabel l8=new JLabel("Phone :");
		l8.setBounds(30,310,150,30);
		l8.setFont(new Font("RaleWay",Font.PLAIN,15));
		add(l8);
		JLabel l18=new JLabel();
		l18.setBounds(200,310,200,30);
		l18.setFont(new Font("RaleWay",Font.PLAIN,15));
		add(l18);
		
		JLabel l9=new JLabel("Price :");
		l9.setBounds(30,360,150,30);
		l9.setFont(new Font("RaleWay",Font.PLAIN,15));
		add(l9);
		JLabel l19=new JLabel();
		l19.setBounds(200,360,200,30);
		l19.setFont(new Font("RaleWay",Font.PLAIN,15));
		add(l19);
		
		b1=new JButton("Back");
	    b1.setFont(new Font("RaleWay",Font.BOLD,17));
		b1.setBounds(150,400,120,30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		add(b1);
		
		try
		{
			conn c=new conn();
			String sql="select * from bookpackage where username='"+us+"'";
			ResultSet rs=c.s.executeQuery(sql);
			while(rs.next())
			{
				l14.setText(rs.getString("package"));
				l15.setText(rs.getString("person"));
				l16.setText(rs.getString("id"));
				l17.setText(rs.getString("number"));
				l18.setText(rs.getString("phone"));
				l19.setText(rs.getString("price"));
			}
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,"No package Booked");
		}
	}
	public static void main(String args[])
	{
		new ViewPackage("").setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent a) {
		// TODO Auto-generated method stub
		if(a.getSource()==b1)
		{
			this.setVisible(false);
		}
	}
}
