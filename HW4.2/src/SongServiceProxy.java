import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongServiceProxy implements SongService {

    private SongService songService;
    private Map<Integer, Song> songMap;

    public SongServiceProxy(SongService songService) {
        this.songService = songService;
        this.songMap = new HashMap<>();
    }

    @Override
    public Song searchById(Integer songID) {
        Song song = songMap.get(songID);
        if (song == null) {
            song = songService.searchById(songID);
            songMap.put(songID, song);
        }
        return song;
    }

    @Override
    public List<Song> searchByTitle(String title) {
        return songService.searchByTitle(title);
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        return songService.searchByAlbum(album);
    }
}
