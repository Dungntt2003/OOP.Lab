package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class StoreTest {
	public static void main(String[] args) {
		Store HUST = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation",19.95f,87, "Will Smith");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction",24.95f, 102, "Geogre Hamth");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation",18.99f, 100, "Taylor");
		HUST.addMedia(dvd1);
		HUST.addMedia(dvd2);
		HUST.removeMedia(dvd3);
		HUST.removeMedia(dvd2);
	}
}
