package second;

import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.*;

public class mypanel extends Panel implements KeyListener {
   int x = 30;
   int y = 30;
   public void paint(Graphics p)
   {
	   p.fillOval(x,y,20,20);
   }
   @Override
   public void keyPressed(KeyEvent arg0)
   {
	  System.out.println(arg0.getKeyCode());
	 if(arg0.getKeyCode() == 37)
	 {
		 x-=100;
	 }
	 if(arg0.getKeyCode() == 38)
	 {
		 y-=100;
	 }
	 if(arg0.getKeyCode() == 39)
	 {
		 x+=100;
	 }
	 if(arg0.getKeyCode() == 40)
	 {
		 y+=100;
	 }
	 repaint();
   }
   @Override
   public void keyReleased(KeyEvent arg1)
   {
	   
   }
   @Override
   public void keyTyped(KeyEvent arg2)
   {
	   
   }
   /*public void run()
   {
	   while(true)
	   {
		   try 
		   {
			   Thread.sleep(100);
		   }
		   catch(Exception e) {}
		   repaint();
	   }
   }*/
}
