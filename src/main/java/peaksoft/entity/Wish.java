package peaksoft.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "wish")
public class Wish {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wish_seq")
    @SequenceGenerator(name = "wish_seq")
    @Column(name = "id", nullable = false)
    private Long id;
    private String photo;
    private String title;
    private LocalDate dateOfHoliday;
    private Holiday holidays;
    private Profile profile;

}