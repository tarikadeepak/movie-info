package movieinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieInfoController {
	@Autowired
	MovieInfoService service;
	@RequestMapping("/movies/{moviename}")
	MovieInfo getMovieInfo(@PathVariable("moviename") String name) {
		return service.getMovieInfo(name);
	}
}
