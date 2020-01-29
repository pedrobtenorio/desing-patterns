package player;

public class MP4Player implements VideoPlayer {

	@Override
	public void playVideo() {
		System.out.println("Videoclip is now playing");
		
	}

	@Override
	public void stopVideo() {
		System.out.println("videoclip stopped");
		
	}

}
