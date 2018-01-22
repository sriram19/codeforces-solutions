import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BearAndBigBrother {

	public static void main(String[] args) {


		try{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String  s = reader.readLine();
			
			String [] s1 = s.split(" ");
			int a = Integer.parseInt(s1[0]);
			int b = Integer.parseInt(s1[1]);
			int count=0;
			while(b>=a)
			{
				a*=3;
				b*=2;
				count++;
			}
			System.out.println(count);
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
