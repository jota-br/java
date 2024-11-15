package AlbumChallenge.dev.llpa;
import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<dev.llpa.Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;

        songs = new ArrayList<dev.llpa.Song>();
    }

    public boolean addSong(String title, double songDuration) {

        AlbumChallenge.dev.llpa.Song foundSong = findSong(title);
        if (foundSong == null) {
            this.songs.add(new dev.llpa.Song(title, songDuration));
            return true;
        }
        return false;
    }

    private dev.llpa.Song findSong(String title) {

        for (dev.llpa.Song song : this.songs) {
            if (song.getTitle() == title) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<dev.llpa.Song> list) {

        int index = trackNumber - 1;
        if (index >= 0 && index <= this.songs.size()) {
            dev.llpa.Song song = songs.get(index);
            list.add(song);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<dev.llpa.Song> list) {

        dev.llpa.Song song = findSong(title);
        if (song == null) {
            return false;
        }

        list.add(song);
        return true;
    }
}
