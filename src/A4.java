
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Collection;

/**
 * COMP 2503 Winter 2020 Assignment 4
 * 
 * This program must read a input stream and keeps track of the frequency at
 * which an avenger is mentioned either by name or alias. The program must use HashMaps
 * for keeping track of the Avenger Objects, and it must use TreeMaps
 * for storing the data. 
 * 
 * @author Amer Alagami
 * @date Fall 2020
 */

public class A4 {
	
	public String[][] avengerRoster = { { "captainamerica", "rogers" }, { "ironman", "stark" },
			{ "blackwidow", "romanoff" }, { "hulk", "banner" }, { "blackpanther", "tchalla" }, { "thor", "odinson" },
			{ "hawkeye", "barton" }, { "warmachine", "rhodes" }, { "spiderman", "parker" },
			{ "wintersoldier", "barnes" } };

	private int topN = 4;
	private int totalwordcount = 0;
	private Scanner input = new Scanner(System.in);

	/* TODO:
	 * Create the necessary hashMap and treeMap objects to keep track of the Avenger objects 
	 * Remeber that a hashtable does not have any inherent ordering of its contents.
	 * But for this assignment we want to be able to create the sorted lists avenger objects.
	 * Use TreeMap objects (which are binary search trees, and hence have an
	 * ordering) the following orders: alphabetical, mention order, most popular, and least popular
	 * The alphabetical order TreeMap must be constructed with the natural order of the Avenger objects.
	 * The other three orderings must be created by passing the corresponding Comparators to the 
	 * TreeMap constructor. 
	 */
	
	public static void main(String[] args) {
		A4 a4 = new A4();
		a4.run();
	}

	public void run() {
		readInput();
		createdOrderedTreeMaps();
		printResults();
	}

	private void createdOrderedTreeMaps() {
		/* TODO:
		 * Create an iterator over the key set in the HashMap that keeps track of the avengers
		 * Add avenger objects to the treeMaps with different orderings.
		 * 
		 ** Hint: 
		 * Note that the HashMap and the TreeMap classes do not implement
		 * the Iterable interface at the top level, but they have
		 * methods that return Iterable objects, such as keySet() and entrySet().
		 * For example, you can create an iterator object over 
		 * the 'key set' of the HashMap and use the next() method in a loopwg
		 * to get each word object. 
		 */		
	}

	/**
	 * read the input stream and keep track how many times avengers are mentioned by
	 * alias or last name.
	 */
	private void readInput() {
		/*
		 * In a loop, while the scanner object has not reached end of stream, - read a
		 * word. - clean up the word - if the word is not empty, add the word count. -
		 * Check if the word is either an avenger alias or last name then - Create a new
		 * avenger object with the corresponding alias and last name. - if this avenger
		 * has already been mentioned, increase the frequency count for the object
		 * already in the hashMap. - if this avenger has not been mentioned before, add the
		 * newly created avenger to the hashMap, remember to set the frequency, and 
		 * to keep track of the mention order
		 */

	}
	
	private boolean isAvenger(String word) {
		for (int i = 0; i < avengerRoster.length; i++) {
			if ((avengerRoster[i][0].equals(word)) 
					|| (avengerRoster[i][1].equals(word))) {
				return true;
			}
		}
		return false;
	}
	
	private String cleanWord(String next) {
		// First, if there is an apostrophe, the substring
		// before the apostrophe is used and the rest is ignored.
		// Words are converted to all lowercase.
		// All other punctuation and numbers are skipped.
		String ret;
		int inx = next.indexOf('\'');
		if (inx != -1) {
			ret = next.substring(0, inx).toLowerCase().trim().replaceAll("[^a-z]", "");
		}
			
		else {
			ret = next.toLowerCase().trim().replaceAll("[^a-z]", "");
		}
			
		return ret;
	}
	private Avenger createAvengerObject(String word, int mentionOrder) {
		int inx = -1;
		for (int i = 0; i < avengerRoster.length; i++) {
			
			if (avengerRoster[i][0].equals(word) 
					|| avengerRoster[i][1].equals(word)) {
				inx = i;
				break;
			}
		}
		if (inx != -1) {
			
			return new Avenger(avengerRoster[inx][0], avengerRoster[inx][1], mentionOrder);
		} else
			return null;
	}

	/**
	 * print the results
	 */
	private void printResults() {
		/*
		 * Please first read the documentation for TreeMap to see how to 
		 * iterate over a TreeMap data structure in Java.
		 *  
		 * Hint for printing the required list of avenger objects:
		 * Note that the TreeMap class does not implement
		 * the Iterable interface at the top level, but it has
		 * methods that return Iterable objects.
		 * You must either create an iterator over the 'key set',
		 * or over the values 'collection' in the TreeMap.
		 * 
		 */
		
		
		System.out.println("Total number of words: " + totalwordcount);
		//System.out.println("Number of Avengers Mentioned: " + ??);
		System.out.println();

		System.out.println("All avengers in the order they appeared in the input stream:");
		// Todo: Print the list of avengers in the order they appeared in the input
		// Make sure you follow the formatting example in the sample output
		System.out.println();

		System.out.println("Top " + topN + " most popular avengers:");
		// Todo: Print the most popular avengers, see the instructions for tie breaking
		// Make sure you follow the formatting example in the sample output
		System.out.println();

		System.out.println("Top " + topN + " least popular avengers:");
		// Todo: Print the least popular avengers, see the instructions for tie breaking
		// Make sure you follow the formatting example in the sample output
		System.out.println();

		System.out.println("All mentioned avengers in alphabetical order:");
		// Todo: Print the list of avengers in alphabetical order
		System.out.println();
	}
}
