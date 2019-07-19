package ibm.ibmDemo.beans;

public class FilmResponse {
    private String title;

    private String location;
    
    public FilmResponse(String title, String location) {
        this.title = title;
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
