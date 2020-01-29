package player;

public class Main {
	
	public static void main(String args[]) 
	{
		MusicPlayer mp3 = new MP3Player();
		
		VideoPlayer mp4 = new MP4Player();
		
		VideoPlayer adaptado = new MP4Adapter(mp3);
		
		System.out.println("MP3");
		mp3.playMusic();
		mp3.stopMusic();
		
		System.out.println("MP4");
		
		mp4.playVideo();
		mp4.stopVideo();
		
		System.out.println("MP4 playing music only");
		
		adaptado.playVideo();
		adaptado.stopVideo();
		
	}

}
