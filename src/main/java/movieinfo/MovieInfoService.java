package movieinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieInfoService {
	@Autowired
	MovieInfoRepository repository;
	public MovieInfo getMovieInfo(String name) {
		return repository.getMovieInfo(name);
	}
}
