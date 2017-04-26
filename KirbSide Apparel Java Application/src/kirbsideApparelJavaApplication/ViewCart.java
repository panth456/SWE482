package kirbsideApparelJavaApplication;

//needed imports
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewCart extends JPanel{
    
    //Creating variables that cn be accessed throughout application
    JButton checkout = new JButton("Checkout");
    
    JPanel holder = new JPanel();
    JPanel cartHolder = new JPanel();
    
    JLabel cartHeader = new JLabel("User Cart");
    public static JLabel cartDisplay = new JLabel();
    
    //Constructor
    public ViewCart() {
        
        //Adding Components to holder, holder to ViewCart, and aligning it center
        holder.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        add(holder);
        cartHolder.add(Box.createHorizontalGlue());
        cartHolder.add(cartDisplay);
        cartHolder.add(Box.createHorizontalGlue());
        holder.add(cartHolder);
        holder.add(Box.createVerticalGlue());
        holder.add(checkout);
        
        //Action listener for checkout button
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });
        
        //Setting parameters of holder JPanel
        holder.setPreferredSize(new Dimension(1900, 900));
        holder.setLayout(new BoxLayout(holder, BoxLayout.Y_AXIS));
    }

    //Setting preferred size of ViewCart
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 500);
    }
    
    //Function called when checkout button is clicked
    public void checkoutActionPerformed (java.awt.event.ActionEvent evt){
        
        //checking if user is already logged in
        if (applicationFunctionality.currentUser == null) {
            
            //If not logged in already changing loginTyoe to 1 so that the user
            //login page knows where to send the user after login
            UserLoginPage.loginType = 1;
            KirbSideApparelJavaApplication.changeCard("User Login Page");
            
        } else {
        //If already logged in then proceeding to checkout page
        KirbSideApparelJavaApplication.changeCard("Checkout Page");
        }
        
    }
}
