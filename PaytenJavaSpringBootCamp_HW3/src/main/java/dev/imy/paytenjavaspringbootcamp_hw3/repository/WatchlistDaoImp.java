package dev.imy.paytenjavaspringbootcamp_hw3.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WatchlistDaoImp implements WatchlistDao{

    private final WatchlistJpaRepository watchlistJpaRepository;

    @Override
    public Long save(WatchlistEntity watchlistEntity) {
        watchlistJpaRepository.save(watchlistEntity);
        return watchlistEntity.getWatchlistId();
    }
}
