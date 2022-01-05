package dev.imy.paytenjavaspringbootcamp_hw2.Controller;

import dev.imy.paytenjavaspringbootcamp_hw2.Models.Genre;
import dev.imy.paytenjavaspringbootcamp_hw2.Models.Member;
import dev.imy.paytenjavaspringbootcamp_hw2.Models.Movie;
import dev.imy.paytenjavaspringbootcamp_hw2.Models.WatchList;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;

@RestController
@RequestMapping("/memberControl")
public class MemberController {

    //Movie movie1 = Movie.builder()
    //        .movieId(10)
    //        .name("Matrix")
    //        .genre(Genre.Sci_Fi)
    //        .releaseYear(1999)
    //        .director("Wachowskis")
    //        .castList(Arrays.asList("Keanu Reeves", "Carrie Anne Moss"))
    //        .build();
//
    //Member mertkan_yilmaz = Member.builder()
    //        .memberId(2)
    //        .memberNameSurname("Mertkan Yilmaz")
    //        //.movieRateOfMember(a)
    //        .build();

    @PostMapping("/gradeMovie/{memberId}/{movieId}")
    @ResponseStatus(HttpStatus.OK)
    public Member GradeMovie(@PathVariable int memberId, @PathVariable int movieId, @RequestBody Member member){

        return Member.builder()
                .memberId(memberId)
                .memberNameSurname("Mertkan Yilmaz")
                .movieRateOfMember(member.getMovieRateOfMember())
                .build();

    }

    @PostMapping("/createWatchList/{memberId}")
    @ResponseStatus(HttpStatus.CREATED)
    public WatchList createWatchList(@PathVariable int memberId, @RequestBody WatchList watchList){

        return WatchList.builder()
                .watchListName(watchList.getWatchListName())
                .movieList(Arrays.asList())
                .build();

    }

    WatchList watchList1 = WatchList.builder()
            .watchListId(20)
            .watchListName("WatchList1")
            .build();

    //@PutMapping("/updateWatchList/{memberId}/{watchListId}")
    //@ResponseStatus(HttpStatus.OK)
    //public WatchList updateWatchList(@PathVariable int memberId, @PathVariable int watchListId, @RequestBody WatchList watchList){
//
    //    watchList1.setMovieList(watchList.getMovieList());
//
    //    //return WatchList.builder()
    //    //        .watchListId(watchListId)
    //    //        .watchListName(watchList.getWatchListName())
    //    //        .movieList(Arrays.asList())
    //    //        .build();
//
    //    return watchList1;
//
    //}


    @PutMapping("/updateWatchList/{memberId}/{watchListId}")
    @ResponseStatus(HttpStatus.OK)
    public WatchList updateWatchList(@PathVariable int memberId, @PathVariable int watchListId, @RequestBody WatchList watchList) {

        return WatchList.builder()
                .watchListId(watchListId)
                .watchListName("Liste1")
                .movieList(watchList.getMovieList())
                .build();
    }

}
