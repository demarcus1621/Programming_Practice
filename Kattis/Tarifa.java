import java.util.*;
import java.io.*;

public class Tarifa{
	public static void main(String[] args){
		Scanner scanner = new Scanner( System.in );
		ArrayList array = new ArrayList<Integer>();
		
		int limit = scanner.nextInt();
		int month = scanner.nextInt();
		int total = limit;
		while( month > 0 ){
			int n = scanner.nextInt();
			total = total - n + limit;
			month--;
		}
		System.out.print(total);
	}
}