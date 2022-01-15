package dev.imy.paytenjavaspringbootcamp_hw3.controller.request;

import dev.imy.paytenjavaspringbootcamp_hw3.repository.MemberEntity;
import dev.imy.paytenjavaspringbootcamp_hw3.service.Watchlist;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class WatchlistRequest {

    @NotBlank
    private String watchlistName;

    @NotBlank
    private Long memberId;


    public Watchlist convertToWatchlist(WatchlistRequest watchlistRequest) {
        return Watchlist.builder()
                .watchlistName(watchlistName)
                .memberId(memberId)
                .build();
    }
}
