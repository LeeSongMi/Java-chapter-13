import javax.swing.JFrame;
import javax.swing.JPanel;

public class Num4 extends JFrame {
      public Num4() {
    	  super("�ǽ����� 4");
    	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  JPanel p = new JPanel();
    	  setLocation(100, 100); //�������� ��ġ�� ����
    	  add(p);
    	  setSize(300, 300);
    	  setVisible(true);
    	  //������ ����
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
				//��ġ�� �������ָ� �����ϴ� ����� ����
				setLocation(90, 100);
				Thread.sleep(1);
				setLocation(100, 100);
			} catch (InterruptedException e) {return;}
		}
	}
}
}

