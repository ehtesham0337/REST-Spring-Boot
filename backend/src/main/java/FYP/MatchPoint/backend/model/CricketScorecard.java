package FYP.MatchPoint.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name = "CricketScorecard")
@Getter
@Setter
@AllArgsConstructor
public class CricketScorecard {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @UuidGenerator
    @Column(name = "id")
    private UUID id;

//    ----SCORECARD ID FK-----

    @Column(name = "runs")
    private Number runs;

    @Column(name = "toss")
    private String toss;

    @Column(name = "overs")
    private Number overs;

    @Column(name = "wickets")
    private Number wickets;

    @Column(name = "fours")
    private Number fours;

    @Column(name = "sixes")
    private Number sixes;

    @Column(name = "dots")
    private Number dots;

    @Column(name = "wides")
    private Number wides;

    @Column(name = "balls")
    private Number balls;












}
