import java.util.ArrayList;

public class DwarvesB {

	public static void main(String[] args) {
		Dwarf d1 = new Dwarf(null, null, null);
		Dwarf d2 = new Dwarf(null, null, null);
		Dwarf d3 = new Dwarf(null, null, null);
		Dwarf d4 = new Dwarf(null, null, null);
		Dwarf d5 = new Dwarf(null, null, null);
		Dwarf d6 = new Dwarf(null, null, null);
		Dwarf d7 = new Dwarf(null, null, null);
		
		d1.setName("Sleepy");
		d1.setAuthor("Disney");
		d1.setImage("sleepy.jpg");
		
		d2.setName("Happy");
		d2.setAuthor("Disney");
		d2.setImage("Happy.jpg");
		
		d3.setName("Dopey");
		d3.setAuthor("Disney");
		d3.setImage("Dopey.jpg");
		
		d4.setName("Bashful");
		d4.setAuthor("Disney");
		d4.setImage("Bashful.jpg");
		
		d5.setName("Sneezy");
		d5.setAuthor("Disney");
		d5.setImage("Sneezy.jpg");
		
		d6.setName("Doc");
		d6.setAuthor("Disney");
		d6.setImage("Doc.jpg");
		
		d7.setName("Grumpy");
		d7.setAuthor("Disney");
		d7.setImage("Grumpy.jpg");
		
		ArrayList<Dwarf> dwarfs = new ArrayList<>();
		dwarfs.add(d1);
		dwarfs.add(d2);
		dwarfs.add(d3);
		dwarfs.add(d4);
		dwarfs.add(d5);
		dwarfs.add(d6);
		dwarfs.add(d7);
		
		for(Dwarf d: dwarfs) {
			System.out.println(d.getName());
		}
		
		System.out.println("\nOther dwarps\n");
		
		String[] dwarvesList = {"Thorin", "Balin", "Dwalin", "Fili", "Kili", "Dori", 
				"Nori", "Ori", "Oin", "Gloin", "Bifur", "Bofur", "Bombur"};
		ArrayList<Dwarf> dwarves = new ArrayList<>();
		
		
		for(String s: dwarvesList) {
			dwarves.add(new Dwarf(s, "Tolkien", s+".jpg"));
		}
		
		for(Dwarf d: dwarves) {
			System.out.println(d.getName());
			System.out.println(d.getAuthor());
			System.out.println(d.getImage());
		}
	}
}
