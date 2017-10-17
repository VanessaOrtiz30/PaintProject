import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TheFrame extends JFrame implements MouseListener{
    private static final long serialVersionUID = 1L;
    public static boolean startDraw;
    protected MenuBar menuBar;

    public TheFrame(){
        this.setTitle("My Paint Project");
        this.setIconImage();
        startDraw=false;//false inorder to not let the user draw until they click the buttons  for options
        addMouseListener(this);//listen for clicks

        NJpanel northJP= new NJpanel();
        SJpanel southJP= new SJpanel();
        WJpanel westJP= new WJpanel();
        EJpanel eastJP= new EJpanel();
        CanvasC centerDraw= new CanvasC();

        // Add Menu Bar
        this.menuBar = new MenuBar();
        setJMenuBar(menuBar);

        JPanel Container= new JPanel();
        Container.setLayout(new BorderLayout());
        Container.add(BorderLayout.NORTH, northJP);
        Container.add(BorderLayout.SOUTH, southJP);
        Container.add(BorderLayout.WEST, westJP);
        Container.add(BorderLayout.EAST, eastJP);
        Container.add(BorderLayout.CENTER, centerDraw);

        add(Container);

    }


    private void setIconImage() {
        // TODO Auto-generated method stub
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("paintPB.png")));//to place the image icon on the top left corner of the jFrame
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

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        javax.swing.SwingUtilities.invokeLater(new Runnable(){//to create the window
            public void run(){
                TheFrame gui = new TheFrame();
                gui.setDefaultCloseOperation(gui.EXIT_ON_CLOSE);//stop running.. when user X's out of the GUI Window
                gui.setSize(1620,720);
                gui.setLocationRelativeTo(null);
                gui.setVisible(true);
            }
        });
    }

}