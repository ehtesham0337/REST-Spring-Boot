package FYP.MatchPoint.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name = "Team")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @UuidGenerator
    @Column(name = "id")
    private UUID id;

//    ------- USER ID FK -----------
//    @Column(name = "id")
//    private UUID id;

    @Column(name = "team_name")
    private String team_name;

    @Column(name = "captain")
    private String captain;

    @Column(name = "coach")
    private String coach;

    @Column(name = "total_matches_played")
    private Number total_matches_played;



}
