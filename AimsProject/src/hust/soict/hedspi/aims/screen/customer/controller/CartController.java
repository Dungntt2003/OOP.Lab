package hust.soict.hedspi.aims.screen.customer.controller;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

public class CartController {
	private Cart cart;

	public CartController(Cart cart) {
		this.cart = cart;
	}

	@FXML
	private TableColumn<Media, Integer> colMediaId;

	@FXML
	private Label costLabel;

	@FXML
	private TableView<Media> tblMedia;

	@FXML
	private TableColumn<Media, Float> colMediaCost;

	@FXML
	private ToggleGroup filterCategory;

	@FXML
	private Button btnRemove;

	@FXML
	private Button btnPlay;

	@FXML
	private TextField tfFilter;

	@FXML
	private TableColumn<Media, String> colMediaTitle;

	@FXML
	private TableColumn<Media, String> colMediaCategory;

	@FXML
	void btnRemovePressed(ActionEvent event) {
		Media media = tblMedia.getSelectionModel().getSelectedItem();
		cart.removeMedia(media);
		costLabel.setText(" " + cart.getCost() + "  $");
	}

	@FXML
	private RadioButton radioBtnFilterTitle;

	@FXML
	private RadioButton radioBtnFilterId;

	@FXML
	void btnPlayPressed(ActionEvent event) {
		Media media = tblMedia.getSelectionModel().getSelectedItem();
		if (media instanceof DigitalVideoDisc) {
			createDialog(((DigitalVideoDisc) media).play());
		} else if (media instanceof CompactDisc) {
			createDialog(((CompactDisc) media).play());
		}
	}

	public void createDialog(String playText) {
		JDialog dialog = new JDialog();
		JLabel label = new JLabel(playText, SwingConstants.CENTER);
		dialog.setLocationRelativeTo(null);
		dialog.add(label);
		dialog.setSize(400, 400);
		dialog.setVisible(true);
	}

	@FXML
	void btnViewStorePressed(ActionEvent event) {
	}

	@FXML
	void btnOrderAction(ActionEvent event) {
		Media media = tblMedia.getSelectionModel().getSelectedItem();
		createDialog(media.getTitle() + " - " + media.getCost() + " is ordered successfully");
		cart.removeMedia(media);
		costLabel.setText(" " + cart.getCost() + "  $");
	}

	@FXML
	public void initialize() {
		colMediaId.setCellValueFactory(new PropertyValueFactory<Media, Integer>("id"));
		colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
		colMediaCategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
		colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Float>("cost"));
		if (cart.getItemsOrdered() != null) {
			tblMedia.setItems(cart.getItemsOrdered());
		}

		costLabel.setText(" " + cart.getCost() + "  $");

		btnPlay.setVisible(false);
		btnRemove.setVisible(false);

		tblMedia.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Media>() {

			@Override
			public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue) {
				// TODO Auto-generated method stub
				updateButtonBar(newValue);
			}

		});

		tfFilter.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				// TODO Auto-generated method stub
				showFilteredMedia(arg2);
			}
		});

	}

	void updateButtonBar(Media media) {
		if (media == null) {
			btnPlay.setVisible(false);
			btnRemove.setVisible(false);
		} else {
			btnRemove.setVisible(true);
			if (media instanceof Playable) {
				btnPlay.setVisible(true);
			} else
				btnPlay.setVisible(false);
		}
	}

	void showFilteredMedia(String textFilter) {
		FilteredList<Media> filteredData = new FilteredList<>(cart.getItemsOrdered());
		tblMedia.setItems(filteredData);

		filteredData.setPredicate(media -> {
			if (textFilter == null || textFilter.isEmpty()) {
				return true;
			}
			if (radioBtnFilterId.isSelected()) {
				return media.getId() == Integer.parseInt(textFilter);
			} else if (radioBtnFilterTitle.isSelected()) {
				return media.getTitle().toLowerCase().contains(textFilter.toLowerCase());
			}
			return false;
		});
	}

}