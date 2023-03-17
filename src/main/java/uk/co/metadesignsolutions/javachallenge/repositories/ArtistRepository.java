package uk.co.metadesignsolutions.javachallenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.co.metadesignsolutions.javachallenge.models.Artist;

@Repository
public interface ArtistRepository extends JpaRepository<Artist,Long> {

}
