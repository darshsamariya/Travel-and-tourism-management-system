package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
public class Viewdetails extends JFrame implements ActionListener {
JButton b1;
	Viewdetails(String us)
	{
		setLayout(null);
		setBounds(400,200,900,700);
		getContentPane().setBackground(Color.WHITE);
		JLabel l11=new JLabel("VIEW DETAILS");
		l11.setBounds(320,20,300,40);
		l11.setFont(new Font("RaleWay",Font.BOLD,30));
		add(l11);
		
		JLabel l1=new JLabel("Username:");
		l1.setBounds(50,90,150,20);
		l1.setFont(new Font("Tahoma",Font.ITALIC,15));
		add(l1);
		
		JLabel l1x=new JLabel();
		l1x.setBounds(200,90,180,20);
		l1x.setFont(new Font("Tahoma",Font.BOLD,14));
		add(l1x);
		
		JLabel l2=new JLabel("Name:");
		l2.setBounds(50,150,150,20);
		l2.setFont(new Font("Tahoma",Font.ITALIC,15));
		add(l2);
		
		JLabel l2x=new JLabel();
		l2x.setBounds(200,150,180,20);
		l2x.setFont(new Font("Tahoma",Font.BOLD,14));
		add(l2x);
		
		JLabel l3=new JLabel("Gender:");
		l3.setBounds(50,210,150,20);
		l3.setFont(new Font("Tahoma",Font.ITALIC,15));
		add(l3);
		
		JLabel l3x=new JLabel();
		l3x.setBounds(200,210,180,20);
		l3x.setFont(new Font("Tahoma",Font.BOLD,14));
		add(l3x);
		
		JLabel l4=new JLabel("Phone No:");
		l4.setBounds(50,270,150,20);
		l4.setFont(new Font("Tahoma",Font.ITALIC,15));
		add(l4);
		
		JLabel l4x=new JLabel();
		l4x.setBounds(200,270,180,20);
		l4x.setFont(new Font("Tahoma",Font.BOLD,14));
		add(l4x);
		
		JLabel l5=new JLabel("ID:");
		l5.setBounds(455,90,150,20);
		l5.setFont(new Font("Tahoma",Font.ITALIC,15));
		add(l5);
		
		JLabel l5x=new JLabel();
		l5x.setBounds(600,90,180,20);
		l5x.setFont(new Font("Tahoma",Font.BOLD,14));
		add(l5x);
		
		JLabel l6=new JLabel("ID No:");
		l6.setBounds(450,150,150,20);
		l6.setFont(new Font("Tahoma",Font.ITALIC,15));
		add(l6);
		
		JLabel l6x=new JLabel();
		l6x.setBounds(600,150,180,20);
		l6x.setFont(new Font("Tahoma",Font.BOLD,14));
		add(l6x);
		
		JLabel l7=new JLabel("Country:");
		l7.setBounds(450,210,150,20);
		l7.setFont(new Font("Tahoma",Font.ITALIC,15));
		add(l7);
		
		JLabel l7x=new JLabel();
		l7x.setBounds(600,210,180,20);
		l7x.setFont(new Font("Tahoma",Font.BOLD,14));
		add(l7x);
		
		JLabel l8=new JLabel("Email:");
		l8.setBounds(450,270,150,20);
		l8.setFont(new Font("Tahoma",Font.ITALIC,15));
		add(l8);
		
		JLabel l8x=new JLabel();
		l8x.setBounds(600,270,280,20);
		l8x.setFont(new Font("Tahoma",Font.BOLD,14));
		add(l8x);
		
		b1=new JButton("Back");
		b1.setBounds(370,350,100,34);
		b1.setBackground(new Color(0,0,102));
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("Tahoma",Font.BOLD,20));
		add(b1);
		b1.addActionListener(this);
		
		JPanel p2=new JPanel();
		p2.setLayout(null);
		p2.setBackground(Color.WHITE);
		p2.setBounds(0,450,900,350);
		add(p2);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/viewall.jpg"));
		Image i2=i1.getImage().getScaledInstance(900,150,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l9=new JLabel(i3);
		l9.setBounds(0,10,900,150);
		p2.add(l9);
		
		try
		{
			conn c=new conn();
			String sql="select * from customer where username='"+us+"'";
			ResultSet rs=c.s.executeQuery(sql);
			while(rs.next())
			{
				l1x.setText(rs.getString("username"));
				l2x.setText(rs.getString("name"));
				l3x.setText(rs.getString("gender"));
				l4x.setText(rs.getString("phone"));
				l5x.setText(rs.getString("id"));
				l6x.setText(rs.getString("number"));
				l7x.setText(rs.getString("country"));
				l8x.setText(rs.getString("email"));
			}
			
			
		}
		catch(Exception e)
		{
			
		}
	}
	public static void main(String args[])
	{
		new Viewdetails("").setVisible(true);
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
