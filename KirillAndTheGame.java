import java.util.Scanner;

public class KirillAndTheGame {
public static void main(String[] args) {
	
	
	
	try{
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String [] arr = s.split(" ");
		int l = Integer.parseInt(arr[0]);
		int r = Integer.parseInt(arr[1]);
		int x = Integer.parseInt(arr[2]);
		int y = Integer.parseInt(arr[3]);
		int k = Integer.parseInt(arr[4]);
		
		
		int a = (r - l ) +1 ;
		int b = (x -y ) +1;
		double effi = a/b;
		
		if(k==effi)
		{
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
