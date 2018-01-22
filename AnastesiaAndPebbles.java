import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AnastesiaAndPebbles {

	public static void main(String[] args) {

		try{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String  s = reader.readLine();
			
			String [] a = s.split(" ");
			int n = Integer.parseInt(a[0]);
			int k = Integer.parseInt(a[1]);
		
			String ar = reader.readLine();
			String[] ar1 = ar.split(" ");
			
			int arr[] = new int[ar1.length];
			for(int i =0;i<ar1.length;i++)
			{
				arr[i] = Integer.parseInt(ar1[i]);
			}
			
			
			int ans =0;
			for(int i=0;i<arr.length;i++)
			{
				ans += (arr[i]+k-1) / k;
				
			}
			
			System.out.println((ans+1)/2);
			
			int check = 3/4;
			System.out.println(check);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
