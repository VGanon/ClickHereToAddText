import java.awt.GridLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class Fenêtre extends JFrame {
	static JFrame f = new JFrame();
	static JPanel j1 = new JPanel();
	static JButton l1 = new Label();
	static JTextArea t = new JTextArea();
	
	public static void main(String[]args){
		f.setTitle("Clicker");
		f.setSize(250, 300);
		l1.setText("click here to add text ");
		t.setSize(200,200);
		t.setEditable(false);
		t.setVisible(true);
		j1.setLayout(new GridLayout(2,1));
		j1.add(l1);
		j1.add(t);
		f.add(j1);
		f.setVisible(true);
	}
}
