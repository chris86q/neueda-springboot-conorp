import java.util.ArrayList;

public class ToyStory {

	public static void main(String[] args) {
		String[] chara = {"Woody", "Buzz", "Slinky", "Ham", "Rex", "Mr Potato Head"};
		String[] actor = {"Tom Hanks", "Tim Allen", "Jim Varney", "John Ratzenburger", "Wallace Shawn", "Don Rickles"};
		ArrayList<Cast> cast = new ArrayList<>();
		
		for(int x = 0; x < chara.length; x++) {
			cast.add(new Cast(chara[x], actor[x]));
		}
		
		for(Cast c: cast) {
			System.out.println(c.chara + "\t:\t" + c.actor);
		}
	}
}
