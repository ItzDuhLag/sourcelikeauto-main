package src;
public class main {
    public static void main(String[] args){
        //Schedule event dispatch thread
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUI.CreateWindow();
            }
        });
    }
}