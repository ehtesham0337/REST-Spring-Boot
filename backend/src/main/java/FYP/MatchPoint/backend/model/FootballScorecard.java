package FYP.MatchPoint.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.sql.Time;
import java.util.UUID;

@Entity
@Table(name = "FootballScorecard")
@Getter
@Setter
@AllArgsConstructor
public class FootballScorecard {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @UuidGenerator
    @Column(name = "id")
    private UUID id;

//    ----SCORECARD ID FK-----

    @Column(name = "timing")
    private Time timing;
    

    @Column(name = "goals")
    private Number goals;

    @Column(name = "fouls")
    private Number fouls;

    @Column(name = "corners")
    private Number corners;


}
