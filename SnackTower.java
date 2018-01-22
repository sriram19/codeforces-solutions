import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SnackTower {

	public static void main(String[] args) {


		try{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			int   n = Integer.parseInt(reader.readLine());
			
			String s= reader.readLine();
			
			String [] s1 = s.split(" ");
			int a[] = new int[s1.length+1];
			for(int i=0; i <s1.length;i++)
			{
				a[i+1] = Integer.parseInt(s1[i]);
			}
			boolean have [] = new boolean[100 * 1000 + 7];
			int ptr = n;
			for(int i=1;i<=n;i++)
			{
				have[a[i]] = true; 
				while(ptr > 0 && have[ptr])
				{
					System.out.print(ptr+" ");
					ptr--;
				}
				System.out.println();
				
			}
			
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		
		
	}

}
