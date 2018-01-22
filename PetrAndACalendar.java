import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PetrAndACalendar {

	public static void main(String[] args) {
		try
		{
			   BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
			   
			   String in = inp.readLine();
			   String inpu[] = in.split(" ");
			   
			   int m = Integer.parseInt(inpu[0]);
			   int d = Integer.parseInt(inpu[1]);
			   
			   int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

			   int ans =1;
			   m--;d--;
			   for(int i=0; i< days[m] -1 ;i++)
			   {
				   d = (d+1) % 7;
				   if(d ==0)
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
