
public class Avenger implements Comparable<Avenger>{	
private String heroName;		
private String heroAlias;
private int frequency;
private int mentionIndex;
		/*
		 * Contructor
		 * @param  name of hero
		 * @param alias of hero
		 */
		public Avenger(String heroName, String heroAlias, int mentionIndex) 
		{
			this.heroName = heroName;
			this.heroAlias = heroAlias;
			this.frequency = 1;
			this.mentionIndex = mentionIndex;
		}
		
		public String getHeroName() 
		{
			return heroName;
		}
		
		public String getHeroAlias() 
		{
			return heroAlias;
		}
		
		public int getMentionIndex() {
			return mentionIndex;
		}
		
		public int getFreq() 
		{
			return frequency;
		}
		
		/*
		 *increment frequency  
		 */
		public void incrementFreq() 
		{
			this.frequency++;
		}
		
		/*
		 * compare Avenger aliases
		 * @param Avenger
		 * @return -1, 0, 1 if this object is less, equal or greater then other
		 */
		
		public int compareTo(Avenger other) 
		{
			
			return this.heroName.compareTo(other.heroName);
		}
		
		
		
		/*
		 * boolean compare Avengers aliases
		 * @param Avenger
		 * @return true if same alais, false if diff alias
		 */
		public boolean equals(Avenger other) 
		{
			return this.heroAlias.equals(other.heroAlias);
		}
		
		/*
		 * overrides toString to make a phrase
		 * @return String 
		 */
		@Override
		public String toString() 
		{
			return heroName + " aka " + heroAlias + " mentioned " + frequency + " time(s)";
			
		}

}

