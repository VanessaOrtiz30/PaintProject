import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WJpanel extends JPanel implements MouseListener, ActionListener{
//shape buttons
	private JButton circle = new JButton("Circle");
	private JButton filledcircle = new JButton("Filled In Circle");
	private JButton draw = new JButton("Draw");//allows you to draw anything
	private JButton square = new JButton("Square");
	private JButton filledsquare= new JButton("Filled In Square");
	private JButton Line = new JButton("Line");
	private JButton BG = new JButton("Canvas Color");
	//private JLabel heart= new JLabel("<html><h1 style=\"font-size:200; color:red;\">&hearts;</h1></html>");

	
	private JButton buttonI = new JButton();//testing picture on a button
	
	public WJpanel(){
		setBackground(Color.BLACK);//to set the color of this JPanel
		//setLayout(new GridLayout(8,1));//(rows,columns)//add more buttons later
		//add(heart)
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 3, 5));
        this.setPreferredSize(new Dimension(170, 1));

        circle.setPreferredSize(new Dimension(151,50));
        filledcircle.setPreferredSize(new Dimension(151,50));
        draw.setPreferredSize(new Dimension(151,50));
        square.setPreferredSize(new Dimension(151,50));
        filledsquare.setPreferredSize(new Dimension(151,50));
        Line.setPreferredSize(new Dimension(151,50));
        BG.setPreferredSize(new Dimension(151,50));
        buttonI.setPreferredSize(new Dimension(151, 60));
		
		add(BG);
		add(draw);
		add(Line);
		add(circle);
		add(filledcircle);
		add(square);
		add(filledsquare);
		
		
		add(buttonI);//tester puppy button
		//buttonI.setBounds(50, 50, 20, 5);//left #pixels, top #Pixels, width, height
		
		/*try{
			Image imgC= new ImageIcon(this.getClass().getResource("colors.png")).getImage();
			circle.setIcon(new ImageIcon(imgC));
			this.setSize(10, 10);
		}
		catch (Exception ex1){
			System.out.println("Atleast I reached here" + ex1);
		}*/
		 
		  try {
		   Image img = new ImageIcon(this.getClass().getResource("puppy2.png")).getImage();
		   Image circleImg = new ImageIcon(this.getClass().getResource("circle.png")).getImage();
		   Image squareImg = new ImageIcon(this.getClass().getResource("square.png")).getImage();
		   Image FSImg = new ImageIcon(this.getClass().getResource("filledsquare.png")).getImage();
		   Image LineImg = new ImageIcon(this.getClass().getResource("line.png")).getImage();
		   Image FCImg = new ImageIcon(this.getClass().getResource("fc.png")).getImage();
		   Image DrawImg = new ImageIcon(this.getClass().getResource("draw (2).png")).getImage();
		   Image BGImg = new ImageIcon(this.getClass().getResource("BG.png")).getImage();//background color button
		    BG.setIcon(new ImageIcon(BGImg));
		    buttonI.setIcon(new ImageIcon(img));
		    draw.setIcon(new ImageIcon(DrawImg));
		    filledcircle.setIcon(new ImageIcon(FCImg));
		    Line.setIcon(new ImageIcon(LineImg));
		    filledsquare.setIcon(new ImageIcon(FSImg));
		    square.setIcon(new ImageIcon(squareImg));
		    circle.setIcon(new ImageIcon(circleImg));
		    this.setSize(10,10);
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
		
		
		BG.addActionListener(this);
		Line.addActionListener(this);
		circle.addActionListener(this);//adding this so that my buttons listen for clicks
		filledcircle.addActionListener(this);
		draw.addActionListener(this);
		square.addActionListener(this);
		filledsquare.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		String btnClicked= e.getActionCommand();//because its a variable that is not a string or any other primitive type so..it must be an object
				//getSource is used for "objects" instead of getActionCommand like when using a string**** MUST USE String here to work and compare a string to another string 
		System.out.println(btnClicked);
		if(btnClicked == "Circle"){
			System.out.println("Circle");
			CanvasC.MyShape = "Circle";//this is calling the class CanvasC and is telling it that the shape choosen was circle and then allowing it to go 
			//through the mousepressed(iteration of 'if-stmts') of the CanvasC class to then draw it
		}
		if(btnClicked == "Filled In Circle"){
			System.out.println("FC");
			CanvasC.MyShape = "Filled In Circle";//this is calling the class CanvasC and is telling it that the shape choosen was circle and then allowing it to go 
			//through the mousepressed(iteration of 'if-stmts') of the CanvasC class to then draw it
		}
		if(btnClicked == "Square"){
			System.out.println("Square");
			CanvasC.MyShape = "Square";
		}
		if(btnClicked == "Draw"){
			System.out.println("Draw");
			CanvasC.MyShape = "Draw";//this is calling the class CanvasC and is telling it that the shape choosen was circle and then allowing it to go 
			//through the mousepressed(iteration of 'if-stmts') of the CanvasC class to then draw it
		}
		if(btnClicked == "Filled In Square"){
			System.out.println("Filled In Square");
			CanvasC.MyShape = "Filled In Square";
		}

		if(btnClicked == "Line"){
			System.out.println("Line");
			CanvasC.MyShape = "Line";
		}
		
		if(btnClicked == "Canvas Color"){
			System.out.println("Canvas Color");
			CanvasC.MyShape = "Canvas Color";
		}
		//ADD MORE PERMISSIONS LATER FOR THE CanvasC-Drawing class
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
