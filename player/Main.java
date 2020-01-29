package player;

public class Main {
	
	public static void main(String args[]) 
	{
		MP3Player mp3 = new MP3Player();
		
		MP4Player mp4 = new MP4Player();
		
		MP4Player adaptado = new MP4Adapter(mp3);
		
	}

}
