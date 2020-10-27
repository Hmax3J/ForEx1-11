package forex8;
import java.io.*;
import java.util.*;

public class ForEx8 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int a;
		int b;
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		for(int i=1; i<=t; i++)
		{
			st = new StringTokenizer(br.readLine()," ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			sb.append("Case #" + i + ": ").append(a + " + " + b + " = " + (a+b)).append('\n');
		}
		br.close();
		System.out.println(sb);
	}

}
