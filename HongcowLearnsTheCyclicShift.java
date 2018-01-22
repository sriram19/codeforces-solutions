import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HongcowLearnsTheCyclicShift {

	public static void main(String[] args) {
		
		try
		{

			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String s = reader.readLine();
			Set<String> hash = new HashSet<String>();
			int n = s.length();
			
		for(int i=0;i<100;i++)
		{
			s = s.charAt(n-1) + s.substring(0,n-1);
			hash.add(s);
		}
			
		System.out.println(hash.size());
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
