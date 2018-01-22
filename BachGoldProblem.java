import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BachGoldProblem {

	public static void main(String[] args) {


		try{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			int  n= Integer.parseInt(reader.readLine());
			
			System.out.println(n/2);
			if(n%2==0)
			{
				for(int i=1;i<=n/2;i++)
				{
					System.out.print("2"+" ");
				}
			}
			else{
				for(int i=1;i<n/2;i++)
				{
					System.out.print("2"+" ");
				}
				System.out.print("3");
			}
			
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
