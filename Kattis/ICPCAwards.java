import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class ICPCAwards {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> set = new HashMap<String, String>();
		ArrayList<String> keys = new ArrayList<String>();
		scan.nextLine();
		while ( set.size() < 12 ) {
			String temp = scan.nextLine();
			if( !set.containsKey(temp.split(" ")[0]) ){
				set.put(temp.split(" ")[0], temp.split(" ")[1]);
				keys.add(temp.split(" ")[0]);
			}
		}
		for ( String x : keys ){
			System.out.println( x + " " + set.get(x) );
		}
	}
}