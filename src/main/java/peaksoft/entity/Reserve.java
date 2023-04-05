package peaksoft.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "reserve")
public class Reserve {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reserve_seq")
    @SequenceGenerator(name = "reserve_seq")
    @Column(name = "id", nullable = false)
    private Long id;
    private List<Wish>wishList;
    private List<Charity>charities;
    private Profile profile;

}