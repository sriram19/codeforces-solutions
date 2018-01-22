import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UnimodalArray {

	public static void main(String[] args) {
	
		try{
		   BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		
		int n = Integer.parseInt(inp.readLine());
		
		String s = inp.readLine();
		
		String s1[] = s.split(" ");
		
		int [] a = new int [s1.length];
		for(int i=0;i<s1.length;i++)
		{
			a[i] = Integer.parseInt(s1[i]);
		}
		
		int pos1 =0; int pos2 = a.length -1 ;
		for(int i=0;i<a.length -1;i++)
		{
			if(a[i+1] > a[i]){
				pos1++;
				
			}
			else{
				break;
			}
		}
		
		for(int i = a.length-1;i>=0;i--)
		{
			if(a[pos2-1] > a[pos2]){
				pos2--;
				
			}
			else{
				break;
			}
		}
		boolean flag = false;
		
		for(int i = pos1 ;i<pos2;i++)
		{
			if(a[i] == a[i+1])
			{
				flag = true;
			}
			else{
				flag = false;
			}
		}
		if(pos1==pos2)
		{
			if(a[pos1] ==a[pos2])
					{
				flag  = true;
					}
			
		}
	if(flag)
	{
		System.out.println("YES");
	}
	else
	{
		System.out.println("NO");
	}
	}
	catch(Exception  e)
	{
		e.printStackTrace();
	}

}
}

