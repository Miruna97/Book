
public class SubChapter extends Chapter {
	String name2;
	
	SubChapter(String name, String name2)
	{
		super(name);
		this.name2=name2;
	}



	@Override
	public String toString() {
		return "SubChapter [name2=" + name2 + ", getName2()=" + getName2() + "]";
	}
	public String getName2() {
		return name2;
	}

	public void setName(String name2) {
		this.name2 = name2;
	}



	public void createNewParagraph(String string) {
		// TODO Auto-generated method stub
		
	}



	public void createNewImage(String string) {
		// TODO Auto-generated method stub
		
	}



	public void createNewTable(String string) {
		// TODO Auto-generated method stub
		
	}
	

}
