```java
import java.util.Arrays;

class Playlist {
    private String[] songs;
    private int count = 0;

    Playlist(int size) {
        songs = new String[size];
    }

    void addSong(String song) {
        if (count < songs.length) {
            songs[count] = song;
            count++;
        }
    }

    String[] getSongs() {
        return Arrays.copyOf(songs, count);
    }

    int getSongCount() {
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Playlist p = new Playlist(10);

        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();
        copy[0] = "Hacked";

        System.out.println("First song = " + p.getSongs()[0]);
        System.out.println("Song count = " + p.getSongCount());
    }
}
```
