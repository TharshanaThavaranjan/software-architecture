// Behavioral pattern

//Adapter pattern

interface MediaPlayer {

    void play (String audioType, String fileName);

}

class AudioPlayer implements MediaPlayer {

    public void play (String audioType, String fileName) {

        if (audioType.equalsIgnoreCase("mp3")) {

            System.out.println("Playing mp3 file: " + fileName);

        }
        else if (audioType.equalsIgnoreCase("vlc")) {

            System.out.println("Cannot play vlc file: " + fileName);
        }

    }

}

class MediaAdapter extends AudioPlayer {


    public void play(String audioType, String fileName) {

        if (audioType.equalsIgnoreCase("vlc")) {

        super.play("mp3", fileName);

    }

  }

}
