// Behavioral pattern

//Adapter pattern

public class Adapter_pattern {

    public static void main(String[] args) {

        MediaPlayer mediaPlayer = new MediaAdapter();

        mediaPlayer.play("vlc", "song1.vlc");

    }

}

