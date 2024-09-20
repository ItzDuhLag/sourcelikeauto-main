package src;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

public class IntervalKeyListener extends GUI{
    //Different key listener for each box
    protected static KeyListener hoursKeyListener;
    protected static KeyListener minsKeyListener;
    protected static KeyListener secsKeyListener;
    protected static KeyListener msecsKeyListener;
    private int[] numKeys = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105};

    //Initialize
    public IntervalKeyListener(){
        hoursKeyListener = new KeyListener() {
            public void keyPressed(KeyEvent e){
                System.out.println("key pressed");
                String oldtext = hoursText.getText();
                int keycode = e.getKeyCode();
                if(functions.indexOf(numKeys, keycode) == -1){
                    hoursText.setText(oldtext);
                    JOptionPane.showMessageDialog(f, "Unacceptable Character");
                }else{
                    hoursText.setText(oldtext);
                    hoursText.append(Character.toString(e.getKeyChar()));
                }
            }
            public void keyTyped(KeyEvent e){
            }
            public void keyReleased(KeyEvent e){
            }
        };
    }
}
