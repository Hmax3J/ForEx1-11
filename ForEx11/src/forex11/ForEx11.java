package forex11;
import java.io.*;
import java.util.*;

public class ForEx11 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// br.readLine() ���� �� ���� ���ڿ��� �о���� �� " " <- ������ �������� �и�
		/* StringTokenizer st = new StringTokenizer(br.readLine()," "); �� �о���ε� 
		�и��� ��ū�� ��ȯ(st.nextToken())�Ͽ� ���� n �� x �� ��´�. */
		
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < n; i++)
		{
			int result = Integer.parseInt(st.nextToken());
			
			if(result < x)
			{
				sb.append(result).append(' ');
			}
		}
		System.out.println(sb);
   /*   N���� ���ڿ��� �� �ٷ� �־����ϴ�. �� ���� st = new StringTokenizer(br.readLine()," "); �� ���� 
		�� ���� �о�鿩 ������ �������� ���ڿ��� �и��� ��, for ���� ���� st.nextToken() ���� �и��� ���ڿ� ��ū�� �ϳ��� 
		��ȯ�ϸ鼭 X ���� ������ ���ο� ���� ��� */
	}

}