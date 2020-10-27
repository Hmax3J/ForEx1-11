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
	    등차수열 공식으로 for문 없이 하는 방법
	    System.out.println(a * (a+1) / 2); 1부터 입력받은 N까지 합 출력하기
	    이렇게 할 경우 sum과 for문 선언 없이 실행가능
	*/
	}

}
