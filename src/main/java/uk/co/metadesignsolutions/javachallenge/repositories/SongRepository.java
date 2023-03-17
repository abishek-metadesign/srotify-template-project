package uk.co.metadesignsolutions.javachallenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import uk.co.metadesignsolutions.javachallenge.models.Song;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<Song,Long> {


    @Query(value = "select s.* from song s , ( select count(p.song_id) as co ,song_id  from play_history p where p.listened_at between :startTime and :endTime group by p.song_id  ) p where p.song_id = s.id order by  p.co desc ", nativeQuery = true)
    List<Song> getSongsByPlayHistory(@Param("startTime") LocalDate startTime, @Param("endTime") LocalDate endTime);

}
