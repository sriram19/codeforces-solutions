import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class KarenAndMorning {

	public static void main(String[] args) {
		try
		{
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String s = reader.readLine();
			List<String> list = new ArrayList<String>();
			list.add("00:00");
			list.add("01:10");
			list.add("02:20");
			list.add("03:30");
			list.add("04:40");
			list.add("05:50");
			list.add("01:11");
			list.add("12:21");
			list.add("13:31");
			list.add("14:41");
			list.add("15:51");
			list.add("20:02");
			list.add("21:12");
			list.add("22:22");
			list.add("23:32");
			int ans =0;
			if(list.contains(s))
			{
				System.out.println("0");
			}
			else if(s.equals("23:59"))
			{
				System.out.println("1");
			}
			else{
			String a[] = s.split(":");
			int h = Integer.parseInt(a[0]);
			int m = Integer.parseInt(a[1]);
 			
 			boolean flag = false;
			while(m<60 && !flag)
			{
				m++;
				String min= new String() ;
				if(m<10)
				{
					min = "0"+m;
				}
				else{
					min =String.valueOf(m);
				}
				String hr= new String() ;
				if(h<10)
				{
					hr = "0"+h;
				}
				else{
					hr =String.valueOf(h);
				}
				StringBuilder ss = new StringBuilder();
				ss.append(hr).append(":").append(min).toString();
				String v = ss.toString();
				ans++;
				if(list.contains(v))
				{
					flag = true;
				}
			}
			while(h<24 && !flag)
			{
				h++;
				String min= new String() ;
				if(m<10)
				{
					min = "0"+m;
				}
				else{
					min =String.valueOf(m);
				}
				String hr= new String() ;
				if(h<10)
				{
					hr = "0"+h;
				}
				else{
					hr =String.valueOf(h);
				}
				StringBuilder ss = new StringBuilder();
				ss.append(hr).append(":").append(min);
				ans++;
				String v = ss.toString();
				if(list.contains(v))
				{
					flag = true;
				}
			}
			System.out.println(ans);
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
