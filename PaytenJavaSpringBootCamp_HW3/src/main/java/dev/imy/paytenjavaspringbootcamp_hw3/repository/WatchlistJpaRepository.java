package dev.imy.paytenjavaspringbootcamp_hw3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchlistJpaRepository extends JpaRepository<WatchlistEntity, Long>{


}
