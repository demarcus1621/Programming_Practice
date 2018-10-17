import java.util.*;
import java.io.*;

public class R2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine();
		int x1 = Integer.valueOf(temp.split(" ")[0]);
		int x2 = Integer.valueOf(temp.split(" ")[1]);
		System.out.print(2 * x2 - x1);
	}
}