package FYP.MatchPoint.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name = "Organizers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Organizer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @UuidGenerator
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String organizer_name;

//    ------ VENUE ID FK-----------
//    @Column(name = "venue_id")
//    private UUID venue_id;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "email")
    private String email;
}
