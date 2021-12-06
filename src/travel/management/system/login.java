package travel.management.system;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

import sun.net.www.content.text.plain;

import java.awt.*;
public class login extends JFrame implements ActionListener {
	JButton b1,b2,b3;
	JTextField t1;
	JPasswordField t2;
login()
{
	setLayout(null);
	setBounds(500,300,900,400);
	getContentPane().setBackground(Color.WHITE);

	JPanel p1=new JPanel();
	p1.setBackground(new Color(131,193,233));
	p1.setLayout(null);
	p1.setBounds(0,0,400,400);
	add(p1);
	ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/login.png"));
	Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
	ImageIcon i3=new ImageIcon(i2);
	JLabel l=new JLabel(i3);
	l.setBounds(50,40,300,300);
	p1.add(l);
	
	JPanel p2=new JPanel();
	p2.setBounds(400,20,450,320);
	p2.setLayout(null);
	add(p2);
	
	JLabel l1=new JLabel("Username");
	l1.setBounds(50,20,100,25);
	l1.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
	p2.add(l1);
	
	 t1=new JTextField();
	t1.setBounds(50,55,300,35);
	t1.setBorder(BorderFactory.createEmptyBorder());
	p2.add(t1);
	
	JLabel l2=new JLabel("Password");
	l2.setBounds(50,100,100,25);
	l2.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
	p2.add(l2);
	
	t2=new JPasswordField();   //for password
	t2.setBounds(50,130,300,35);
	t2.setBorder(BorderFactory.createEmptyBorder());
	p2.add(t2);

	 b1=new JButton("Login");
	b1.setBounds(60,200,130,30);
	b1.setForeground(Color.WHITE);
	b1.setBackground(new Color(133,193,231));
	b1.addActionListener(this);
	b1.setBorder(BorderFactory.createEmptyBorder());
	p2.add(b1);
	
	 b2=new JButton("SignUp");
	b2.setBounds(200,200,130,30);
	b2.setForeground(new Color(133,193,231));
	b2.setBackground(Color.WHITE);
	b2.addActionListener(this);
	b2.setBorder(new LineBorder(new Color(133,193,231)));
	p2.add(b2);
	
	 b3=new JButton("Forgot Password");
	b3.setBounds(130,250,130,30);
	b3.setForeground(new Color(133,193,231));
	b3.setBackground(Color.WHITE);
	b3.addActionListener(this);
	b3.setBorder(new LineBorder(new Color(133,193,231)));
	p2.add(b3);
	
}

public static void main(String args[])
{
	new login().setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	conn c=new conn();
	if(e.getSource()==b1)
	{
		try {
			String sql="select * from account where username='"+t1.getText()+"' and password='"+t2.getText()+"'";
			ResultSet rs=c.s.executeQuery(sql);
			if(rs.next())
			{
				this.setVisible(false);
				new loading(t1.getText()).setVisible(true);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Username or password incorrect");
			}
		}
		catch(Exception qw)
		{
			
		}
	
	}
	else if(e.getSource()==b2)
	{
		this.setVisible(false);
		new signup().setVisible(true);
		
	}
	else if(e.getSource()==b3)
	{
		this.setVisible(false);
		new forgetpassword().setVisible(true);
	}
	
}
}
