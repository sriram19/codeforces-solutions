import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IamBoredWithMyLife {

	public static void main(String[] args) {
		
		try{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String  inp = reader.readLine();
			
			String inp1[] =inp.split(" ");
			int a = Integer.parseInt(inp1[0]);
			int b = Integer.parseInt(inp1[1]);
			
			int ans =1;
			
			for(int j = 1 ;j<=Math.min(a, b) ; j++)
			{
				ans *= j;
			}
			
			System.out.println(ans);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
