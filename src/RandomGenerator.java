import java.util.Random;

public class RandomGenerator {

	public static void main(String[] args) {
		output("Generate 10 random integers between 0 and 6");
		Random rand = new Random();


		for (int i = 1; i <= 12; ++i){

		}
		int randomInt = 0 + rand.nextInt(6);
		output("Generated number: " + randomInt);

	
	System.out.println("Done."); 
	}
private static void output(String aMessage)
{
	System.out.println(aMessage);
}
}