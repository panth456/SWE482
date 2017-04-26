package kirbsideApparelJavaApplication;


public class PaymentProcessor {
    
    //Data attributes
    int processID;
    String processorName;
    String processorStreetAddress1;
    String processorStreetAddress2;
    String processorCity;
    String processorState;
    int processorZip;
    String contactName;
    int contactPhone;
    String contactEmail;
    
    //Constructor
    PaymentProcessor(int processID, String processorStreetAddress1, String processorStreetAddress2, String processorCity, String processorState, int processorZip,
            String contactName, int contactPhone, String contactEmail)
    {
        this.processID = processID;
        this.processorStreetAddress1 = processorStreetAddress1;
        this.processorStreetAddress2 = processorStreetAddress2;
        this.processorCity = processorCity;
        this.processorState = processorState;
        this.processorZip = processorZip;
        this.contactName = contactName;
        this.contactPhone = contactPhone;
        this.contactEmail = contactEmail;
    }
    
    //Getters and Setters
    public int getProcessID()
    {
        return processID;
    }
    public void setProcessID(int processID)
    {
        this.processID = processID;
    }
    
    public String getProcessorStreeAddress1()
    {
        return processorStreetAddress1;
    }
    public void setProcessorStreetAddress1(String processStreetAddress1)
    {
        this.processorStreetAddress1 = processStreetAddress1;
    }
    
    public String getProcessorStreetAddress2()
    {
        return processorStreetAddress2;
    }
    public void setProcessorAddress2(String processorStreetAddress2)
    {
        this.processorStreetAddress2 = processorStreetAddress2;
    }
    
    public String getProcessorCity()
    {
        return processorCity;
    }
    public void setProcessorCity(String processorCity)
    {
        this.processorCity = processorCity;
    }
    
    public String getProcesorState()
    {
        return processorState;
    }
    public void setProcessorState(String processorState)
    {
        this.processorState = processorState;
    }
    
    public int getProcesorZip()
    {
        return processorZip;
    }
    public void setProcessorZip(int processorZip)
    {
        this.processorZip = processorZip;
    }
    
    public String getContactName()
    {
        return contactName;
    }
    public void setContactName(String contactName)
    {
        this.contactName = contactName;
    }
    
    public int getContactPhone()
    {
        return contactPhone;
    }
    public void setContactPhone(int contactPhone)
    {
        this.contactPhone = contactPhone;
    }
    
    public String getContactEmail()
    {
        return contactEmail;
    }
    public void setContactEmail(String contactEmail)
    {
        this.contactEmail = contactEmail;
    }
    
}
