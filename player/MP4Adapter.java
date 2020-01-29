package player;

public class MP4Adapter implements VideoPlayer {

	
	MusicPlayer adaptador;
	
	public MP4Adapter(MusicPlayer adaptador)
	{
		this.adaptador=adaptador;
	}
	
	@Override
	public void playVideo() {
		adaptador.playMusic();	
	}

	@Override
	public void stopVideo() {
		adaptador.stopMusic();
	}

}
