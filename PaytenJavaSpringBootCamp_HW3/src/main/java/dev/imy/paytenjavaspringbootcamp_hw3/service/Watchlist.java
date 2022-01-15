package dev.imy.paytenjavaspringbootcamp_hw3.service;

import dev.imy.paytenjavaspringbootcamp_hw3.repository.WatchlistEntity;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@EqualsAndHashCode
public class Watchlist {

    private String watchlistName;
    private Long memberId;


    public WatchlistEntity convertToWatchlistEntity(Watchlist watchlist) {
        WatchlistEntity watchlistEntity = new WatchlistEntity();
        watchlistEntity.setWatchlistName(watchlist.getWatchlistName());
        watchlistEntity.setMembersId(getMemberId());
        return watchlistEntity;
    }
}
