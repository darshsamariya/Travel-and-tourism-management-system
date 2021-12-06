package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
	public class destination extends JFrame implements Runnable{
		JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
		JLabel[] label=new JLabel[]{l1,l2,l3,l4,l5,l6,l7,l8,l9};
		
        JLabel caption;
		
		public void run()
		{
			String m[]= new String[]{"Boleuvard 9 Resort n Spa","Hyaat Resort","Ramada","Ramee Royal","Via Lakhela Resort","Ananta Resort","Maharaja 5-star","Sterling Holidays","Escobar Hotels"};
			
			try {
			for(int i=0;i<10;i++)
			{
				this.label[i].setVisible(true);
				caption.setText(m[i]);
				this.label[i].add(caption);
				Thread.sleep(2800);
				this.label[i].setVisible(false);
			}
			}
			
			catch(Exception e) {}
		}
		destination()
		{
			setBounds(550,200,900,700);
			setLayout(null);
			caption=new JLabel();
			caption.setBounds(50,550,1000,70);
			caption.setForeground(Color.WHITE);
			caption.setFont(new Font("Tahoma",Font.BOLD,25));
			add(caption);	
			
			for(int i=1;i<10;i++)
			{
				ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/dest"+i+".jpg"));
				Image i2=i1.getImage().getScaledInstance(900,700,Image.SCALE_DEFAULT);
				ImageIcon i3=new ImageIcon(i2);
				label[i-1]=new JLabel(i3);
				label[i-1].setBounds(0,0,900,700);
				
				add(label[i-1]);
			}
			Thread t1=new Thread(this);
			t1.start();
		}
		public static void main(String args[])
		{
			new destination().setVisible(true);
		}
	
	}


