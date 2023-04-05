package peaksoft.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profile_seq")
    @SequenceGenerator(name = "profile_seq")
    @Column(name = "id", nullable = false)
    private Long id;
    private List<User> friends;
    private List<Wish> feedOfSite;
    private List<Charity>charities;
    private List<Wish>wishList;
    private List<Reserve> reserves;

}