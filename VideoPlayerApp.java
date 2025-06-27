interface Playlist {
    void addSong(String song);
    void removeSong(String song);
}

class MediaPlayer {
    void play() {
        System.out.println("Playing media...");
    }

    void pause() {
        System.out.println("Media paused.");
    }

    void stop() {
        System.out.println("Media stopped.");
    }
}

class VideoPlayer extends MediaPlayer implements Playlist {
    public void rewind() {
        System.out.println("Video rewinding...");
    }

    public void fastForward() {
        System.out.println("Video fast-forwarding...");
    }

    public void addSong(String song) {
        System.out.println("Added to playlist: " + song);
    }

    public void removeSong(String song) {
        System.out.println("Removed from playlist: " + song);
    }
}

public class VideoPlayerApp {
    public static void main(String[] args) {
        VideoPlayer player = new VideoPlayer();

        player.play();
        player.pause();
        player.rewind();
        player.fastForward();
        player.addSong("Adventure.mp4");
        player.removeSong("Adventure.mp4");
        player.stop();
    }
}
