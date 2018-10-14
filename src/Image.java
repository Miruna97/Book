
public class Image extends SubChapter{
	String imageName;

	Image(String name, String name2, String imageName) {
		super(name, name2);
		this.imageName=imageName;
		// TODO Auto-generated constructor stub
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	@Override
	public String toString() {
		return "Image [imageName=" + imageName + ", getImageName()=" + getImageName() + "]";
	}

	

}
