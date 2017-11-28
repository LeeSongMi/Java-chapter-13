import java.util.Scanner;

public class Num1 {

	static public void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("아무 키나 입력>> ");
		s.nextLine(); // 아무 키나 입력받는다
		
		//스레드 실행
		Thread th = new Thread(new NumThread());	
		th.start();
		
		s.close();

	}
}
//숫자 출력 스레드 설정
class NumThread implements Runnable {
	@Override
	public void run() {
		System.out.println("스레드 실행 시작");		
		for(int i=1; i<=10; i++)
			System.out.print(i + " ");
		System.out.println();
		System.out.println("스레드 종료");
	}
}

