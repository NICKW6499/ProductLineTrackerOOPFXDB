package sample;

public class AudioPlayer extends Product implements MultimediaControl {

  private static String supportedAudioFormats;
  private static String supportedPlaylistFormats;

  public void play(){
    System.out.println("Playing");
  }

  public void stop(){
    System.out.println("Stopping");
  }

  public void previous(){
    System.out.println("Previous");
  }

  public void next(){
    System.out.println("Next");
  }

  AudioPlayer(){
  }

  AudioPlayer(String name, String manufacturer, String supportedAudioFormats, String supportedPlaylistFormats){
    super(name, manufacturer, ItemType.AUDIO);
    AudioPlayer.supportedAudioFormats = supportedAudioFormats;
    AudioPlayer.supportedPlaylistFormats = supportedPlaylistFormats;
  }

  public String getSupportedAudioFormats() {
    return supportedAudioFormats;
  }

  public void setSupportedAudioFormats(String supportedAudioFormats) {
    AudioPlayer.supportedAudioFormats = AudioPlayer.supportedAudioFormats;
  }

  public String getSupportedPlaylistFormats() {
    return supportedPlaylistFormats;
  }

  public void setSupportedPlaylistFormats(String supportedPlaylistFormats) {
    AudioPlayer.supportedPlaylistFormats = AudioPlayer.supportedPlaylistFormats;
  }

  public String toString() {
    return super.toString() + "Supported Audio Formats: " + supportedAudioFormats + "\n" + "Supported Playlist Formats: " + supportedPlaylistFormats;
  }
}
