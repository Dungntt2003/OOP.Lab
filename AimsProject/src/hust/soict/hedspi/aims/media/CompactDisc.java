package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

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

	public String play() {
		// TODO Auto-generated method stub
		return printAllTracks();
	}

	public String printAllTracks() {
		String s = "";
		for (Track track : tracks) {
			s += track.getTitle() + " " + track.getLength() + "\n";
		}
		return s;
	}

	public String toString() {
		return super.tostring() + " - " + this.artist;
	}

}
