package forex4;
import java.io.*;
import java.util.*;

public class ForEx4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i=0; i<n; i++)
		{
			st = new StringTokenizer(br.readLine()," "); 
			//�׽�Ʈ ���̽����� �־����� �� ������ ���ڿ� �и��� ���� �� �ݺ����� StringTokenizer �� ������ ���ÿ� ���ڸ� �Է¹޴´�.
			
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
		/*	�� StringTokenizer �� ��ū (�и��Ǿ��ִ� ����)�� ��ȯ�ϸ�, ��ȯ�Ǵ� Ÿ���� String �̹Ƿ� Integer.parseInt�� ���� 
			int������ �ٲپ� �ش�. �̷��� �ٲ� �� ��ū�� ������ ���� BufferedWriter.write() �� �־��ش�. */
		}
		
		br.close();
		bw.flush();
		bw.close();

	}

}
