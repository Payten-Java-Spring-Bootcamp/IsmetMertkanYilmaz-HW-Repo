package dev.imy.paytenjavaspringbootcamp_hw3.controller;

import dev.imy.paytenjavaspringbootcamp_hw3.controller.request.MemberRequest;
import dev.imy.paytenjavaspringbootcamp_hw3.controller.request.MovieRequest;
import dev.imy.paytenjavaspringbootcamp_hw3.controller.request.WatchlistRequest;
import dev.imy.paytenjavaspringbootcamp_hw3.controller.response.MemberResponse;
import dev.imy.paytenjavaspringbootcamp_hw3.controller.response.MovieResponse;
import dev.imy.paytenjavaspringbootcamp_hw3.controller.response.WatchListResponse;
import dev.imy.paytenjavaspringbootcamp_hw3.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
    private final WatchlistService watchlistService;

    @PostMapping("/members")
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@RequestBody @Valid MemberRequest request){
        Member member = request.convertToMember();
        Long id = memberService.create(member);
        return MemberResponse.convertToMemberIdRespond(id);
    }

    @PostMapping("/members/watchlist")
    @ResponseStatus(HttpStatus.CREATED)
    public String createWatchlist(@RequestBody @Valid WatchlistRequest watchlistRequest){
        Watchlist watchlist = watchlistRequest.convertToWatchlist(watchlistRequest);
        Long id = watchlistService.create(watchlist);
        return WatchListResponse.convertToWatchlistResponse(id);

    }

}
