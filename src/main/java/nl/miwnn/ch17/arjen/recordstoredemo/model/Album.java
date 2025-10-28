package nl.miwnn.ch17.arjen.recordstoredemo.model;

/**
 * @Author Arjen Zijlstra
 * The concept of an album for which my record store can have copies.
 */

public class Album {

    String title;

    public Album(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
