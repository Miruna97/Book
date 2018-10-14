
public class Chapter {
	String name;
	
	Chapter(String name)
	{
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Chapter [name=" + name + ", getName()=" + getName() + "]";
	}

	public int createSubChapter(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	public SubChapter getSubChapter(int indexSubChapterOneOne) {
		// TODO Auto-generated method stub
		return null;
	}

}
