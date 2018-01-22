import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArpaAndMexicanWave {

	public static void main(String[] args) {


		

		try{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String in = reader.readLine();
			
			String inp[] = in.split(" ");
			int n = Integer.parseInt(inp[0]);
			int k = Integer.parseInt(inp[1]);
			int t = Integer.parseInt(inp[2]);
			
			
			if( t<=k)
			{
				System.out.println(t);
			}
			
			else if(t>=k && t<=n)
			{
				System.out.println(k);
			}
			
			else if(t>=n && t<(n+k))
			{
				System.out.println(n+k-t);
			}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
