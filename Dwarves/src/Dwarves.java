import java.util.ArrayList;
import java.util.Arrays;

public class Dwarves {
	private static String[] dwarfs = {"Happy", "Sleepy", "Dopey", "Bashful", "Sneezy", "Doc", "Grumpy"};
	private static String[] dwarves = {"Thorin", "Balin", "Dwalin", "Fili", "Kili", "Dori", 
										"Nori", "Ori", "Oin", "Gloin", "Bifur", "Bofur", "Bombur"};

	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<>(Arrays.asList(dwarfs));
		ArrayList<String> arr2 = new ArrayList<>(Arrays.asList(dwarves));
		
		for (String s : arr1) {
			System.out.println(s);
		}
		
		System.out.println("\nOther dwarps\n");
		for (String s : arr2) {
			System.out.println(s);
		}
	}
}
