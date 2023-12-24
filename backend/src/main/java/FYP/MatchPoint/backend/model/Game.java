package FYP.MatchPoint.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.sql.Date;
import java.sql.Time;
import java.util.UUID;

@Entity
@Table(name = "Game")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @UuidGenerator
    @Column(name = "id")
    private UUID id;

//    ------TEAM ID FK----
//    ------ORGANIZE ID FK---
//    ---VENUE ID FK------

    @Column(name = "date")
    private Date date;

    @Column(name = "time")
    private Time time;
}
