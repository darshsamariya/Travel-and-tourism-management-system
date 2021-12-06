package travel.management.system;
import java.awt.Color;
import java.awt.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;
public class Addcustomer extends JFrame implements ActionListener{
JTextField t1,t2,t3,t4,t5,t6;
JComboBox c1;
JRadioButton r1,r2;
JButton b1,b2;
ButtonGroup g;
String us;
	Addcustomer(String username)
	{
		us=username;
		setBounds(550,250,850,650);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel l1=new JLabel("Username:");
		l1.setBounds(50,20,100,30);
		l1.setFont(new Font("Tahoma",Font.PLAIN,18));
		add(l1);
		
		t1=new JTextField();
		t1.setBounds(180,20,200,30);
		add(t1);
		
		JLabel l2=new JLabel("ID:");
		l2.setBounds(50,80,100,30);
		l2.setFont(new Font("Tahoma",Font.PLAIN,18));
		add(l2);
		
	 c1=new JComboBox(new String[] {"Passport","Addhar Card","Ration Card","Pan Card"} );
				c1.setBounds(180,80,200,30);
				add(c1);
				
				JLabel l3=new JLabel("Number:");
				l3.setBounds(50,140,100,30);
				l3.setFont(new Font("Tahoma",Font.PLAIN,18));
				add(l3);
				
				t2=new JTextField();
				t2.setBounds(180,140,200,30);
	   add(t2);
	   
	   JLabel l4=new JLabel("Name:");
		l4.setBounds(50,200,100,30);
		l4.setFont(new Font("Tahoma",Font.PLAIN,18));
		add(l4);
		
		t3=new JTextField();
		t3.setBounds(180,200,200,30);
		add(t3);
		
		JLabel l5=new JLabel("Gender:");
		l5.setBounds(50,260,100,30);
		l5.setFont(new Font("Tahoma",Font.PLAIN,18));
		add(l5);
		
		g=new ButtonGroup();  //grouping button so that one is selected
		r1=new JRadioButton("Male");
		r1.setBounds(200,260,70,30);
		r1.setBackground(Color.WHITE);
		add(r1);
		r2=new JRadioButton("Female");
		r2.setBounds(290,260,70,30);
		r2.setBackground(Color.WHITE);
		add(r2);
		g.add(r1);
		g.add(r2);
		
		JLabel l6=new JLabel("Country:");
		l6.setBounds(50,320,100,30);
		l6.setFont(new Font("Tahoma",Font.PLAIN,18));
		add(l6);
		
		t4=new JTextField();
		t4.setBounds(180,320,200,30);
		add(t4);

		JLabel l7=new JLabel("Phone No:");
		l7.setBounds(50,380,100,30);
		l7.setFont(new Font("Tahoma",Font.PLAIN,18));
		add(l7);
		
		t5=new JTextField();
		t5.setBounds(180,380,200,30);
		add(t5);
		
		JLabel l8=new JLabel("Email:");
		l8.setBounds(50,440,100,30);
		l8.setFont(new Font("Tahoma",Font.PLAIN,18));
		add(l8);
		
		t6=new JTextField();
		t6.setBounds(180,440,200,30);
		add(t6);
		
		b1=new JButton("ADD");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setBounds(100,520,100,40);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("BACK");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setBounds(260,520,100,40);
		b2.addActionListener(this);
		add(b2);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/newcustomer.jpg"));
		Image i2=i1.getImage().getScaledInstance(400,650,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l9=new JLabel(i3);
		l9.setBounds(450,10,400,650);
		add(l9);
			
	try {
		conn c=new conn();
		String sql="select * from account where username='"+us+"'";
		ResultSet rs=c.s.executeQuery(sql);
		while(rs.next())
		{
			t1.setText(rs.getString("username"));
			t3.setText(rs.getString("name"));
		}
	}
	catch(Exception e)
	{
		
	}
				
		
		
	}
	public static void main(String args[])
	{
		new Addcustomer("").setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent a) {
		
		// TODO Auto-generated method stub
		if(a.getSource()==b1)
		{
		String username=t1.getText();
		String id=(String)c1.getSelectedItem();
		String number=t2.getText();
		String name=t3.getText();
		String gender="";
		String country=t4.getText();
		String phone=t5.getText();
		String email=t6.getText();
		if(r1.isSelected())
		{
			gender="Male";
		}
		else if(r2.isSelected())
		{
			gender="Female";
		}
		String sql="insert into customer values('"+us+"', '"+id+"' , '"+number+"' ,'"+name+"' ,'"+gender+"' ,'"+country+"' ,'"+phone+"' ,'"+email+"')";
		try
		{
			conn c=new conn();
			c.s.executeUpdate(sql);
			JOptionPane.showMessageDialog(null,"Details Added successfully");
			this.setVisible(false);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,"An error Occured");
		}
		}
		else if(a.getSource()==b2)
		{
			this.setVisible(false);
		}
		
		
	}
}

