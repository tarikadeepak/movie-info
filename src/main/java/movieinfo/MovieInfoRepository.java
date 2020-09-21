package movieinfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class MovieInfoRepository {
	List<MovieInfo> movieList = new ArrayList<MovieInfo>(Arrays.asList(
			new MovieInfo("Movie1", "Movie1 Description", Arrays.asList("Deepak")),
			new MovieInfo("Movie2", "Movie1 Description", Arrays.asList("Divya")),
			new MovieInfo("Movie3", "Movie1 Description", Arrays.asList("Deepak", "Divya")))); 
	
	public MovieInfo getMovieInfo(String movieName){
		return movieList.stream().filter(movie -> movieName.equals(movie.getName())).findFirst().get();
	}
}
