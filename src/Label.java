import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class Label extends JButton implements MouseListener {
	String s= new String();
	public Label(){
		super();
		this.setText(" ");
		this.addMouseListener(this);
	
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		s=s+"text ";
		if(s.length()>56){
			s+=" \n";
			}
		Fen�tre.t.setText(s);

		SwingUtilities.updateComponentTreeUI(Fen�tre.f);
		Fen�tre.f.repaint();
		Fen�tre.j1.repaint();
		this.repaint();
		System.out.println("azera");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
