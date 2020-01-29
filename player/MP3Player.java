package player;

public class MP3Player implements MusicPlayer {

	@Override
	public void playMusic() {
		System.out.println("Music is now playing");
		
	}

	@Override
	public void stopMusic() {
		System.out.println("Music stopped");
		
	}

}
