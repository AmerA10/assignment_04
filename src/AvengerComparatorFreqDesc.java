import java.util.Comparator;
public class AvengerComparatorFreqDesc implements Comparator<Avenger> {
	@Override
	public int compare(Avenger a1, Avenger a2) {
		int diff = a2.getFreq() - a1.getFreq();
		if (diff == 0) {
			return a1.compareTo(a2);
		}
		return diff;
	}
}
