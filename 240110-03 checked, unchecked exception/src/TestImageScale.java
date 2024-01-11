import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestImageScale extends JFrame {
	public TestImageScale() {
		
		Image scaledImage = null;
		try {
			URL url = TestImageScale.class.getClassLoader().getResource("image/춘식15.png");
			BufferedImage image = ImageIO.read(url);
			scaledImage = image.getScaledInstance(400, 400, BufferedImage.SCALE_DEFAULT);
		} catch (IOException e) {
			System.out.println("이미지 정보를 불러오는 동중 예외가 발생했습니다.");
		}
		JLabel lblImage = null;
		if (scaledImage != null) {
			ImageIcon icon = new ImageIcon(scaledImage);
			lblImage = new JLabel(icon);
		} else {
			lblImage = new JLabel("이미지 정보 손상. 개발자에게 문의하세요.");
		}
		add(lblImage);
		
		showGUI();
	}
	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TestImageScale();
	}
}
