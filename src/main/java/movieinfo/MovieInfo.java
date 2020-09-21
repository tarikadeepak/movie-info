package movieinfo;

import java.util.List;

public class MovieInfo {
	String name;
	String description;
	List<String> starring;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getStarring() {
		return starring;
	}
	public void setStarring(List<String> starring) {
		this.starring = starring;
	}
	public MovieInfo(String name, String description, List<String> starring) {
		super();
		this.name = name;
		this.description = description;
		this.starring = starring;
	}
}
