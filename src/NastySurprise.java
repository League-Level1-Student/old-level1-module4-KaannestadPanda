import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JButton treat = new JButton("Treat");
	
	JButton trick = new JButton("Trick");
	
	public static void main(String[] args) {
	NastySurprise a=new NastySurprise();
		a.go();
		
		
	}
	
	void go() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		treat.addActionListener(this);
		trick.addActionListener(this);
		panel.add(trick);
		panel.add(treat);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton)(e.getSource());
		if(buttonPressed == treat) {
			showPictureFromTheInternet("https://ih1.redbubble.net/image.207972549.9487/flat,1000x1000,075,f.jpg");
		}
		else {
			showPictureFromTheInternet("https://i.ytimg.com/vi/uzvWZyDMe8A/maxresdefault.jpg");
		}
		// TODO Auto-generated method stub
		
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}
}
