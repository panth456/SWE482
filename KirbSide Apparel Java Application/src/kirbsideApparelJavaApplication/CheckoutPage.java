package kirbsideApparelJavaApplication;

//Needed imports
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CheckoutPage extends JPanel{
   
    //JPanels for holding all other components and a header
    JPanel holder = new JPanel();
    JPanel header = new JPanel();
    
    
    //Buttons to let user take an action
    JButton completeCheckout = new JButton("Complete Checkout");
    JButton cancelOrder = new JButton("Cancel Order");
    
    //Texfields to gather input form user
    JTextField paymentTypeField = new JTextField("Payment Type");
    JTextField creditCardNumberField = new JTextField("Credit Card Number");
    JTextField ccvNumberField = new JTextField("CCV Number");
    JTextField expirationDateField = new JTextField("Expiration Date"); 
    JTextField billingAddress1Field = new JTextField("Billing Address 1");
    JTextField billingAddress2Field = new JTextField("Billing Address 2");
    JTextField billingCityField = new JTextField("Billing City");
    JTextField billingStateField = new JTextField("Billing State");
    JTextField billingZipCodeField = new JTextField("Billing Zip Code");
    JTextField cardHolderNameField = new JTextField("Card Holder Name");   
    
    //constructor
    public CheckoutPage() {
        
        //Adding componets to the holder JPanel and the holder to the CheckoutPage JPanel
        add(holder);
        holder.add(paymentTypeField);
        holder.add(creditCardNumberField);
        holder.add(ccvNumberField);
        holder.add(expirationDateField);
        holder.add(billingAddress1Field);
        holder.add(billingAddress2Field);
        holder.add(billingCityField);
        holder.add(billingStateField);
        holder.add(billingZipCodeField);
        holder.add(cardHolderNameField);
        holder.add(completeCheckout);
        holder.add(cancelOrder);
        
        
        //Action listeners for the two buttons
        completeCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeCheckoutActionPerformed(evt);
            }
        });
        
        cancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOrderActionPerformed(evt);
            }
        });
    }

    //Setting prefered dimensions for the CheckoutPage JPanel
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 500);
    }
    
    //Method call for complete checkout button when clicked
    public void completeCheckoutActionPerformed (java.awt.event.ActionEvent evt){
        
        int result = 0;
        
        //Try-catch to handle exceptions in case no zip is entered
        try {
            
            //Gathering data from textfields
            int orderId = applicationFunctionality.orderID;
            String customerId = applicationFunctionality.currentUser.getUsername();
            String paymentType = paymentTypeField.getText();
            int creditCardNumber = Integer.parseInt(creditCardNumberField.getText());
            int ccvNumber = Integer.parseInt(ccvNumberField.getText());
            String billingAddress1 = billingAddress1Field.getText();
            String billingAddress2 = billingAddress2Field.getText();
            String billingCity = billingCityField.getText();
            String billingState = billingStateField.getText();
            int billingZipCode = Integer.parseInt(billingZipCodeField.getText());
            String cardHolderName = cardHolderNameField.getText();
            String expirationDate = expirationDateField.getText();
            int processId = applicationFunctionality.processID;
            boolean transactionResult = true;
            
            //Creating the new payment
            applicationFunctionality.addPayment(orderId, customerId, paymentType, creditCardNumber, ccvNumber, billingAddress1, billingAddress2, billingCity, billingState, billingZipCode, cardHolderName, expirationDate, processId, transactionResult);

            //Writing the Payment CSV to store the payment details
            KirbSideApparelJavaApplication.writePaymentCSVFile(KirbSideApparelJavaApplication.PAYMENT_FILE_NAME);
            
            result  =1;
        } catch (NumberFormatException e) {

        }
        //Using switch to only perform functions if previous try catch succeeds
        switch (result){
            case 1:
                
                //Creates a new order object and writes the order array to the orders CSV
                applicationFunctionality.createOrder();

                KirbSideApparelJavaApplication.writeOrdersCsvFile(KirbSideApparelJavaApplication.ORDERS_FILE_NAME); 

                //Adding orderLine objects from cart to orderLine array and writing that array to the orderLine CSV
                for (int x = 0; x < applicationFunctionality.cartList.size(); x++) {
                    applicationFunctionality.orderLines.add(applicationFunctionality.cartList.get(x));
                }
                KirbSideApparelJavaApplication.writeOrderLineCSVFile(KirbSideApparelJavaApplication.ORDERLINE_FILE_NAME);
                
                //Incrementing orderID for the next order 
                applicationFunctionality.orderID++;

                //Clearing the cart and resetting lineNumber so another order can be completed
                applicationFunctionality.cartList.clear();
                applicationFunctionality.lineNumber = 1;

                //Changing to oder complete page
                KirbSideApparelJavaApplication.changeCard("Order Complete Page");
                break;
            case 0:
        }
        
    }
    
    public void cancelOrderActionPerformed (java.awt.event.ActionEvent evt){
        //Changing to Main Menu when order is cancelled
        KirbSideApparelJavaApplication.changeCard("Main Menu");
        
    }
}
