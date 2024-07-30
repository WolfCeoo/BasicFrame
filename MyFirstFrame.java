
package za.ac.tut.ui;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;


public class MyFirstFrame extends JFrame{

    public MyFirstFrame() throws HeadlessException {
        setTitle("My First GUI");
        setSize(200,250);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.BLUE);
        setVisible(true);
    }
    
}
