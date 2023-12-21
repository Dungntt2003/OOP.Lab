package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

import hust.soict.hedspi.aims.exception.PlayerException;

public class CompactDisc extends Disc {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();

	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}

	public CompactDisc(String title, String category, float cost, int length, String director, String artist) {
		// TODO Auto-generated method stub
		super(title, category, cost, length, director);
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}

	public void addTrack(Track track) {
		int index = tracks.indexOf(track);
		if (index != -1) {
			System.out.println("Track " + track.getTitle() + " has been added");
		} else
			tracks.add(track);
	}

	public void removeTrack(Track track) {
		int index = tracks.indexOf(track);
		if (index != -1) {
			tracks.remove(index);
		} else
			System.out.println("Track " + track.getTitle() + " not found");
	}

	public int getLength() {
		int sumLength = 0;
		for (Track track : tracks) {
			sumLength += track.getLength();
		}
		return sumLength;
	}

	public String play() throws PlayerException {
		// TODO Auto-generated method stub

		if (this.getLength() > 0) {
			String s = "";
			for (Track track : tracks) {
				s += track.play();
			}
			java.util.Iterator iter = tracks.iterator();
			Track nextTrack;
			while (iter.hasNext()) {
				nextTrack = (Track) iter.next();
				try {
					nextTrack.play();
				} catch (PlayerException e) {
					// TODO: handle exception
					throw e;
				}
			}
			return s;
		} else {
			throw new PlayerException("ERROR : CD length is non-positive");
		}

	}

	public void printAllTracks() {
		for (Track track : tracks) {
			System.out.println(track.getTitle() + " - " + track.getLength());
		}
	}

	public String toString() {
		return super.tostring() + " - " + this.artist;
	}

}
