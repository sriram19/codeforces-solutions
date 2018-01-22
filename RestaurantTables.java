import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RestaurantTables {

	public static void main(String[] args) {
		try
		{
			   BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
			   
			   String in = inp.readLine();
			   String inpu[] = in.split(" ");
			   int n = Integer.parseInt(inpu[0]);
			   int a = Integer.parseInt(inpu[1]);
			   int b = Integer.parseInt(inpu[2]);
			   
			   int c=0;
			   int answer =0;
			   String in2 = inp.readLine();
			   String inpu2[] = in2.split(" ");
			   int ar[] = new int[inpu2.length];
			   for(int i=0;i<inpu2.length;i++)
			   {
				   ar[i] = Integer.parseInt(inpu2[i]);
			   }
			   for(int i=0;i<ar.length;i++)
			   {
				   int t ;
				   t=ar[i];
				   
				   if(t==2 && b ==0)
				   {
					   answer+= 2;
				   }else if(t==2 && b >0){
					   b-=1;
				   }
				   
				   
				   
				   
				   
				   if(t==1)
				   {
					   
					   if(a>0)
					   {
						   a-=1;
					   }
					   else if( t==1 && a==0 && c>0)
					   {
						   c-=1;
					   }
					   else if(t==1 && a==0 && b>0 ){
						   b-=1;
						   c+=1;
					   }
					   else
					   {
						   answer+=1;
					   }
				   }
				 
			   }
			   System.out.println(answer);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
