
public class TestContentParser {

	public static void main(String[] args) {
		ContentParserProxy cpp = new ContentParserProxy("Proxy Pattern make a good system performance");
		
		System.out.println("First request command could take a time to processing...");
		System.out.println(cpp.getCharacterCount());
		System.out.println();
		
		System.out.println("Any more request could have a short time processing (like cache)");
		System.out.println(cpp.getCharacterCount());
		System.out.println(cpp.getWordCount());
		System.out.println(cpp.getCharacterCount());
		System.out.println(cpp.getWordCount());
	}

}
