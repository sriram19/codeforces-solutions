import java.util.HashMap;
import java.util.Scanner;

public class UselessToy {

	public static void main(String[] args) {
		
		try{
			
			Scanner sc = new Scanner(System.in);
			char a = sc.nextLine().charAt(0);
			char b = sc.nextLine().charAt(0);
			int c = sc.nextInt();
			
			HashMap<Character,Integer>  map = new HashMap<Character,Integer>();
			map.put('v',0);
			map.put('<',1);
			map.put('^',2);
			map.put('>',3);
			
			int st = map.get(a);
			int fn = map.get(b);
			
			boolean ans1 = ((st+c) %4 == fn);
			boolean ans2 = ((st- c %4 +4 )%4 ==fn);
			if(ans1 && !ans2){
				System.out.println("cw");
			}
			if(!ans1 && ans2)
			{
				System.out.println("ccw");
			}
			if(ans1 == ans2)
			{
				System.out.println("undefined");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
