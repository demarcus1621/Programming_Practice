import java.util.*;
import java.io.*;

public class GuessingGame{
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		while( scanner.hasNext() ){
			list.add(scanner.nextLine());
		}
		String actual = list.get(list.size() - 3);
		for( int i = 0 ; i < list.size() ; i++){
			if( list.get(i).equals("right on") && (list.get(i-1).equals(actual)) ){
				System.out.println("Stan may be honest");
			}
			else if (list.get(i).equals("right on") ){
				System.out.println("Stan is dishonest");
			}
		}
	}
}