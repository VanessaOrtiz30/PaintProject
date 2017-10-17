import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class EJpanel extends JPanel implements MouseListener, ActionListener{
	//Option for color change here and Font type and maybe even font size
	private static final long serialVersionUID = 1L;//check what this is later
	private JButton colorBar= new JButton("");
	
	public EJpanel(){
		setBackground(Color.WHITE);
		setLayout(new GridLayout(7,1));//change later if want
		
		add(colorBar);
		
		colorBar.addActionListener(this);
		
		
		try{
			Image imgC= new ImageIcon(this.getClass().getResource("paintBox.png")).getImage();
			colorBar.setIcon(new ImageIcon(imgC));
			this.setSize(10, 10);
		}
		catch (Exception ex1){
			System.out.println("Atleast I reached here" + ex1);
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		CanvasC.myColor = JColorChooser.showDialog(this, "Select Your Color", Color.BLACK);
		
	}
	 public void init(){//why find out
		 addMouseListener(this);
	 }

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
