import java.util.*;
public class Book{
	private String title;
	
	ArrayList<Book> books = new ArrayList<>();
	
	Book(String title)
	{
		this.title=title;
	}

	

	@Override
	public String toString() {
		return "Book [title=" + title + ", getTitle()=" + getTitle() + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public void test()
	{
		System.out.println(getTitle());
	}
	public void addAuthor(Author rpGheo) {
		// TODO Auto-generated method stub
		
	}
	public int createChapter(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
	public Chapter getChapter(int indexChapterOne) {
		// TODO Auto-generated method stub
		return null;
	}

}
