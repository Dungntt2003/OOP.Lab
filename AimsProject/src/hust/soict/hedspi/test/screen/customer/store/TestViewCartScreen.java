package hust.soict.hedspi.test.screen.customer.store;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.screen.customer.controller.CartController;
import hust.soict.hedspi.aims.store.Store;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestViewCartScreen extends Application {
	private static Cart cart;
	private static Store store;

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		final String STORE_FXML_FILE_PATH = "/hust/soict/hedspi/screen/customer/view/Cart.fxml";
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));
		CartController cartController = new CartController(store, cart);
		fxmlLoader.setController(cartController);
		Parent root = fxmlLoader.load();

		arg0.setTitle("Cart");
		arg0.setScene(new Scene(root));
		arg0.show();
	}

}
