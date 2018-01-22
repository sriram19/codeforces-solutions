import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fraction {

	public static void main(String[] args) {


		

		try{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(reader.readLine());
			
			int j =0;
			int mx =1;
			for(int i =1 ;i<=n ;i++)
			{
				j  = n - i;
				
				if(i>=j)
				{
					break;
				}
				if(gcd(i,j)==1)
				{
					mx =i;
				}
			}
			System.out.println(mx+" "+(n-mx));
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	private static int gcd(int i, int j) {
		
		
		return ( j==0 ? i : gcd(j,(i%j)));
	}

	private static boolean checkPrime(int sum) {

		if(sum==1 || sum ==2)
		{
			return true;
			
		}
		else{
		if(sum % 2 ==0 )
		{
			return false;
		}
		else{
			int m = sum /2;
			int flag  = 0;
			for(int i=2;i<=m;i++)
			{
				if(sum % i ==0)
				{
					flag =1;
					break;
				}
			}
			if(flag ==1 )
			{
				return false;	
			}
			else{
				return true;
			}
		}
		}
	}

}
