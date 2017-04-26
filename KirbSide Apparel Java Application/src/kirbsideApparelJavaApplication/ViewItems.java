package kirbsideApparelJavaApplication;

//Needed imports
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;

class ViewItems extends JPanel {
    
    //Containers for the images and search results
    ArrayList<JLabel> images = new ArrayList<>();    
    public static Map<Product, Product> searchResults = new HashMap();
    
    //Creating image holders
    JLabel imageHolder1 = new JLabel();
    JLabel imageHolder2 = new JLabel();
    JLabel imageHolder3 = new JLabel();
    JLabel imageHolder4 = new JLabel();
    JLabel imageHolder5 = new JLabel();
    JLabel imageHolder6 = new JLabel();
    JLabel imageHolder7 = new JLabel();
    JLabel imageHolder8 = new JLabel();
    JLabel imageHolder9 = new JLabel();
    JLabel imageHolder10 = new JLabel();
    JLabel imageHolder11 = new JLabel();
    JLabel imageHolder12 = new JLabel();
    
    //Creawting search comoponents
    JButton searchButton = new JButton("Search");
    JTextField searchField = new JTextField("Search");
    
    //Constructor
    public ViewItems() {
        
        //Variables used later
        int holderWidth = 1880;
        int holderHeight = 200;
        int frameWidth = 1400;
        int frameHeight = 150;
        int imageWidth = 150;
        int imageHeight = 150;
                
        searchField.setPreferredSize(new Dimension(300, 20));
        
        //Action listener for search button
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        
        //Adding images to array
        addImages();
                
        //All image locations set to variables
        String itemImage1Location = "images/blackMensShoe.jpg";
        String itemImage2Location = "images/blueMensShoe.jpg";
        String itemImage3Location = "images/redMensShoe.jpg";
        String itemImage4Location = "images/purpleWomensShoe.jpg";
        String itemImage5Location = "images/pinkWomensShoe.jpg";
        String itemImage6Location = "images/greyWomensShoe.jpg";
        String itemImage7Location = "images/blueBoysShoe.jpg";
        String itemImage8Location = "images/greenBoysShoe.jpg";
        String itemImage9Location = "images/greyBoysShoe.jpg";
        String itemImage10Location = "images/pinkGirlsShoe.jpg";
        String itemImage11Location = "images/orangeGirlsShoe.jpg";
        String itemImage12Location = "images/redGirlsShoe.jpg";
        
        //Creating array for image locations
        String[] imageLocations = {itemImage1Location, itemImage2Location,itemImage3Location,
            itemImage4Location, itemImage5Location, itemImage6Location, itemImage7Location,
            itemImage8Location, itemImage9Location, itemImage10Location, itemImage11Location,
            itemImage12Location};
                
        //Holder for all components
        JPanel holder = new JPanel();
         
        //Resizing all images
        for(int x = 0; x < images.size(); x++)
        {
            File inputFile = new File(imageLocations[x]);
            BufferedImage resizedImage = null;

            try{
                BufferedImage image = ImageIO.read(inputFile);
                resizedImage = resize(image, imageWidth, imageHeight);
            } catch (IOException e) {

            }

            //Setting resized image to image holder
            images.get(x).setIcon(new ImageIcon(resizedImage));
        }
        
        //Creating JPanels to hold all data for specific item
        JPanel itemHolder1 = new JPanel();
        JPanel itemHolder2 = new JPanel();
        JPanel itemHolder3 = new JPanel();
        JPanel itemHolder4 = new JPanel();
        JPanel itemHolder5 = new JPanel();
        JPanel itemHolder6 = new JPanel();
        JPanel itemHolder7 = new JPanel();
        JPanel itemHolder8 = new JPanel();
        JPanel itemHolder9 = new JPanel();
        JPanel itemHolder10 = new JPanel();
        JPanel itemHolder11 = new JPanel();
        JPanel itemHolder12 = new JPanel();
        JPanel itemHolder13 = new JPanel();
        
        //Creating buttons for all items, and setting their action listeners
        String itemButtonText = "View Item Details";
        JButton itemButton1 = new JButton(itemButtonText);
        itemButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemButton1ActionPerformed(evt);
            }
        });
        
        JButton itemButton2 = new JButton(itemButtonText);
        itemButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemButton2ActionPerformed(evt);
            }
        });
        
        JButton itemButton3 = new JButton(itemButtonText);
        itemButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemButton3ActionPerformed(evt);
            }
        });
        
        JButton itemButton4 = new JButton(itemButtonText);
        itemButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemButton4ActionPerformed(evt);
            }
        });
        
        JButton itemButton5 = new JButton(itemButtonText);
        itemButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemButton5ActionPerformed(evt);
            }
        });
        
        JButton itemButton6 = new JButton(itemButtonText);
        itemButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemButton6ActionPerformed(evt);
            }
        });
        
        JButton itemButton7 = new JButton(itemButtonText);
        itemButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemButton7ActionPerformed(evt);
            }
        });
        
        JButton itemButton8 = new JButton(itemButtonText);
        itemButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemButton8ActionPerformed(evt);
            }
        });
        
        JButton itemButton9 = new JButton(itemButtonText);
        itemButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemButton9ActionPerformed(evt);
            }
        });
        
        JButton itemButton10 = new JButton(itemButtonText);
        itemButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemButton10ActionPerformed(evt);
            }
        });
        
        JButton itemButton11 = new JButton(itemButtonText);
        itemButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemButton11ActionPerformed(evt);
            }
        });
        
        JButton itemButton12 = new JButton(itemButtonText);
        itemButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemButton12ActionPerformed(evt);
            }
        });
        
        JButton viewCart = new JButton("View Cart");
        viewCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCartActionPerformed(evt);
            }
        });
                
        //Creating scroll pane to show all items, and craeting border design for item holders
        JScrollPane scrollPane = new JScrollPane( 
            ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,  
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        Border blackline = BorderFactory.createLineBorder(Color.black);
        
        //Setting preffered size of all item holders
        itemHolder1.setPreferredSize(new Dimension(holderWidth, holderHeight));
        itemHolder1.setMaximumSize(new Dimension(holderWidth, holderHeight));
        itemHolder1.setMinimumSize(new Dimension(holderWidth, holderHeight));
        itemHolder2.setPreferredSize(new Dimension(holderWidth, holderHeight));
        itemHolder3.setPreferredSize(new Dimension(holderWidth, holderHeight));
        itemHolder4.setPreferredSize(new Dimension(holderWidth, holderHeight));
        itemHolder5.setPreferredSize(new Dimension(holderWidth, holderHeight));
        itemHolder6.setPreferredSize(new Dimension(holderWidth, holderHeight));
        itemHolder7.setPreferredSize(new Dimension(holderWidth, holderHeight));
        itemHolder8.setPreferredSize(new Dimension(holderWidth, holderHeight));
        itemHolder9.setPreferredSize(new Dimension(holderWidth, holderHeight));
        itemHolder10.setPreferredSize(new Dimension(holderWidth, holderHeight));
        itemHolder11.setPreferredSize(new Dimension(holderWidth, holderHeight));
        itemHolder12.setPreferredSize(new Dimension(holderWidth, holderHeight));
        itemHolder13.setPreferredSize(new Dimension(holderWidth, holderHeight));
        
        //Adding boder to all item holders
        itemHolder2.setBorder(blackline);
        itemHolder3.setBorder(blackline);
        itemHolder4.setBorder(blackline);
        itemHolder5.setBorder(blackline);
        itemHolder6.setBorder(blackline);
        itemHolder7.setBorder(blackline);
        itemHolder8.setBorder(blackline);
        itemHolder9.setBorder(blackline);
        itemHolder10.setBorder(blackline);
        itemHolder11.setBorder(blackline);
        itemHolder12.setBorder(blackline);
        itemHolder13.setBorder(blackline);
                
        //Creating JLabels for all products with their details inside the label, and setting their preferred size
        JLabel itemFrame1 = new JLabel(applicationFunctionality.getProductInfo("M8"));
        itemFrame1.setPreferredSize(new Dimension(frameWidth, frameHeight));
        
        JLabel itemFrame2 = new JLabel(applicationFunctionality.getProductInfo("M9"), JLabel.CENTER);
        itemFrame2.setMinimumSize(new Dimension(frameWidth, frameHeight));
        itemFrame2.setPreferredSize(new Dimension(frameWidth, frameHeight));
        itemFrame2.setMaximumSize(new Dimension(frameWidth, frameHeight));
        
        JLabel itemFrame3 = new JLabel(applicationFunctionality.getProductInfo("M10"), JLabel.CENTER);
        itemFrame3.setMinimumSize(new Dimension(frameWidth, frameHeight));
        itemFrame3.setPreferredSize(new Dimension(frameWidth, frameHeight));
        itemFrame3.setMaximumSize(new Dimension(frameWidth, frameHeight));
        
        JLabel itemFrame4 = new JLabel(applicationFunctionality.getProductInfo("W6"), JLabel.CENTER);
        itemFrame4.setMinimumSize(new Dimension(frameWidth, frameHeight));
        itemFrame4.setPreferredSize(new Dimension(frameWidth, frameHeight));
        itemFrame4.setMaximumSize(new Dimension(frameWidth, frameHeight));
        
        JLabel itemFrame5 = new JLabel(applicationFunctionality.getProductInfo("W7"), JLabel.CENTER);
        itemFrame5.setMinimumSize(new Dimension(frameWidth, frameHeight));
        itemFrame5.setPreferredSize(new Dimension(frameWidth, frameHeight));
        itemFrame5.setMaximumSize(new Dimension(frameWidth, frameHeight));
        
        JLabel itemFrame6 = new JLabel(applicationFunctionality.getProductInfo("W8"), JLabel.CENTER);
        itemFrame6.setMinimumSize(new Dimension(frameWidth, frameHeight));
        itemFrame6.setPreferredSize(new Dimension(frameWidth, frameHeight));
        itemFrame6.setMaximumSize(new Dimension(frameWidth, frameHeight));
        
        JLabel itemFrame7 = new JLabel(applicationFunctionality.getProductInfo("B4"), JLabel.CENTER);
        itemFrame7.setMinimumSize(new Dimension(frameWidth, frameHeight));
        itemFrame7.setPreferredSize(new Dimension(frameWidth, frameHeight));
        itemFrame7.setMaximumSize(new Dimension(frameWidth, frameHeight));
        
        JLabel itemFrame8 = new JLabel(applicationFunctionality.getProductInfo("B5"), JLabel.CENTER);
        itemFrame8.setMinimumSize(new Dimension(frameWidth, frameHeight));
        itemFrame8.setPreferredSize(new Dimension(frameWidth, frameHeight));
        itemFrame8.setMaximumSize(new Dimension(frameWidth, frameHeight));
        
        JLabel itemFrame9 = new JLabel(applicationFunctionality.getProductInfo("B6"), JLabel.CENTER);
        itemFrame9.setMinimumSize(new Dimension(frameWidth, frameHeight));
        itemFrame9.setPreferredSize(new Dimension(frameWidth, frameHeight));
        itemFrame9.setMaximumSize(new Dimension(frameWidth, frameHeight));
       
        JLabel itemFrame10 = new JLabel(applicationFunctionality.getProductInfo("G4"), JLabel.CENTER);
        itemFrame10.setMinimumSize(new Dimension(frameWidth, frameHeight));
        itemFrame10.setPreferredSize(new Dimension(frameWidth, frameHeight));
        itemFrame10.setMaximumSize(new Dimension(frameWidth, frameHeight));
        
        JLabel itemFrame11 = new JLabel(applicationFunctionality.getProductInfo("G5"), JLabel.CENTER);
        itemFrame11.setMinimumSize(new Dimension(frameWidth, frameHeight));
        itemFrame11.setPreferredSize(new Dimension(frameWidth, frameHeight));
        itemFrame11.setMaximumSize(new Dimension(frameWidth, frameHeight));
        
        JLabel itemFrame12 = new JLabel(applicationFunctionality.getProductInfo("G6"), JLabel.CENTER);
        itemFrame12.setMinimumSize(new Dimension(frameWidth, frameHeight));
        itemFrame12.setPreferredSize(new Dimension(frameWidth, frameHeight));
        itemFrame12.setMaximumSize(new Dimension(frameWidth, frameHeight));
        
        
        //Adding teh items to holder, holder as viewport to scrollPane, and adding scrollPane to ViewItems
        add(scrollPane);
        holder.add(itemHolder1);
        holder.add(itemHolder2);
        holder.add(itemHolder3);
        holder.add(itemHolder4);
        holder.add(itemHolder5);
        holder.add(itemHolder6);
        holder.add(itemHolder7);
        holder.add(itemHolder8);
        holder.add(itemHolder9);
        holder.add(itemHolder10);
        holder.add(itemHolder11);
        holder.add(itemHolder12);
        holder.add(itemHolder13);
        holder.add(viewCart);
        scrollPane.setViewportView(holder);
        
        //Adding search components to top holder
        itemHolder1.add(Box.createHorizontalGlue());
        itemHolder1.add(searchField);
        itemHolder1.add(searchButton);
        
        //Spacer inside each item holder
        itemHolder2.add(Box.createHorizontalGlue());
        itemHolder3.add(Box.createHorizontalGlue());
        itemHolder4.add(Box.createHorizontalGlue());
        itemHolder5.add(Box.createHorizontalGlue());
        itemHolder6.add(Box.createHorizontalGlue());
        itemHolder7.add(Box.createHorizontalGlue());
        itemHolder8.add(Box.createHorizontalGlue());
        itemHolder9.add(Box.createHorizontalGlue());
        itemHolder10.add(Box.createHorizontalGlue());
        itemHolder11.add(Box.createHorizontalGlue());
        itemHolder12.add(Box.createHorizontalGlue());
        itemHolder13.add(Box.createHorizontalGlue());
        
        //Adding item images to item holder
        itemHolder2.add(imageHolder1);
        itemHolder3.add(imageHolder2);
        itemHolder4.add(imageHolder3);
        itemHolder5.add(imageHolder4);
        itemHolder6.add(imageHolder5);
        itemHolder7.add(imageHolder6);
        itemHolder8.add(imageHolder7);
        itemHolder9.add(imageHolder8);
        itemHolder10.add(imageHolder9);
        itemHolder11.add(imageHolder10);
        itemHolder12.add(imageHolder11);
        itemHolder13.add(imageHolder12);
        
        //Another spacer
        itemHolder2.add(Box.createHorizontalGlue());
        itemHolder3.add(Box.createHorizontalGlue());
        itemHolder4.add(Box.createHorizontalGlue());
        itemHolder5.add(Box.createHorizontalGlue());
        itemHolder6.add(Box.createHorizontalGlue());
        itemHolder7.add(Box.createHorizontalGlue());
        itemHolder8.add(Box.createHorizontalGlue());
        itemHolder9.add(Box.createHorizontalGlue());
        itemHolder10.add(Box.createHorizontalGlue());
        itemHolder11.add(Box.createHorizontalGlue());
        itemHolder12.add(Box.createHorizontalGlue());
        itemHolder13.add(Box.createHorizontalGlue());
        
        //Adding item details label to item holder
        itemHolder2.add(itemFrame1);
        itemHolder3.add(itemFrame2);
        itemHolder4.add(itemFrame3);
        itemHolder5.add(itemFrame4);
        itemHolder6.add(itemFrame5);
        itemHolder7.add(itemFrame6);
        itemHolder8.add(itemFrame7);
        itemHolder9.add(itemFrame8);
        itemHolder10.add(itemFrame9);
        itemHolder11.add(itemFrame10);
        itemHolder12.add(itemFrame11);
        itemHolder13.add(itemFrame12);
        
        //Another spacer
        itemHolder2.add(Box.createHorizontalGlue());
        itemHolder3.add(Box.createHorizontalGlue());
        itemHolder4.add(Box.createHorizontalGlue());
        itemHolder5.add(Box.createHorizontalGlue());
        itemHolder6.add(Box.createHorizontalGlue());
        itemHolder7.add(Box.createHorizontalGlue());
        itemHolder8.add(Box.createHorizontalGlue());
        itemHolder9.add(Box.createHorizontalGlue());
        itemHolder10.add(Box.createHorizontalGlue());
        itemHolder11.add(Box.createHorizontalGlue());
        itemHolder12.add(Box.createHorizontalGlue());
        itemHolder13.add(Box.createHorizontalGlue());
        
        //Adding each item button to repective item holder
        itemHolder2.add(itemButton1);
        itemHolder3.add(itemButton2);
        itemHolder4.add(itemButton3);
        itemHolder5.add(itemButton4);
        itemHolder6.add(itemButton5);
        itemHolder7.add(itemButton6);
        itemHolder8.add(itemButton7);
        itemHolder9.add(itemButton8);
        itemHolder10.add(itemButton9);
        itemHolder11.add(itemButton10);
        itemHolder12.add(itemButton11);
        itemHolder13.add(itemButton12);
        
        //last spacer
        itemHolder2.add(Box.createHorizontalGlue());
        itemHolder3.add(Box.createHorizontalGlue());
        itemHolder4.add(Box.createHorizontalGlue());
        itemHolder5.add(Box.createHorizontalGlue());
        itemHolder6.add(Box.createHorizontalGlue());
        itemHolder7.add(Box.createHorizontalGlue());
        itemHolder8.add(Box.createHorizontalGlue());
        itemHolder9.add(Box.createHorizontalGlue());
        itemHolder10.add(Box.createHorizontalGlue());
        itemHolder11.add(Box.createHorizontalGlue());
        itemHolder12.add(Box.createHorizontalGlue());
        itemHolder13.add(Box.createHorizontalGlue());
        
        //Setting paramaters of scrollpane, and layout for holder, and item holders
        scrollPane.setPreferredSize(new Dimension(1900, 950));
        scrollPane.getVerticalScrollBar().setUnitIncrement(20);
        holder.setLayout(new BoxLayout(holder, BoxLayout.Y_AXIS));
        itemHolder2.setLayout(new BoxLayout(itemHolder2, BoxLayout.X_AXIS));
        itemHolder3.setLayout(new BoxLayout(itemHolder3, BoxLayout.X_AXIS));
        itemHolder4.setLayout(new BoxLayout(itemHolder4, BoxLayout.X_AXIS));
        itemHolder5.setLayout(new BoxLayout(itemHolder5, BoxLayout.X_AXIS));
        itemHolder6.setLayout(new BoxLayout(itemHolder6, BoxLayout.X_AXIS));
        itemHolder7.setLayout(new BoxLayout(itemHolder7, BoxLayout.X_AXIS));
        itemHolder8.setLayout(new BoxLayout(itemHolder8, BoxLayout.X_AXIS));
        itemHolder9.setLayout(new BoxLayout(itemHolder9, BoxLayout.X_AXIS));
        itemHolder10.setLayout(new BoxLayout(itemHolder10, BoxLayout.X_AXIS));
        itemHolder11.setLayout(new BoxLayout(itemHolder11, BoxLayout.X_AXIS));
        itemHolder12.setLayout(new BoxLayout(itemHolder12, BoxLayout.X_AXIS));
        itemHolder13.setLayout(new BoxLayout(itemHolder13, BoxLayout.X_AXIS));
        
    }

    //Setting preferred size of ViewItems
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(1900, 950);
    }
    
    //Function that resizes images
    public static BufferedImage resize(BufferedImage image, int width, int height) {
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
        Graphics2D g2d = (Graphics2D) bi.createGraphics();
        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
        g2d.drawImage(image, 0, 0, width, height, null);
        g2d.dispose();
        return bi;
    }
    
    //Function to add all images to images array
    public void addImages()
    {
        images.add(imageHolder1);
        images.add(imageHolder2);
        images.add(imageHolder3);
        images.add(imageHolder4);
        images.add(imageHolder5);
        images.add(imageHolder6);
        images.add(imageHolder7);
        images.add(imageHolder8);
        images.add(imageHolder9);
        images.add(imageHolder10);
        images.add(imageHolder11);
        images.add(imageHolder12);
    }
    
    //Function called when button 1 is clicked
    private void itemButton1ActionPerformed (java.awt.event.ActionEvent evt) {                                           

        //Changing viewedProduct to appropriate product, setting the correct details, and chaning the "display" to Product Page
        ProductDisplay.viewedProduct = "M8";
        ProductDisplay.itemDetails.setText(applicationFunctionality.getItemDetails("M8"));
        KirbSideApparelJavaApplication.changeCard("Product Display");
        
    }
    //Function called when button is 2 clicked
    private void itemButton2ActionPerformed (java.awt.event.ActionEvent evt) {                                         

        //Changing viewedProduct to appropriate product, setting the correct details, and chaning the "display" to Product Page
        ProductDisplay.viewedProduct = "M9";
        ProductDisplay.itemDetails.setText(applicationFunctionality.getItemDetails("M9"));
        KirbSideApparelJavaApplication.changeCard("Product Display");
        
    }    
    //Function called when button is 3 clicked
    private void itemButton3ActionPerformed (java.awt.event.ActionEvent evt) {                                          

        //Changing viewedProduct to appropriate product, setting the correct details, and chaning the "display" to Product Page
        ProductDisplay.viewedProduct = "M10";
        ProductDisplay.itemDetails.setText(applicationFunctionality.getItemDetails("M10"));
        KirbSideApparelJavaApplication.changeCard("Product Display");
        
    }    
    //Function called when button is 4 clicked
    private void itemButton4ActionPerformed (java.awt.event.ActionEvent evt) {                                         

        //Changing viewedProduct to appropriate product, setting the correct details, and chaning the "display" to Product Page
        ProductDisplay.viewedProduct = "W6";
        ProductDisplay.itemDetails.setText(applicationFunctionality.getItemDetails("W6"));
        KirbSideApparelJavaApplication.changeCard("Product Display");
        
    }    
    //Function called when button is 5 clicked
    private void itemButton5ActionPerformed (java.awt.event.ActionEvent evt) {                                         

        //Changing viewedProduct to appropriate product, setting the correct details, and chaning the "display" to Product Page
        ProductDisplay.viewedProduct = "W7";
        ProductDisplay.itemDetails.setText(applicationFunctionality.getItemDetails("W7"));
        KirbSideApparelJavaApplication.changeCard("Product Display");
        
    }    
    //Function called when button is 6 clicked
    private void itemButton6ActionPerformed (java.awt.event.ActionEvent evt) {                                         

        //Changing viewedProduct to appropriate product, setting the correct details, and chaning the "display" to Product Page
        ProductDisplay.viewedProduct = "W8";
        ProductDisplay.itemDetails.setText(applicationFunctionality.getItemDetails("W8"));
        KirbSideApparelJavaApplication.changeCard("Product Display");
        
    }    
    //Function called when button is 7 clicked
    private void itemButton7ActionPerformed (java.awt.event.ActionEvent evt) {                                         

        //Changing viewedProduct to appropriate product, setting the correct details, and chaning the "display" to Product Page
        ProductDisplay.viewedProduct = "B4";
        ProductDisplay.itemDetails.setText(applicationFunctionality.getItemDetails("B4"));
        KirbSideApparelJavaApplication.changeCard("Product Display");
        
    }    
    //Function called when button is 8 clicked
    private void itemButton8ActionPerformed (java.awt.event.ActionEvent evt) {                                          

        //Changing viewedProduct to appropriate product, setting the correct details, and chaning the "display" to Product Page
        ProductDisplay.viewedProduct = "B5";
        ProductDisplay.itemDetails.setText(applicationFunctionality.getItemDetails("B5"));
        KirbSideApparelJavaApplication.changeCard("Product Display");
        
    }    
    //Function called when button is 9 clicked
    private void itemButton9ActionPerformed (java.awt.event.ActionEvent evt) {                                           

        //Changing viewedProduct to appropriate product, setting the correct details, and chaning the "display" to Product Page
        ProductDisplay.viewedProduct = "B6";
        ProductDisplay.itemDetails.setText(applicationFunctionality.getItemDetails("B6"));
        KirbSideApparelJavaApplication.changeCard("Product Display");;
        
    }    
    //Function called when button is 10 clicked
    private void itemButton10ActionPerformed (java.awt.event.ActionEvent evt) {                                          

        //Changing viewedProduct to appropriate product, setting the correct details, and chaning the "display" to Product Page
        ProductDisplay.viewedProduct = "G4";
        ProductDisplay.itemDetails.setText(applicationFunctionality.getItemDetails("G4"));
        KirbSideApparelJavaApplication.changeCard("Product Display");
        
    }    
    //Function called when button is 11 clicked
    private void itemButton11ActionPerformed (java.awt.event.ActionEvent evt) {                                         

        //Changing viewedProduct to appropriate product, setting the correct details, and chaning the "display" to Product Page
        ProductDisplay.viewedProduct = "G5";
        ProductDisplay.itemDetails.setText(applicationFunctionality.getItemDetails("G5"));
        KirbSideApparelJavaApplication.changeCard("Product Display");
        
    }    
    //Function called when button is 12 clicked
    private void itemButton12ActionPerformed (java.awt.event.ActionEvent evt) {                                          

        //Changing viewedProduct to appropriate product, setting the correct details, and chaning the "display" to Product Page
        ProductDisplay.viewedProduct = "G6";
        ProductDisplay.itemDetails.setText(applicationFunctionality.getItemDetails("G6"));
        KirbSideApparelJavaApplication.changeCard("Product Display");
        
    }     
    
    //Function called when view cart button is clicked
    private void viewCartActionPerformed (java.awt.event.ActionEvent evt){
        
        //Creating the display of the users cart, and chaning the "display" to view Cart
        ViewCart.cartDisplay.setText(applicationFunctionality.displayCart());
        
        KirbSideApparelJavaApplication.changeCard("View Cart");
        
    }
    
    //Function called when search button is clicked
    private void searchButtonActionPerformed (java.awt.event.ActionEvent evt) {                                          

        //Clearing the searchResults Map for new search, and removing any items from item holder, left from previous search
        searchResults.clear();
        SearchPage.itemsHolder.removeAll();
        
        //Iterating through all products and checking if any product names match search entry, and adding to searchResults if thers a match
        for(int x =0; x < applicationFunctionality.productList.size(); x++){
            if (applicationFunctionality.productList.get(x).getItemName().toLowerCase().contains(searchField.getText().toLowerCase())){
                searchResults.put(applicationFunctionality.productList.get(x), applicationFunctionality.productList.get(x));
            }
        }    
        
        //Iterating through all products and checking if any product descriptions maatch search entry, and adding to searchResults if theres a match
        for(int x =0; x < applicationFunctionality.productList.size(); x++){
            if (applicationFunctionality.productList.get(x).getItemDescription().toLowerCase().contains(searchField.getText().toLowerCase())){
                searchResults.put(applicationFunctionality.productList.get(x), applicationFunctionality.productList.get(x));
            }
        } 
        
        //Creating display of all items collected in searchResults and changing "display" to Search Page to display those results
        SearchPage.getSearchDetails();
        KirbSideApparelJavaApplication.changeCard("Search Page");
    } 

}
