package dev.imy.paytenjavaspringbootcamp_hw3.service;

import dev.imy.paytenjavaspringbootcamp_hw3.repository.WatchlistDao;
import dev.imy.paytenjavaspringbootcamp_hw3.repository.WatchlistEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WatchlistServiceImp implements WatchlistService{

    private final WatchlistDao watchlistDao;

    @Override
    public Long create(Watchlist watchlist) {
        WatchlistEntity watchlistEntity = watchlist.convertToWatchlistEntity(watchlist);
        return watchlistDao.save(watchlistEntity);
    }
}
