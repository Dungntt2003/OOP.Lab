package hust.soict.hedspi.aims.media;

public class Track implements Playable{
	private String title;
	private int length;
	public Track() {
		// TODO Auto-generated constructor stub
	}
	
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing DVD : " + this.getTitle());
		System.out.println("DVD length : " + this.getLength());
	}
	
	public boolean equals(Track track) {
		if (this.title.equals(track.getTitle()) && this.length == track.getLength()) {
			return true;
		}
		return false;
	}
}
