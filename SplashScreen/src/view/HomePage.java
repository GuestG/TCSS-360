/* 
 * TCSS 360
 */

package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

/**
 * Class to start splash screen for DIY project.
 * 
 * @author gehry guest
 * @version 1.7.44
 */
public class HomePage extends JWindow {
    
    /** A number for Serialization. */
    private static final long serialVersionUID = -2102839873375270630L;
                    
    /** The width of the panel. */
    private static final int WIDTH = 600;

    /** The height of the panel. */
    private static final int HEIGHT = 700;
    
    /** The button for the editing tab. */
    private RoundButton myEditButton;
    
    /** The button for the more tab. */
    private RoundButton myMoreButton;
    
    /** The button for the more tab. */
    private RoundButton myDeleteButton;
    
   
    /**
     * Initializes fields with reasonable values.
     * 
     */
    public HomePage() {
        
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
        myEditButton = new RoundButton("Edit");
       
        myMoreButton = new RoundButton("Add");
        
        myDeleteButton = new RoundButton("Dele");
        
        //myMenuBar = new JMenuBar();
        
        setUp();
    }
    
    /**
     * sets up containers, JPanels, and progress bar with layouts and colors.
     * 
     */
    private void setUp() {
        
        final Container container = getContentPane();

        final JPanel panel = new JPanel();
        
        final JLabel imgLabel = new JLabel("",
                                        new ImageIcon("./Resources/HomePage BackGround.png"), 
                                        SwingConstants.CENTER);

        container.add(panel, BorderLayout.CENTER);
        
        panel.add(imgLabel, BorderLayout.CENTER);
        
        panel.add(myMoreButton, FlowLayout.LEFT);
        
        panel.add(myDeleteButton, FlowLayout.LEFT);
        
        panel.add(myEditButton, FlowLayout.LEFT);
        
        //panel.add(myMenuBar);
        
        panel.setOpaque(false);
  
        this.pack();
        
        this.setLocationRelativeTo(null);
        
        this.setVisible(true);
    }
   
}
