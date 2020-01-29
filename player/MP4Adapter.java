package player;

public class MP4Adapter implements VideoPlayer {

	
	MusicPlayer adaptador;
	
	public MP4Adapter(MusicPlayer adaptador)
	{
		this.adaptador=adaptador;
	}
	
	
	public void playVideo() {
		adaptador.playMusic();	
	}

	
	public void stopVideo() {
		adaptador.stopMusic();
	}

}
