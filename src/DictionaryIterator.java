import java.util.Iterator;
import java.util.NoSuchElementException;

public class DictionaryIterator implements Iterator<Word> {
	private Dictionary dictionary;
	private int index = 0;
	
	public DictionaryIterator(Dictionary dictionary) {
		this.dictionary = dictionary;
	}
	
	@Override
	public boolean hasNext() {
		if(index < dictionary.getLength()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public Word next() {
		if(!hasNext()) {
			throw new NoSuchElementException();
		}
		
		Word word = dictionary.getDictionaryAt(index);
		index++;
		return word;
	}
	
}