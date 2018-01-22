import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LongestUnCommonSubsequence {

	public static void main(String[] args) {


		try{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String   a = reader.readLine();
			
			String b = reader.readLine();
			
			if(a.equals(b)){
				System.out.println("-1");
			}
			else{
				System.out.println(Math.max(a.length(), b.length()));
			}
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		
		
	
		
	}
}
