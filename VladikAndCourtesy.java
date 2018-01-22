import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VladikAndCourtesy {

	public static void main(String[] args) {
		
		try{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String  inp = reader.readLine();
			
			String inp1[] =inp.split(" ");
			int a = Integer.parseInt(inp1[0]);
			int b = Integer.parseInt(inp1[1]);
			
			int cnt =1;
			
			
			while(true)
			{
				if(a<cnt)
				{
					System.out.println("Vladik");
					break;
				}
				a-= cnt;
				cnt++;
				if(b<cnt)
				{
					System.out.println("Valera");
					break;
				}
				b-= cnt;
				cnt++;
			}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
