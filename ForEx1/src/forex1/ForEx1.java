package forex1;
import java.io.*;

public class ForEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=9; i++)
		{
			System.out.println(a+" * "+i+" = "+(a*i));
		}
		
	}

}
