import java.util.*;
import java.io.*;

public class Server{
	public static void main(String[] args){
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		int maxTime = Integer.valueOf( scanner.nextLine().split(" ")[1] );
		String[] times = scanner.nextLine().split(" ");
		for(String x : times){
			maxTime -= Integer.valueOf(x);
			if( maxTime >= 0 )
				count++;	
		}
		System.out.println(count);
	}
}