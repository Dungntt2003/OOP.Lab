package hust.soict.hedpsi.test.media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Media> mediae = new ArrayList<Media>();
		Book book = new Book("How to be goog dev", "IT", 19.90f);
		CompactDisc cd = new CompactDisc("Chrismas", "Festival", 20f, 100, "Taylor", "Mian");
		DigitalVideoDisc dvd = new DigitalVideoDisc("The timer", "Animation", 10f, 102, "Tom Holland");
		mediae.add(dvd);
		mediae.add(cd);
		mediae.add(book);
		for (Media m : mediae) {
			System.out.println(m.toString());
		}
		Collections.sort(mediae, Media.COMPARE_BY_COST_TITLE);
		for (Media m : mediae) {
			System.out.println(m.toString());
		}
		Collections.sort(mediae, Media.COMPARE_BY_TITLE_COST);
		for (Media m : mediae) {
			System.out.println(m.toString());
		}
	}

}
