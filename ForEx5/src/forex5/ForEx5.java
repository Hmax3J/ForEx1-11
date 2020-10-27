package forex5;
import java.io.*;
import java.util.*;

public class ForEx5 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		int i = 1;
		StringBuilder sb = new StringBuilder();
		
		while(i<=n)
		{
			sb.append(i+"\n");
			i++;
		}
		
		System.out.println(sb);
		
	}

}
