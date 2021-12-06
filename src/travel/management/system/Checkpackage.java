package travel.management.system;
import java.awt.*;

import javax.swing.*;
public class Checkpackage extends JFrame {

	Checkpackage()
	{
		setBounds(600,250,930,600);
		JTabbedPane pane=new JTabbedPane();
		String pack1[]= {"package1.jpg","GOLD PACKAGE","6 day and 7 night","Air-Fair Included","Full day city tour","Daily Buffet","Welcome drink on Arrival","Full 3 Days Island Cruise","Summer Special -","32000Rs"};
		String pack2[]= {"package2.jpg","SILVER PACKAGE","5 day and 6 night","Cab Pick-up n Drop","Half day city tour","Only Breakfast","Visit to national park","3 Days Snow Trekking","Winter Special -","22000Rs"};
		String pack3[]= {"package3.jpg","Bronze Package","5 day and 6 night","Train-Fair Included","5-Star Hotel Stay","BBQ Dinner","Welcome Drinks","Sky-Diving","Summer Special -","20000Rs"};
		JPanel p1=createPackage(pack1);
		JPanel p2=createPackage(pack2);
		JPanel p3=createPackage(pack3);
		pane.addTab("Package 1",null,p1);
		pane.addTab("Package 2",null,p2);
		pane.addTab("Package 3",null,p3);
		
		
		add(pane,BorderLayout.CENTER);
	}
	JPanel createPackage(String pack[])
	{
		JPanel p1=new JPanel();
		p1.setLayout(null);
		add(p1);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/"+pack[0]+""));
		Image i2=i1.getImage().getScaledInstance(500,400,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l1=new JLabel(i3);
		l1.setBounds(400,20,500,400);
		p1.add(l1);
		JLabel l2=new JLabel(pack[1]);
		l2.setFont(new Font("Tahoma",Font.BOLD,25));
		l2.setBounds(100,20,300,26);
		p1.add(l2);
		
		JLabel l3=new JLabel(pack[2]);
		l3.setFont(new Font("Tahoma",Font.PLAIN,20));
		l3.setBounds(20,60,180,25);
		l3.setForeground(Color.RED);
		p1.add(l3);
		
		JLabel l4=new JLabel(pack[3]);
		l4.setFont(new Font("Tahoma",Font.PLAIN,20));
		l4.setBounds(20,120,180,25);
		l4.setForeground(Color.BLUE);
		p1.add(l4);
		
		JLabel l5=new JLabel(pack[4]);
		l5.setFont(new Font("Tahoma",Font.PLAIN,20));
		l5.setBounds(20,180,180,25);
		l5.setForeground(Color.RED);
		p1.add(l5);
		
		JLabel l6=new JLabel(pack[5]);
		l6.setFont(new Font("Tahoma",Font.PLAIN,20));
		l6.setBounds(20,240,180,25);
		l6.setForeground(Color.BLUE);
		p1.add(l6);
		
		JLabel l7=new JLabel(pack[6]);
		l7.setFont(new Font("Tahoma",Font.PLAIN,20));
		l7.setBounds(20,300,280,25);
		l7.setForeground(Color.RED);
		p1.add(l7);
		
		JLabel l8=new JLabel(pack[7]);
		l8.setFont(new Font("Tahoma",Font.PLAIN,20));
		l8.setBounds(20,360,280,25);
		l8.setForeground(Color.BLUE);
		p1.add(l8);
		
		JLabel l9=new JLabel("BOOK NOW");
		l9.setFont(new Font("Tahoma",Font.BOLD,25));
		l9.setBounds(100,440,300,26);
		p1.add(l9);
		
		JLabel l10=new JLabel(pack[8]);
		l10.setFont(new Font("Tahoma",Font.BOLD,25));
		l10.setForeground(Color.RED);
		l10.setBounds(450,440,230,26);
		p1.add(l10);
		
		JLabel l11=new JLabel(pack[9]);
		l11.setFont(new Font("Tahoma",Font.BOLD,25));
		l11.setForeground(Color.RED);
		l11.setBounds(680,440,200,26);
		p1.add(l11);
		return p1;
	}
	public static void main(String args[])
	{
		new Checkpackage().setVisible(true);
	}
}
