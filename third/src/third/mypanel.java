package third;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class mypanel extends Panel implements Runnable,KeyListener {
  
	int x[] = new int[10];
	int y[] = new int[10];
	char c[] = new char[10]; 
	int score = 1000;
     mypanel()
	{
		for(int i = 0;i<10;i++)
		{
			x[i] = (int)(300*Math.random());
			y[i] = (int)(300*Math.random());
			c[i] = (char)(26*Math.random()+97);
		}
	}
     public void paint(Graphics g)
     {
    	 for(int i = 0;i<10;i++)
    	 {
    		 g.drawString(new Character(c[i]).toString(),x[i],y[i]);
    	 }
    	 g.setColor(Color.RED);
    	 g.drawString("你的成绩是 "+score, 5, 15);
     }
     public void run()
     {
    	 while(true) {
    		 for(int i = 0;i<10;i++)
    		 {
    			 y[i]+=1;
    		 if(y[i]>400)
    		 {
    			 y[i] = 0;
    			 x[i] = (int)(Math.random()*300);
    			 c[i] = (char)(Math.random()*26+97);
    		 }try {
    			 Thread.sleep(30);
    		 }catch(Exception e) {}
    		 repaint();
    	 }
     }
     }
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO 自动生成的方法存根
		char keyc = arg0.getKeyChar();
		int nowy = -1;
		int nowindex = -1;
		for(int i = 0;i<10;i++)
		{
			if(keyc == c[i])
			{
				if(y[i]>nowy)
				{
					nowy = y[i];
					nowindex = i;
				}
			}
		}
		if(nowindex!=-1)
		{
			y[nowindex] = 0;
			x[nowindex] = (int)(Math.random()*300);
			c[nowindex] = (char)(Math.random()*26+97);
            score += 10;
		}
		else
		{
			score-=10;
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO 自动生成的方法存根
		
	}
}
