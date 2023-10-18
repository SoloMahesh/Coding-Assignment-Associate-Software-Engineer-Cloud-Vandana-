
import java.util.Scanner;

public class panagram {
	
	public static boolean checkIfPangram(String sentence) {
        for(char c='a';c<='z';c++)
            if(sentence.indexOf(c)== -1)
            	return false;
        return true;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(checkIfPangram(s.toLowerCase()));
	}
}