import java.util.*;
import java.io.*;

public class AddingWords{
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String output = "= ";
		int value = 0;
		String[] array;
		bool isPossible = true;

		while ( !input.equals("clear") ){
			array = input.split(" ");
			if( array[0].equals("def") ){
				map.put( array[1], array[2] );
			}
			else {
				for( int i = array.length - 2 ; i >= 0 ; i = i - 2 ){
					output = array[i] + " " + output;
					if( !map.containsKey(array[i]) && !array[i].equals("+") && !array[i].equals("-") )
						isPossible = false;
					else{
						value 
						if( array 
	}
}
