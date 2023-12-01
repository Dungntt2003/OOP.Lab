package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc {
	public DigitalVideoDisc() {

	}

	public DigitalVideoDisc(String title, String category, float cost, int length, String director) {
		super(title, category, cost, length, director);
	}

	public boolean equals(DigitalVideoDisc disc1) {
		if (disc1 == null || this == null)
			return false;
		if (!disc1.getTitle().equals(super.getTitle()))
			return false;
		return true;
	}

	public boolean isMatch(String title) {
		if (super.getTitle().equals(title)) {
			return true;
		}
		return false;
	}

	public String play() {
		// TODO Auto-generated method stub
		return this.getTitle() + " - " + this.getLength();
	}

}
