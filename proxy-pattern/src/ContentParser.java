
public class ContentParser implements IContentParser {

	private String content;

	public ContentParser(String content) {
		this.content = content;
		
		// sleep for 3 second to make this situation look expensive processing.
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int getWordCount() {
		String[] wordSplit = content.split(" ");

		return wordSplit.length;
	}

	@Override
	public int getCharacterCount() {
		int characterCount = 0;

		for (int i = 0; i < content.length(); i++) {
			if (content.charAt(i) != ' ')
				characterCount++;
		}

		return characterCount;
	}

}
