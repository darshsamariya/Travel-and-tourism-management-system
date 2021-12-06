package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class BookPackage extends JFrame implements ActionListener{
Choice c1;
JTextField t1;
JButton b1,b2,b3;
JLabel l16,l13,l14,l15;
String us;
	BookPackage(String us)
	{
		
		this.us=us;
		setBounds(600,240,1000,520);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		JLabel l1=new JLabel("Book Package");
		l1.setBounds(100,20,200,30);
		l1.setFont(new Font("Tahoma",Font.BOLD,20));
		add(l1);
		
		JLabel l2=new JLabel("Username:");
		l2.setBounds(30,80,100,30);
		add(l2);
		JLabel l12=new JLabel(us);
		l12.setBounds(150,80,100,30);
		add(l12);
		
		JLabel l3=new JLabel("Select Package:");
		l3.setBounds(30,130,100,30);
		add(l3);
		
		c1=new Choice();
		c1.add("Gold Package");
		c1.add("Silver Package");
		c1.add("Bronze Package");
		c1.setBounds(150,130,150,25);
		add(c1);
		
		JLabel l5=new JLabel("No of person:");
		l5.setBounds(30,180,100,30);
		add(l5);
		t1=new JTextField("1");
		t1.setBounds(150,180,125,25);
		add(t1);
		
		JLabel l4=new JLabel("ID:");
		l4.setBounds(30,230,150,20);
		add(l4);
		 l13=new JLabel();
		l13.setBounds(150,230,100,30);
		add(l13);
		
		JLabel l6=new JLabel("Number");
		l6.setBounds(30,280,150,20);
		add(l6);
	 l14=new JLabel();
		l14.setBounds(150,280,100,30);
		add(l14);
		
		JLabel l7=new JLabel("Phone");
		l7.setBounds(30,330,150,20);
		add(l7);
		l15=new JLabel();
		l15.setBounds(150,330,100,30);
		add(l15);
		
		JLabel l8=new JLabel("Total Price");
		l8.setBounds(30,380,150,20);
		add(l8);
		 l16=new JLabel();
		l16.setBounds(150,380,100,30);
		l16.setForeground(Color.RED);
		add(l16);
		
		try
		{
			conn c =new conn();
			ResultSet rs=c.s.executeQuery("select * from customer where username='"+us+"'");
			while(rs.next())
			{
				l13.setText(rs.getString("id"));
				l14.setText(rs.getString("number"));
				l15.setText(rs.getString("phone"));
			}
		}
		catch(Exception e)
		{
			
		}
		b1=new JButton("Check Price");
		b1.setBounds(30,420,150,30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("Book Package");
		b2.setBounds(190,420,150,30);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		add(b2);
		
		b3=new JButton("Back");
		b3.setBounds(350,420,150,30);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		b3.addActionListener(this );
		add(b3);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/bookpackage.jpg"));
		Image i2=i1.getImage().getScaledInstance(450,400,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l9=new JLabel(i3);
		l9.setBounds(530,20,450,400);
		add(l9);
	}
	public static void main(String args[])
	{
		new BookPackage("").setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent a) {
		// TODO Auto-generated method stub
		if(a.getSource()==b1)
		{
			String p=c1.getSelectedItem();
			int cost=0;
			if(p.equals("Gold Package"))
			{
				cost=12000;
			}
			else if(p.equals("Silver Package"))
			{
				cost=22000;
			}
			else if(p.equals("Bronze Package"))
			{
				cost=24000;
			}
			try
			{
				int t=Integer.parseInt(t1.getText());
				cost=cost*t;
				l16.setText("Rs "+cost);
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"No of person must be Int");
			}
			
			 
		}
		else if(a.getSource()==b2)
		{
			try
			{
				conn c=new conn();
				String query="insert into bookpackage values('"+us+"','"+c1.getSelectedItem()+"','"+t1.getText()+"','"+l13.getText()+"','"+l14.getText()+"','"+l15.getText()+"','"+l16.getText()+"')";
				System.out.println(query);
				c.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null,"Package Booked Successfully");
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"An error Occured");
			}
		}
		else if(a.getSource()==b3)
		{
			this.setVisible(false);
		}
	}
}
