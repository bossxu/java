import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
       JFrame w = new JFrame();
       w.setSize(250,125);
       w.setTitle("尝试");
       
       //控件
       JLabel user = new JLabel("用户名");
       JLabel mima = new JLabel("密码");
       
       JTextField txtuser = new JTextField();
       JPasswordField txtpass = new JPasswordField();
       
       JButton login = new JButton("登录");
       JButton reg = new JButton("注册");
       JButton cannel = new JButton("取消");
       
       //布置面板
       
       JPanel paninput = new JPanel();
       paninput.setLayout(new GridLayout(2, 2));
       
       paninput.add(user);
       paninput.add(txtuser);	
       paninput.add(mima);
       paninput.add(txtpass);
       
       //两个面板去合成一个面板
       JPanel panb = new JPanel();
       panb.setLayout(new FlowLayout());
       
       panb.add(login);
       panb.add(reg);
       panb.add(cannel);
       
       //布置整体
       w.setLayout(new BorderLayout());
       
       w.add(paninput,BorderLayout.CENTER);
       w.add(panb, BorderLayout.SOUTH);
       
       w.setVisible(true);
       
	}

}
