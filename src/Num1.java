import java.util.Scanner;

public class Num1 {

	static public void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("�ƹ� Ű�� �Է�>> ");
		s.nextLine(); // �ƹ� Ű�� �Է¹޴´�
		
		//������ ����
		Thread th = new Thread(new NumThread());	
		th.start();
		
		s.close();

	}
}
//���� ��� ������ ����
class NumThread implements Runnable {
	@Override
	public void run() {
		System.out.println("������ ���� ����");		
		for(int i=1; i<=10; i++)
			System.out.print(i + " ");
		System.out.println();
		System.out.println("������ ����");
	}
}

