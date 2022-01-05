package dev.imy.paytenjavaspringbootcamp_hw2.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int movieId;
    private String name;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    private int releaseYear;
    private String director;
    private List<String> castList;

}
