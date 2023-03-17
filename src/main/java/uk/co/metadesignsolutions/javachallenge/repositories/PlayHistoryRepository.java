package uk.co.metadesignsolutions.javachallenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import uk.co.metadesignsolutions.javachallenge.models.PlayHistory;
import uk.co.metadesignsolutions.javachallenge.models.Song;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface PlayHistoryRepository extends JpaRepository<PlayHistory, Long> {



}
