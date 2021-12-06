package travel.management.system;
import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
public class signup extends JFrame implements ActionListener{
	JButton b1,b2;
	JTextField k1,k2,k5;
	JPasswordField k3;
	Choice c1;
	signup()
	{
		setLayout(null);
		setBounds(500,300,900,500);
		getContentPane().setBackground(Color.WHITE);
		JPanel p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(0,10,500,500);
		p1.setBackground(new Color(121,193,231));
		add(p1);
		JLabel l1=new JLabel("Username");
		l1.setBounds(50,70,100,25);
		l1.setFont(new Font("SAN_SERIF",Font.BOLD,14));
		p1.add(l1);
		
		 k1=new JTextField();
		k1.setBounds(200,70,200,25);
		k1.setBorder(BorderFactory.createEmptyBorder());
		p1.add(k1);

		JLabel l2=new JLabel("Name");
		l2.setBounds(50,130,100,25);
		l2.setFont(new Font("SAN_SERIF",Font.BOLD,14));
		p1.add(l2);
		
		 k2=new JTextField();
		k2.setBounds(200,130,200,25);
		k2.setBorder(BorderFactory.createEmptyBorder());
		p1.add(k2);
		
		JLabel l3=new JLabel("Password");
		l3.setBounds(50,190,100,25);
		l3.setFont(new Font("SAN_SERIF",Font.BOLD,14));
		p1.add(l3);
		
		 k3=new JPasswordField();
		k3.setBounds(200,190,200,25);
		k3.setBorder(BorderFactory.createEmptyBorder());
		p1.add(k3);
		
		JLabel l4=new JLabel("Security Question");
		l4.setBounds(50,250,150,25);
		l4.setFont(new Font("SAN_SERIF",Font.BOLD,14));
		p1.add(l4);
		
		 c1=new Choice();
		c1.add("Pet Name");
		c1.add("Favourite Movie");
		c1.add("High School name");
		c1.add("Fav charcater from Money Heist");
		c1.add("Fav City");
		c1.setBounds(200,250,200,25);
		p1.add(c1);
		
		JLabel l5=new JLabel("Answer");
		l5.setBounds(50,310,100,25);
		l5.setFont(new Font("SAN_SERIF",Font.BOLD,14));
		p1.add(l5);
		
		 k5=new JTextField();
		k5.setBounds(200,310,200,25);
		k5.setBorder(BorderFactory.createEmptyBorder());
		p1.add(k5);
		
		 b1=new JButton("Create");
		b1.setBounds(80,370,100,30);
		b1.setFont(new Font("SAN_SERIF",Font.BOLD,14));
		b1.setBackground(Color.WHITE);
		b1.addActionListener(this);
		b1.setForeground(Color.BLUE);
		p1.add(b1);
		
		 b2=new JButton("Back");
		b2.setBounds(280,370,100,30);
		b2.setFont(new Font("SAN_SERIF",Font.BOLD,14));
		b2.setBackground(Color.WHITE);
		b2.addActionListener(this);
		b2.setForeground(Color.BLUE);
		p1.add(b2);
		
		JPanel p2=new JPanel();
		p2.setBounds(500,10,400,500);
		p2.setLayout(null);
		p2.setBackground(Color.WHITE);
		add(p2);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/signup.png"));
		Image i2=i1.getImage().getScaledInstance(200,250,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel t1=new JLabel(i3);
		t1.setBounds(100,70,200,250);
         p2.add(t1);
	
	
	}
 public static void main(String args[])
 {
	 new signup().setVisible(true);;
 }
@Override
public void actionPerformed(ActionEvent a) {
	// TODO Auto-generated method stub
	if(a.getSource()==b1)
	{
		String username=k1.getText();
		String name=k2.getText();
		String password=k3.getText();
		String security=c1.getSelectedItem();
		String answer=k5.getText();
		//excecute query
		String query="insert into account values('"+username+"', '"+name+"', '"+password+"', '"+security+"', '"+answer+"')";
		try
		{

			conn c=new conn();
			c.s.executeUpdate(query); //execute query using statemnt
			JOptionPane.showMessageDialog(null,"Account Created Successfully");
			this.setVisible(false);
			new login().setVisible(true);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,"An error Occured");
		} 	 
		
	}
	else if(a.getSource()==b2)
	{
		this.setVisible(false);
		new login().setVisible(true);
		
	}
}
}
