package kirbsideApparelJavaApplication;

//Needed imports
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

class ViewOrders extends JPanel{
    
    //Creating cariable that can be accessed throughtout the application
    static JLabel orderDisplay = new JLabel();
    
    //Constructor
    public ViewOrders() {
        
        //Holder for all components
        JPanel holder = new JPanel();
        
        //Scroll Pane in case there are more orders than can fit on one screen
        JScrollPane scrollPane = new JScrollPane( 
            ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,  
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        
        //Adding components to holder, and holder to ViewOrders
        add(scrollPane);
        holder.add(orderDisplay);
        scrollPane.setViewportView(holder);     
        
        //Setting paramaters of the scrollPane
        scrollPane.setPreferredSize(new Dimension(1890, 940));
        scrollPane.getVerticalScrollBar().setUnitIncrement(20);
    }

    //Setting prefered size of ViewOrders
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 500);
    }
    
}
