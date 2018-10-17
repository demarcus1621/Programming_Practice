import java.io.*;
import java.util.*;

public class GrandpaBernie{
	public static void main(String[] args){
		HashMap<String, ArrayList<Integer> > map = new HashMap<String, ArrayList<Integer> >();
		Scanner scanner = new Scanner(System.in);
		int trips = Integer.valueOf(scanner.nextLine());
		while( trips > 0 ){
			String x = scanner.nextLine();
			String key = x.split(" ")[0];
			int year = Integer.valueOf(x.split(" ")[1]);
			ArrayList<Integer> list = new ArrayList<Integer>();
			if( map.containsKey(key) ){
				map.get(key).add(year);
			}
			else{
				list.add(year);
				map.put(key, list);
			}
			trips--;
		}
		int query = Integer.valueOf(scanner.nextLine());
		while( query > 0 ){
			String quest = scanner.nextLine();
			String key = quest.split(" ")[0];
			int time = Integer.valueOf(quest.split(" ")[1]);
			Object[] ar = map.get(key).toArray();
			Arrays.sort(ar);
			System.out.println(ar[time-1]);
			query--;
		}
	}
}
