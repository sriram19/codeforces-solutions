import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaymyrIsCallingYou {

	public static void main(String[] args) {



		try{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String   a = reader.readLine();
			
			String[] s = a.split(" ");
			
			int n = Integer.parseInt(s[0]);
			int m = Integer.parseInt(s[1]);
			int z = Integer.parseInt(s[2]);
			
			int vis[] = new int[100 * 1000 + 7];
			for(int i=n;i<=z;i+=n)
			{
				vis[i] =1;
			}
			int ans=0;
			for(int i=m;i<=z;i+=m)
			{
				if(vis[i]==1)
				{
					ans++;
				}
			}
			System.out.println(ans);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		
		
	
		
	
	}
}
