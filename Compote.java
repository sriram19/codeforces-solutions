import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Compote {

	public static void main(String[] args) {




		try{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			int  lemon	= Integer.parseInt(reader.readLine());
			int  apple = Integer.parseInt(reader.readLine());
			int  pears = Integer.parseInt(reader.readLine());
			
			int min = Math.min(lemon,Math.min(apple/2, pears/4));
			
			System.out.println(min*7);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	

	

	}

}
