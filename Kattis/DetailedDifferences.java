import java.util.Scanner;

public class DetailedDifferences{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int cases = Integer.valueOf(scan.nextLine());
		for( int i = 0 ; i < cases ; i++ ){
			String line1 = scan.nextLine();
			String line2 = scan.nextLine();
			String outString = "";
			for( int j = 0 ; j < line1.length() ; j++ ){ 
				if( line1.charAt(j) == line2.charAt(j) )
					outString = outString + ".";
				else
					outString = outString + "*";
			}
			System.out.println(line1);
			System.out.println(line2);
			System.out.println(outString);
			System.out.println();
		}
	}
}