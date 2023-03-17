package uk.co.metadesignsolutions.javachallenge.models;

import lombok.Getter;
import lombok.Setter;
import uk.co.metadesignsolutions.javachallenge.enums.Genre;

import javax.persistence.*;
import java.time.Duration;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "song")
@Setter
@Getter
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Genre> genres;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
    @JoinTable(
            name = "song_artists",
            joinColumns = @JoinColumn(name = "song_id"),
            inverseJoinColumns = @JoinColumn(name = "artist_id"))
    private Set<Artist> artists;


    private String url;

    private Duration length;


}
