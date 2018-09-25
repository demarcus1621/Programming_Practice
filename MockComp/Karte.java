import java.util.*;
import java.io.*;

public class Karte{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<Integer>();
		while( scanner.hasNextLine() ){
			int x = scanner.nextInt();
			for(int i = 1; i < x ; i++){
				if( x % i == 0 )
					ar.add(i);
			}
			int total = 0;
			for( Object i : ar.toArray() )
				total += (int) i;
			double diff = Math.abs(total - x);
			if( total == x )
				System.out.println(x + " perfect");
			else if(diff <= (double) 2 )
				System.out.println(x + " almost perfect");
			else
				System.out.println(x + " not perfect");
		}
	}
}