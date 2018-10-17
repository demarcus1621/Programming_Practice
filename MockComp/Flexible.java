import java.util.*;
import java.io.*;

public class Flexible{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String in = scanner.nextLine();
		int max = Integer.valueOf(in.split(" ")[0]);
		int parts = Integer.valueOf(in.split(" ")[1]);
		in = scanner.nextLine();
		String array[] = in.split(" ");
		int index[] = new int[array.length];
		for( int i = 0 ; i < array.length ; i++ )
			index[i] = Integer.valueOf(array[i]);
		for( int i = 0 ; i <= max ; i++ ){
			for( int j = 0 ; j < index.length ; j++ ){
				if( i == index[j] || i == max || i == max - index[j] ){
					System.out.print(i + " ");
					break;
				}
				else{
					for( int k = 0 ; k < j ; k++ ){
						if( i == index[j] - index[k]){
							System.out.print(i + " ");
							break;
						}
					}
				}
			}
		}
	}
}