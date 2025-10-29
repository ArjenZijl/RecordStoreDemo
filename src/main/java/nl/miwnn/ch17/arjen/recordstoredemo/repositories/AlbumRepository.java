package nl.miwnn.ch17.arjen.recordstoredemo.repositories;


import nl.miwnn.ch17.arjen.recordstoredemo.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
