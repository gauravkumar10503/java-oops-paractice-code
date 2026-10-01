/*6. Interface Example

Create an interface Playable with methods play() and pause().
Implement it in classes MusicPlayer and VideoPlayer.*/
package abstraction;

public class Playable_Interface_Abstraction
{
	public static void main(String[]args)
	{
		Mplayer m=new Mplayer();
		m.play();
		m.pause();
		
		System.out.println("------------------------------------------------");
		
		Vplayer v=new Vplayer();
		v.play();
		v.pause();
	}
}

interface Playable
{
	void play();
	void pause();
}

class Mplayer implements Playable
{
	public void play()
	{
		System.out.println("Play the music");
	}
	public void pause()
	{
		System.out.println("Pause the music");
	}
}

class Vplayer implements Playable
{
	public void play()
	{
		System.out.println("Play the video ");
	}
	public void pause()
	{
		System.out.println("Pause the video here");
	}
}