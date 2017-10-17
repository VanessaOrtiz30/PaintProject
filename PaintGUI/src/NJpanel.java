import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NJpanel extends JPanel implements ActionListener {

    private JTextField jtTitle= new JTextField("Enter Your Paintings Title Here");
    private JButton submit= new JButton("Submit");
    private JLabel usersT= new JLabel("My Work of Art");
    private JLabel spaces= new JLabel("                 ");
    //private JLabel heart= new JLabel("<html><h1 style=\"font-size:50; color:red;\">&hearts;</h1></html>");
    //new JLabel("<html><h1 style=\"font-size:200; color:red;\">&hearts;</h1></html>")//heart

    public NJpanel(){
        setBackground(Color.WHITE);//color of the Title Panel
        setLayout(new BorderLayout());
        usersT.setFont(new Font("Serif", Font.BOLD, 75));
        //usersT.setAlignmentX(56);//to center my jlabel x-coordinate
        //usersT.setAlignmentY(55);//y-coordinate
        //add(usersT);
        //add(jtTitle);

        try{
            Image submitImg = new ImageIcon(this.getClass().getResource("submit.gif")).getImage();
            submit.setIcon(new ImageIcon(submitImg));
            this.setSize(10,10);
        }
        catch (Exception ex){
            System.out.println(ex);
        }

        //
        JPanel southContainer = new JPanel();
        southContainer.setLayout(new BorderLayout());
        southContainer.setBackground(Color.WHITE);
        jtTitle.setPreferredSize(new Dimension(200, 25));
        southContainer.add(BorderLayout.WEST, jtTitle);

        submit.addActionListener(this);
        add(BorderLayout.CENTER, usersT);
        add(BorderLayout.SOUTH, southContainer);
        add(BorderLayout.WEST, spaces);
        add(BorderLayout.EAST, submit);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String btnClicked= e.getActionCommand().trim();
        if(btnClicked == "Submit"){
            try{
                String paintT= getStringFromTF(jtTitle);//grabs user title
                System.out.println(paintT);
                usersT.setText(getStringFromTF(jtTitle));
            }
            catch (Exception ex){
                System.out.println(ex);
            }
        }

    }

    private static String getStringFromTF(JTextField jtf) throws Exception{
        String a= (jtf.getText().trim());
        System.out.println(a);
        return a; //turn String into double
    }
//I want my title here and the option with a JText field to Change the Title of the Canvas

}