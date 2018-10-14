
public class Pharagraph extends SubChapter{
	String text;
	
	Pharagraph(String name, String name2, String text) {
		super(name, name2);
		this.text=text;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pharagraph [text=" + text + ", getText()=" + getText() + "]";
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	

}
