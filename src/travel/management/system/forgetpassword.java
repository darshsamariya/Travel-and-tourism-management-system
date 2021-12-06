package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class forgetpassword extends JFrame implements ActionListener {
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3;
	Choice c1;
   forgetpassword()
   {
	   setLayout(null);
	   setBounds(450,250,900,500);
	   setBackground(Color.WHITE);
	   
	   JPanel p1=new JPanel();
	   p1.setLayout(null);
	   p1.setBounds(0,40,500,500);
	   add(p1);
	   JLabel l1=new JLabel("Username");
	   l1.setBounds(30,40,100,30);
	   l1.setFont(new Font("San_Serif",Font.BOLD,17));
	   p1.add(l1);
	   t1=new JTextField();
	   t1.setBounds(200,40,150,30);
	   t1.setBorder(BorderFactory.createEmptyBorder());
	   p1.add(t1);
	    b1=new JButton("Search");
	   b1.setBackground(Color.GRAY);
	   b1.setForeground(Color.WHITE);
	   b1.addActionListener(this);
	   b1.setBounds(370,40,100,30);
	   p1.add(b1);
	   
	   JLabel l2=new JLabel("Name");
	   l2.setBounds(30,100,100,30);
	   l2.setFont(new Font("San_Serif",Font.BOLD,17));
	   p1.add(l2);
	   t2=new JTextField();
	   t2.setBounds(200,100,200,30);
	   t2.setBorder(BorderFactory.createEmptyBorder());
	   p1.add(t2);
	   
	   JLabel l3=new JLabel("Security Question");
	   l3.setBounds(30,160,150,30);
	   l3.setFont(new Font("San_Serif",Font.BOLD,17));
	   p1.add(l3);
	   
	   t3=new JTextField();
	   t3.setBounds(200,160,200,30);
	   t3.setBorder(BorderFactory.createEmptyBorder());
	   p1.add(t3);
	 
	   
		JLabel l4=new JLabel("Answer");
		   l4.setBounds(30,220,100,30);
		   l4.setFont(new Font("San_Serif",Font.BOLD,17));
		   p1.add(l4);
		   t4=new JTextField();
		   t4.setBounds(200,220,150,30);
		   t4.setBorder(BorderFactory.createEmptyBorder());
		   p1.add(t4);
		    b2=new JButton("Retrive");  //b2
		   b2.setBackground(Color.GRAY);
		   b2.setForeground(Color.WHITE);
		   b2.addActionListener(this);
		   b2.setBounds(370,220,100,30);
		   p1.add(b2);
		
		   JLabel l5=new JLabel("Password");
		   l5.setBounds(30,280,100,30);
		   l5.setFont(new Font("San_Serif",Font.BOLD,17));
		   p1.add(l5);
		    t5=new JTextField();
		   t5.setBounds(200,280,200,30);
		   t5.setBorder(BorderFactory.createEmptyBorder());
		   p1.add(t5);
		   
		    b3=new JButton("Back");
		   b3.setBackground(Color.GRAY);
		   b3.setForeground(Color.WHITE);
		   b3.addActionListener(this);
		   b3.setBounds(190,340,100,30);
		   p1.add(b3);
		   
	   JPanel p2=new JPanel();
	   p2.setLayout(null);
	   p2.setBounds(500,0,400,500);
	   p2.setBackground(Color.WHITE);
	   add(p2);
	   ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/forgotpassword.jpg"));
	   Image i2=i1.getImage().getScaledInstance(250,300,Image.SCALE_DEFAULT);
	   ImageIcon i3=new ImageIcon(i2);
	   JLabel m1=new JLabel(i3);
	   m1.setBounds(0,20,400,400);
	   p2.add(m1);
	   
	   
   }
   
   public static void main(String args[])
   {
	   new forgetpassword().setVisible(true);
   }

@Override
public void actionPerformed(ActionEvent a) {
	// TODO Auto-generated method stub
	conn c =new conn();
	if(a.getSource()==b1)
	{
		try
		{
			String sql="select * from account where username='"+t1.getText()+"'";
			ResultSet rs=c.s.executeQuery(sql);
			while(rs.next())
			{
				t2.setText(rs.getString("name"));
				t3.setText(rs.getString("security"));
				
			}
		}
		catch(Exception e)
		{
			
		}
		
	}
	 if(a.getSource()==b2)
	{
		 try
			{
				String sql="select * from account where answer='"+t4.getText()+"' AND username='"+t1.getText()+"'";
				ResultSet rs=c.s.executeQuery(sql);
				while(rs.next())
				{
					t5.setText(rs.getString("password"));
				}
			}
			catch(Exception e)
			{
				
			}
	}
	if(a.getSource()==b3)
	{
		this.setVisible(false);
		new login().setVisible(true);
	}
	
}
}
