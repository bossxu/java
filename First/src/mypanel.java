import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
class mypanel extends Panel implements Runnable {
	
	int x[] = new int[300] ;
	int y[] = new int[300] ;
	public void init()
	{
	   for(int i = 0;i<300;i++)
	 {
		x[i] = (int)(Math.random()*1024);
		y[i] = (int)(Math.random()*768);
	 }
	}
	
    public void paint(Graphics g)
    {
    	     g.setColor(Color.WHITE);
    	     for(int i = 0;i<300;i++)
    		 g.drawString("*", x[i], y[i]);
    }
    public void run()
    {
    	while(true)
    	{
    		try {
    			Thread.sleep(1000);
    		}catch(Exception e) {}
    		repaint();
    	}
    }
}
