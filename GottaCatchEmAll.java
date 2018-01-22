import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class GottaCatchEmAll {

	public static void main(String[] args) {

		
		
		
		try{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String  s = reader.readLine();
			
			Map<Character,Integer> map = new HashMap<Character,Integer>();
			
			char[] c = s.toCharArray();
			for(int i=0;i<c.length;i++)
			{
				if(map.containsKey(c[i]))
				{
					map.put(c[i], map.get(c[i])+1);
				}
				else{
					map.put(c[i],1);
				}
			}
			
			  int ans=0;
			  if(map.get('B')!=null){
				  ans=map.get('B');
			  }
			 
			  if(map.get('u')!=null){
				  ans = Math.min(ans,map.get('u')/2);
			  }
			  
			  if(map.get('a')!=null){
				  ans = Math.min(ans, map.get('a')/2);
			  }
			  
			  if(map.get('b')!=null){
				  ans = Math.min(ans, map.get('b'));
			  }
			  
			  if(map.get('s')!=null){
				  ans = Math.min(ans, map.get('s'));
			  }
			  if(map.get('r')!=null){
				  ans = Math.min(ans, map.get('r'));
			  }
			  if(map.get('l')!=null){
				  ans = Math.min(ans, map.get('l'));
			  }
			 
			 
			 
			 
			 
			  
			  System.out.println(ans);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


	}

}
