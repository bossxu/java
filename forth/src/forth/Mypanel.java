package forth;

import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Mypanel extends Panel implements MouseMotionListener {

	int x = 30;
	int y = 30;
	public void paint(Graphics g)
	{
		super.paint(g);
		g.fillOval(x, y, 20, 20);
	}
	
	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO �Զ����ɵķ������
		x = arg0.getX();
		y = arg0.getY();
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO �Զ����ɵķ������

	}

}
