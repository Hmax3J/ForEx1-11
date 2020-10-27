package forex10;
import java.io.*;

public class ForEx10 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-i; j++)
			{
				sb.append(' ');
			}
			for(int m=1; m<=i; m++)
			{
				sb.append('*');
			}
			sb.append('\n');
		}
		System.out.print(sb);

	}

}