import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KRounding {

	public static void main(String[] args) {
		

		

		try{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String  inp = reader.readLine();
			String s[] = inp.split(" ");
			int n = Integer.parseInt(s[0]);
			int k = Integer.parseInt(s[1]);
			
			
			String val = "1";
			
			for(int i=0;i<k;i++)
			{
				val +="0";
			}
			int v = Integer.parseInt(val);
			
			if(k==0)
			{
				System.out.println("0");
			}
			else{
			for(int i =v ;i<1000000000;i+=v)
			{
				
				 if(i % n ==0 )
				{
					System.out.println(i);
					break;
				}
			}
			}
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
