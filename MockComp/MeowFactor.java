import java.io.*;
import java.util.*;

public class MeowFactor{
	
	static boolean counter(long  input,long factor){
		return input % factor == 0;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long number = scan.nextLong();
		int highest = 1;
		for( int i = 2 ; i < number ; i++ ){
			if( counter(number, i) ){
				if( counter(number/i, i) ){
					if( counter(number/(Math.pow(i,2)), i) ){
						if( counter(number/(Math.pow(i,3)), i) ){
							if( counter(number/(Math.pow(i,4)), i) ){
								if( counter(number/Math.pow(i,5), i) ){
									if( counter(number/Math.pow(i,6), i) ){
										if( counter(number/Math.pow(i,7), i) ){
											if( counter(number/Math.pow(i,8), i) ){
												highest = i;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(highest);
	}
}
	