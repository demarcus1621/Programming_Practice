import java.util.*;

public class noDuplicates{
	public static void main(String[] args){
		HashSet<String> temp = new HashSet<String>();
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] words = input.split(" ");
		String output = "yes";
		for( String x : words ){
			if( !temp.add(x) ){
				output = "no";
				break;
			}
		}
		System.out.println(output);
	}
}