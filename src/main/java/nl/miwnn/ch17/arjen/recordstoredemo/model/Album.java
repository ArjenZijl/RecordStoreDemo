package nl.miwnn.ch17.arjen.recordstoredemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author Arjen Zijlstra
 * The concept of an album for which my record store can have copies.
 */

@Entity
public class Album {

    @Id @GeneratedValue
    Long albumId;
    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }
}
