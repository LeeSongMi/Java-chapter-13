import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Num2 extends JFrame {

	public Num2() {
		super("실습문제2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyPanel p = new MyPanel(10,10);
		setContentPane(p);
		p.setLayout(null);
		
		p.addMouseListener(new MyMouseListener());
		
		setSize(300,300);
		setVisible(true);
			
		
		
	}
	
	class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			MyPanel b =  (MyPanel) e.getSource();
			//MyPanel의 위치를 랜덤으로 정함
			Random r = new Random();
			int x =  r.nextInt(200);
			int y = r.nextInt(200);
			TimerThread th = new TimerThread();
			th.start();
			b.setLocation(x,y);
		}
		
	}
	
	public static void main(String[] args) {
		new Num2();
	}

}

//동그라미 모양 만들기
class MyPanel extends JPanel {
	int x, y;

	public MyPanel(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		g.drawOval(x, y, 50, 50);
	}
	
}

class TimerThread extends Thread implements Runnable {
	@Override
	public void run() {
		while(true) {
			try {
				sleep(400); //시간 딜레이
			} catch (Exception e) {return;}
		}
	}
}
