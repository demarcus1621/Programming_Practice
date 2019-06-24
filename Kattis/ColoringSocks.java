import java.util.*;
import java.io.*;

public class ColoringSocks{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String[] line1 = in.nextLine().split(" ");
		String[] line2 = in.nextLine().split(" ");
		int numSocks = Integer.valueOf(line1[0]);
		int maxCap = Integer.valueOf(line1[1]);
		int maxVar = Integer.valueOf(line1[2]);
		int numMachines = 0;
		int temp = 0;
		for(int i = 0 ; i < line2.length - 1 ; i += 2){
			if(Integer.valueOf(line2[i+1]) - Integer.valueOf(line2[i]) <= maxVar && temp < maxCap){
				temp += 2;
			}
			else{
				count++;
				temp = 0;
			}
		}
	}
}