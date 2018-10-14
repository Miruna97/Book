
public class Table extends SubChapter{
	String title;
	
	Table(String name, String name2, String title) {
		super(name, name2);
		this.title=title;
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Table [title=" + title + ", getTitle()=" + getTitle() + "]";
	}

	

}
