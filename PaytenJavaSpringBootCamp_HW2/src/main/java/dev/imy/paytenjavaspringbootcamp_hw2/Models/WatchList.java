package dev.imy.paytenjavaspringbootcamp_hw2.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashMap;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WatchList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int watchListId;
    private String watchListName;
    private List<String> movieList;

}
