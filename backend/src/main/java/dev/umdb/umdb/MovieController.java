package dev.umdb.umdb;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping()
    @CrossOrigin
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<>(movieService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbid}")
    @CrossOrigin
    public ResponseEntity<Optional<Movie>> getMovie( @PathVariable String imdbid) {
        return new ResponseEntity<>(movieService.getMovieByImdbId(imdbid), HttpStatus.OK);
    }
}
