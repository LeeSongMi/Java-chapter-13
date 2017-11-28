import javax.swing.JFrame;
import javax.swing.JLabel;

public class test extends JFrame {

	JLabel p = new JLabel("진동");
	      public test() {
	    	  super("실습문제 4");
	    	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	  
	    	  add(p);
	    	  setSize(300, 300);
	    	  setVisible(true);
	    	  
	    	  Thread th = new Thread(new BelThread());
	    	  th.start();

	      }




	class BelThread implements Runnable {
		public void run() {
			while(true) {
				try {
					p.setLocation(90, 100);
					Thread.sleep(1);
					p.setLocation(110, 100);
				} catch (InterruptedException e) {return;}
			}
		}
	}

	public static void main(String[] args) {
		new test();

	}
	}
		



