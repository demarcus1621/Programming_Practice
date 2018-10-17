import java.io.*;
import java.util.*;

public class Cold{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine();
		String[] array = scanner.nextLine().split(" ");
		int count = 0;
		for( String x : array ){
			if ( Integer.valueOf(x) < 0 )
				count++;
		}
		System.out.println(count);
	}
}