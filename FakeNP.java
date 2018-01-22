import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FakeNP {
	public static void main(String[] args) {
	

	try{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String  inp = reader.readLine();
		String inp1[] =inp.split(" ");
		int a = Integer.parseInt(inp1[0]);
		int b = Integer.parseInt(inp1[1]);
		int n = (a==b?a:2);
		System.out.println(n);
		
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
