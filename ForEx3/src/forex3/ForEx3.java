package forex3;
import java.io.*;

public class ForEx3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i=1; i<=a; i++)
		{
			sum+=i;
		}
		
		System.out.println(sum);
		
	/*	
	    �������� �������� for�� ���� �ϴ� ���
	    System.out.println(a * (a+1) / 2); 1���� �Է¹��� N���� �� ����ϱ�
	    �̷��� �� ��� sum�� for�� ���� ���� ���డ��
	*/
	}

}
