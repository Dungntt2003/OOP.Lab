package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.exception.PlayerException;

public class Disc extends Media implements Playable {
	private int length;
	private String director;

	public int getLength() {
		return length;
	}

	public String getDirector() {
		return director;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Disc() {

	}

	public Disc(String title, String category, float cost, int length, String director) {
		// TODO Auto-generated constructor stub
		super(title, category, cost);
		this.length = length;
		this.director = director;
	}

	public String tostring() {
		return super.toString() + " - " + this.length + " - " + this.director;
	}

	@Override
	public String play() throws PlayerException {
		return "";
	}

}
