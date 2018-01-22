import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AntonAndPolyhedrons {
public static void main(String[] args) {



	try{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int  n = Integer.parseInt(reader.readLine());
		
		int tetra =0;
		int cube =0;
		int octa =0;
		int dode =0;
		int icoso=0;
		int ans=0;
		for(int i=0;i<n;i++)
		{
			String s = reader.readLine();
			if(s.equals("Tetrahedron"))
			{
				tetra+=4;
			}
			else if(s.equals("Cube"))
			{
				cube+=6;
			}
			else if(s.equals("Octahedron"))
			{
				octa+=8;
			}
			else if(s.equals("Dodecahedron"))
			{
				dode+=12;
			}
			else if(s.equals("Icosahedron"))
			{
				icoso+=20;
			}
		}
		 ans = tetra + cube + octa+ dode + icoso;
		 System.out.println(ans);
		
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}


}
}
