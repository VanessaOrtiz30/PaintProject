import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CanvasC extends JPanel implements MouseListener, MouseMotionListener, KeyListener{//keylistener for writing text
	
	//private JTextField jtTitle= new JTextField("Enter Your Paintings Title Here");
	//private JLabel usersT= new JLabel("My Work of Art");
	
	int x;//this is for getting the x-coordinate location of the mouse
	int y;//this is for getting the x-coordinate location of the mouse
	int startX = -1;
	int startY = -1;
	
	boolean startDraw= true;//if false will not draw anything only type
	public static String MyShape; //to choose the type
	public static Color myColor;//for choosing colors
	public static Color myCanvasColor;//for choosing colors
	public static int sizeOfAll= 25;//size for all (initially without touching the slider) and slider
	public int lastX=0, lastY=0;//previous location for your drawing
	
	private FontMetrics fontVariable;//this allows you to write text..it is the variable to write text;
	private int fontSize= 35;
	
	Font font = new Font("Serif", Font.ITALIC, fontSize);//to write in script and with the size assigned by your slider

	
	public CanvasC(){//constructor
		setBackground(Color.WHITE);//color of the canvas
		addMouseListener(this);//to have the mouse listen to the user on this JPanel/Canvas WHEN they Click/Press/Release
		addMouseMotionListener(this);//to have the mouse listen to the user on this JPanel/Canvas WHEN they Move the mouse
		addKeyListener(this);//listen for types
		
		myColor = (Color.black);
		myCanvasColor = (Color.white);
		fontVariable= getFontMetrics(font);//passing in how you want the font to look
		
		/*usersT.setFont(new Font("Serif", Font.BOLD, 100));
		add(usersT);
		add(jtTitle);
		*/
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		int x= arg0.getX(); //to get the x-coordinate location
		int y= arg0.getY();//to get the y-coordinate location
		//System.out.println("x= " + x + " , y= " + y);
		Graphics getG= getGraphics();//graphics in general
		Graphics g2dCasted= (Graphics2D)getG;//to turn the regualar graphics into a 2D graphic
		((Graphics2D)g2dCasted).setStroke(new BasicStroke(sizeOfAll)); //-10));//drawing size will be given here and changed/set from the slider SJpanel class by calling the canvas class dot the variable
		g2dCasted.setColor(myColor);//set the graphics drawing color that the user chooses
		
		if(startDraw == true){
			g2dCasted.drawLine(lastX, lastY, x, y);//to draw
		}
		
		if(MyShape == "Line"){
			if(startX < 0){//then you know your stting to draw
				startX = x;//recording values
				startY = y;
			}
			//getG.dispose();
			//repaint();
			g2dCasted.drawLine(startX, startY, x, y);//to draw
		}
		recordLast(x,y);
		
		//if(MyShape == "Line"){
			//startDraw = false;
			//g2dCasted.drawLine(lastX, lastY, sizeOfAll, sizeOfAll);
		//}
	}
	protected void recordLast(int x,int y){
		lastX=x;
		lastY=y;
	}
	
	public int getLastX(){
		return lastX;
	}
	
	public int getLastY(){
		return lastY;
	}
	
	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		recordLast(arg0.getX(), arg0.getY());//recording the last x and y that the user was using with the dragging of the mouse
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		requestFocus();//requesting focus for where-ever the mouse is //something java knows how to do //also used in video games
		recordLast(arg0.getX(), arg0.getY());//recoding last place mouse was entered
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		recordLast(arg0.getX(), arg0.getY());//storing the value of when the mouse is only pressed(notDragged)
		Graphics getG= getGraphics();//graphics in general
		Graphics g2dCasted= (Graphics2D)getG;//to turn the regualar graphics into a 2D graphic
		g2dCasted.setColor(myColor);//set the graphics drawing color that the user chooses
		if(MyShape == "Draw"){
			startDraw= true; //in order to make the user be able to now draw on the canvas after pressing the button "draw"
		}
		if(MyShape == "Circle"){
			startDraw = false;//in order to not do multiple of this shape or i.o.w to not draw
			g2dCasted.drawOval(lastX-(sizeOfAll/2), lastY-(sizeOfAll/2), sizeOfAll, sizeOfAll);//to make your circle appear at the center/ point of the mouse
		}
		if(MyShape == "Filled In Circle"){
			startDraw = false;//in order to make the user be able to now draw on the canvas after pressing the button "draw"
			g2dCasted.fillOval(lastX-(sizeOfAll/2), lastY-(sizeOfAll/2), sizeOfAll, sizeOfAll);//to make your filled circle appear at the center/ point of the mouse
		}
		if(MyShape == "Square"){
			startDraw = false;//in order to not do multiple of this shape or i.o.w to not draw
			g2dCasted.drawRect(lastX-(sizeOfAll/2), lastY-(sizeOfAll/2), sizeOfAll, sizeOfAll);//to make your filled circle appear at the center/ point of the mouse
		}
		if(MyShape == "Filled In Square"){
			startDraw = false;//in order to make the user be able to now draw on the canvas after pressing the button "draw"
			g2dCasted.fillRect(lastX-(sizeOfAll/2), lastY-(sizeOfAll/2), sizeOfAll, sizeOfAll);//to make your filled circle appear at the center/ point of the mouse
		}
		/*if(MyShape == "Line"){//**help
			startDraw = false;
			g2dCasted.drawLine(lastX, lastY, lastX-(sizeOfAll/2) , sizeOfAll);
		}*/
		if(MyShape == "Canvas Color"){
			startDraw = false;
			this.setBackground(myColor);//to set the background color of the canvas to your choice
		}
		//if()//to do more shapes
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		startX= -1;//reset these to -1
		startY= -1;
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		String takeText= String.valueOf(arg0.getKeyChar()); //get the character of the text typed in the keyboard
		Graphics getG= getGraphics();
		getG.setColor(myColor);
		getG.setFont(new Font("Serif", Font.ITALIC, sizeOfAll));
		fontVariable= getFontMetrics(new Font("Serif", Font.ITALIC, sizeOfAll));
		getG.drawString(takeText, getLastX(), getLastY());
		recordLast(getLastX() + fontVariable.stringWidth(takeText), getLastY());
		
	}

}
