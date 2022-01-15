package dev.imy.paytenjavaspringbootcamp_hw3.repository;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table
public class WatchlistEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long watchlistId;

    private String watchlistName;
    private Long membersId;

    @OneToOne
    private MemberEntity member;

    @ManyToMany(mappedBy = "watchlistEntityList", fetch = FetchType.EAGER)
    private List<MovieEntity> moviesList;

}
