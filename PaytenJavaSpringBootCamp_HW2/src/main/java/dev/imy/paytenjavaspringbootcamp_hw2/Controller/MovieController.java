package dev.imy.paytenjavaspringbootcamp_hw2.Controller;

import dev.imy.paytenjavaspringbootcamp_hw2.Models.Genre;
import dev.imy.paytenjavaspringbootcamp_hw2.Models.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/movieControl")
public class MovieController {

    @PostMapping("/createMovie")
    @ResponseStatus(HttpStatus.CREATED)
    public Movie CreateMovie(@RequestBody Movie movie){
        return Movie.builder()
                .movieId(movie.getMovieId())
                .name(movie.getName())
                .genre(movie.getGenre())
                .releaseYear(movie.getReleaseYear())
                .director(movie.getDirector())
                .castList(movie.getCastList())
                .build();
    }


    @GetMapping("/getMovie/{movieName}")
    @ResponseStatus(HttpStatus.OK)
    public Movie getMovie(@PathVariable String movieName){
        return Movie.builder()
                .name(movieName)
                .genre(Genre.Sci_Fi)
                .releaseYear(1999)
                .director("Wachowskis")
                .castList(Arrays.asList("Keanu Reeves", "Carrie Anne Moss"))
                .build();
    }


    @DeleteMapping("/deleteMovie/{movieName}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteMovie(@PathVariable String movieName){
        return (movieName + "has been deleted...");
    }


}
