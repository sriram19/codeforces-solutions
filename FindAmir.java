import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindAmir {
	public static void main(String[] args) {
	

	try{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int  inp = Integer.parseInt(reader.readLine());
		
		System.out.println((inp-1)/2);
		
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}