import java.util.Random;

/**
 * It is a driver class that prints out all the statistics such as Average, Count, Total and more.
 * 
 * @author Alexe Tataru
*/
public class Driver {
	public static void main(String[] args) {

		final int VALUES = 10; //holds the number of random values generated.
		Stats stats = new Stats(VALUES); //creates an object called "stats" from the Stats class.
		Random random = new Random(); // it creates a random object called "random" from the Random class.
		
		for (int i = 0; i < VALUES; i++) { //the loop keeps going until it reaches the number of values.
			stats.addValue(random.nextInt(100)); //creates 100 random values and adds them to stats
		}

		System.out.println("Numbers stored : ");
		System.out.println(stats);
	
		//prints all the statistics generated in the Stats.java class.
		System.out.println("Average = " + stats.getAverage());
		System.out.println("Count = " + stats.getLength());
		System.out.println("Total = " + stats.getTotal());
		System.out.println("Minimum value = " + stats.getMin());
		System.out.println("Maximum value = " + stats.getMax());
	}
}
