import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		Scanner put = new Scanner(System.in);
		System.out.print("Enter finger`s number: ");
		int numb = put.nextInt();
		if (numb <= 0 || numb > 5){
			System.out.println("Error number");
			System.exit(1);
		}
		switch(numb){
			case 1:
				System.out.println("Это большой палец");
				break;
			case 2:
				System.out.println("Это указательный палец");
				break;
			case 3:
				System.out.println("Это средний палец");
				break;
			case 4:
				System.out.println("Это безымянный палец");
				break;
			case 5:
				System.out.println("Это мизинец");
				break;
		}
	}
}
