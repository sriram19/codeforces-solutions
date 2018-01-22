import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BuyingAHouse {

	public static void main(String[] args) {

		try{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String  s = reader.readLine();
			
			String [] a = s.split(" ");
			int n = Integer.parseInt(a[0]);
			int m = Integer.parseInt(a[1]);
			int k = Integer.parseInt(a[2]);
			m = m-1;
			String ar = reader.readLine();
			String[] ar1 = ar.split(" ");
			
			int arr[] = new int[ar1.length];
			for(int i =0;i<ar1.length;i++)
			{
				arr[i] = Integer.parseInt(ar1[i]);
			}
			
			
			int ans =Integer.MAX_VALUE;
			for(int i=0;i<arr.length;i++)
			{
				if( arr[i] !=0  && arr[i] <=k)
				{
					ans = Math.min(ans, Math.abs(i-m));
				}
			}
			
			System.out.println(ans*10);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
