import javax.swing.JFrame;
import javax.swing.JLabel;


public class Ventana {
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		frame.setTitle("ventanaa!");
		label.setText("Soy un label");
		frame.add(label);		
	    frame.setSize(800,600);
		frame.setVisible(true);
		
	}


}
