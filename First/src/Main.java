import java.awt.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
           Frame w = new Frame();
           w.setSize(1024, 768);
           w.setBackground(Color.BLACK);
           mypanel mp = new mypanel();
           mp.init();
           w.add(mp);
           Thread t = new Thread(mp);
           t.start();
           w.show(); 
	}
}
