import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AnAbandonedSentimentFromThePast {

	public static void main(String[] args) {
		
	
	try{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
	
		String inp = reader.readLine();
		String in[] = inp.split(" ");
		
		int n = Integer.parseInt(in[0]);
		int k = Integer.parseInt(in[1]);
		
		String inp1 = reader.readLine();
		String in1[] = inp1.split(" ");
		int a [] = new int[n];
		int last_zero =-1;
		for(int i =0;i<in1.length;i++)
		{
			a[i] = Integer.parseInt(in1[i]);
			if(a[i] ==0)
			{
				last_zero = i;
			}
		}
		
		String inp2 = reader.readLine();
		String in2[] = inp2.split(" ");
		int b [] = new int[k];
		if(in2.length==1)
		{
			b[0] = Integer.parseInt(in2[0]);
		}
		else{
		for(int i =0;i<in2.length;i++)
		{
			b[i] = Integer.parseInt(in2[i]);
		}
		}
		
		  if (k > 1) {
		       System.out.println("YES");
		    } else {
		        a[last_zero] = b[0];
		        boolean valid = false;
		        for (int i = 1; i < n; ++i)
		            if (a[i] <= a[i - 1]) { valid = true; break; }
		        System.out.println(valid ? "Yes" : "No");
		    }
		
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}
