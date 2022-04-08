package Files;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class LAB8 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		FileWriter file = new FileWriter("expenses.txt",true);
		String redo;
		
		do {
			System.out.println("Input your name: ");
			String name = scan.next();
			
			System.out.println("What did you purchase? ");
			String purchase = scan.next();
			
			System.out.println("How much did you pay? (in USD) ");
			double price = scan.nextDouble();
			
			String str = name + " purchased " + purchase + " for " + price + " US Dollars.";
			
			file.write(str + "\n");
			
			System.out.print("Would you like to log another purchase? (y/n) ");
			redo = scan.next();

		}while (redo.equalsIgnoreCase("y"));
		
		file.close();
		
		System.out.print("Would you like to read a summary of your purchases? ");
		String summ = scan.next();
		
		File newFile = new File("expenses.txt");
		Scanner scanFromFile = new Scanner(newFile);	
		
		if (summ.equalsIgnoreCase("y")) {
			while(scanFromFile.hasNext()) {
				String summary = scanFromFile.nextLine();
				System.out.print(summary);
				
			}
			
		}
		
	}
		
}
