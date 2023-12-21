package hust.soict.hedspi.test.screen.customer.store;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.screen.customer.controller.CartController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestViewCartScreen extends Application {
	private static Cart cart;

	@Override
	public void start(Stage arg0) throws Exception {

		cart = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The moon", "anime", 10.67f, 100, "Tom");
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("The moon1", "anime1", 10.67f, 100, "Tom1");
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Landmark", "anime2", 100.6f, 200, "Tom2");
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Stand by me", "SNSD", 10.6778f, 300, "Holland");
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Kid to first", "baby", 10.67f, 100, "monster");
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Store your tell", "PHUB", 10.67f, 100, "Tom2");
		Book book = new Book("The love", "romance", 10.10f);
		Book book1 = new Book("The love1", "romance1", 10.10f);
		cart.addMedia(dvd1);
		cart.addMedia(book1);
		cart.addMedia(book);
		cart.addMedia(dvd2);
		cart.addMedia(dvd3);
		cart.addMedia(dvd4);
		cart.addMedia(dvd5);
		cart.addMedia(dvd6);

		// TODO Auto-generated method stub
		final String STORE_FXML_FILE_PATH = "/hust/soict/hedspi/screen/customer/view/Cart.fxml";
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));
		CartController cartController = new CartController(cart);
		fxmlLoader.setController(cartController);
		Parent root = fxmlLoader.load();

		arg0.setTitle("Cart");
		arg0.setScene(new Scene(root));
		arg0.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
