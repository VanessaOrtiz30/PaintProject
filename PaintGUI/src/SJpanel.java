import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SJpanel extends JPanel implements MouseListener, ActionListener, ChangeListener{//changelistener is for the slider
//Option to change Font type and maybe even font size and more
	
	private JSlider slider= new JSlider(JSlider.HORIZONTAL, 1, 150, 20);//1 is the Minimum size, 150 is the maximum size, 20 for starting point
	private JLabel UName= new JLabel("");
	private JTextField jtUName= new JTextField("Enter Your Name Here");
	private JButton submit= new JButton("Submit");
	
	public SJpanel(){
		setBackground(Color.WHITE);
		//setLayout(new FlowLayout)
		setLayout(new GridLayout(1,3));
		UName.setFont(new Font("Serif", Font.ITALIC, 25));
		//setLayout(new BorderLayout());
		//setLayout() and add labels later
		
		slider.addChangeListener(this);
		
		submit.addActionListener(this);
		
		add(submit);
		add(jtUName); 
		add(slider);
		add(UName);
		
		try{
			Image submitImg = new ImageIcon(this.getClass().getResource("submit.gif")).getImage();
		    submit.setIcon(new ImageIcon(submitImg));
	    this.setSize(10,10);
		}
		catch (Exception ex){
			System.out.println(ex);
		}
		
		//add your jlabels
		//add(BorderLayout.NORTH, slider);
		//add(BorderLayout.WEST, jtUName);
		//add(BorderLayout.EAST, UName);
	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		// TODO Auto-generated method stub
		CanvasC.sizeOfAll = slider.getValue();//this will set the size for everything
		//this will get the vale of the slider..according to the options you provided above (mini, max, starting point)
				
	}

	@Override
	public void actionPerformed(ActionEvent arg0) { //NOT FINISHED here Yet
		// TODO Auto-generated method stub
		String btnClicked = arg0.getActionCommand();
		
		if(btnClicked == "Submit"){
		String givenName = jtUName.getText().trim();//grabs user title
		jtUName.setText("");
		UName.setText("  By: " + givenName);
		
		}
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
