package forex11;
import java.io.*;
import java.util.*;

public class ForEx11 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// br.readLine() 으로 한 줄을 문자열로 읽어들인 뒤 " " <- 공백을 기준으로 분리
		/* StringTokenizer st = new StringTokenizer(br.readLine()," "); 로 읽어들인뒤 
		분리된 토큰을 반환(st.nextToken())하여 각각 n 과 x 에 담는다. */
		
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
   /*   N개의 문자열이 한 줄로 주어집니다. 이 또한 st = new StringTokenizer(br.readLine()," "); 을 통해 
		한 줄을 읽어들여 공백을 기준으로 문자열을 분리한 뒤, for 문을 통해 st.nextToken() 으로 분리된 문자열 토큰을 하나씩 
		반환하면서 X 보다 작은지 여부에 따라 출력 */
	}

}