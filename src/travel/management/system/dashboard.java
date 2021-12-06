package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class dashboard extends JFrame implements ActionListener{
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,u1,u2,u3,u4,u5;
static String us;
	dashboard(String username)
	{
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);
		us=username;
		
		JPanel p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(320,70,1600,1000);
		add(p1);
		
		JLabel l2=new JLabel("Travel and Tourism Management System");
		l2.setBounds(380,80,1000,80);
		l2.setFont(new Font("Tahoma",Font.BOLD,48));
		l2.setForeground(Color.WHITE);
		p1.add(l2);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/home.jpg"));
		Image i2=i1.getImage().getScaledInstance(1600,1000,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l1=new JLabel(i3);
		l1.setBounds(0,0,1600,1000);
		p1.add(l1);
		
		
		JPanel p2=new JPanel();
		p2.setLayout(null);
		p2.setBounds(0,0,1950,70);
		p2.setBackground(Color.RED);
		add(p2);
		JLabel l3=new JLabel("Dashboard");
		l3.setBounds(250,10,500,50);
		l3.setFont(new Font("San_Serif",Font.PLAIN,24));
		l3.setForeground(Color.WHITE);
		p2.add(l3);
		ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/oyo.png"));
		Image i22=i11.getImage().getScaledInstance(200,80,Image.SCALE_DEFAULT);
		ImageIcon i33=new ImageIcon(i22);
		JLabel l4=new JLabel(i33);
		l4.setBounds(0,0,200,80);
		p2.add(l4);
		
		JPanel p3=new JPanel();
		p3.setLayout(null);
		p3.setBounds(0,70,320,1000);
		p3.setBackground(new Color(133,193,231));
		add(p3);
		
		b1=new JButton("Add Personal Details");
		b1.setBackground(new Color(0,0,102));
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("RaleWay",Font.CENTER_BASELINE,24));
		b1.setBounds(0,0,320,60);
		b1.addActionListener(this);
		p3.add(b1);
		
		b2=new JButton("Update Personal Details");
		b2.setBackground(new Color(0,0,102));
		b2.setForeground(Color.WHITE);
		b2.setFont(new Font("RaleWay",Font.CENTER_BASELINE,24));
		b2.setBounds(0,60,320,60);
		b2.addActionListener(this);
		p3.add(b2);
		
		b3=new JButton("View Details");
		b3.setBackground(new Color(0,0,102));
		b3.setForeground(Color.WHITE);
		b3.setFont(new Font("RaleWay",Font.CENTER_BASELINE,24));
		b3.setBounds(0,120,320,60);
		b3.addActionListener(this);
		p3.add(b3);
		
		b4=new JButton("Delete Personal Details");
		b4.setBackground(new Color(0,0,102));
		b4.setForeground(Color.WHITE);
		b4.setFont(new Font("RaleWay",Font.CENTER_BASELINE,24));
		b4.setBounds(0,180,320,60);
		p3.add(b4);
		
		b5=new JButton("Check Package");
		b5.setBackground(new Color(0,0,102));
		b5.setForeground(Color.WHITE);
		b5.setFont(new Font("RaleWay",Font.CENTER_BASELINE,24));
		b5.setBounds(0,240,320,60);
		b5.addActionListener(this);
		p3.add(b5);
		
		b6=new JButton("Book Package");
		b6.setBackground(new Color(0,0,102));
		b6.setForeground(Color.WHITE);
		b6.setFont(new Font("RaleWay",Font.CENTER_BASELINE,24));
		b6.setBounds(0,300,320,60);
		b6.addActionListener(this);
		p3.add(b6);
		
		b7=new JButton("View Package");
		b7.setBackground(new Color(0,0,102));
		b7.setForeground(Color.WHITE);
		b7.setFont(new Font("RaleWay",Font.CENTER_BASELINE,24));
		b7.setBounds(0,360,320,60);
		b7.addActionListener(this);
		p3.add(b7);
		
		b8=new JButton("View Hotels");
		b8.setBackground(new Color(0,0,102));
		b8.setForeground(Color.WHITE);
		b8.setFont(new Font("RaleWay",Font.CENTER_BASELINE,24));
		b8.setBounds(0,420,320,60);
		b8.addActionListener(this);
		p3.add(b8);
		
		b9=new JButton("Book Hotels");
		b9.setBackground(new Color(0,0,102));
		b9.setForeground(Color.WHITE);
		b9.setFont(new Font("RaleWay",Font.CENTER_BASELINE,24));
		b9.setBounds(0,480,320,60);
		b9.addActionListener(this);
		p3.add(b9);
		
		b10=new JButton("View Booked Hotels");
		b10.setBackground(new Color(0,0,102));
		b10.setForeground(Color.WHITE);
		b10.setFont(new Font("RaleWay",Font.CENTER_BASELINE,24));
		b10.setBounds(0,540,320,60);
		p3.add(b10);
		
		u1=new JButton("Destination");
		u1.setBackground(new Color(0,0,102));
		u1.setForeground(Color.WHITE);
		u1.setFont(new Font("RaleWay",Font.CENTER_BASELINE,24));
		u1.setBounds(0,600,320,60);
		u1.addActionListener(this);
		p3.add(u1);
		
		u2=new JButton("Payment");
		u2.setBackground(new Color(0,0,102));
		u2.setForeground(Color.WHITE);
		u2.setFont(new Font("RaleWay",Font.CENTER_BASELINE,24));
		u2.setBounds(0,660,320,60);
		p3.add(u2);
		
		u3=new JButton("Calculator");
		u3.setBackground(new Color(0,0,102));
		u3.setForeground(Color.WHITE);
		u3.setFont(new Font("RaleWay",Font.CENTER_BASELINE,24));
		u3.addActionListener(this);
		u3.setBounds(0,720,320,60);
		p3.add(u3);
		
		u4=new JButton("NotePad");
		u4.setBackground(new Color(0,0,102));
		u4.setForeground(Color.WHITE);
		u4.setFont(new Font("RaleWay",Font.CENTER_BASELINE,24));
		u4.addActionListener(this);
		u4.setBounds(0,780,320,60);
		p3.add(u4);
		
		u5=new JButton("About");
		u5.setBackground(new Color(0,0,102));
		u5.setForeground(Color.WHITE);
		u5.setFont(new Font("RaleWay",Font.CENTER_BASELINE,24));
		u5.setBounds(0,840,320,60);
		p3.add(u5);
	}
	
	
	public static void main(String args[])
	{
		new dashboard("").setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent a) {
		// TODO Auto-generated method stub
		if(a.getSource()==b1)
		{
			new Addcustomer(us).setVisible(true);
		}
		if(a.getSource()==b2)
		{
			new Updatecustomer(us).setVisible(true);
		}
		if(a.getSource()==b3)
		{
			new Viewdetails(us).setVisible(true);
		}
		if(a.getSource()==b5)
		{
			new Checkpackage().setVisible(true);
		}
		if(a.getSource()==b6)
		{
			new BookPackage(us).setVisible(true);
		}
		if(a.getSource()==b7)
		{
			new ViewPackage(us).setVisible(true);
		}
		if(a.getSource()==b8)
		{
			new checkhotel().setVisible(true);
		}
		if(a.getSource()==b9)
		{
			new bookhotel(us).setVisible(true);
		}
		if(a.getSource()==u1)
		{
			new destination().setVisible(true);
		}
		if(a.getSource()==u3)
		{
			try {
				Runtime.getRuntime().exec("calc.exe");  ///opeen calc
			}
			catch(Exception e)
			{
				
			}
		}
		else if(a.getSource()==u4)
		{
			try {
				Runtime.getRuntime().exec("notepad.exe");  //open notepad using runtime class
			}
			catch(Exception e)
			{
				
			}
		}
		
	}
}
