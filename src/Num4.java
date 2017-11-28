import javax.swing.JFrame;
import javax.swing.JPanel;

public class Num4 extends JFrame {
      public Num4() {
    	  super("실습문제 4");
    	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  JPanel p = new JPanel();
    	  setLocation(100, 100); //프레임의 위치를 지정
    	  add(p);
    	  setSize(300, 300);
    	  setVisible(true);
    	  //스레드 실행
    	  Thread th = new Thread(new BelThread());
    	  th.start();

      }

public static void main(String[] args) {
	new Num4();

}
class BelThread implements Runnable {
	public void run() {
		while(true) {
			try {
				//위치를 변경해주며 진동하는 모습을 구현
				setLocation(90, 100);
				Thread.sleep(1);
				setLocation(100, 100);
			} catch (InterruptedException e) {return;}
		}
	}
}
}

