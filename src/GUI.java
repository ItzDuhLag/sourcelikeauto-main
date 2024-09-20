package src;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.KeyboardFocusManager;
import javax.swing.*;

public class GUI {

    //Global variable for the frame (window) of for application for the entire class to use
    protected static JFrame f;
    protected static JTextArea hoursText;

    //CreateWindow() creates the frame (window) for the application
    public static void CreateWindow(){
        //Creates instance of frame (window)
        f = new JFrame("Source-like Autoclicker");

        //x width , y height of frame (window)
        f.setSize(455,375);

        //Changes the Application Icon
        //Throwing exception catcher if the image is not found defaults to null
        ImageIcon mouseIcon = null;
        java.net.URL imgURL = GUI.class.getResource("images/mouse icon.png"); //sets imgURL to the image file
        if (imgURL != null) {
            mouseIcon = new ImageIcon(imgURL); //converts imgURL to ImageIcon
            f.setIconImage(mouseIcon.getImage()); //sets icon
        } else { //exception catcher
            JOptionPane.showMessageDialog(f, "Icon image not found.");
        }

        //Sets the layout manager ()
        f.setLayout(null);

        //Calls methods which constructs other portions of the window
        layer1();
        finishWindow();
    }

    //finishWindow() makes the frame (window) visible (AFTER CONSTRUCTION OF ALL OBJECTS IN WINDOW)
    public static void finishWindow(){
        //Makes frame visible
        f.setVisible(true);
        KeyboardFocusManager.getCurrentKeyboardFocusManager().clearGlobalFocusOwner();
    }

    //layer1() dedicated to creation of all objects / items inside of the first layer of the application (Click Interval Portion)
    public static void layer1(){
        //Creating Top Portion of Autoclicker GUI (Intervals)

        //Creates the label for top portion
        JLabel intervalLabel = new JLabel("Click  Interval");
        //setBounds(loc X, loc Y, width x, height y)
        intervalLabel.setBounds(10,0,100,30);
        intervalLabel.setFont(new Font("Georgia", Font.PLAIN, 11));
        f.add(intervalLabel);

        //Adds boxes for text to be inserted ONLY number values (0,1,2,3,4,5,6,7,8,9)
        hoursText = new JTextArea();
        hoursText.setBounds(10,30,50,18);
        hoursText.setFont(new Font("Georgia", Font.PLAIN, 13));
        hoursText.setBorder(BorderFactory.createLineBorder(Color.black));
        hoursText.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        hoursText.setText("0");
        //Adds the listener for the specified text box
        hoursText.addKeyListener(IntervalKeyListener.hoursKeyListener);
        f.add(hoursText);

        JTextArea minsText = new JTextArea();
        minsText.setBounds(110,30,50,18);
        minsText.setFont(new Font("Georgia", Font.PLAIN, 13));
        minsText.setBorder(BorderFactory.createLineBorder(Color.black));
        minsText.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        minsText.setText("0");
        f.add(minsText);

        JTextArea secsText = new JTextArea();
        secsText.setBounds(210,30,50,18);
        secsText.setFont(new Font("Georgia", Font.PLAIN, 13));
        secsText.setBorder(BorderFactory.createLineBorder(Color.black));
        secsText.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        secsText.setText("0");
        f.add(secsText);

        JTextArea msecsText = new JTextArea();
        msecsText.setBounds(310,30,50,18);
        msecsText.setFont(new Font("Georgia", Font.PLAIN, 13));
        msecsText.setBorder(BorderFactory.createLineBorder(Color.black));
        msecsText.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        msecsText.setText("100");
        f.add(msecsText);

        //Create Labels for each Text Area
        JLabel hoursLabel = new JLabel("hours");
        hoursLabel.setBounds(65,30,30,16);
        hoursLabel.setFont(new Font("Georgia", Font.PLAIN, 10));
        f.add(hoursLabel);

        JLabel minsLabel = new JLabel("mins");
        minsLabel.setBounds(165,30,30,16);
        minsLabel.setFont(new Font("Georgia", Font.PLAIN, 10));
        f.add(minsLabel);

        JLabel secsLabel = new JLabel("secs");
        secsLabel.setBounds(265,30,30,16);
        secsLabel.setFont(new Font("Georgia", Font.PLAIN, 10));
        f.add(secsLabel);

        JLabel msecsLabel = new JLabel("milliseconds");
        msecsLabel.setBounds(365,30,80,16);
        msecsLabel.setFont(new Font("Georgia", Font.PLAIN, 10));
        f.add(msecsLabel);
    }

}