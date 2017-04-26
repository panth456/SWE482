package kirbsideApparelJavaApplication;

//Needed imports
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class KirbSideApparelJavaApplication {
    
    //More variable declarations
    public static final String USER_FILE_NAME = "customers.csv";
    public static final String ORDERS_FILE_NAME = "orders.csv";
    public static final String ORDERLINE_FILE_NAME = "orderLine.CSV";
    public static final String PAYMENT_FILE_NAME = "payments.CSV";

    private static final int CUSTOMER_FIRSTNAME = 0;
    private static final int CUSTOMER_LASTNAME = 1;
    private static final int CUSTOMER_EMAIL = 2;
    private static final int CUSTOMER_ADDRESS1 = 3;
    private static final int CUSTOMER_ADDRESS2 = 4;
    private static final int CUSTOMER_CITY = 5;
    private static final int CUSTOMER_STATE = 6;
    private static final int CUSTOMER_ZIPCODE = 7;
    private static final int CUSTOMER_USERNAME = 8;
    private static final int CUSTOMER_PASSWORD = 9;
    private static final int ORDER_ID = 0;
    private static final int DATE = 1;
    private static final int EMPLOYEE_ID = 2;
    private static final int SUBTOTAL = 3;
    private static final int TAX = 4;
    private static final int TOTAL_PRICE = 5;
    private static final int USER_ID = 6;
    private static final int LINE_NUMBER = 1;
    private static final int ITEM_ID = 2;
    private static final int COST = 3;
    private static final int QUANTITY = 4;
    private static final int COLOR = 5;
    private static final int SIZE = 6;
    private static final int CUSTOMER_ID = 1;
    private static final int PAYMENT_TYPE = 2;
    private static final int CREDIT_CARD_NUMBER = 3;
    private static final int CCV_NUMBER = 4;
    private static final int BILLING_ADDRESS_1 = 5;
    private static final int BILLING_ADDRESS_2 = 6;
    private static final int BILLING_CITY = 7;
    private static final int BILLING_STATE = 8;
    private static final int BILLING_ZIP_CODE = 9;
    private static final int CARD_HOLDER_NAME = 10;
    private static final int EXPIRATION_DATE = 11;
    private static final int PROCES_ID = 12;
    private static final int TRANSACTION_RESULT = 13;
    boolean exit;
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String USER_FILE_HEADER
            = "firstName,lastName,email,address1,address2,city,state,zipCode,userName,password";
    private static final String ORDERS_FILE_HEADER 
            = "orderID,date,employeeID,subtotal,tax,totalPrice,userID";
    private static final String ORDER_LINE_FILE_HEADER 
            = "OrderID,LineNumber,ItemID,Cost,Quantity,Color,Size";
    private static final String PAYMENTS_FILE_HEADER
            = "OrderID,CustomerID,PaymentType,CreditCardNumber,CCVNumber,BillingStreretAddress1,BillingStreetAddress2,BillingCity"
            + ",BillingState,BillingZip,CardHolderName,ExpirationDate,ProcesID,TransactionResult";
    public int currentOrderID = 1;

    //Variable declaration for all "displays" of classes
    static MainMenu p1 = new MainMenu();
    static ViewItems p2 = new ViewItems();
    static UserPage p3 = new UserPage();
    static ViewCart p4 = new ViewCart();
    static CheckoutPage p5 = new CheckoutPage();
    static UserLoginPage p6 = new UserLoginPage();
    static CreateUserAccount p7 = new CreateUserAccount();
    static OrderCompletePage p8 = new OrderCompletePage();
    static UserAccountUpdate p9 = new UserAccountUpdate();
    static ViewOrders p10 = new ViewOrders();
    static ProductDisplay p11 = new ProductDisplay();
    static SearchPage p12 = new SearchPage();

    //Declaring cardLayout for JPanel
    static CardLayout layout = new CardLayout();
    static JPanel cardPanel = new JPanel(layout);

    public KirbSideApparelJavaApplication() {
        
        //Buttons on the main form of the application to be displayed at all times
        JButton mainMenu = new JButton("Main Menu");
        JButton viewItems = new JButton("View Items");
        JButton userPage = new JButton("User Page");
        
        //JPanel for butons
        JPanel buttonsPanel = new JPanel();
        //Adding buttons to that JPanel
        buttonsPanel.add(mainMenu);
        buttonsPanel.add(viewItems);
        buttonsPanel.add(userPage);
        //Action listeners for the buttons
        mainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeCard("Main Menu");
            }
        });
        viewItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeCard("View Items");
            }
        });
        userPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeCard("User Page");
            }
        });

        //Adding all of the classes to the JPanel as cards in order
        cardPanel.add(p1, "Main Menu");
        cardPanel.add(p2, "View Items");
        cardPanel.add(p3, "User Page");
        cardPanel.add(p4, "View Cart");
        cardPanel.add(p5, "Checkout Page");
        cardPanel.add(p6, "User Login Page");
        cardPanel.add(p7, "User Account Creation Page");
        cardPanel.add(p8, "Order Complete Page");
        cardPanel.add(p9, "User Account Update Page");
        cardPanel.add(p10, "View Orders Page");
        cardPanel.add(p11, "Product Display");
        cardPanel.add(p12, "Search Page");

        //Creating the main frame to hold everthing
        JFrame frame = new JFrame("Test Card");
        frame.add(cardPanel);
        frame.add(buttonsPanel, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
        
        //Modifing the actions taken on closing
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
    }
    
     public static void main(String[] args) {
        
        //Needed functions before anything else can happen, reading and writing to files
        applicationFunctionality.addProducts();
        readCustomerCsvFile(USER_FILE_NAME);
        readOrdersCSVFile(ORDERS_FILE_NAME);
        readOrderLineCsvFile(ORDERLINE_FILE_NAME);
        
        //Running the main form
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                KirbSideApparelJavaApplication KirbSideApparelJavaApplication = new KirbSideApparelJavaApplication();
            }
        });
        
    }
    
     //Function to switch cards based on value passed in
    public static void changeCard(String card)
    {
        if("View Cart".equals(card)){
            layout.show(cardPanel, "View Cart");
        } else if ("Checkout Page".equals(card)) {
            layout.show(cardPanel, "Checkout Page");
        } else if ("User Page".equals(card)) {
            if (applicationFunctionality.currentUser != null) {
                layout.show(cardPanel, "User Page");
            } else {
                layout.show(cardPanel, "User Login Page");
            }
        } else if ("Main Menu".equals(card)){
            layout.show(cardPanel, "Main Menu");
        } else if ("View Items".equals(card)) {
            layout.show(cardPanel, "View Items");
        } else if ("User Account Creation Page".equals(card)) {
            layout.show(cardPanel, "User Account Creation Page");
        } else if ("Order Complete Page".equals(card)){
            layout.show(cardPanel, card);
        } else if ("User Login Page".equals(card)) {
            layout.show(cardPanel, "User Login Page");
        } else if ("User Account Update Page".equals(card)) {
            layout.show(cardPanel, "User Account Update Page");
        } else if ("View Orders Page".equals(card)) {
            layout.show(cardPanel, "View Orders Page");
        } else if ("Product Display".equals(card)) {
            layout.show(cardPanel, "Product Display");
        } else if ("Search Page".equals(card)) {
            layout.show(cardPanel, "Search Page");
        }
    }
    
    //prints entire customer array for testing purposes only
    public static void printCustomerArray() {

        System.out.println("---------------------------------------------");
        for (Customers customer : applicationFunctionality.users) {
            System.out.println(customer.firstName + " " + customer.lastName);
            System.out.println("Username: " + customer.userName);
            System.out.println("Email: " + customer.email);
            System.out.println("Mailing Address: " + customer.address1 + " " + customer.address2 + " " + customer.city + " " + customer.state + " " + customer.zipCode);
            System.out.println("Username: " + customer.userName + "   Password: " + customer.password);
            System.out.println("---------------------------------------------");
        }
    }

//reads csv file into the arraylist for customer account information
    @SuppressWarnings("null")
    public static void readCustomerCsvFile(String fileName) {

        BufferedReader fileReader = null;

        try {
            @SuppressWarnings("UnusedAssignment")
            String line = "";
            //Create the file reader
            fileReader = new BufferedReader(new FileReader(fileName));

            //Read the CSV file header to skip it
            fileReader.readLine();

            //Read the file line by line starting from the second line
            while ((line = fileReader.readLine()) != null) {

                //Get all tokens available in line
                String[] tokens = line.split(COMMA_DELIMITER);

                if (tokens.length > 0) {

                    //Create a new customer object and fill his  data
                    @SuppressWarnings("LocalVariableHidesMemberVariable")
                    Customers customerInfo = new Customers((tokens[CUSTOMER_FIRSTNAME]), tokens[CUSTOMER_LASTNAME], tokens[CUSTOMER_EMAIL], tokens[CUSTOMER_ADDRESS1], tokens[CUSTOMER_ADDRESS2], tokens[CUSTOMER_CITY], tokens[CUSTOMER_STATE], Integer.parseInt(tokens[CUSTOMER_ZIPCODE]), tokens[CUSTOMER_USERNAME], tokens[CUSTOMER_PASSWORD]);

                    applicationFunctionality.users.add(customerInfo);
                }
            }
            System.out.println("Customer Accounts Loaded Successfully");

        } catch (IOException | NumberFormatException e) {

            System.out.println("Error in CsvFileReader !!!");

        } finally {

            try {

                fileReader.close();

            } catch (IOException e) {

                System.out.println("Error while closing fileReader !!!");

            }
        }
    }
    
    //writes contents of customer array to external csv file
    @SuppressWarnings({"null", "RedundantStringToString"})
    public static int writeCustomerCsvFile(String fileName) {

        FileWriter fileWriter = null;

        try {

            fileWriter = new FileWriter(fileName);

            //Write the CSV file header
            fileWriter.append(USER_FILE_HEADER.toString());

            //Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);

            //Write all customer objects in arrayList to the CSV file
            for (Customers customer : applicationFunctionality.users) {

                fileWriter.append(customer.firstName);
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.lastName);
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.email);
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.address1);
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.address2);
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.city);
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.state);
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.toString(customer.zipCode));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.userName);
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.password);
                fileWriter.append(NEW_LINE_SEPARATOR);

            }
            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {

            System.out.println("Error in CsvFileWriter !!!");

        } finally {

            try {

                fileWriter.flush();

                fileWriter.close();

            } catch (IOException e) {

                System.out.println("Error while flushing/closing fileWriter !!!");

            }
        }
        return 3;
    }

    //reads orders csv file into the arraylist for order information
    @SuppressWarnings("null")
    public static void readOrdersCSVFile(String orderFileName) {

        BufferedReader fileReader = null;

        try {

            @SuppressWarnings("UnusedAssignment")
            String line = "";
            
            //Create the file reader
            fileReader = new BufferedReader(new FileReader(orderFileName));

            //Read the CSV file header to skip it
            fileReader.readLine();

            //Read the file line by line starting from the second line
            while ((line = fileReader.readLine()) != null) {

                //Get all tokens available in line
                String[] tokens = line.split(COMMA_DELIMITER);

                if (tokens.length > 0) {
                  
                    //Create a new order object and fill the data
                    @SuppressWarnings("LocalVariableHidesMemberVariable")
                    Order tempOrder = new Order(Integer.parseInt(tokens[ORDER_ID]), LocalDate.parse(tokens[DATE]), Integer.parseInt(tokens[EMPLOYEE_ID]), Double.parseDouble(tokens[SUBTOTAL]), Double.parseDouble(tokens[TAX]), Double.parseDouble(tokens[TOTAL_PRICE]), tokens[USER_ID]);
                      
                    applicationFunctionality.orders.add(tempOrder);
                    applicationFunctionality.orderID++;
                }
            }
            System.out.println("Orders Loaded Successfully");

        } catch (IOException | NumberFormatException e) {

            System.out.println("Error in OrdersCsvFileReader !!!");

        } finally {

            try {

                fileReader.close();

            } catch (IOException e) {

                System.out.println("Error while closing fileReader !!!");

            }
        }
    }
    
    //writes contents of orders array to external csv file
    @SuppressWarnings({"null", "RedundantStringToString"})
    public static int writeOrdersCsvFile(String ordersFileName) {

        FileWriter fileWriter = null;

        try {

            fileWriter = new FileWriter(ordersFileName);

            //Write the CSV file header
            fileWriter.append(ORDERS_FILE_HEADER.toString());

            //Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);

            //Write all order objects from arrayList to the CSV file
            for (Order orders : applicationFunctionality.orders) {

                fileWriter.append(Integer.toString(orders.getOrderID()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(orders.getDate().toString());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.toString(orders.getEmployeeID()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Double.toString(orders.getSubtotal()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Double.toString(orders.getTax()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Double.toString(orders.getTotalPrice()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(orders.userID);
                fileWriter.append(NEW_LINE_SEPARATOR);

            }
            System.out.println("Orders CSV file was created successfully !!!");

        } catch (Exception e) {

            System.out.println("Error in OrdersCsvFileWriter !!!");

        } finally {

            try {

                fileWriter.flush();

                fileWriter.close();

            } catch (IOException e) {

                System.out.println("Error while flushing/closing fileWriter !!!");

            }
        }
        return 3;
    }
    
    //reads orderLine csv file into the arraylist for orderLine information
    @SuppressWarnings("null")
    public static void readOrderLineCsvFile(String orderLineFileName) {

        BufferedReader fileReader = null;

        try {

            @SuppressWarnings("UnusedAssignment")
            String line = "";
            //Create the file reader
            fileReader = new BufferedReader(new FileReader(orderLineFileName));

            //Read the CSV file header to skip it
            fileReader.readLine();

            //Read the file line by line starting from the second line
            while ((line = fileReader.readLine()) != null) {

                //Get all tokens available in line
                String[] tokens = line.split(COMMA_DELIMITER);

                if (tokens.length > 0) {

                    //Create a new orderLine object and fill its  data
                    @SuppressWarnings("LocalVariableHidesMemberVariable")
                    OrderLine tempOrderLine = new OrderLine(Integer.parseInt(tokens[ORDER_ID]), Integer.parseInt(tokens[LINE_NUMBER]), Integer.parseInt(tokens[ITEM_ID]), Double.parseDouble(tokens[COST]), Integer.parseInt(tokens[QUANTITY]), tokens[COLOR], tokens[SIZE]);
                       
                    applicationFunctionality.orderLines.add(tempOrderLine);
                }
            }
            System.out.println("OrderLines Loaded Successfully");

        } catch (IOException e) {

            System.out.println("Error in OrderLineCsvFileReader !!!");

        } finally {

            try {

                fileReader.close();

            } catch (IOException e) {

                System.out.println("Error while closing fileReader !!!");

            }
        }
    }
    
    //writes contents of orderLine array to external csv file
    @SuppressWarnings({"null", "RedundantStringToString"})
    public static int writeOrderLineCSVFile(String orderLineFileName) {

        FileWriter fileWriter = null;

        try {

            fileWriter = new FileWriter(orderLineFileName);

            //Write the CSV file header
            fileWriter.append(ORDER_LINE_FILE_HEADER.toString());

            //Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);

            //Write all orderLine objects to the CSV file
            for (OrderLine orderLines : applicationFunctionality.orderLines) {

                fileWriter.append(Integer.toString(orderLines.getOrderID()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.toString(orderLines.getLineNumber()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.toString(orderLines.getItemID()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Double.toString(orderLines.getCost()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.toString(orderLines.getQuantity()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(orderLines.getColor());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(orderLines.getSize());
                fileWriter.append(NEW_LINE_SEPARATOR);

            }
            System.out.println("OrderLine CSV file was created successfully !!!");

        } catch (Exception e) {

            System.out.println("Error in OrderLineCsvFileWriter !!!");

        } finally {

            try {

                fileWriter.flush();

                fileWriter.close();

            } catch (IOException e) {

                System.out.println("Error while flushing/closing fileWriter !!!");

            }
        }
        return 3;
    }
    
    //reads Payment csv file into the arraylist for Payment information
    @SuppressWarnings("null")
    public static void readPaymentCsvFile(String paymentFileName) {

        BufferedReader fileReader = null;

        try {

            @SuppressWarnings("UnusedAssignment")
            String line = "";
            //Create the file reader
            fileReader = new BufferedReader(new FileReader(paymentFileName));

            //Read the CSV file header to skip it
            fileReader.readLine();

            //Read the file line by line starting from the second line
            while ((line = fileReader.readLine()) != null) {

                //Get all tokens available in line
                String[] tokens = line.split(COMMA_DELIMITER);

                if (tokens.length > 0) {

                    //Create a new payment object and fill its  data
                    @SuppressWarnings("LocalVariableHidesMemberVariable")
                    Payment tempPayment = new Payment(Integer.parseInt(tokens[ORDER_ID]), tokens[CUSTOMER_ID], tokens[PAYMENT_TYPE], Integer.parseInt(tokens[CREDIT_CARD_NUMBER]), Integer.parseInt(tokens[CCV_NUMBER]), tokens[BILLING_ADDRESS_1], tokens[BILLING_ADDRESS_2], tokens[BILLING_CITY], tokens[BILLING_STATE], Integer.parseInt(tokens[BILLING_ZIP_CODE]), tokens[CARD_HOLDER_NAME], tokens[EXPIRATION_DATE], Integer.parseInt(tokens[PROCES_ID]), Boolean.parseBoolean(tokens[TRANSACTION_RESULT]));
                       
                    applicationFunctionality.payments.add(tempPayment);
                }
            }
            System.out.println("Payments Loaded Successfully");

        } catch (IOException e) {

            System.out.println("Error in PaymentCsvFileReader !!!");

        } finally {

            try {

                fileReader.close();

            } catch (IOException e) {

                System.out.println("Error while closing fileReader !!!");

            }
        }
    }
    
    //writes contents of payments array to external csv file
    @SuppressWarnings({"null", "RedundantStringToString"})
    public static int writePaymentCSVFile(String paymentFileName) {

        FileWriter fileWriter = null;

        try {

            fileWriter = new FileWriter(paymentFileName);

            //Write the CSV file header
            fileWriter.append(PAYMENTS_FILE_HEADER.toString());

            //Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);

            //Write all payment objects to the CSV file
            for (Payment payment : applicationFunctionality.payments) {

                fileWriter.append(Integer.toString(payment.getOrderID()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(payment.getcustomerID());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(payment.getPaymentType());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.toString(payment.getCreditCardNumber()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.toString(payment.getCCVNumber()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(payment.getBillingStreetAddress1());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(payment.getBillingStreetAddress2());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(payment.getBillingCity());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(payment.getBillingState());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.toString(payment.getBillingZip()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(payment.getCardHolderName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(payment.getExpirationDate());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Integer.toString(payment.getProcessID()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Boolean.toString(payment.getTransactionResult()));
                fileWriter.append(NEW_LINE_SEPARATOR);

            }
            System.out.println("Payments CSV file was created successfully !!!");

        } catch (Exception e) {

            System.out.println("Error in PaymentCsvFileWriter !!!");

        } finally {

            try {

                fileWriter.flush();

                fileWriter.close();

            } catch (IOException e) {

                System.out.println("Error while flushing/closing fileWriter !!!");

            }
        }
        return 3;
    }
    
    //Actions performed when window is closed
    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   

        //Writing the customer array to the CSV file and closing the application
        writeCustomerCsvFile(USER_FILE_NAME);
        System.out.println("Closing window");
        System.exit(0);

    } 
}
