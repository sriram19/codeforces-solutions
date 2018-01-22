import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DashaAndStairs {

	public static void main(String[] args) {




		try{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String   s= reader.readLine();
			
			String[] s1 = s.split(" ");
			
			int a = Integer.parseInt(s1[0]);
			int b = Integer.parseInt(s1[1]);
			
			if(a==0 && b==0)
			{
				System.out.println("NO");
			}
			else{
				
				System.out.println(Math.abs(a -b )<=1 ? "YES" :"NO");
			}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		
		
	
		
	
	
	}
}
