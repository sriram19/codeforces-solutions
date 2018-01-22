import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ShellGame {

	public static void main(String[] args) {
		
		


		try{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			int  n = Integer.parseInt(reader.readLine());
		    int x = Integer.parseInt(reader.readLine());
			
		    int arr [][] ={{0, 1, 2},
		    		{1, 0, 2},
		    		{1, 2, 0},
		    		{2, 1, 0},
		    		{2, 0, 1},
		    		{0, 2, 1}};
		    
		      n%=6;
		      System.out.println(arr[n][x]);
			
			
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


	}

}
