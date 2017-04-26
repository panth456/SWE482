package kirbsideApparelJavaApplication;


public class OrderLine {
    
    //Data attributes
    int orderID;
    int lineNumber;
    int itemID;
    double cost;
    int quantity;
    String color;
    String size;
    
    //Constructor
    OrderLine(int orderID, int lineNumber, int itemID, double cost, int quantity, String color, String size)
    {
        
        this.orderID = orderID;
        this.lineNumber = lineNumber;
        this.itemID = itemID;
        this.cost = cost;
        this.quantity = quantity;
        this.color = color;
        this.size = size;
        
    }
    
    //Getters and Setters
    public int getOrderID()
    {
        return orderID;
    }
    public void setOrderID(int orderID)
    {
        this.orderID = orderID;
    }
    
    public int getLineNumber()
    {
        return lineNumber;
    }
    
    public void setLineNumber(int lineNumber)
    {
        this.lineNumber = lineNumber;
    }
    
    public int getItemID()
    {
        return itemID;
    }
    
    public void setItemID(int itemID)
    {
        this.itemID = itemID;
    }
    
    public double getCost()
    {
        return cost;
    }
    
    public void setCost(int cost)
    {
        this.cost = cost;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
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
