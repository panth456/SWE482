package kirbsideApparelJavaApplication;

//Needed imports
import java.awt.Color;
import java.awt.Dimension;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;

public class SearchPage extends JPanel{
    
    //Object variables with global scope to be accessible to other parts of the application
    static JLabel displaySearchResults = new JLabel();
    static JPanel itemsHolder = new JPanel();
    static JPanel holder = new JPanel();
    
    //Constructor that creates the Search Page "display" through a JPanel
    public SearchPage() {
        
        //Creating header and scrolPane to allow for many items to be displayed
        JPanel header = new JPanel();
        JLabel headerDetails = new JLabel("HEADER");
        header.setPreferredSize(new Dimension(1880, 100));
        
        JScrollPane scrollPane = new JScrollPane( 
            ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,  
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        header.add(headerDetails);
        
        //Adding components to holder, and setting layout
        holder.add(Box.createVerticalGlue());
        holder.add(header);
        holder.add(itemsHolder);
        holder.setLayout(new BoxLayout(holder, BoxLayout.Y_AXIS));
        itemsHolder.setLayout(new BoxLayout(itemsHolder, BoxLayout.Y_AXIS));
        
        //Setting up the scroll pane with holder as the viewable are
        scrollPane.setViewportView(holder);
        scrollPane.setPreferredSize(new Dimension(1900, 950));
        scrollPane.getVerticalScrollBar().setUnitIncrement(20);
        add(scrollPane);
    }

    //Setting the prefered size of SearchDetails
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 500);
    }
    
    //Fucntion to create the display area of SearchDetails
     public static void getSearchDetails()
    {
        //Displaying information when no items are found
        if (ViewItems.searchResults.isEmpty())
        {
            JLabel noSearchResults = new JLabel("Your search returned no results");
            SearchPage.itemsHolder.add(noSearchResults);
            
        } else {  
            //Iterating through all elements in Map 
            for(Map.Entry<Product, Product> entry : ViewItems.searchResults.entrySet()){
                     
                //Adding JPanels, Jlabels, and JButtons for each item 
                JPanel searchResultItem = new JPanel();
                JPanel itemHolder = new JPanel();
                JLabel imageHolder = new JLabel();
                JLabel itemDetails = new JLabel();
                    itemDetails.setPreferredSize(new Dimension(1400, 150));
                JButton viewItemDetails = new JButton("View Item Details");
                
                //Determining which product is held as the current element in Map, and setting the products name to a String variable
                int productNumber = applicationFunctionality.productList.indexOf(entry.getKey());
                String productName = applicationFunctionality.productList.get(productNumber).getItemName();
                
                //action listener for view item details button
                viewItemDetails.addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        //Sending the String variable, which is the product name, to the new function
                        viewItemDetailsActionPerformed(productName);
                    }
                });
                
                //Setting the display of itemDetails to the details of the product specified earlier
                itemDetails.setText(applicationFunctionality.getProductInfo(productName));
                
                //Used as a border for items
                Border blackline = BorderFactory.createLineBorder(Color.black);
                
                //adding all componeents to the holder                
                itemHolder.add(Box.createHorizontalGlue());
                itemHolder.add(imageHolder);
                itemHolder.add(Box.createHorizontalGlue());
                itemHolder.add(itemDetails);
                itemHolder.add(Box.createHorizontalGlue());
                itemHolder.add(viewItemDetails);
                itemHolder.add(Box.createHorizontalGlue());
                        
                //Adding the border for the item, andiing the details, and sending this all to the itemHolder on SearchPage to display
                searchResultItem.setBorder(blackline);
                searchResultItem.add(itemHolder);
                SearchPage.itemsHolder.add(searchResultItem);                
            }            
        }    
        
        holder.add(Box.createVerticalGlue());        
    } 
     
    //function called when view item details button is clicked
    public static void viewItemDetailsActionPerformed(String product) {
        //chanign the viewedProduct variabel to the product associated with the button that was clicked
        ProductDisplay.viewedProduct = product;
        
        //Getting teh item details and changing the "display" to the Product display page
        ProductDisplay.itemDetails.setText(applicationFunctionality.getItemDetails(product));
        KirbSideApparelJavaApplication.changeCard("Product Display");

    }
}
