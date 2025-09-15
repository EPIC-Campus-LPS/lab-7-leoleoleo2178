package packagename;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
public class username {

	public static void main(String[] args) throws IOException {
		File words = new File("emails.txt");
		Scanner sc = new Scanner(words);
		Random random = new Random();
		String select = "abcdefghigklmnopqrstuvwxyz1234567890";
		
		while(sc.hasNextLine()) {
			System.out.print(sc.nextLine() + " ");
			for (int i = 0; i < 11; i++) {
				int rand = random.nextInt(36);
				System.out.print(select.substring(rand,rand+1));
			}
			System.out.println("");
			
		}
	}

}
