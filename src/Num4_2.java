import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Num4_2 extends JFrame{ 
	JFrame f = this;
	JLabel la = new JLabel("���� ���̺�");
	public Num4_2() {
  	  super("�ǽ����� 4_2");
  	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	  //���̺� ��ġ ����
  	  la.setLocation(110,40);
  	  f.add(la);
  	  setSize(300, 300);
  	  setVisible(true);
  	  
  	  //������ ����
  	  Thread th = new Thread(new BellThread());
  	  th.start();
    }



class BellThread extends Thread implements Runnable {
	public void run() {
		while(true) {
			try {
				//���ڰ� �ִ� ���̺��� ��ġ�� �������ش�.
				la.setLocation(100, 35);
				la.setLocation(120, 45);
			} catch (Exception e) {return;}
		}
	}
}

public static void main(String[] args) {
	new Num4_2();

}
}
	

