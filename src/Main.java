public class Main {
	public static void main(String[] args) {
		Dictionary dictionary = new Dictionary();
		dictionary.appendWord(new Word("apple"));
		dictionary.appendWord(new Word("lemon"));
		dictionary.appendWord(new Word("peach"));
		dictionary.appendWord(new Word("melon"));
		
		for(Word word: dictionary) {
			System.out.println(word.getWord());
		}
	}
}