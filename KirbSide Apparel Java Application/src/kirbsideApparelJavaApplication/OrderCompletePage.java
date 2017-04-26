package kirbsideApparelJavaApplication;

//Needed imports
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OrderCompletePage extends JPanel{

    public OrderCompletePage() {
        //Adding JLabel to display a title
        add(new JLabel("Order Complete Page"));
    }

    //Setting prefered size of OrderCompletePage
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 500);
    }
    
}
