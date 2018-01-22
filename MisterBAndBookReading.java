import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MisterBAndBookReading {

	public static void main(String[] args) {
		
		try{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String  inp = reader.readLine();
			
			String inp1[] =inp.split(" ");
			int c = Integer.parseInt(inp1[0]);
			int v0 = Integer.parseInt(inp1[1]);
			int v1 = Integer.parseInt(inp1[2]);
			int a = Integer.parseInt(inp1[3]);
			int l = Integer.parseInt(inp1[4]);
			
			int t =1;
			
			
			int pos = v0;
			int add = v0;
			
			while(pos<c)
			{
				add = Math.min(v1, (add+a));
				
				pos += add - l;
				t++;
			}
			
			
			
			System.out.println(t);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
