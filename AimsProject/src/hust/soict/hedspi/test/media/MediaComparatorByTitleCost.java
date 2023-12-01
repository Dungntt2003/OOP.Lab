package hust.soict.hedspi.test.media;

import java.util.Comparator;

import hust.soict.hedspi.aims.media.Media;

public class MediaComparatorByTitleCost implements Comparator<Media> {

	@Override
	public int compare(Media o1, Media o2) {
		// TODO Auto-generated method stub
		if (o1.getTitle().compareTo(o2.getTitle()) == 0) {
			return Float.compare(o2.getCost(), o1.getCost());
		}
		return o1.getTitle().compareTo(o2.getTitle());
	}

}
