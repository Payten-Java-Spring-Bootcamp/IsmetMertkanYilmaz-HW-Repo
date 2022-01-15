package dev.imy.paytenjavaspringbootcamp_hw3.repository;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String memberName;

    @Column(nullable = false)
    private String memberEmail;

    @OneToOne(mappedBy = "member", fetch = FetchType.EAGER)
    private WatchlistEntity watchlist;

}
