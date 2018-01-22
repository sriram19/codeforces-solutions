import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AndryushaAndSocks {
public static void main(String[] args) {




	try{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int  n = Integer.parseInt(reader.readLine());
		
		String s1 = reader.readLine();
		String s [] = s1.split(" ");
		
		int a [] = new int[s.length];
		for(int i=0;i<s.length;i++)
		{
			a[i] = Integer.parseInt(s[i]);
		}
		
		Map<Integer,Integer> hash = new HashMap<Integer,Integer>();
		
		int count=0;
		for(int i =0;i<a.length;i++)
		{
			if(hash.containsKey(a[i]))
			{
				hash.remove(a[i]);
			}
			else{
				hash.put(a[i], a[i]);
			}
			
			if(hash.size() >count)
			{
				count = hash.size();
			}
		}
		System.out.println(count);
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}



}
}
