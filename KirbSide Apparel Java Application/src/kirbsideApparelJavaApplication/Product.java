package kirbsideApparelJavaApplication;

public class Product {
    
    //Data attributes
    int itemID;
    String itemName;
    String itemDescription;
    double unitPrice;
    boolean availability;
    String color;
    String size;
    
    //Constructor
    Product(int itemID, String itemName, String itemDescription, double unitPrice, boolean availability, String color, String size)
    {
        
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.unitPrice = unitPrice;
        this.availability = availability;
        this.color = color;
        this.size = size;
        
    }
    
    //Getters and Setters
    
   public int getItemID()
   {   
       return itemID;
   }
   
   public void setItemID(int itemID)
   {
       this.itemID = itemID;
   }
   
   public String getItemName()
   {
       return itemName;
   }
   
   public void setItemName(String itemName)
   {
       this.itemName = itemName;
   }
   
   public String getItemDescription()
   {
       return itemDescription;
   }
   
   public void setItemDescription(String itemDescription)
   {
       this.itemDescription = itemDescription;
   }
   
   public double getUnitPrice()
   {
       return unitPrice;
   }
   
   public void setUnitPrice(double unitPrice)
   {
       this.unitPrice = unitPrice;
   }
   
   public boolean getAvailability()
   {
       return availability;
   }
   
   public void setAvailiability(boolean availability)
   {
       this.availability = availability;
   }
   
   public String getColor()
   {
       return color;
   }
   
   public void setColor(String color)
   {
       this.color = color;
   }
   
   public String getSize()
   {
       return size;
   }
   
   public void setSize(String size)
   {
       this.size = size;
   }
}
