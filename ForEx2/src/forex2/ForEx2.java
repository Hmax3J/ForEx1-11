package forex2;
import java.util.*;


public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int t=1; t<=T; t++)
		{
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(a+b);
		}

	}

}
