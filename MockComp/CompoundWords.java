import java.io.*;
import java.util.*;

public class CompoundWords{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> array = new ArrayList<String>();
		while( scanner.hasNextLine() ){
			String x = scanner.nextLine();
			for( String j : x.split(" ") ){
				array.add(j);
			}
		}
		TreeSet<String> ar = new TreeSet<String>();
		for( int i = 0 ; i < array.size() ; i++ ){
			for( int j = 0 ; j < array.size() ; j++ ){
				if(array.get(i) == array.get(j) )
					continue;
				ar.add( array.get(i).toString().concat(array.get(j).toString()) );
			}
		}
		for( Object j : ar ){
			System.out.println(j);
		}
	}
}