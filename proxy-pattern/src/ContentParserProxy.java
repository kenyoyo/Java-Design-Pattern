
public class ContentParserProxy implements IContentParser {

	private ContentParser contentParser;
	private String content;
	
	public ContentParserProxy(String content) {
		this.content = content;
	}
	
	@Override
	public int getWordCount() {
		if(contentParser == null)
			contentParser = new ContentParser(content);
		return contentParser.getWordCount();
	}

	@Override
	public int getCharacterCount() {
		if(contentParser == null)
			contentParser = new ContentParser(content);
		return contentParser.getCharacterCount();
	}
	
}
