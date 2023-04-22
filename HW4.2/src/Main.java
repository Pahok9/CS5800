import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Song> listOfSong = new ArrayList<>();
        listOfSong.add(new Song(1, "Water Melon", "Harry Styles", "Fine Line", 174));
        listOfSong.add(new Song(2, "Sweater Weather", "The Neighbourhood", "I Love You", 236));
        listOfSong.add(new Song(3, "Let's Groove", "Earth, Wind & Fire", "242", 244));
        listOfSong.add(new Song(4, "Sugar", "Maroon 5", "V", 235));
        listOfSong.add(new Song(5, "Sugar", "Robin Schulz", "Sugar", 219));

        SongService songService = new SongServiceImplementation(listOfSong);
        SongService songServiceProxy = new SongServiceProxy(songService);

        Song song1 = songServiceProxy.searchById(1);
        System.out.println(song1);
        Song song2 = songServiceProxy.searchById(2);
        System.out.println(song2);
        List<Song> song3 = songServiceProxy.searchByTitle("Sugar");
        System.out.println(song3);
        List<Song> song4 = songServiceProxy.searchByAlbum("I Love You");
        System.out.println(song4);
        Song song5 = songServiceProxy.searchById(5);
        System.out.println(song5);
    }
}
