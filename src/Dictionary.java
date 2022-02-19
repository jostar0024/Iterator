import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dictionary implements Iterable<Word> {
	private List<Word> words;
	
	public Dictionary() {
		this.words = new ArrayList<>();
	};
	
	public Word getDictionaryAt(int index) {
		return words.get(index);
	}
	
	public void appendWord(final Word word) {
		words.add(word);
	}
	
	public int getLength() {
		return words.size();
	}
	
	@Override
	public Iterator<Word> iterator() {
		return new DictionaryIterator(this);
	}
	
}