package travel.management.system;
import javax.swing.*;
import java.awt.*;
public class splash {
	public static void main(String[] args)
	{

		splashframe frame=new splashframe();
		frame.setVisible(true);
		int x=1;
		for(int i=0;i<700;i+=6,x+=7)
		{
			frame.setLocation(950-(x+i)/2,500-(i/2));
			frame.setSize(x+i,i);
			try {
				Thread.sleep(10);   //makes screen look large one by one slowly
			}
			catch(Exception e) {}
		}
		
		frame.setVisible(true);
	}
	
}
class splashframe extends JFrame implements Runnable{
	Thread t1;
	splashframe(){
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/splash.jpg"));
        Image i2=i1.getImage().getScaledInstance(1600,700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
		JLabel l1=new JLabel(i3);
		setUndecorated(true);
         add(l1);
        // setLocation(300,200);
        // setSize(400,500);
         t1=new Thread(this);
         t1.start();
	}
	public void run()
	{
		try {
			Thread.sleep(7000);  //closes scrren after 7 seconds 
			this.setVisible(false);
			new login().setVisible(true);
		}
		catch(Exception e)
		{
			
		}
	}
}
