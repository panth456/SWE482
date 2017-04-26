package kirbsideApparelJavaApplication;

//Needed imports
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu extends JPanel{
    
    public MainMenu() {
        
        //Adding a JLabel to display a title
        add(new JLabel("Main Menu"));
    }

    //Setting prefered size of MainMenu
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 500);
    }
}
