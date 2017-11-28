import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Num4_2 extends JFrame{ 
	JFrame f = this;
	JLabel la = new JLabel("진동 레이블");
	public Num4_2() {
  	  super("실습문제 4_2");
  	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	  //레이블 위치 설정
  	  la.setLocation(110,40);
  	  f.add(la);
  	  setSize(300, 300);
  	  setVisible(true);
  	  
  	  //스레드 실행
  	  Thread th = new Thread(new BellThread());
  	  th.start();
    }



class BellThread extends Thread implements Runnable {
	public void run() {
		while(true) {
			try {
				//글자가 있는 레이블의 위치를 변경해준다.
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
	

