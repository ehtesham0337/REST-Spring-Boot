package FYP.MatchPoint.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name = "Scorecard")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Scorecard {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @UuidGenerator
    @Column(name = "id")
    private UUID id;


    //------GAME ID FK------
    //@Column(name = "scorecard_id")
    //private UUID scorecard_id;

    //------TEAM ID FK-------
//    @Column(name = "scorecard_id")
//    private UUID scorecard_id;


}



