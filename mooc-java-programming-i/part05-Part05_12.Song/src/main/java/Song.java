
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
    
    public boolean equals(Object compared) {
        if(this == compared) {
            return true;
        }
        if(!(compared instanceof Song)) {
            return false;
        }
        Song song = (Song) compared;
        if(this.artist == song.artist && this.name == song.name && this.durationInSeconds == song.durationInSeconds) {
            return true;
        }
        
        return false;
    }


}
