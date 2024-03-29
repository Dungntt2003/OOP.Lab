package hust.soict.hedspi.aims.screen.manager;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hust.soict.hedspi.aims.exception.PlayerException;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;

public class MediaStore extends JPanel {
	private Media media;

	public MediaStore(Media media) {
		this.media = media;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		JLabel title = new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 15));
		title.setAlignmentX(CENTER_ALIGNMENT);

		JLabel cost = new JLabel("" + media.getCost() + "$");
		cost.setAlignmentX(CENTER_ALIGNMENT);

		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		if (media instanceof Playable) {
			JButton btnPlay = new JButton("Play");
			btnPlay.addActionListener(e -> {
				if (media instanceof DigitalVideoDisc) {
					try {
						createDialog(((DigitalVideoDisc) media).play());
					} catch (PlayerException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else {
					try {
						createDialog(((CompactDisc) media).play());
					} catch (PlayerException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			container.add(btnPlay);
		}
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(Box.createVerticalGlue());
		this.add(container);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

	public void createDialog(String playText) {
		JDialog dialog = new JDialog();
		JLabel label = new JLabel(playText);
		dialog.add(label);
		dialog.setSize(200, 200);
		dialog.setVisible(true);
	}
}
