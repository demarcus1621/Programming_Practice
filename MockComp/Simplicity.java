import java.util.*;
import java.io.*;

public class Simplicity{
	public static void main(String[] args){
		HashMap<Character, Integer> list = new HashMap<Character, Integer>();
		Scanner scan = new Scanner(System.in);
		
		char[] input = scan.nextLine().toCharArray();
		Arrays.sort(input);
		int size;
		int count = 0;
		int tcount = 0;
		
		for( char x : input ){
			if( list.containsKey(x) )
				list.put(x, list.get(x) + 1);
			else
				list.put(x,1);
		}
		
		TreeSet<Character> temp = new TreeSet<Character>(list.keySet());
		size = temp.size();
		if( size > 2 ){
			for( Character x : temp ){
				if( tcount < 2){
					tcount++;
					continue;
				}
				count += list.get(x);
			}
			System.out.println(tcount);
		}
		else 
			System.out.println(0);
		
	}
}