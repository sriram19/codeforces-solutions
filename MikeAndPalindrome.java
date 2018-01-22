import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MikeAndPalindrome {

	public static void main(String[] args) {
		

		try{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String  s = reader.readLine();
			s ="#"+ s;
			int n = s.length() - 1 ;
			
			int count =0;
			for(int i=1;(i+i)<n;++i)
			{
				if(s.charAt(i) != s.charAt(n-i+1))
					count++;
				
			}
			int a = (n&1);
			if(((count <= 1) && a==1) || count==1 )
			{
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
}

}
