package dev.imy.paytenjavaspringbootcamp_hw3.controller.response;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class WatchListResponse {

    private Long id;


    public static String convertToWatchlistResponse(Long id) {
        return "Watchlist has been created with ID number : " + id;
    }
}
