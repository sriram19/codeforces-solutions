import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NeverEndingCompetitions {

	public static void main(String[] args) {


		try{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			int   n = Integer.parseInt(reader.readLine());
			
			String s = reader.readLine();
			for(int i=0;i<n;i++)
			{
				String a = reader.readLine();
			}
			if((n&1)==0)
			{
				System.out.println("home");
			}
			else{
				System.out.println("contest");
			}
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		
		
	}

}
