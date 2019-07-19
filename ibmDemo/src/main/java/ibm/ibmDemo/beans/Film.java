package ibm.ibmDemo.beans;

import java.util.List;

public class Film {

    private String title;

    private List<String> locations;

    private String actor1;

    private String actor2;

    private String actor3;

    private String year;

    private String funFacts;

    private String productionCompany;

    private String distributor;

    private String writer;

    private String director;

    /*
    For this exercise purpose, a Film is created from a title and a location
     */
    public Film(String title, List<String> locations) {
        this.setTitle(title);
        this.setLocations(locations);
    }

    public Film(String title, List<String> locations, String actor1, String actor2, String actor3,
                String year, String funFacts, String productionCompany, String distributor,
                String writer, String director) {
        this.setTitle(title);
        this.setLocations(locations);
        this.setActor1(actor1);
        this.setActor2(actor2);
        this.setActor3(actor3);
        this.setYear(year);
        this.setFunFacts(funFacts);
        this.setProductionCompany(productionCompany);
        this.setDistributor(distributor);
        this.setWriter(writer);
        this.setDirector(director);
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getLocations() {
		return locations;
	}

	public void setLocations(List<String> locations) {
		this.locations = locations;
	}

	public String getActor1() {
		return actor1;
	}

	public void setActor1(String actor1) {
		this.actor1 = actor1;
	}

	public String getActor2() {
		return actor2;
	}

	public void setActor2(String actor2) {
		this.actor2 = actor2;
	}

	public String getActor3() {
		return actor3;
	}

	public void setActor3(String actor3) {
		this.actor3 = actor3;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getFunFacts() {
		return funFacts;
	}

	public void setFunFacts(String funFacts) {
		this.funFacts = funFacts;
	}

	public String getProductionCompany() {
		return productionCompany;
	}

	public void setProductionCompany(String productionCompany) {
		this.productionCompany = productionCompany;
	}

	public String getDistributor() {
		return distributor;
	}

	public void setDistributor(String distributor) {
		this.distributor = distributor;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
}
