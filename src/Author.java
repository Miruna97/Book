
public class Author {
	String name;
	
	Author(String name)
	{
		this.name=name;
	}
	
	

	@Override
	public String toString() {
		return "Author [name=" + name + ", getName()=" + getName() + "]";
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
