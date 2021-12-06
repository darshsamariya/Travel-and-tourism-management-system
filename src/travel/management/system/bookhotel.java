package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
public class bookhotel extends JFrame implements ActionListener{
JLabel l1,l2,l3,l4,l5,l6,l21,l12,l13,l14,l10,l11;
JTextField t1,t2,t3,t4,t5;
Choice c1,c2,c3;
JButton b1,b2,b3;
	bookhotel(String username)
	{
		setBounds(400,200,900,600);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/book.jpg"));
		Image i2=i1.getImage().getScaledInstance(450,500,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel y1=new JLabel(i3);
		y1.setBounds(450,20,450,500);
		add(y1);
		l1=new JLabel("Username:");
		l1.setBounds(30,20,150,20);
		l1.setFont(new Font("Tahoma",Font.BOLD,15));
		add(l1);
		
		 l11=new JLabel();
		 l11.setText(username);
		l11.setBounds(200,20,150,20);
		l11.setFont(new Font("Tahoma",Font.BOLD,15));
		add(l11);
		
		l2=new JLabel("Select Hotel:");
		l2.setBounds(30,60,150,20);
		l2.setFont(new Font("Tahoma",Font.BOLD,15));
		add(l2);
		
		c1=new Choice();
		try
		{
			conn c=new conn();
			ResultSet rs=c.s.executeQuery("select * from hotel");
			while(rs.next())
			{
				c1.add(rs.getString("name"));
			}
		}
		catch(Exception e) {}
		c1.setBounds(200,60,150,20);
		add(c1);
		
		l3=new JLabel("Total Person:");
		l3.setBounds(30,100,150,20);
		l3.setFont(new Font("Tahoma",Font.BOLD,15));
		add(l3);
		t1=new JTextField();
		t1.setBounds(200,100,150,20);
		add(t1);
		
		l4=new JLabel("No of Days:");
		l4.setBounds(30,140,150,20);
		l4.setFont(new Font("Tahoma",Font.BOLD,15));
		add(l4);
		t2=new JTextField();
		t2.setBounds(200,140,150,20);
		add(t2);
		
		l5=new JLabel("AC/NON AC:");
		l5.setBounds(30,180,150,20);
		l5.setFont(new Font("Tahoma",Font.BOLD,15));
		add(l5);
		c2=new Choice();
		c2.add("YES");
		c2.add("NO");
		c2.setBounds(200,180,150,20);
		add(c2);
		
		l6=new JLabel("Food Included:");
		l6.setBounds(30,220,150,20);
		l6.setFont(new Font("Tahoma",Font.BOLD,15));
		add(l6);
		c3=new Choice();
		c3.add("YES");
		c3.add("NO");
		c3.setBounds(200,220,150,20);
		add(c3);
		
		JLabel l7=new JLabel("ID:");
		l7.setBounds(30,260,150,20);
		l7.setFont(new Font("Tahoma",Font.BOLD,15));
		add(l7);
		
	     l21=new JLabel();
		l21.setBounds(200,260,150,20);
		l21.setFont(new Font("Tahoma",Font.BOLD,15));
		add(l21);
		
		JLabel l8=new JLabel("Passport:");
		l8.setBounds(30,300,150,20);
		l8.setFont(new Font("Tahoma",Font.BOLD,15));
		add(l8);
		
		l12=new JLabel();
		l12.setBounds(200,300,150,20);
		l12.setFont(new Font("Tahoma",Font.BOLD,15));
		add(l12);
		
		JLabel l9=new JLabel("Phone:");
		l9.setBounds(30,340,150,20);
		l9.setFont(new Font("Tahoma",Font.BOLD,15));
		add(l9);
		
		l13=new JLabel();
		l13.setBounds(200,340,150,20);
		l13.setFont(new Font("Tahoma",Font.BOLD,15));
		add(l13);
		
		 l10=new JLabel("Total Price:");
		l10.setBounds(30,380,150,20);
		l10.setFont(new Font("Tahoma",Font.BOLD,15));
		add(l10);
		
		l14=new JLabel();
		l14.setBounds(200,380,150,20);
		l14.setFont(new Font("Tahoma",Font.BOLD,15));
		add(l14);
		
		try
		{
			conn c=new conn();
			ResultSet rs=c.s.executeQuery("Select * from customer where username='"+username+"'");
			while(rs.next())
			{
				l21.setText(rs.getString("id"));
				l12.setText(rs.getString("number"));
				l13.setText(rs.getString("phone"));
			}
		}
		catch(Exception e)
		{
		   JOptionPane.showMessageDialog(null,"An error Occured");
		}
		b1=new JButton("Check Price");
		b1.setBounds(30,440,120,30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("Book Hotel");
		b2.setBounds(160,440,120,30);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		add(b2);
		
		b3=new JButton("Back");
		b3.setBounds(290,440,120,30);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		b3.addActionListener(this );
		add(b3);
		
	}
	public static void main(String args[])
	{
		new bookhotel("").setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent a) {
		// TODO Auto-generated method stub
		if(a.getSource()==b1)
		{
			try {
				conn c=new conn();
				ResultSet rs=c.s.executeQuery("select * from hotel where name='"+c1.getSelectedItem()+"'");
				int cost_per=0,food_per=0,ac_per=0;
				while(rs.next())
				{
				     cost_per=Integer.parseInt(rs.getString("cost_per_day"));
					 food_per=Integer.parseInt(rs.getString("food_charges"));
					 ac_per=Integer.parseInt(rs.getString("ac_charges"));
				}
				int person=Integer.parseInt(t1.getText());
				int day=Integer.parseInt(t2.getText());
				int total=0;
				if(person*day>0)
				{
			      total+=cost_per;
			      total+=c2.getSelectedItem().equals("YES")?ac_per:0;
			      total+=c3.getSelectedItem().equals("YES")?food_per:0;
			      total=total*person*day;
			      l14.setText(Integer.toString(total));
				}
				else
				{
					l14.setText("Invalid");
					l14.setForeground(Color.RED);
				}
			}
			
			catch(Exception e) {}
		}
		else if(a.getSource()==b2)
		{
			try {
			conn c=new conn();
			c.s.executeUpdate("insert into bookhotel values('"+l11.getText()+"','"+c1.getSelectedItem()+"','"+t1.getText()+"','"+t2.getText()+"','"+c2.getSelectedItem()+"','"+c3.getSelectedItem()+"','"+l21.getText()+"','"+l12.getText()+"','"+l13.getText()+"','"+l14.getText()+"')");
			JOptionPane.showMessageDialog(null,"Hotel Booked successfully");
			this.setVisible(false);
			}
			catch (Exception e)
			{}
		}
		else if(a.getSource()==b3)
		{
			this.setVisible(false);
		}
	}
}

