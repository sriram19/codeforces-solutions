import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TheMonster {
public static void main(String[] args) {

	try{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String  s = reader.readLine();
		
		String [] s1 = s.split(" ");
		int a = Integer.parseInt(s1[0]);
		int b = Integer.parseInt(s1[1]);
		String  s11 = reader.readLine();
		
		String [] s2 = s11.split(" ");
		int c = Integer.parseInt(s2[0]);
		int d = Integer.parseInt(s2[1]);
		
		int ans = Integer.MAX_VALUE;
		for(int i =0;i<=1000;i++)
		{
			for(int j=0;j<=1000;j++)
			{
				if((i*a)+b == (j*c)+d)
				{
					ans = Math.min(ans, (i*a)+b);
				}
			}
			
		}
		
		if(ans == Integer.MAX_VALUE)
		{
			System.out.println("-1");
		}
		else{
			System.out.println(ans);
		}
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
