import java.util.ArrayList;
import java.util.List;

public class SongServiceImplementation implements SongService {
    private List<Song> songList;

    public SongServiceImplementation() {
        songList = new ArrayList<>();
    }

    public SongServiceImplementation(List<Song> songList) {
        this.songList = songList;
    }

    @Override
    public Song searchById(Integer songID) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(Song song : songList) {
            if(song.getId() == songID) {
                return song;
            }
        }
        return null;
    }

    @Override
    public List<Song> searchByTitle(String title) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Song> matchingSongs = new ArrayList<>();
        for(Song song : songList) {
            if(song.getTitle().equals(title)) {
                matchingSongs.add(song);
            }
        }
        return matchingSongs;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Song> matchingSongs = new ArrayList<>();
        for(Song song : songList) {
            if(song.getAlbum().equals(album)) {
                matchingSongs.add(song);
            }
        }
        return matchingSongs;
    }
}
