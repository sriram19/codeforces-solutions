import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ViciousKeyboard {
	public static void main(String[] args) {

		try{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String  s = reader.readLine();
			
			int ans =0;
			char arr [] = s.toCharArray();
			for(int i =0;i<s.length();i++)
			{
				char t = s.charAt(i);
				arr[i] = 'V';
				ans = Math.max(ans, maxCount(arr));
				arr[i] = 'K';
				ans = Math.max(ans, maxCount(arr));
				arr[i] = t;
			
			}
			System.out.println(ans);
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static int maxCount(char[] s) {
		
		int ans =0;
		for(int  i =0;i<s.length-1;i++)
		{
			if(s[i]=='V' && s[i+1]=='K')
			{
				ans++;
			}
		}
		return ans;
	}

}
