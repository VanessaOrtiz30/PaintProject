import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FileMenu extends JMenu implements MouseListener {

	    public FileMenu(){
	        this.setText("File");

	        addMouseListener(this);

	        add(new ExitMenuItem());
	    }

	    @Override
	    public void mouseEntered(MouseEvent e){ setCursor(new Cursor(Cursor.HAND_CURSOR)); }
	    @Override
	    public void mouseExited(MouseEvent e){ setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); }
	    @Override
	    public void mousePressed(MouseEvent e){ }
	    @Override
	    public void mouseClicked(MouseEvent e){}
	    @Override
	    public void mouseReleased(MouseEvent e){}
	}
	

