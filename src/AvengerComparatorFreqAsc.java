import java.util.Comparator;

public class AvengerComparatorFreqAsc implements Comparator<Avenger> {
	@Override
	public int compare(Avenger a1, Avenger a2) {
		int diff = a1.getFreq() - a2.getFreq();
		if (diff == 0) {
			diff = a1.getHeroAlias().length() - a2.getHeroAlias().length();
			if (diff == 0)
				return a1.getHeroAlias().compareTo(a2.getHeroAlias());
		}
		return diff;
	}
}
