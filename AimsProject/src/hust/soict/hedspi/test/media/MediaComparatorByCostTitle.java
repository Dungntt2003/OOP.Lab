package hust.soict.hedspi.test.media;

import java.util.Comparator;

import hust.soict.hedspi.aims.media.Media;

public class MediaComparatorByCostTitle implements Comparator<Media> {

	@Override
	public int compare(Media o1, Media o2) {
		// TODO Auto-generated method stub
		if (Float.compare(o2.getCost(), o1.getCost()) == 0) {
			return o1.getTitle().compareTo(o2.getTitle());
		}
		return Float.compare(o2.getCost(), o1.getCost());
	}

}
