import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SantaClassAndPlaceInAClass {

	public static void main(String[] args) {


		try{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String  s = reader.readLine();
			
			String s1 [] = s.split(" ");
			int n = Integer.parseInt(s1[0]);
			int m = Integer.parseInt(s1[1]);
			int k = Integer.parseInt(s1[2]);
			--k;
			int a = k / (m*2);
			int b = k % (m *2)/2;
			int c = k % 2;
			System.out.println((a+1)+" "+(b+1)+" "+(c==0? 'L' :'R'));
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
