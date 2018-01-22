import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DisplaySize {

	public static void main(String[] args) {



		try{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			int  n= Integer.parseInt(reader.readLine());
			
			int a =1;int b =n;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					if(n/i < i)
						continue;
					if(n/i -i < (b-a))
					{
						a= i;
						b=n/i;
					}
					
				}
			}
			System.out.println(a+" "+b);
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	

	}

}
