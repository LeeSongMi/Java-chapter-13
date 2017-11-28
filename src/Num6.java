import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Num6 extends JFrame {
	JPanel p = new JPanel();
	JLabel la;
	//�̹����� ���� ���� �̹����� ���
	ImageIcon img= new ImageIcon("images/chicken.jpg");
	public Num6() {
		super("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p.setLayout(null);
		this.addMouseListener(new MyMouseListener());
		
		
		la = new JLabel(img);
		la.setSize(50, 50);
		p.add(la);
		
		this.add(p);
		
		setSize(600, 600);
		setVisible(true);

		//������ �ö󰡴� ������ ����
		Thread th = new Thread(new Bub());
		th.start();

        }

	//Ŭ���� ������ ���������
	class MyMouseListener implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			la = new JLabel(img);
			la.setSize(50, 50);
			p.add(la);
			la.setLocation(e.getX(), e.getY());
			}

		@Override
		public void mouseEntered(MouseEvent arg0) {}

		@Override
		public void mouseExited(MouseEvent arg0) {}

		@Override
		public void mousePressed(MouseEvent arg0) {}

		@Override
		public void mouseReleased(MouseEvent arg0) {}
}

	class Bub implements Runnable {
		public void run() {
			while(true) {
				try {
					la.setLocation(la.getX(), la.getY()-5);
					Thread.sleep(200);
					if(la.getY() <=0) {
						la.setVisible(false);
					}
				} catch(InterruptedException e){return;}
			}
		}
	}

	public static void main(String[] args) {
		new Num6();

	}

}
