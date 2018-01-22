import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HolidayOfEquality {

	public static void main(String[] args) {
		
		try
		{

			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			int n   = Integer.parseInt(reader.readLine());
			
			String ss = reader.readLine();
			
			String inp1[] =ss.split(" ");
			int a [] = new int [inp1.length];
			for(int i=0;i<inp1.length;i++)
			{
				a[i] = Integer.parseInt(inp1[i]);
			}
			
			int max = 0;
			int sum =0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i] > max)
				{
					max = a[i];
				}
				sum+=a[i];
			}
			
			max = a.length * max;
			int ans = max - sum;
			System.out.println(ans);
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
