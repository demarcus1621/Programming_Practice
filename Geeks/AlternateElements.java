import java.util.*;
import java.io.*;

public class AlternateElements{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int cases = Integer.valueOf(scan.nextLine());
		for(int i = 0 ; i < cases ; i++){
			int N = Integer.valueOf(scan.nextLine());
			String[] array = scan.nextLine().split(" ");
			for( int j = 0 ; j < N ; j++ ) {
				if( j % 2 == 0 )
					System.out.print(array[j] + " ");
			}
			System.out.println();
		}
	}	
}