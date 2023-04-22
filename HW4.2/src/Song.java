public class Song {
    private int id;
    private String title;
    private String artist;
    private String album;
    private int duration;

    public Song(int id, String title, String artist, String album, int duration) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAlbum() {
        return album;
    }

    @Override
    public String toString() {
        return "Song title: " + title + " Artist: " + artist + " Album: " + album + " ID: " + id + " Duration: " + duration + "s";
    }
}
