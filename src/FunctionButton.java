import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class FunctionButton extends JButton {
	String keyname;

	FunctionButton(String keyname) {
		Dimension size = getPreferredSize();
		size.width = size.height = Math.max(size.width, size.height);
		setContentAreaFilled(false);
		setPreferredSize(size);
		Border line = new LineBorder(new Color(0, 0, 0));
		Border margin = new EmptyBorder(5, 20, 5, 15);
		Border compound = new CompoundBorder(line, margin);
		this.setBorder(compound);
		this.keyname = keyname;
		this.setText(this.keyname);
		ImageIcon img = new ImageIcon(getClass().getResource("resources//functionbutton.png"));
		this.setIcon(img);
		this.setForeground(Color.WHITE);
		this.setFont(new Font("Monospaced", Font.BOLD, 18));
		this.setHorizontalTextPosition(JButton.CENTER);
		this.setVerticalTextPosition(JButton.CENTER);
		this.setOpaque(false);
		this.setFocusable(false);

	}

}