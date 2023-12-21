package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.exception.PlayerException;

public class Track implements Playable {
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
	public String play() throws PlayerException {
		// TODO Auto-generated method stub
		if (this.length > 0) {
			return this.title + " - " + this.length;
		} else {
			throw new PlayerException("ERROR : Track length is non-positive");
		}
	}

	public boolean equals(Track track) {
		if (this.title.equals(track.getTitle()) && this.length == track.getLength()) {
			return true;
		}
		return false;
	}
}
