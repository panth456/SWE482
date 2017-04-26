package kirbsideApparelJavaApplication;


public class Payment {
    
    //Data attibutes
    int orderID;
    String customerID;
    String paymentType;
    int creditCardNumber;
    int CCVNumber;
    String billingStreetAddress1;
    String billingStreetAddress2;
    String billingCity;
    String billingState;
    int billingZip;
    String cardHolderName;
    String expirationDate;
    int processID;
    boolean transactionResult;
    
    //Constructor
    Payment(int orderID, String customerID, String paymentType, int creditCardNumber, int CCVNumber, String billingStreetAddress1, 
            String billingStreetAddress2, String billingCity, String billingState, int billingZip, String cardHolderName, String expirationDate, int processID, boolean transactionResult)
    {
        this.orderID = orderID;
        this.customerID = customerID;
        this.paymentType = paymentType;
        this.creditCardNumber = creditCardNumber;
        this.CCVNumber = CCVNumber;
        this.billingStreetAddress1 = billingStreetAddress1;
        this.billingStreetAddress2 = billingStreetAddress2;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.processID = processID;
        this.transactionResult = transactionResult;
        
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
    
    public String getcustomerID()
    {
        return customerID;
    }
    public void setCustomerID(String customerID)
    {
        this.customerID = customerID;
    }
    
    public String getPaymentType()
    {
        return paymentType;
    }
    public void setPaymentType(String paymentType)
    {
        this.paymentType = paymentType;
    }
    
    public int getCreditCardNumber()
    {
        return creditCardNumber;
    }
    public void setCreditCardNumber(int creditCardNumber)
    {
        this.creditCardNumber = creditCardNumber;
    }
    
    public int getCCVNumber()
    {
        return CCVNumber;
    }
    public void setCCVNumber(int CCVNumber)
    {
        this.CCVNumber = CCVNumber;
    }
    
    public String getBillingStreetAddress1()
    {
        return billingStreetAddress1;
    }
    public void setBillingStreetAddress1(String billingStreetAddress1)
    {
        this.billingStreetAddress1 = billingStreetAddress1;
    }
    
    public String getBillingStreetAddress2()
    {
        return billingStreetAddress2;
    }
    public void setBillingStreeAddress2(String billingStreetAddress2)
    {
        this.billingStreetAddress2 = billingStreetAddress2;
    }
    
    public String getBillingCity()
    {
        return billingCity;
    }
    public void setBillingCity(String billingCity)
    {
        this.billingCity = billingCity;
    }
    
    public String getBillingState()
    {
        return billingState;
    }
    public void setBillingState(String billingState)
    {
        this.billingState = billingState;
    }
    
    public int getBillingZip()
    {
        return billingZip;
    }
    public void setBillingZip(int billingZip)
    {
        this.billingZip = billingZip;
    }
    
    public String getCardHolderName()
    {
        return cardHolderName;
    }
    public void setCardHolderName(String cardHolderName)
    {
        this.cardHolderName = cardHolderName;
    }
    
    public String getExpirationDate()
    {
        return expirationDate;
    }
    public void setExpirationDate(String expirationDate)
    {
        this.expirationDate = expirationDate;
    }
    
    public int getProcessID()
    {
        return processID;
    }
    public void setProcessID(int processID)
    {
        this.processID = processID;
    }
    
    public boolean getTransactionResult()
    {
        return transactionResult;
    }
    public void setTransactionResult(boolean transactionResult)
    {
        this.transactionResult = transactionResult;
    }
}


