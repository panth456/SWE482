package kirbsideApparelJavaApplication;

//Needed imports
import java.time.*;

public class Order {
    
    //Data attributes
    int orderID;
    LocalDate date;
    int employeeID;
    double subtotal;
    double tax;
    double totalPrice;
    String userID;
    
    //Constructor
    Order(int orderID, LocalDate date, int employeeID, double subtotal, double tax, double totalPrice, String userID)
    {
        
        this.orderID = orderID;
        this.date = date;
        this.employeeID = employeeID;
        this.subtotal = subtotal;
        this.tax = tax;
        this.totalPrice = totalPrice;
        this.userID = userID;
        
    }

    Order(LocalDate now) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    public LocalDate getDate()
    {
        return date;
    }
    
    public void setDate(LocalDate date)
    {
        this.date = date;
    }
    
    public int getEmployeeID()
    {
        return employeeID;
    }
    
    public void setEmployeeID(int employeeID)
    {
        this.employeeID = employeeID;
    }
    
    public double getSubtotal()
    {
        return subtotal;
    }
    
    public void setSubtotal(int subtotal)
    {
        this.subtotal = subtotal;
    }
    
    public double getTax()
    {
        return tax;
    }
    
    public void setTax(int tax)
    {
        this.tax = tax;
    }
    
    public double getTotalPrice()
    {
        return totalPrice;
    }
    
    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice = totalPrice;
    }
    
    public String getCustomerID()
    {
        return userID;
    }
    
    public void setCustomerID(String userID)
    {
        this.userID = userID;
    }
    
}
    

