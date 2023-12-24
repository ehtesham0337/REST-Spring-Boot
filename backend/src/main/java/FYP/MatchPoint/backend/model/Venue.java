package FYP.MatchPoint.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name = "Venue")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @UuidGenerator
    @Column(name = "id")
    private UUID id;

    @Column(name = "venue_name")
    private String venueName;

    @Column(name = "location")
    private String location;

    @Column(name = "games_hosted")
    private Number games_hosted;

    @Column(name = "capacity")
    private Number capacity;

}
