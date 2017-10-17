import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ExitMenuItem extends JMenuItem implements MouseListener{

	    public ExitMenuItem(){
	        this.setText("Exit");

	        addMouseListener(this);
	    }

	    @Override
	    public void mousePressed(MouseEvent e){ System.exit(0); }
	    @Override
	    public void mouseEntered(MouseEvent e){ setCursor(new Cursor(Cursor.HAND_CURSOR)); }
	    @Override
	    public void mouseExited(MouseEvent e){ setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); }
	    @Override
	    public void mouseClicked(MouseEvent e){}
	    @Override
	    public void mouseReleased(MouseEvent e){}
	}
	

