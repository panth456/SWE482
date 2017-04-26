package kirbsideApparelJavaApplication;

//Needed imoports
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProductDisplay extends JPanel{
    
    //Creating public variables taht can be accessed throughout the application
    public static String viewedProduct = "";    
    public static JLabel itemDetails = new JLabel();
    JLabel displayBox = new JLabel();
    
    public ProductDisplay() {
        
        //holder for all swing components
        JPanel holder = new JPanel();
                
        //button to add to cart and acction listener for the button
        JButton addToCart = new JButton("Add To Cart");
        addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartActionPerformed(evt);
            }
        });
        
        //Addding componets to holder and holder to ProductDisplay JPanel
        add(holder);
        holder.add(itemDetails);
        holder.add(addToCart);
        holder.add(displayBox);
    }

    //Setting the prefered size of Prodcutdisplay
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 500);
    }
    
    //Action performed when add to cart button is clicked
    private void addToCartActionPerformed (java.awt.event.ActionEvent evt) {                                          

        //Adding the item to the users cart, and displaying that has been done
        applicationFunctionality.addToCart(viewedProduct);
        displayBox.setText("Item Added to Cart");
        
    }     
    
}
